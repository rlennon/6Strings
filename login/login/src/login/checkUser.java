/**
 * 
 */
package login;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;

import org.bson.Document;
import java.util.Arrays;
import com.mongodb.Block;

import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Updates.*;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;

/**
 * @author whori
 *
 */
public class checkUser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner (System.in);  

			String username, password;
			boolean auth;

			//System.out.println("Welcome to EP online Transport System!");
			System.out.print("\nPlease enter your Username and Password to Login.");    

			System.out.print("\nUsername: ");
	        username = input.nextLine();

	        System.out.print("Password: ");
	        password = input.nextLine();
	        
	        Authenticator authUser = new Authenticator();
	        
	        if(authUser.checkUser(username,password)) {
	        	auth = true;
	        }
	        
	        else {
	        	auth = false;
	        }

	        //UserAccount login = new UserAccount(username, password);

	        /*if(login.checkPassword())
	            System.out.println("You are logged in!");
	        else
	            System.out.println("The username and password you entered are incorrect.");*/
	}

}
