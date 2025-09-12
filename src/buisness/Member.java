package buisness;

import java.io.FileReader;
import java.io.PrintStream;
import com.google.gson.*;

public class Member {
	//member variables
	private String name;
	private PlanType plan;
	private String perscriptionId;
	
	//default constructor
  public Member() {
	  
  }

public String getPerscriptionId() {
	return perscriptionId;
}

public void setPerscriptionId(String perscriptionId) {
	this.perscriptionId = perscriptionId;
}

public PlanType getPlan() {
	return plan;
}

public void setPlan(PlanType plan) {
	this.plan = plan;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public void readJson(FileReader fr) {
	
}

public void writeJson(PrintStream ps) {
	
}

}


