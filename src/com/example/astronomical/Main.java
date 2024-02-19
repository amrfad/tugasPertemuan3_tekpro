package com.example.astronomical;

public class Main {

	public static void main(String[] args) {
		// Membuat instance dari BlackHole
		BlackHole SgrA = new BlackHole("Sagittarius A*", 8.62e36);
		SgrA.displayInfo();
		
		// Membuat instance dari Star
		Star sun = new Star("Sun", 2e30, 7e8, 5448.85, "Normal");
		sun.orbit(SgrA);
		sun.displayInfo();
		
		// Membuat instance dari Planet
		Planet earth = new Planet("Earth", "Terrestrial", 6e24, 6.371e6);
		earth.orbit(sun, 365.256);
		earth.displayInfo();
		
		// Membuat instance dari Satellite
		Satellite moon = new Satellite("Moon", 7.3e22, 1737400);
		moon.orbit(earth, true);
		moon.displayInfo();
	}

}
