package GetStarted;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

/**
 * Simple application that shows how to use Azure Cosmos DB with the MongoDB API and Java.
 *
 */
public class MongoDB_Test {
	
    public static void main(String[] args)
    {
	/*
	* Replace connection string from the Azure Cosmos Portal
        */
        MongoClientURI uri = new MongoClientURI("FILLME");
		
        MongoClient mongoClient = null;
        try {
            mongoClient = new MongoClient(uri);        
            
            // Get database
            MongoDatabase database = mongoClient.getDatabase("db");

            // Get collection
            MongoCollection<Document> collection = database.getCollection("coll");

            // Insert documents
            Document document1 = new Document("fruit", "apple");
            collection.insertOne(document1);
            
            Document document2 = new Document("fruit", "mango");
            collection.insertOne(document2);            

            // Find fruits by name
            Document queryResult = collection.find(Filters.eq("fruit", "apple")).first();
            System.out.println(queryResult.toJson());    	
        	
            System.out.println( "Completed successfully" );  
            
        } finally {
        	if (mongoClient != null) {
        		mongoClient.close();
        	}
        }
    }
}
