import java.util.*;

public class Main {
       public static void main(String[] args) {
      	Scanner keyIn = new Scanner(System.in);
        int result;
        float exchange, input, output123;
        CurrencyConverter converter = new CurrencyConverter();
        //allows user to enter amount to convert 
        System.out.println("Welcome BananaBucks Currency Converter!");
        System.out.println("What is the current exchange rate from Dollars to Bananabucks?");
        exchange = keyIn.nextFloat();
        System.out.println("Enter 1 to convert from BananaBucks to Dollars and 2 to convert from Dollars to BananaBucks");
        result = keyIn.nextInt();
        System.out.println("How much would you like to convert?");
        input = keyIn.nextFloat();
        while ((result < 1) || (result > 2)) {
            System.out.println("Enter 1 to convert from BananaBucks to Dollars and 2 to convert from Dollars to BananaBucks");
            result = keyIn.nextInt();
        }
        if (result == 1) {
            output123 = converter.DollarsBananaBucks(input, exchange);
            System.out.println(output123);
        } else if (result == 2) {
            output123 = converter.BananaBucksDollars(input, exchange);
            System.out.println(output123);
        }
       }
      } 
      
      