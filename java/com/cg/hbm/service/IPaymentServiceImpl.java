package com.cg.hbm.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.hbm.entities.Payments;
import com.cg.hbm.dao.IPaymentRepository;

@Service
public class IPaymentServiceImpl implements IPaymentService{
	@Autowired
	IPaymentRepository pDao;
	/**
	 * @author Keerthi
	 * @return Payment
	 * @param payment
	 */
	@Override
	public Payments addPayment(Payments payment) {
		return pDao.save(payment);
	}
	/**
	 * @author Keerthi
	 * @return list of payments
	 */
	@Override
	public List<Payments> showAllPayments() {
		return pDao.findAll();
	}
	/**
	 * @author Keerthi
	 * @return Payment
	 * @param payment_id
	 */
	@Override
	public Payments showPayments(int payment_id) {
		return pDao.findById(payment_id).get();
	}

}
