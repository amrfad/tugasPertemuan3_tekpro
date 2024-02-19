package com.example.astronomical;

public class Planet extends InnactiveObject {
	private String planetType;

	public Planet(String name, String planetType, double mass, double radius) {
		super(name, mass, radius);
		this.planetType = planetType;
	}

	// Getter and Setter
	public String getPlanetType() {
		return planetType;
	}

	public void setPlanetType(String planetType) {
		this.planetType = planetType;
	}

	// Method
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Planet Type: " + getPlanetType());
		System.out.println("Radius: " + getRadius() + " m");
		System.out.println("Percepatan Gravitasi: " + calculateGravitationalAcceleration() + " m/s^2");
		System.out.println();
	}
	
	public void orbit(AstronomicalObject obj, double period) {
		super.orbit(obj, 0, false);
		setOrbitalPeriod(period);
	}
}
