conn = new Mongo();
db = conn.getDB("espirro");

db.createCollection("locations");

db.locations.insert({
	{
	_id: "Site A",
	maxTrains: 2,
	maxTanks: 5,
	offLoad_Time: 1
	},

	{
	_id: "Site B",
	maxTrains: 2,
	maxTanks: 5,
	offLoad_Time: 1
	}
})