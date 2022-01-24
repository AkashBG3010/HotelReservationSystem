package com.bridgelabz;

import java.util.ArrayList;

public interface HotelReservationSystem {
	public void addHotel(String hotelName,int rating, double regularCustomerRate);
	public void printHotelList();
	public int getHotelListSize();
	public ArrayList<Hotel> getHotelList();
}