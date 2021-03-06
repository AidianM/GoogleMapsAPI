package com.tts.mapsapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class MapService {
	@Value("${api_key}")
	private String apiKey;

	
	public void addCoordinates(Location location) {
		String url = "https://maps.googleapis.com/maps/api/geocode/json?address="+
				location.getCity()+","+location.getState()+"&key="+apiKey;
		
		//pulling a Rest Template 
		RestTemplate restTemplate = new RestTemplate();
		
		//will stuff any rest template it sees into this response object:
		GeocodingResponse response = restTemplate.getForObject(url, GeocodingResponse.class);
		
		Location coordinates = response.getResults().get(0).getGeometry().getLocation();
		//we need classes for every level of deserialization, so we've got Geocoding/Geometry/Location etc
		
		location.setLat(coordinates.getLat());
		location.setLng(coordinates.getLng());
	}
}
