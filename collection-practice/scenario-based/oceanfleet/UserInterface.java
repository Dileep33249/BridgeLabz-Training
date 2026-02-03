package com.oceanfleet;

import java.util.List;

public class UserInterface {
   public static void main(String [] args) {
	   Vessel vessel1 = new Vessel("kie48","KingofOcean", 4.26, "Cargo");
	   Vessel vessel2 = new Vessel("nci97","AtlanticTracker", 3.15, "Cargo");
	   Vessel vessel3 = new Vessel("wjdbb88", "MuskKing", 7.57, "Cargo");
	   Vessel vessel4 = new Vessel("ndjw47","FilesWavy", 8.36, "Cargo");
	   
	   VesselUtil vesselUtil = new VesselUtil();
	   vesselUtil.addVesselPerformance(vessel1);
	   vesselUtil.addVesselPerformance(vessel2);
	   vesselUtil.addVesselPerformance(vessel3);
	   vesselUtil.addVesselPerformance(vessel4);
	   
	   Vessel newVessel = vesselUtil.getVesselById("wjdbb88hbhbh");
	   if(newVessel == null) {
		   System.out.print("vessel did not found!");
	   }
	   else {
		   System.out.print("vessel found!");
	   }
	   
	   List<Vessel> ans = vesselUtil.getHighPerformanceVessels();
	   
	   helper1Printer(ans);
	   
   }
   
   private static void helper1Printer(List<Vessel> list) {
	   if(list == null) {
		   System.out.print("not vessels found");
		   return;
	   }
	   
	   for(Vessel obj : list) {
		   System.out.print("\nid: "+obj.getVesselId()+", \nnameOfVessel: "+obj.getVesselName()+", \naverage: "+obj.getAverageSpeed()+", \ntype :"
		   		+ obj.getVesseltype());
	   }
	   
   }
}
