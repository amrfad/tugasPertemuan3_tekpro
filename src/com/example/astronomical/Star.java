package com.example.astronomical;

public class Star extends ActiveObject {
	private String type;
	private double temperature;
	
	// Constructor
	public Star(String name, double mass, double radius, double temp, String type) {
		super(name, mass, radius);
		this.temperature = temp;
		this.type = type;
	}

	// Getter and Setter
	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	// Method
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Type: " + type);
		System.out.println("Temperature: " + getTemperature() + " °C");
		System.out.println("Radius: " + getRadius() + " m");
		System.out.println("Percepatan Gravitasi: " + calculateGravitationalAcceleration() + " m/s^2");
		System.out.println();
	}
	
	public void orbit(AstronomicalObject obj) {
		super.orbit(obj, 0, false);
	}

}
