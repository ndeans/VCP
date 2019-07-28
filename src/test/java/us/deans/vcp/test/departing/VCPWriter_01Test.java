package us.deans.vcp.test.departing;

import org.junit.Test;

import us.deans.vcp.departing.VCPWriter;
import us.deans.vcp.departing.VCPWriter_01;

public class VCPWriter_01Test {

	@Test
	public void testVCPWriter_01() {
		
		VCPWriter vcpw = new VCPWriter_01();
		vcpw.writeDeparting();
		assert(true);
		
	}
	
}
