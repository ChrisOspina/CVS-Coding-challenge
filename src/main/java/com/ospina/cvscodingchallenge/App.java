package com.ospina.cvscodingchallenge;

import Buisness.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

public class App 
{
    public static void main( String[] args )
    {
    	//Declaring a test array of Members
    	Member[] testMembers;
    	testMembers = new Member[3];
    	
    	//Reading in a Json
    	Gson gson = new Gson();
    	String filename = "test.json"; //The path to the Json
    	
    	try(FileReader fr = new FileReader(filename)) {
    		System.out.println("Reading in from JSON file");
    		for(int i =0;i<testMembers.length;i++) {
    			//For loop to do the work.
    		}
    	}
    	catch(IOException e) {
    		e.printStackTrace();
    	}
    	
        System.out.println( "Hello World!" );
    }
    
    public static boolean checkCoverage(planType plan, String prescription) {
    	List<String> basicCoverage = Arrays.asList("ibuprofen","amoxicillin");
    	List<String> premiumCoverage = Arrays.asList("ibuprofen","amoxicillin", "metformin", "lisinopril");
    	
    	String normalizedRx = prescription.trim().toLowerCase();
    	
    	switch(plan) {
    		case Basic:
    			return basicCoverage.contains(normalizedRx);
    		case Premium:
    			return premiumCoverage.contains(normalizedRx);
    		default:
    			return false;
    		
    	}
    	
    }
}
