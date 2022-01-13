package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelDetails {
	static Scanner scanner = new Scanner(System.in);
	static String hotelName;
	static double priceForRegularCustomer;
	static HotelList[] hotelDetails = new HotelList[10];
		Scanner sccanner = new Scanner(System.in);
		ArrayList<HotelList> hotelList = new ArrayList<HotelList>();
		HotelList hotel;
		public void addHotel() {
				System.out.println("Enter hotel name:");
				hotelName = scanner.next();
				
				System.out.println("Enter regular customer rate:");
				priceForRegularCustomer = scanner.nextDouble();
				
				hotel = new HotelList(hotelName,priceForRegularCustomer);
				hotelList.add(hotel);
			}
	}