package com.matiwa.conversion.service;

import org.springframework.stereotype.Service;

@Service
public class ConversionService implements IConversion {

	@Override
	public double GetKM(String miles) {
		
		return Double.parseDouble(miles) * 1.6  ;
	}

	@Override
	public double GetMiles(String km) {
		
		return  Double.parseDouble(km) / 1.6  ;
	}

	@Override
	public double GetCelcius(String kevin) {
		
		return Double.parseDouble(kevin) - 273.15 ;
	}

	@Override
	public double GetKevin(String celcius) {
		
		return Double.parseDouble(celcius) + 273.15 ;
	}
}
