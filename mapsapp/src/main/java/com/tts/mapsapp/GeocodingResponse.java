package com.tts.mapsapp;

import java.util.List;

import lombok.Data;

@Data
public class GeocodingResponse {

	//top level of JSON: results, status
	
	//names MUST MATCH to stash info
	private List<Geocoding> results;
	
	String status;
	
}

//this would be a model, in our normal file framework
