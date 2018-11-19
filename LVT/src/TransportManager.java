/**
 * The class manages the moving of vehicles from one location to another
 *
 * @version v0.02
 * @author Jason Mc Clafferty
 *
 */





public class TransportManager
{
    Location start, dest;

    public TransportManager(Location start, Location dest) {
        this.start = start;
        this.dest = dest;
    }

    /**
     *
     * @param start - the location that the vehicle(s) are departing from.
     * @param dest - the location the vehicles are travelling towards.
     * @throws IndexOutOfBoundsException
     *
     */
    public void traverse(Location start, Location dest) {

        for (Vehicle v : start.vehicles) {
            dest.vehicles.add(v);
        }
    }

}
