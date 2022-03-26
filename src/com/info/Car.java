package com.info;

public class Car {
	private int carId;
	private String carColor;
	private String fuelType;
	private double mileage;
	private boolean isPollutionCheckVerified;
	public Car(int carId, String carColor, String fuelType, double mileage, boolean isPollutionCheckVerified) {
		super();
		this.carId = carId;
		this.carColor = carColor;
		this.fuelType = fuelType;
		this.mileage = mileage;
		this.isPollutionCheckVerified = isPollutionCheckVerified;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public boolean getIsPollutionCheckVerified() {
		return isPollutionCheckVerified;
	}
	public void setIsPollutionCheckVerified(boolean isPollutionCheckVerified) {
		this.isPollutionCheckVerified = isPollutionCheckVerified;
	}

}
