package com.futurelogistics;

 abstract class GoodTransport {
 protected String trasnportId;
 protected String transportDate;
 protected int transportRating;
  
  public GoodTransport(String trasnportId, String transportDate, int transportRating) {
	  this.transportDate=transportDate;
	  this.transportRating=transportRating;
	  this.trasnportId=trasnportId;
	  
  }
  
  abstract public String vehicleSelection();
  abstract public float calculateTotalCharge();
  
  public String getTransportId() {
	  return trasnportId;
  }
  
  public String getTransportDate() {
	  return transportDate;
  }
  
  public int getTransportRating() {
	  return transportRating;
  }
}
