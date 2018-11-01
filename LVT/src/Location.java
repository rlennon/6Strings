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

    Location() {
        this.link = null;
    }


    Location (Location link) {

        this.link = link;

    }
}
