package com.bridgelabz;

import java.util.ArrayList;

public interface HotelReservationSystem {
	public void addHotel(String hotelName,int hotelRating, int priceInWeekDaysForCommons, int  priceInWeekEndsForCommons);
	public void printHotelList();
	public int getHotelListSize();
	public ArrayList<Hotel> getHotelList();
}