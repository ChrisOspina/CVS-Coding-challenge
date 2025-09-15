package Buisness;

import com.google.gson.annotations.SerializedName;

/***
 * This class simulates a CVS group member
 * @author Christopher Ospina
 * @version 1.0
 */
public class Member {
	
	@SerializedName("Name")
	private String name;
	@SerializedName("Plan Type")
	private planType plan;
	@SerializedName("Prescription")
	private String prescription;

	/***
	 * The Default constructor
	 */
	public Member() {
		
	}
	
	/***
	 * This method constructs an instance of the Member class if any arguments are needed
	 * @param n sets the name directly
	 * @param pt sets the planType directly
	 * @param p sets the prescription directly
	 */
	public Member(String n, planType pt, String p) {
		name = n;
		plan = pt;
		prescription = p;
	}
	
	/***
	 * The getter method for the prescription attribute
	 * @return the user's prescription
	 */
	
	public String getPrescription() {
		return prescription;
	}
	
	/***
	 * The setter method for the prescription attribute
	 * @param prescription -> the value that the user wants to set the prescription to
	 */
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}
	
	/***
	 * The getter method for the plan attribute
	 * @return the user's plan type
	 */
	
	public planType getPlan() {
		return plan;
	}
	
	/***
	 * The setter method for the plan attribute
	 * @param plan -> the value that the user wants to set the planType to
	 */
	public void setPlan(planType plan) {
		this.plan = plan;
	}
	
	/***
	 * The getter method for the name attribute
	 * @return the user's name
	 */
	public String getName() {
		return name;
	}
	/***
	 * The setter method for the name attribute
	 * @param name -> the value that the user wants to set their name to
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
