package com.bridgelabz;

public class HotelList implements PrintInterface{
	
private String hotelName;
private double priceForRegularCustomer;

public HotelList(String hotelName, double priceForRegularCustomer) {
	this.hotelName = hotelName;
	this.priceForRegularCustomer = priceForRegularCustomer;
}
	
	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public double getPriceForRegularCustomer() {
		return priceForRegularCustomer;
	}

	public void setPriceForRegularCustomer(double priceForRegularCustomer) {
		this.priceForRegularCustomer = priceForRegularCustomer;
	}
	@Override
	public String toString() {
		return "HotelDetails [hotelName = "+hotelName+" , priceForRegularCustomer = "+priceForRegularCustomer+"]";
	}

	public void printHotelList() {
			System.out.println(toString());
		}
	}