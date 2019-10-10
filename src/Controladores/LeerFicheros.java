package Controladores;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

import Modelos.Airline;
import Modelos.Airport;
import Modelos.Route;

public class LeerFicheros {

	
	public ArrayList<Airport> leerAerpouertos() throws IOException{
		ArrayList<Airport> airportList = new ArrayList<Airport>();
		String[] lines = Files.readAllLines(new File("airports.dat").toPath()).toArray(new String[0]);
		for(String line: lines) {
			System.out.println(line);
			/*
		    int courseId = Integer.parseInt(line.substring(0, 4));
		    String studentName = line.substring(4, 24).trim();*/
		    // etc...
		}
		return airportList;
	}
	
	public ArrayList<Route> leerRutas(){
		ArrayList<Route> airportList = new ArrayList<Route>();
		
		
		return airportList;
	}
	
	public ArrayList<Airline> leerAerolinea(){
		ArrayList<Airline> airportList = new ArrayList<Airline>();
		
		
		return airportList;
	}
}
