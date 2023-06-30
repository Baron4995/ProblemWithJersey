package com.bookcab.service;

import java.util.Date;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/bookingcab")
public class BookCabService {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String bookCab() {
		String response = "You have succesfully book a cab on this date: "+ new Date();
		return response;
	}

}
