import java.util.*; 
public class vehiclesTester{

   public static void main(String [] args){
      /*Testing purposes
      vehiclesUpdated tank1 = new vehiclesUpdated("tnk001", 10, 30);
      tank1.getFullOrder();  
      */
      Random randRegGen = new Random();
      ArrayList <vehiclesUpdated> totTanks = new ArrayList();
      Scanner orderNo = new Scanner(System.in);
      
      for(int temp = 0; temp < 4; temp++){
      
      
         int reg = randRegGen.nextInt(100)+1;
         int orderMins = orderNo.nextInt();
         int orderRocks = orderNo.nextInt();
         String regPlate = "tnk" + reg;
         
         
         vehiclesUpdated newTank = new vehiclesUpdated(regPlate, orderMins,orderRocks);
         totTanks.add(newTank);               
      }   
      for(vehiclesUpdated tanks: totTanks){
         tanks.getFullOrder();
      }
   }
}