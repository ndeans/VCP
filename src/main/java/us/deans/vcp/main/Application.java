package us.deans.vcp.main;

import us.deans.vcp.arriving.VCPReader;
import us.deans.vcp.arriving.VCPReader_01;
import us.deans.vcp.departing.VCPWriter;
import us.deans.vcp.departing.VCPWriter_01;

public class Application {

	public static void main(String[] args) {

		String message;
		
		VCPReader reader = new VCPReader_01();
		VCPWriter writer = new VCPWriter_01();
		
		message = reader.readArriving();
		writer.writeDeparting(message);
		
	}

}
