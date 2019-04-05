package com.capgemini.spring.configuration;

import com.capgemini.spring.model.*;
import com.capgemini.spring.client.*;
import java.util.*;
import java.io.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrganizationConfiguration{
	
	public Address getAddress(){
		Address address = new Address("Mumbai", "Maharashtra");	
		return address;
	} 

	public List<String> getDirectors(){
		List<String> directors = new ArrayList<String>();
		directors.add("John"); 
		directors.add("Grant");
		return directors;
	}

	public Set<String> getBranches(){
		Set<String> branches = new HashSet<String>();
		branches.add("Mumbai");
		branches.add("Pune");
		return branches;
	}

	public Map<String, String> getBranchWiseHead(){
		Map<String,String> branchWiseHead= new HashMap<>();
		branchWiseHead.put("Pune","Joy");
		branchWiseHead.put("Mumbai","Sana");
		branchWiseHead.put("Banglore","Anna");
		return branchWiseHead;
	}

	public Properties getIpAddress() {
		FileReader reader=null;
		Properties ipAddress=null;
		try{
			reader=new FileReader("src/ipAddress.properties");  
    			ipAddress=new Properties();  
    			ipAddress.load(reader);
		}catch(Exception e){
			e.printStackTrace();
		}
		return ipAddress;
	}

	
	public Properties getDatabaseDetails() {
		FileReader reader=null;
		Properties databaseDetails=null;
		try{
			reader=new FileReader("src/database.properties"); 
      			databaseDetails=new Properties();  
    			databaseDetails.load(reader);
		}catch(Exception e){
			e.printStackTrace();
		 } 
		return databaseDetails;
	}

	@Bean
	public Organization organization(){
		Organization org=new Organization();
		org.setOrgId(10001210);
		org.setOrgName("Capgemini");
		org.setMarketPrice(6500200.0);
		org.setAddress(getAddress());
		org.setDirectors(getDirectors());
		org.setBranches(getBranches());
		org.setBranchWiseHead(getBranchWiseHead());
		org.setIpAddress(getIpAddress());
		org.setDatabaseDetails(getDatabaseDetails());
		return org;
	}
}