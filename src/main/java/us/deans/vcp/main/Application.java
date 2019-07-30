package us.deans.vcp.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import us.deans.vcp.arriving.VCPReader;
import us.deans.vcp.arriving.VCPReader_01;
import us.deans.vcp.departing.VCPWriter;
import us.deans.vcp.departing.VCPWriter_01;


public class Application {

	private static final Logger logger = LogManager.getLogger(Application.class.getName());
	
	public static void main(String[] args) {

		String message;
		
		VCPReader reader = new VCPReader_01();
		VCPWriter writer = new VCPWriter_01();

		logger.info("Starting Test...");
		
		message = reader.readArriving();
		writer.writeDeparting(message);
		
		
	}

}
