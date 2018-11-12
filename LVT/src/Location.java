import java.util.*;

/*
 *  Location class -
 *  Represents a location that can store vehicles,
 *  launch vehicles to it's linked location and
 *  accept vehicles from it's linked location.
 *
 *  Needs interfaces, comparable? equals?.
 */

public class Location
{
    Location link;
    ArrayList<Vehicle> vehicles;

    private String locationName;
    private boolean maxTanks = false, maxTrains = false;
    public Location(String locName, boolean atMaxCapTanks, boolean atMaxCapTrains){
       locationName = locName;
       maxTanks = atMaxCapTanks;
       maxTrains = atMaxCapTrains;
    }

    Location() {
        this.link = null;
    }
    Location (Location link) {
        this.link = link;
    }
}
