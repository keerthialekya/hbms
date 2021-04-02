package com.cg.hbm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.hbm.entities.Payments;
import com.cg.hbm.exceptions.PaymentNotFoundException;
import com.cg.hbm.service.IPaymentService;
@RestController
@RequestMapping("/payment")
public class PaymentController {
	@Autowired
	IPaymentService iSer;
	
	/**
	 * 
	 * @param payment
	 * @return payment
	 */
	
	@PostMapping("/add")
	public Payments addPayment(@RequestBody Payments payment) {
		return iSer.addPayment(payment);
	}
	
	/**
	 * 
	 * @return list of payments
	 */
	@GetMapping("/all")
	public List<Payments> showAllPayments(){
		return iSer.showAllPayments();
	}
	/**
	 * 
	 * @param payment_id
	 * @return payments
	 * @throws PaymentNotFoundException
	 */
	
	@GetMapping("/{payment_id}")
	public Payments showPayments(@PathVariable int payment_id)throws PaymentNotFoundException {
		
		try {
		return iSer.showPayments(payment_id);
		}catch(Exception e)
		{
			throw new PaymentNotFoundException("payment id not available.....give valid number");
		}
		}
	
}