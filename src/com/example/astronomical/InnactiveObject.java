package com.example.astronomical;

public abstract class InnactiveObject extends AstronomicalObject {
	private double orbitalPeriod = 0;

	// Constructor
	public InnactiveObject(String name, double mass, double radius) {
		super(name, mass, radius);
	}

	// Getter and Setter
	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}

	public void setOrbitalPeriod(double orbitalPeriod) {
		this.orbitalPeriod = orbitalPeriod;
	}
	
	// // Impementasi dari abstract method
	public void displayInfo() {
		System.out.println("Name: " + getName());
		System.out.println("Orbited to " + getOrbit());
		System.out.println("Mass: " + getMass() + " Kg");
		System.out.println("Orbital Period: " + getOrbitalPeriod());
	}
	
	// Impementasi dari abstract method
	@Override
	public void orbit(AstronomicalObject obj, double orbitalPeriod, boolean tidal) {
		setOrbit(obj.getName());
	}
	
}
