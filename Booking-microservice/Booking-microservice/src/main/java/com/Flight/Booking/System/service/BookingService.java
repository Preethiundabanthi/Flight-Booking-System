package com.Flight.Booking.System.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.Flight.Booking.System.Entity.Booking;
import com.Flight.Booking.System.Repository.BookingRepository;

public class BookingService {

	@Autowired
	private static BookingRepository bookingrepository ;

	public BookingService(BookingRepository bookingrepository) {
		super();
		this.bookingrepository = bookingrepository;
	}
	
	public Booking saveBooking(Booking booking) {
		return bookingrepository.save(booking);
	}
	
	public static List<Booking> getAllBookings() {
		return bookingrepository.getAll();
	}


	public static List<Booking> getByBookingId(int bookingid) {
		return bookingrepository.getByBookingId(bookingid);
	}


	public static Booking updatebookingid(Booking bookingid1) {
		return bookingrepository.save(bookingid1);
	}
	
}
