package com.bridgelabz;

public class Hotel {
	
	String hotelName;
	int hotelRating, priceInWeekDaysForCommons, priceInWeekDaysForRewards, priceInWeekEndsForCommons, priceInWeekEndsForRewards;
	
	Hotel (String hotelName, int hotelRating, int priceInWeekDaysForCommons, int  priceInWeekEndsForCommons) {
		this.hotelName = hotelName;
		this.hotelRating = hotelRating;
		this.priceInWeekDaysForCommons = priceInWeekDaysForCommons;
		this.priceInWeekDaysForRewards = priceInWeekDaysForRewards;
		this.priceInWeekEndsForCommons = priceInWeekEndsForCommons;
		this.priceInWeekEndsForRewards = priceInWeekEndsForRewards;
	}

	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getHotelRating() {
		return hotelRating;
	}
	public void setHotelRating(int hotelRating) {
		this.hotelRating = hotelRating;
	}

	public int getPriceInWeekDaysForCommons() {
		return priceInWeekDaysForCommons;
	}
	public void setPriceInWeekDaysForCommons(int priceInWeekDaysForCommons) {
		this.priceInWeekDaysForCommons = priceInWeekDaysForCommons;
	}

	public int getPriceInWeekDaysForRewards() {
		return priceInWeekDaysForRewards;
	}
	public void setPriceInWeekDaysForRewards(int priceInWeekDaysForRewards) {
		this.priceInWeekDaysForRewards = priceInWeekDaysForRewards;
	}

	public int getPriceInWeekEndsForCommons() {
		return priceInWeekEndsForCommons;
	}
	public void setPriceInWeekEndsForCommons(int priceInWeekEndsForCommons) {
		this.priceInWeekEndsForCommons = priceInWeekEndsForCommons;
	}

	public int getPriceInWeekEndsForRewards() {
		return priceInWeekEndsForRewards;
	}
	public void setPriceInWeekEndsForRewards(int priceInWeekEndsForRewards) {
		this.priceInWeekEndsForRewards = priceInWeekEndsForRewards;
	}
}