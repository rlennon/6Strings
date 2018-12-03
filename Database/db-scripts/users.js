conn = new Mongo();
db = conn.getDB("espirro");

db.users.insertMany([
	{
	name: "Eduardo Perez",
	password: "El_Macho"
	},

	{
	name: "Admin",
	password: "pollito"
	}
])
