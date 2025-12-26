package com.problems;

public class CarRental {
  String customerName;
  String CarModel;
  int rentalDays;
  
  static int RentPerDay=150;
  
  CarRental(String cutomerName, String CarModel , int  rentalDays) {
	  this.customerName=cutomerName;
	  this.CarModel=CarModel;
	  this.rentalDays=rentalDays;
  }
  public void TotalCost() {
	  System.out.print("Total Cost Would be: "+RentPerDay * rentalDays);
  }
  public static void main(String [] args) {
	  
	  CarRental obj=new CarRental("Dileep" , "1960Cadilac", 14);
	  obj.TotalCost();
  }
}
