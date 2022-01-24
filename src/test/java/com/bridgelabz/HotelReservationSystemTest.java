package com.bridgelabz;

import java.time.LocalDate;
import java.time.Month;
import org.junit.Assert;
import org.junit.Test;

public class HotelReservationSystemTest {
	
	@Test
	public void givenHotelList_WhenAdded_shouldReturnProperHotelName(){
		HotelReservationSystem hotelReservation = new HotelReservation();
		hotelReservation.addHotel("Bridgewood", 4, 160);
		String hotelName = hotelReservation.getHotelList().get(0).getHotelName();
		Assert.assertEquals("Bridgewood", hotelName);
	}

	@Test
	public void givenHotelList_WhenAdded_shouldReturnProperHotelRating(){
		HotelReservationSystem hotelReservation = new HotelReservation();
		hotelReservation.addHotel("Bridgewood", 4, 160);
		int hotelRating = hotelReservation.getHotelList().get(0).getHotelRating();
		Assert.assertEquals(4, hotelRating);
	}

	@Test
	public void givenHotelList_WhenAdded_shouldReturnRegularCustomerCost(){
		HotelReservationSystem hotelReservation = new HotelReservation();
		hotelReservation.addHotel("Bridgewood", 4, 160);
		int hotelRegularCustomerCost = (int) hotelReservation.getHotelList().get(0).getPriceInWeekDaysForCommons();
		Assert.assertEquals(160, hotelRegularCustomerCost);
	}
	
	@Test
	public void givenHotelDetails_WhenSizeMatches_ShoulReturnTrue(){
		HotelReservationSystem hotelReservation = new HotelReservation();
		hotelReservation.addHotel("Lakewood", 3, 110);
		hotelReservation.addHotel("Bridgewood", 4, 160);
		hotelReservation.addHotel("Ridgewood", 5, 220);
		int hotelListSize = hotelReservation.getHotelListSize();
		Assert.assertEquals(3, hotelListSize);
	}
	
	@Test
	public void givenHotelDetails_shouldReturnCheapestHotel(){
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel("Lakewood", 3, 110);
		hotelReservation.addHotel("Bridgewood", 4, 160);
		LocalDate startDate = LocalDate.of(2021, Month.SEPTEMBER, 10);    
		LocalDate endDate = LocalDate.of(2021, Month.SEPTEMBER, 11);    
		Hotel hotel = hotelReservation.getCheapestHotel(startDate, endDate);
		Assert.assertEquals("Lakewood", hotel.getHotelName());
	}
}