package com.oceanfleet;

public class Vessel {
	private String vesselId;
	private String vesselName;
	private double averageSpeed;
	private String vesselType;
	
	Vessel(String vesselId, String vesselName, double averageSpeed, String vesselType){
		this.vesselId = vesselId;
		this.vesselName= vesselName;
		this.averageSpeed=averageSpeed;
		this.vesselType=vesselType;
	}
	
	public String getVesselId() {
		return vesselId;
	}
	
	public String getVesselName() {
		return vesselName;
	}
	
	public String getVesseltype() {
		return vesselType;
	}
	
	public double getAverageSpeed() {
		return averageSpeed;
	}
	
	public void getVesselId(String vesselId) {
		 this.vesselId = vesselId;
	}
	
	public void setVesselName(String vesselName) {
		this.vesselName= vesselName;
	}
	
	public void setVsseltype(String vesselType) {
		this.vesselType=vesselType;
	}
	
	public void setAverageSpeed(double averageSpeed) {
		this.averageSpeed= averageSpeed;
	}
	
	
}
