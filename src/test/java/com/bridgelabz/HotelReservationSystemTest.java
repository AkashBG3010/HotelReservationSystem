package com.bridgelabz;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationSystemTest {
	
	@Test
	public void givenHotelList_WhenAdded_shouldReturnProperHotelName(){
		HotelReservationSystem hotelReservation = new HotelReservation();
		hotelReservation.addHotel("Bridgewood", 4, 110,90);
		String hotelName = hotelReservation.getHotelList().get(0).getHotelName();
		Assert.assertEquals("Bridgewood", hotelName);
	}

	@Test
	public void givenHotelList_WhenAdded_shouldReturnProperHotelRating(){
		HotelReservationSystem hotelReservation = new HotelReservation();
		hotelReservation.addHotel("Bridgewood", 4, 150,50);
		int hotelRating = hotelReservation.getHotelList().get(0).getHotelRating();
		Assert.assertEquals(4, hotelRating);
	}

	@Test
	public void givenHotelList_WhenAdded_shouldReturnRegularCustomerCost(){
		HotelReservationSystem hotelReservation = new HotelReservation();
		hotelReservation.addHotel("Bridgewood", 4,  150,50);
		int hotelRegularCustomerCost = (int) hotelReservation.getHotelList().get(0).getPriceInWeekDaysForCommons();
		Assert.assertEquals(150, hotelRegularCustomerCost);
	}
	
	@Test
	public void givenHotelList_WhenAdded_shouldReturnWeekendRate(){
		HotelReservationSystem hotelReservation = new HotelReservation();
		hotelReservation.addHotel("Bridgewood", 4, 220,150);
		int weekendRate = (int) hotelReservation.getHotelList().get(0).getPriceInWeekDaysForCommons();
		Assert.assertEquals(150, weekendRate);
	}
	
	@Test
	public void givenHotelDetails_WhenSizeMatches_ShoulReturnTrue(){
		HotelReservationSystem hotelReservation = new HotelReservation();
		hotelReservation.addHotel("Lakewood", 3, 110, 90);
		hotelReservation.addHotel("Bridgewood", 4, 150, 50);
		hotelReservation.addHotel("Ridgewood", 5, 220, 150);
		int hotelListSize = hotelReservation.getHotelListSize();
		Assert.assertEquals(3, hotelListSize);
	}
	
	@Test
	public void givenHotelDetails_shouldReturnCheapestHotel(){
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel("Lakewood", 3, 110, 90);
		hotelReservation.addHotel("Bridgewood", 4, 160, 50);
		LocalDate startDate = LocalDate.of(2021, Month.SEPTEMBER, 10);    
		LocalDate endDate = LocalDate.of(2021, Month.SEPTEMBER, 12);    
		String hotelName = hotelReservation.getCheapestHotel(startDate, endDate);
		Assert.assertEquals("Lakewood", hotelName);
	}
}