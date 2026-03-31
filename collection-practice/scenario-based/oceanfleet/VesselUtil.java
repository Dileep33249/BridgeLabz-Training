package com.oceanfleet;
import java.util.*; 
public class VesselUtil {
   
	private List<Vessel> vesselList=new ArrayList<>();
	
	public void addVesselPerformance(Vessel vessel)
	 {
		vesselList.add(vessel);
	}
	
	public Vessel getVesselById(String vesselId) {
		for(Vessel obj: vesselList) {
			if(obj.getVesselId().equals(vesselId)) {
				return obj;
			}
		}
		
		return null;
	}
	
	public List<Vessel> getHighPerformanceVessels(){
		PriorityQueue<Vessel> pq = new PriorityQueue<>(Comparator.comparingDouble(Vessel::getAverageSpeed).reversed());
		
		List<Vessel> ans=new ArrayList<>();
       
	     int idx=0;
	     while(idx < vesselList.size()) {
	    	 pq.offer(vesselList.get(idx++));
	     }
	     
	     ans.add(pq.poll());
	     while(pq.isEmpty() && pq.peek() == ans.get(0)) {
	    	 ans.add(pq.poll());
	     }
		return ans;

}
}
