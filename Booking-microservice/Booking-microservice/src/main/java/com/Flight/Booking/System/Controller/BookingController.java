package com.Flight.Booking.System.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Flight.Booking.System.Entity.Booking;
import com.Flight.Booking.System.Repository.BookingRepository;
import com.Flight.Booking.System.service.BookingService;

@RestController
@RequestMapping("/tickets")
public class BookingController {
	
	@Autowired
	private BookingRepository bookingRepository;

	public BookingController(BookingRepository bookingRepository) {
		this.bookingRepository = bookingRepository;
	}
    
	@GetMapping("getallbookings")
	public List<Booking> getAllbooking() {
		return BookingService.getAllBookings();
		}
	
	@GetMapping("{bookingid}")
	public List<Booking> getByflightstatus(@PathVariable int bookingid) {
		return BookingService.getByBookingId(bookingid);
     }
	
	@PostMapping("/booking")
	public Booking adding(@RequestBody Booking booking) {
	return BookingService.updatebookingid(booking);
	}
	
	@DeleteMapping("/delete/{bookingid}")  
	public Object deleteBooking(@RequestBody int bookingid)   {  
	  return bookingRepository.deleteByBookingId(bookingid);
	}  
	
	@PutMapping("update/bookingid")  
	private Booking update(@RequestBody  Booking bookingid1,@PathVariable int id)  {  
	return BookingService.updatebookingid(bookingid1);  
}
}
