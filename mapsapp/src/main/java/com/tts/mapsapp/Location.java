package com.tts.mapsapp;

import lombok.Data;

@Data
public class Location {


	private String lat;
	private String lng;
	
	//these two fields are NOT in JSON, and won't be unpacked; they're private fields to store city and state because
	//the Location class does double duty as both a class used for JSON deserialization (unpacking) and as a utility
	//class for us to store location info. Not best practice, but here we are.
	private String city;
	private String state;
}
//ENHANCE GRANULARITY