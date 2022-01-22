package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationSystemTest {
	@Test
	public void givenHotelDetails_WhenSizeMatches_ShoulReturnTrue()
	{
		HotelReservationSystem hotelReservation = new HotelReservation();
		hotelReservation.addHotel();
		int hotelListSize = hotelReservation.getHotelListSize();
		Assert.assertEquals(3, hotelListSize);
	}
}