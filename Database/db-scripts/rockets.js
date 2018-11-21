conn = new Mongo();
db = conn.getDB("espirro");
//create rocket collection
//db.createCollection("rockets");

//insert document

db.rockets.insertMany([
    {
	name: "V2",
	type: "rocket",
	minions: 2
	},
    {
	name: "Heat Seeker",
	type: "advanced rocket",
	minions: 5
    }
])


//Remove rockets by type
//db.rockets.remove({'name':'V2'});
//db.rockets.remove({'name':'Heat Seeker'});
