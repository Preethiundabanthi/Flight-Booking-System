package com.Flight.Booking.System.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.Flight.Booking.System.Entity.Booking;

public interface BookingRepository extends MongoRepository<Booking, String>{

	List<Booking> getByBookingId(int bookingid);

	List<Booking> getAll();

	Object deleteByBookingId(int bookingid);

	


    
      
     
	
    
}
