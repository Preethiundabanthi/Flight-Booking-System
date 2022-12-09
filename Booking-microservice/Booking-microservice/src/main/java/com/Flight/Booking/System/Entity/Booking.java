package com.Flight.Booking.System.Entity;

import java.sql.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="reservation")
public class Booking {

	private int bookingId;
	private String name;
	private String gender;
	private String age;
	private String address;
	private String seats;
	private String bankid;
	private String origin;
	private String destination;
	private Date bookingdate;
	private long flightstatus ;
	
	public Booking() {
		
	}

	@Override
	public String toString() {
		return "Booking [Id=" + bookingId + ", name=" + name + ", gender=" + gender + ", age=" + age + ", address=" + address
				+ ", seats=" + seats + ", bankid=" + bankid + ", origin=" + origin + ", destination=" + destination
				+ ", date=" + bookingdate + ", flightstatus=" + flightstatus + "]";
	}

	public Booking(int bookingid, String name, String gender, String age, String address, String seats, String bankid,
			String origin, String destination, Date bookingdate, long flightstatus) {
		super();
		bookingId = bookingid;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;
		this.seats = seats;
		this.bankid = bankid;
		this.origin = origin;
		this.destination = destination;
		this.bookingdate = bookingdate;
		this.flightstatus = flightstatus;
	}

	public int getbookingId() {
		return bookingId;
	}

	public void setId(int id) {
		bookingId = id;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSeats() {
		return seats;
	}

	public void setSeats(String seats) {
		this.seats = seats;
	}

	public String getBankid() {
		return bankid;
	}

	public void setBankid(String bankid) {
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

	public Date getDate() {
		return bookingdate;
	}

	public void setDate(Date date) {
		this.bookingdate = date;
	}

	public long getflightstatus() {
		return flightstatus;
	}

	public void setPhoneno(long flightstatus) {
		this.flightstatus = flightstatus;
	}




	
	
}
