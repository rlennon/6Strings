public class Vehicle
{
    /*
    * Vehicle class -
    * Represents a vehicle with height, weight,
    * capacity, and an id number.
    *
    * Needs interfacing - transportable, stockable, storeable.
    */


    private float height, weight, capacity;
    private String id;

    Vehicle(String id, float height, float weight, float capacity) {

        this.id = id;
        this.height = height;
        this.weight = weight;
        this.capacity = capacity;
    }

    Vehicle(String id) {
        this.id = id;
    }

    public float getCapacity() {
        return capacity;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Height: " + getHeight() + ". Weight: " + getWeight() + ". Capacity Remaining: " + getCapacity() + ".";
    }
}
