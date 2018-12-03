conn = new Mongo();
db = conn.getDB("espirro");

//db.createCollection("vehicles");

//Add many documents to the vehicle Collection

db.vehicles.insertMany([
    {
	_id: "12DL181",
	vehicleType: "Tank",
	minions: 0,
	rockets: 0,
	advRockects: 0
	},

	{
	_id: "70DL131",
	vehicleType: "Tank",
	minions: 0,
	rockets: 0,
	advRockects: 0
	},

	{
	_id: "97 80 8194",
	vehicleType: "Train",
	minions: 0,
	rockets: 0,
	advRockects: 0
	},

	{
	_id: "94 51 2140",
	vehicleType: "Train",
	minions: 0,
	rockets: 0,
	advRockects: 0
    },

    {
    _id: "30DL181",
    vehicleType: "Tank",
    minions: 0,
    rockets: 0,
    advRockects: 0
    },
	{
    _id: "17DL181",
    vehicleType: "Tank",
    minions: 0,
    rockets: 0,
    advRockects: 0
    },
    {
    _id: "29DL181",
    vehicleType: "Tank",
    minions: 0,
    rockets: 0,
    advRockects: 0
    },
    {
    _id: "96 15 5078",
    vehicleType: "Train",
    minions: 0,
    rockets: 0,
    advRockects: 0
    },
    {
    _id: "99 56 2140",
    vehicleType: "Train",
    minions: 0,
    rockets: 0,
    advRockects: 0
    },
    {
    _id: "98 04 8391",
    vehicleType: "Train",
    minions: 0,
    rockets: 0,
    advRockects: 0
    }

])