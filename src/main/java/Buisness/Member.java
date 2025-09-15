package Buisness;

import com.google.gson.*;
import java.io.FileReader;
import com.google.gson.annotations.SerializedName;

public class Member {
	
	@SerializedName("Name")
	private String name;
	@SerializedName("Plan Type")
	private planType plan;
	@SerializedName("Prescription")
	private String prescription;
	
	//Default constructor
	public Member() {
		
	}
	
	public String getPrescription() {
		return prescription;
	}
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	public planType getPlan() {
		return plan;
	}
	public void setPlan(planType plan) {
		this.plan = plan;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
