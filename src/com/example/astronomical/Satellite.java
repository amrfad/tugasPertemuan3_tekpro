package com.example.astronomical;

public class Satellite extends InnactiveObject{
	private boolean tidalLock;

	// Constructor
	public Satellite(String name, double mass, double radius) {
		super(name, mass, radius);
	}
	
	// Getter and Setter
	public boolean isTidalLock() {
		return tidalLock;
	}
	
	public void setTidalLock(boolean tidalLock) {
		this.tidalLock = tidalLock;
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Tidal Lock: " + isTidalLock());
		System.out.println("Radius: " + getRadius() + " m");
		System.out.println("Percepatan Gravitasi: " + calculateGravitationalAcceleration() + " m/s^2");
		System.out.println();
	}
	
	public void orbit(AstronomicalObject obj, boolean tidal) {
		super.orbit(obj, 0, false);
		setTidalLock(tidal);
	}
}