package com.sapient.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sapient.dao.DaoImpl;
import com.sapient.dao.IDao;
import com.sapient.exceptions.BalException;
import com.sapient.exceptions.IdException;
import com.sapient.service.ISer;
import com.sapient.service.SerImpl;

public class TransferClient {

	private static Logger logger = LoggerFactory.getLogger("sapient");
	public static void main(String[] args) {
		logger.trace("main thred starts");
		ISer ser = new SerImpl();
		logger.debug("service instance created");
	
		try {
			logger.info("transfer the amount rs 5000 from account ID 1001 to 1002");
			ser.transferFund(1001, 1002, 5000);
			logger.info("successfully transfered");
		} catch (BalException | IdException e) {
			logger.error(e.getMessage(),e);
		}
		
		try {
			logger.info("transfer the amount rs 5000 from account ID 1003 to 1002");
			ser.transferFund(1003, 1002, 5000);
			logger.info("successfully transfered");
		} catch (BalException | IdException e) {
			logger.error(e.getMessage(),e);
		}
		
		try {
			logger.info("transfer the amount rs 5000 from account ID 2003 to 1002");
			ser.transferFund(2003, 1002, 5000);
			logger.info("successfully transfered");
		} catch (BalException | IdException e) {
			logger.error(e.getMessage(),e);
		}
		
		

	}

}
