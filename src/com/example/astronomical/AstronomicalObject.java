package com.example.astronomical;

public abstract class AstronomicalObject {
	protected final double G = 6.674e-11;
	private String name;
	private double mass; // in Kilogram
	private double radius; // in Meter
	private String orbit = "nothing";
	
	// Constructor
	public AstronomicalObject(String name, double mass, double radius) {
		this.name = name;
		this.mass = mass;
		this.radius = radius;
	}

	// Getter and Setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getMass() {
		return mass;
	}
	
	public void setMass(double mass) {
		this.mass = mass;
	}
	
	public String getOrbit() {
		return orbit;
	}

	public void setOrbit(String orbit) {
		this.orbit = orbit;
	}

	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// Abstract Method
	public abstract void displayInfo();
	public abstract void orbit(AstronomicalObject obj, double period, boolean tidal);
	
	// Method
	public double calculateGravitationalAcceleration() {
		double g = G*getMass()/(getRadius()*getRadius());
		return g;	
	}

}
