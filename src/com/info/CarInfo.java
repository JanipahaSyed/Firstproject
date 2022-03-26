package com.info;

import java.util.Scanner;

public class CarInfo {
	
 public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 Scanner s1=new Scanner(System.in);
	 Car [] cararray=new Car[8];
	 System.out.println("enter carId");
	 int carId=s.nextInt();
	 System.out.println("enter carColor");
	 String carColor=s1.nextLine();
	 System.out.println("enter car fuelType");
	 String fuelType=s1.nextLine();
	 System.out.println("enter mileage");
	 double mileage=s.nextDouble();
	 System.out.println("is pollutioncheckverified");
	 boolean isPollutionCheckVerified=s.nextBoolean();
	 for(int i=0;i<cararray.length;i++){
	
	 cararray[i]=new Car(carId,carColor,fuelType,mileage,isPollutionCheckVerified);
	 
			 }
	 
	 int search= searchCarById(cararray,carId);
	 System.out.println("saearch="+search);
	 System.out.println("enter car quantity");
	 int quantity=s.nextInt();
	 boolean check=getCertifiedCars(Car[] cararray,quantity);
	 System.out.println("check="+check);
	 System.out.println("this is 2nd person");
	 double count=getCountofMileageRange(Car [] cararry,mileage, int i, int j);
	 System.out.println("count="+count);
	 
	 
	 

	
}

private static boolean getCertifiedCars(Object object, int quantity) {
	// TODO Auto-generated method stub
	return false;
}

private static int searchCarById(Car[] cararray, int carId) {
	// TODO Auto-generated method stub
	return 0;
}
}
