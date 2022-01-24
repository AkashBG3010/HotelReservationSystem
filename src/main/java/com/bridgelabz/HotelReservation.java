package com.bridgelabz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

public class HotelReservation implements HotelReservationSystem {
	Hotel hotel;
	ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
	Scanner scanner = new Scanner(System.in);
	public void addHotel() {
		System.out.println("How the number of hotels that you want to add:");
		int numOfHotels = scanner.nextInt();
		
		while (numOfHotels > 0) {
			for (int counter=1; counter<=numOfHotels; counter++) {
		System.out.println("Enter the details accordingly to add the Hotel-"+counter+" to the list");
		
		System.out.println("Enter name of the hotel:");
		String hotelName = scanner.next();
		
		System.out.println("Enter the rating for hotel out of 5:");
		int hotelRating = scanner.nextInt();
		
		System.out.println("Enter the regular customer price(during Weekdays) for the hotel:");
		int priceInWeekDaysForCommons = scanner.nextInt();
		
//		System.out.println("Enter the rewarded customer price(during Weekdays) for the hotel:");
//		int priceInWeekDaysForRewards = scanner.nextInt();
//		
		System.out.println("Enter the regular customer price(during Weekends) for the hotel:");
		int priceInWeekEndsForCommons = scanner.nextInt();
//		
//		System.out.println("Enter the rewarded customer price(during Weekends) for the hotel:");
//		int priceInWeekEndsForRewards = scanner.nextInt();

		hotel = new Hotel(hotelName,hotelRating,priceInWeekDaysForCommons,priceInWeekEndsForCommons);
		hotelList.add(hotel);
			}
			break;
		}
	}
	public void printHotelList() {
		System.out.println(hotelList);
	}
	public int getHotelListSize() {
		return hotelList.size();
	}
	public ArrayList<Hotel> getHotelList(){
		return hotelList;
	}
	@Override
	public void addHotel(String hotelName, int hotelRating, int priceInWeekDaysForCommons, int  priceInWeekEndsForCommons) {
	}
	public String getCheapestHotel(LocalDate startDate, LocalDate endDate) {

		int numberOfDays = (int) ChronoUnit.DAYS.between(startDate, endDate);
        int weekends = 0;

		while (startDate.compareTo(endDate) != 0) {
            switch (DayOfWeek.of(startDate.get(ChronoField.DAY_OF_WEEK))) {
                case SATURDAY:
                    ++weekends;
                    break;
                case SUNDAY:
                    ++weekends;
                    break;
            }
            startDate = startDate.plusDays(1);
        }

		final int weekdaysNumber = numberOfDays - weekends;
		final int weekendsNumber = weekends;

		int cheapestRate = (int) (hotelList.get(0).getPriceInWeekDaysForCommons() + hotelList.get(0).getPriceInWeekEndsForCommons());
		String cheapestHotel=hotelList.get(0).getHotelName();
		int maxRating = hotelList.get(0).getHotelRating();
		for (Hotel hotel : hotelList) {
		            int rateForHotel = (int) ((weekdaysNumber * hotel.getPriceInWeekDaysForCommons())
		                    + (weekendsNumber * hotel.getPriceInWeekEndsForCommons()));
		            int ratingForHotel=hotel.getHotelRating();
		            if (rateForHotel < cheapestRate){
		                cheapestRate = rateForHotel;
		                cheapestHotel = hotel.getHotelName();
		                maxRating=ratingForHotel;
		            } else if (rateForHotel == cheapestRate) {
		                if(hotel.getHotelRating()>maxRating) {
		                    cheapestHotel = hotel.getHotelName();
		                    maxRating=ratingForHotel;
		                }
		            }
		 }
		System.out.println("Cheapest Hotel : " + cheapestHotel + ", having rating: "+maxRating+" , Total Rates: " + cheapestRate);
        return cheapestHotel;
	}
	public String getBestRatedHotel(LocalDate startDate, LocalDate endDate) {
		int rate=0;
		String ratedHotel = null;
		int numberOfDays = (int) ChronoUnit.DAYS.between(startDate, endDate);
        int weekends = 0;

		while (startDate.compareTo(endDate) != 0) {
            switch (DayOfWeek.of(startDate.get(ChronoField.DAY_OF_WEEK))) {
                case SATURDAY:
                    ++weekends;
                    break;
                case SUNDAY:
                    ++weekends;
                    break;
            }
            startDate = startDate.plusDays(1);
        }

		final int weekdaysNumber = numberOfDays - weekends;
		final int weekendsNumber = weekends;

		int maxRating = hotelList.get(0).getHotelRating();
		for (Hotel hotel : hotelList) {
				int rateForHotel = (int) ((weekdaysNumber * hotel.getPriceInWeekDaysForCommons())
                    + (weekendsNumber * hotel.getPriceInWeekEndsForCommons()));
	            int ratingForHotel=hotel.getHotelRating();
	            if (ratingForHotel > maxRating){
	                rate = rateForHotel;
	                ratedHotel = hotel.getHotelName();
	                maxRating=ratingForHotel;
	            }
		}
		System.out.println("Best Rated Hotel : " + ratedHotel + ", having rating: "+maxRating+" , Total Rates: " + rate);
		return ratedHotel;
	}

}