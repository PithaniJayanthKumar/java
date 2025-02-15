package com.wipro.java.designpattern.builder.cars;

import com.wipro.java.designpattern.builder.components.Engine;
import com.wipro.java.designpattern.builder.components.GPSNavigator;
import com.wipro.java.designpattern.builder.components.Transmission;
import com.wipro.java.designpattern.builder.components.TripComputer;

/**
 * 
 *Car is a product class
 */
public class Car {
	private final CarType carType;
	private final int seats;
	private final Engine engine;
	private final Transmission transmission;
	private final TripComputer tripComputer;
	private final GPSNavigator gpsNavigator;
	private double fuel = 0;
	/**
	 * @param carType
	 * @param seats
	 * @param engine
	 * @param transmission
	 * @param tripComputer
	 * @param gpsNavigator
	 * @param fuel
	 */
	public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer,
			GPSNavigator gpsNavigator) {
		super();
		this.carType = carType;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
		this.tripComputer = tripComputer;
		if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
		this.gpsNavigator = gpsNavigator;
	
	}
	/**
	 * @return the fuel
	 */
	public double getFuel() {
		return fuel;
	}
	/**
	 * @param fuel the fuel to set
	 */
	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
	/**
	 * @return the carType
	 */
	public CarType getCarType() {
		return carType;
	}
	/**
	 * @return the seats
	 */
	public int getSeats() {
		return seats;
	}
	/**
	 * @return the engine
	 */
	public Engine getEngine() {
		return engine;
	}
	/**
	 * @return the transmission
	 */
	public Transmission getTransmission() {
		return transmission;
	}
	/**
	 * @return the tripComputer
	 */
	public TripComputer getTripComputer() {
		return tripComputer;
	}
	/**
	 * @return the gpsNavigator
	 */
	public GPSNavigator getGpsNavigator() {
		return gpsNavigator;
	}
	
	
	
	
	

}
