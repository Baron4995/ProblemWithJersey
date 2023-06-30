package com.bookcab.client;

import java.net.URI;

import org.glassfish.jersey.client.ClientConfig;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
//import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriBuilder;

public class BookCabClient {
	
	WebTarget target;
	
	public BookCabClient() {
		
		ClientConfig configuration = new ClientConfig();
		Client client = ClientBuilder.newClient(configuration);
		URI uri = UriBuilder.fromUri("http://localhost:8080/bookCab4").build();
		target = client.target(uri);
	}
	
	public String getPlainResponse() {
		
		try {
			String response = target.path("rest").path("bookingcab").request().accept(MediaType.TEXT_PLAIN).get(String.class);
			return response;
//			Response body = Response.status(200).entity(target.path("rest").path("bookingcab")).build();
//			 return body.getEntity().toString();
		} catch (Exception e) {
			System.out.println("Here it is what happened -> "+e.getMessage());
		}
		return "something went wrong";
	}

}
