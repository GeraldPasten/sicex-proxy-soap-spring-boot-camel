package cl.gob.hacienda.sicex.middleware.procesadores;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

import cl.gob.hacienda.sicex.middleware.exception.BadRequestException;

public class ProcesadorRequestBeanBase implements Processor {

	private static final Logger logger = Logger.getLogger(ProcesadorRequestBeanBase.class);

	@Override
	public void process(Exchange exchange) throws BadRequestException {

		String param1 = (String) exchange.getIn().getHeader("param1");

		// Log del Request
		logger.info("Parametros Request");
		logger.info("param1: " + param1);
		
	}
}
