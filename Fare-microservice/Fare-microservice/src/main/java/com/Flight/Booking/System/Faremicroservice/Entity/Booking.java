package com.Flight.Booking.System.Faremicroservice.Entity;

import java.time.LocalDate;

import java.util.Date;
import java.util.List;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "booking")
public class Booking {

	
	private int bookingId;
	private String name;
	private String gender;
	private int age;
	private String address;
	private int seatnumber;
	private long bankid;
	private String origin;
	private String destination;
	private LocalDate bookingdate;

	public Booking() {

	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", name=" + name + ", gender=" + gender + ", age=" + age
				+ ", address=" + address + ", seatnumber=" + seatnumber + ", bankid=" + bankid + ", origin=" + origin
				+ ", destination=" + destination + ", bookingdate=" + bookingdate + "]";

	}

	public Booking(int bookingid, String name, String gender, int age, String address, int seatnumber, long bankid,
			String origin, String destination, String bookingdate, String flightstatus) {
		super();
		bookingId = bookingid;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;
		this.seatnumber = seatnumber;
		this.bankid = bankid;
		this.origin = origin;
		this.destination = destination;
		this.bookingdate = LocalDate.parse(bookingdate);

	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSeatnumber() {
		return seatnumber;
	}

	public void setSeatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}

	public long getBankid() {
		return bankid;
	}

	public void setBankid(long bankid) {
		this.bankid = bankid;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDate getBookingdate() {
		return bookingdate;
	}

	public void setBookingdate(String bookingdate) {
		this.bookingdate = LocalDate.parse(bookingdate);
	}

	

}
