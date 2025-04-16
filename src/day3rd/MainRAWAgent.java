package day3rd;

import java.util.ArrayList;
import java.util.List;

class RAWAgent {
String rawAgentBatchId;
 String rawAgentCodeName;
 String rawAgentMissionName;

	 RAWAgent(String rawagentbatchid, String rawagentcodename, String rawagentmissionname) {
		this.rawAgentBatchId=rawagentbatchid;
		this.rawAgentCodeName=rawagentcodename;
		this.rawAgentMissionName=rawagentmissionname;
	}
	 void printDetails() {
	        System.out.println("Batch ID: " + rawAgentBatchId + ", Code Name: " + rawAgentCodeName + ", Mission: " + rawAgentMissionName);
	    }

 }
	
class 	IndianSecretUnit {
	RAWAgent[] agents = new RAWAgent[5];

    void addAgents() {
        agents[0] = new RAWAgent("R001", "Tiger", "Mission Sunrise");
        agents[1] = new RAWAgent("R002", "Cobra", "Mission Moonlight");
        agents[2] = new RAWAgent("R003", "Falcon", "Mission Windstrike");
        agents[3] = new RAWAgent("R004", "Panther", "Mission Icefall");
        agents[4] = new RAWAgent("R005", "Wolf", "Mission Thunder");
    }
    void printAllAgents() {
        System.out.println("----- RAW AGENTS DETAILS -----");
        for (RAWAgent agent : agents) {
            agent.printDetails();
        }
    
}
    void updateMissions() {
        agents[0].rawAgentMissionName = "Mission Stormfire";
        agents[1].rawAgentMissionName = "Mission Deep Blue";
        agents[2].rawAgentMissionName = "Mission Night Shadow";
        agents[3].rawAgentMissionName = "Mission Flame Edge";
        agents[4].rawAgentMissionName = "Mission Steel Rain";
    }
}

public class MainRAWAgent  {
	  public static void main(String[] args) {
		  IndianSecretUnit unit = new IndianSecretUnit();

	        unit.addAgents(); 
	        unit.printAllAgents();

	        System.out.println("\n--- UPDATING MISSIONS ---\n");
	        unit.updateMissions(); 

	        unit.printAllAgents(); 
	        
	        

	  }
		  
	  }