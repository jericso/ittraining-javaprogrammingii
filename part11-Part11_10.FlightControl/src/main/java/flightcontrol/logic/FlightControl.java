package flightcontrol.logic;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import flightcontrol.domain.Airplane;
import flightcontrol.domain.Place;
import flightcontrol.domain.Flight;

public class FlightControl {

    private HashMap<String, Airplane> airplanes = new HashMap<>();
    private Map<String, Place> places;
    private HashMap<String, Flight> flights = new HashMap<>();

    public FlightControl() {
        this.airplanes = new HashMap<>();
        this.places = new HashMap<>();
        this.flights = new HashMap<>();
    }

    public void addAirplane(String ID, int capacity) {
        Airplane plane = new Airplane(ID, capacity);
        this.airplanes.put(ID, plane);
    }

    public void addFlight(Airplane plane, String departureID, String destinationID) {
        this.places.putIfAbsent(departureID, new Place(departureID));
        this.places.putIfAbsent(destinationID, new Place(destinationID));

        Flight flight = new Flight(plane, this.places.get(departureID), this.places.get(destinationID));
        this.flights.put(flight.toString(), flight);
    }

    public Collection<Airplane> getAirplanes() {
        return this.airplanes.values();
    }

    public Collection<Flight> getFlights() {
        return this.flights.values();
    }

    public Airplane getAirplane(String ID) {
        return this.airplanes.get(ID);
    }
}
