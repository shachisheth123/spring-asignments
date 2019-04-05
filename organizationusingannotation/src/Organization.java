package com.capgemini.spring.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.PropertySource;

@Component
@PropertySource("dbconfig.properties")
public class Organization {

@Value("100")
private int orgId;

@Value("Capgemini")
private String orgName;

@Value("2000")
private double marketPrice;

@Value("{'${listDirectors}'.split(',')}")
private List<String> directors;

@Value("{'${setBranches}'.split(',')}")
private Set<String> branches;

@Value("#{${valuesMap}}")
private Map<String, String> branchWiseHead;

@Value("${ipAddr}")
private Properties ipAddresses;

@Value("${username},${password}")
private Properties databaseDetails;

@Autowired
private Address address;


@Override
public String toString() {
	return "Organization [orgId=" + orgId + ", orgName=" + orgName + ", marketPrice=" + marketPrice + ", 		address="
			+ address + ", directors=" + directors + ", branches=" + branches + ", 					branchWiseHead=" + branchWiseHead
			+ ", ipAddresses=" + ipAddresses + ", databaseDetails=" + databaseDetails + "]";
}



}