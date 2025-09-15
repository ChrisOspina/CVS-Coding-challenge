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
    	String filename = "test.json"; //The path to the Json
    	
    	
    	try(FileReader fr = new FileReader(filename)) {
    		
        	//Reading in a JSON
        	Gson gson = new Gson();
        	
    		//Declaring a test array of Members and a boolean value for when we check coverage
        	Member[] testMembers = gson.fromJson(fr, Member[].class);
        	boolean isCovered;

    		System.out.println("Reading in from JSON file.\n");
    		
    		//Foreach loop to iterate through each of the Array members
    		for(Member m: testMembers) {
    			System.out.println("Checking coverage for "+ m.getName()+"\n");
    			
    			//Calling the checkCoverage method to check whether the coverage is eligible for prescription
    			isCovered = checkCoverage(m.getPlan(),m.getPrescription());
    			
    			if(isCovered) {
    				System.out.println("Success: ");
    				System.out.println(m.getName() + ", your prescription (" + m.getPrescription() + ") is covered under the " + m.getPlan() + " plan.\n");
    				
    			}
    			else {
    				System.out.println("Faliure: ");
    				System.out.println("Sorry, "+ m.getName() + ", your prescription (" + m.getPrescription() + ") is NOT covered under the " + m.getPlan() + " plan.\n");
    			}
    		}
    		
    	}
    	catch(IOException e) {
    		System.err.println("An error occurred");
    		e.printStackTrace();
    	}
    	
       // System.out.println( "Hello World!" );
    }
    
    /***
     * 
     * @param plan: The type of plan a member uses
     * @param prescription: The user's prescription by drug name
     * @return whether the prescription is eligible as a boolean value
     */
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
