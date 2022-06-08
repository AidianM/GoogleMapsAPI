package com.tts.mapsapp;

import java.util.List;

import lombok.Data;

@Data
public class Geocoding {

	private String formatted_address;
	private Geometry geometry; //made of multiple things? Must unpack to Geometry object
	private String place_id;
	private List<String> Types; //multiple types, all String? List<String>
	
	//you can add as many as you want, just have to match 1:1 naming
}

//next level of the JSON file