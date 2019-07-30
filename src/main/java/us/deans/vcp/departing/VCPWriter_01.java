package us.deans.vcp.departing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import us.deans.vcp.main.Application;

public class VCPWriter_01 implements VCPWriter {

	private Logger logger = LogManager.getLogger(Application.class.getName());
	
	public void writeDeparting(String msg) {
		logger.info(msg);
	}

}
