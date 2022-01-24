package com.bridgelabz;

import java.time.LocalDate;
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
//		System.out.println("Enter the regular customer price(during Weekends) for the hotel:");
//		int priceInWeekEndsForCommons = scanner.nextInt();
//		
//		System.out.println("Enter the rewarded customer price(during Weekends) for the hotel:");
//		int priceInWeekEndsForRewards = scanner.nextInt();

		hotel = new Hotel(hotelName,hotelRating,priceInWeekDaysForCommons);
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

	public Hotel getCheapestHotel(LocalDate startDate, LocalDate endDate) {
		Optional<Hotel> resultList = hotelList.stream().min(Comparator.comparing(Hotel::getPriceInWeekDaysForCommons));
		return resultList.get();
	}
	@Override
	public void addHotel(String hotelName, int rating, double regularCustomerRate) {
	}
}