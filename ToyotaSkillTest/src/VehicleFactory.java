
public class VehicleFactory {
	
	public static Vehicle createVehicle(String type) {
		
		switch(type) {
			case "Small":
				return new Vehicle("Small", 5, 5000);
			case "Medium":
				return new Vehicle("Medium", 10, 8000);
			case "Large":
				return new Vehicle("Large", 15, 12000);
			default:
				throw new IllegalArgumentException("Unknown Vehicle type " + type);
		
		
		}
	}
}
