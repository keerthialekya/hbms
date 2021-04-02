package com.cg.hbm.controller;

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

import com.cg.hbm.entities.BookingDetails;
import com.cg.hbm.exceptions.BookingDetailsNotFoundException;
import com.cg.hbm.service.IBookingDetailsService;
@RestController
@RequestMapping("/bookingdetails")
public class BookingDetailsController {
	@Autowired
	IBookingDetailsService bSer;
	/**
	 * 
	 * @param bookingdetails
	 * @return BookingDetails
	 */
	
	@PostMapping("/add")
	public BookingDetails addBookingDetails(@RequestBody BookingDetails bookingdetails) {
		return bSer.addBookingDetails(bookingdetails);
	}
	
	/**
	 * 
	 * @param bookingdetails
	 * @return BookingDetails
	 */
	
	@PutMapping("/update")
	public BookingDetails updateBookingDetails(@RequestBody BookingDetails bookingdetails) {
		return bSer.updateBookingDetails(bookingdetails);
	}
	
	
	/**
	 * 
	 * @param bookingdetails
	 * @return BookingDetails
	 * @throws BookingDetailsNotFoundException
	 */
	@DeleteMapping("/remove")
	public BookingDetails removeBookingDetails(@RequestBody BookingDetails bookingdetails)throws BookingDetailsNotFoundException {
	
		try {
		return bSer.removeBookingDetails(bookingdetails);
		}catch(Exception e)
     	{
		throw new BookingDetailsNotFoundException("booking_id not available please enter a valid number");
	    }
	}
	
	/**
	 * 
	 * @return List<BookingDetails>
	 */
	@GetMapping("/all")
	public List<BookingDetails> showAllBookingDetails(){
		return bSer.showAllBookingDetails();
	}
	/**
	 * 
	 * @param booking_id
	 * @return BookingDetails
	 * @throws BookingDetailsNotFoundException
	 */
	
	@GetMapping("/{booking_id}")
	public BookingDetails showBookingDetails(@PathVariable int booking_id)throws BookingDetailsNotFoundException {
		
		try {
		return bSer.showBookingDetails(booking_id);
		}catch(Exception e)
		{
			throw new BookingDetailsNotFoundException("bookingid not available.....give valid number");
		}
		}
	
}