package com.qris.payment.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.qris.payment.model.JsonHistoryPatner;
import com.qris.payment.model.TransactionPayment;

public interface TransactionRepo extends CrudRepository<TransactionPayment, Long> {
	
	TransactionPayment findByTransactionNumber(String Tran);
   


}
