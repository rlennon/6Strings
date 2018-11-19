import java.util.*;
public class Vehicle{
    private String vehicleReg;
    private int minions, rockets;
    //constructor
   /*
   Constructors are more appropriate as we need to
   set a total number of minions and rockets
   even if the number is 0. Setters are somewhat optional
   in comparisson.
   */
    public Vehicle(String vReg, int mins, int rocks){
        vehicleReg = vReg;
        minions = mins;
        rockets = rocks;
    }
    /*setters *OBSELETE*
    public void setVehicleRed(String regNo){
         vehicleReg = regNo;
    }
    public void setMinionOrder(int totMinions){
         minions = totMinions;
    }
    public void setRocketsOrder(int totRockets){
         rockets = totRockets;
    }*/
    public void getFullOrder(){
        String fullOrder;
        fullOrder ="Vehicle Registration: " + vehicleReg + " (Minions: " + minions + ", Rockets: "  + rockets + ")\n";
        System.out.print(fullOrder);
    }
    //getters
    public String getVehicleReg(){
        return vehicleReg;
    }
    public int getMinionOrder(){
        return minions;
    }
    public int getRocketsOrder(){
        return rockets;
    }
    /*Weight MIGHT become an issue later down the line
    Just covering all bases.
    another function could be created for the likes of upgraded weaponry
    eg Advanced Rockets.
    */
    public double totalWeight(double weightOfMins, double weightOfRockets){
        double totalCombinedWeight = 0;
        totalCombinedWeight = weightOfMins + weightOfRockets;
        return totalCombinedWeight;
    }
}