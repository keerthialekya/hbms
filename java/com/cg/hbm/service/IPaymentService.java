package com.cg.hbm.service;


import java.util.List;
import com.cg.hbm.entities.Payments;
/*************************************************************************************************
 *@author          	Keerthi
 *Description      	It is a IPaymentService Interface and provides methods for the Implementation class.  
 *Version          	1.0
 *Created Date    	31-MAR-2021
 *************************************************************************************************/

public interface IPaymentService {
	
	public Payments addPayment(Payments payments);
	public List<Payments> showAllPayments() ;
	public Payments showPayments(int payment_id);
}
	
	
	
