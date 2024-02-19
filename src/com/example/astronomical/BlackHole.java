package com.example.astronomical;

public class BlackHole extends ActiveObject {
	
	
	public BlackHole(String name, double mass) {
		super(name, mass, 0);
		setRadius((float)getSchwarzschildRadius());
	}

	// Method
	public double getSchwarzschildRadius() {
		double r = 2*G*getMass()/(c*c);
		return r;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Schwarzschild Radius: " + getRadius() + " m");
		System.out.println("Percepatan Gravitasi: " + calculateGravitationalAcceleration() + " m/s^2");
		System.out.println();
	}
	
	public void orbit(AstronomicalObject obj) {
		super.orbit(obj, 0, false);
	}
}
