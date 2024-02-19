package com.example.astronomical;

public abstract class ActiveObject extends AstronomicalObject{
	protected final double c = 3e8;
	
	
	// Constructor
	public ActiveObject(String name, double mass, double radius) {
		super(name, mass, radius);
	}
	
	// // Impementasi dari abstract method
	public void displayInfo() {
		System.out.println("Name: " + getName());
		System.out.println("Orbited to " + getOrbit());
		System.out.println("Mass: " + getMass() + " Kg");
		System.out.println("Lorentz Factor (akibat massa objek): " + calculateLorentzFactor());
	}
	
	public double calculateLorentzFactor() {
		double gamma = 1/Math.sqrt(1-2*G*getMass()/(getRadius()*c*c));
		return gamma;
	}
	
	// Impementasi dari abstract method
	@Override
	public void orbit(AstronomicalObject obj, double period, boolean tidal) {
		setOrbit(obj.getName());
	}
	
}
