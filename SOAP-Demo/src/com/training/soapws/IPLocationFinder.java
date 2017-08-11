package com.training.soapws;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("You need to pass only 1 IP address");
		}
		else {
			String ipAddress = args[0];
			//service.getCountryName(ipAddress);
			
			//SEI for Java; autogenerates 
			GeoIPService ipService = new GeoIPService();
			GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap();
			GeoIP geoIP = geoIPServiceSoap.getGeoIP(ipAddress);
			//stub.getCountryName(ipAddress);
	
			System.out.println(geoIP.getCountryName());
		}

	}

}
