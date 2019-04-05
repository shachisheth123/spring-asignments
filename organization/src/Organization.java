package com.capgemini.spring.model;

import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Organization {

 	private int orgId;
	private String orgName;
	private double marketPrice;
	private Address address;
	private List<String> directors;
	private Set<String> branches;
	private Map<String, String> branchWiseHead;
	private Properties ipAddresses;
	private Properties databaseDetails;

	public Organization(int orgId ,String orgName ,double marketPrice, Address address ,List<String> 		directors,Set<String> branches,Map<String, String> branchWiseHead, Properties ipAddresses,  		Properties databaseDetails   ) {
		this.orgId=orgId;
		this.orgName=orgName ;
		this.marketPrice=marketPrice;
		this.address =address ;
		this.ipAddresses=ipAddresses;
		this.databaseDetails=databaseDetails;
		this.directors =directors ;
		this.branchWiseHead=branchWiseHead;
		this.branches=branches;
		
		}
		public Properties getIpAddresses() {
		return ipAddresses;
		}

		public void setIpAddresses(Properties ipAddresses) {
		this.ipAddresses = ipAddresses;
		}

		public Properties getDatabaseDetails() {
		return databaseDetails;
		}

		public void setDatabaseDetails(Properties databaseDetails) {
		this.databaseDetails = databaseDetails;
		}

		public int getOrgId() {
			return orgId;
		}
		public void setOrgId(int orgId) {
			this.orgId = orgId;
		}
		public String getOrgName() {
			return orgName;
		}
		public void setOrgName(String orgName) {
			this.orgName = orgName;
		}
		public double getMarketPrice() {
			return marketPrice;
		}
		public void setMarketPrice(double marketPrice) {
			this.marketPrice = marketPrice;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		public List<String> getDirectors() {
			return directors;
		}
		public void setDirectors(List<String> directors) {
			this.directors = directors;
		}
		public Set<String> getBranches() {
			return branches;
		}
		public void setBranches(Set<String> branches) {
			this.branches = branches;
		}
		public Map<String, String> getBranchWiseHead() {
			return branchWiseHead;
		}
		public void setBranchWiseHead(Map<String, String> branchWiseHead) {
			this.branchWiseHead = branchWiseHead;
		}
		
		 public String toString(){
  		return orgId+" "+orgName+" "+ marketPrice+" "+address+" "+ipAddresses+" "+databaseDetails+" 			"+directors+" "+branchWiseHead;  
		 }

		
}