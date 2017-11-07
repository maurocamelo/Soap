package org.mc.anagrafica.ws;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import org.mc.anagrafica.ws.AnagraficaServiceStub;



import org.mc.anagrafica.ws.AnagraficaServiceStub.AnagraficaResponse;
import org.mc.anagrafica.ws.AnagraficaServiceStub.FindAnagraficaResponse;

/*
 *  AnagraficaServiceTest Junit test case
 */

public class AnagraficaClient {

	/**
	 * Auto generated test method
	 */
	public AnagraficaResponse findAnagrafica(String codiceFiscale)
			throws java.lang.Exception {

		
		
		org.mc.anagrafica.ws.AnagraficaServiceStub stub = new org.mc.anagrafica.ws.AnagraficaServiceStub();
		
		org.mc.anagrafica.ws.AnagraficaServiceStub.AnagraficaRequest request = new org.mc.anagrafica.ws.AnagraficaServiceStub.AnagraficaRequest(); 

		org.mc.anagrafica.ws.AnagraficaServiceStub.FindAnagrafica findAnagrafica = (org.mc.anagrafica.ws.AnagraficaServiceStub.FindAnagrafica) getObject(org.mc.anagrafica.ws.AnagraficaServiceStub.FindAnagrafica.class);
		
		findAnagrafica.setAnagraficaRequest(request);

		findAnagrafica.getAnagraficaRequest().setCodiceFiscale(codiceFiscale);

		FindAnagraficaResponse response = stub.findAnagrafica(findAnagrafica);

		AnagraficaResponse anagraficaResponse = response.get_return();

		
		
		
		System.out.println("Risultato : "+response.get_return());

		return anagraficaResponse;
	}

	// Create an ADBBean and provide it as the test object
	public org.apache.axis2.databinding.ADBBean getObject(java.lang.Class type)
			throws java.lang.Exception {
		return (org.apache.axis2.databinding.ADBBean) type.newInstance();
	}

}
