package com.bridgelabz;

public class HotelReservationMain {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Hotel Reservation System Program");
		
		HotelReservationSystem hotelReservation = new HotelReservation();
		hotelReservation.addHotel();
		hotelReservation.printHotelList();
	}
}