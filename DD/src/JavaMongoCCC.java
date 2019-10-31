import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class JavaMongoCCC {

	public static void main(String[] args) throws UnknownHostException{
		//connecting to a server
		MongoClient mongoClient = new MongoClient("localhost",27017);
		System.out.println("server connection successfully done");
		//connecting to a database
		DB dbs = mongoClient.getDB("rr");
		System.out.println("connection done");
		System.out.println("DataBase name:"+dbs.getName());
		//Create Collection
		DBCollection coll=dbs.getCollection("test");
		System.out.println("collection created successfully");
		
		/**************************************/
		
		
		/*affichage 1
		DBCursor cursor=coll.find();
		while(cursor.hasNext()) {
			//projection "ville"
			System.out.println(cursor.next().get("ville"));
		}*/
		
		
		/**************************************/
		
		
		//affichage 2
		BasicDBObject doc = new BasicDBObject("ville","casa");
		DBCursor cursor=coll.find(doc);
		while(cursor.hasNext()) {
			System.out.println(cursor.next());
		
		}
		
		/**************************************/
		/*
		DBCursor cursor=coll.find();
		while(cursor.hasNext()) {
			System.out.println(cursor.next());
		
		}
		
		//update document
		BasicDBObject updatedDocument = new BasicDBObject();
		//New Value
		updatedDocument.append("$set", new BasicDBObject().append("ville", "fes"));
		//old document
		BasicDBObject oldDocument = new BasicDBObject().append("ecole_id", "564378");
		coll.update(oldDocument, updatedDocument,false,false);
		System.out.println("Document Updated ...");
		cursor=coll.find();
		while(cursor.hasNext()) {
			System.out.println(cursor.next());
		
		}
		
		//delete a document
		DBCursor cursor1=coll.find();
		while(cursor1.hasNext()) {
			System.out.println(cursor1.next());
		
		}
		System.out.println("After Delete ");
		BasicDBObject del = new BasicDBObject("ville","rabat");
		coll.remove(del);
		cursor1=coll.find();
		while(cursor1.hasNext()) {
			System.out.println(cursor1.next());
		
		}
		
		//to drop the collection
		coll.drop();
		System.out.println("Collection Dropped");
		*/
		
		
}
	}