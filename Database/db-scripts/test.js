conn = new Mongo();
db = conn.getDB("espirro");

//db = connect("localhost:27020/myDatabase");
db.adminCommand('listDatabases');

//show collections

//show collection documents
db.getCollectionNames();
db.vehicles.find().pretty();
db.locations.find().pretty();
db.rockets.find().pretty();
db.users.find().pretty();

