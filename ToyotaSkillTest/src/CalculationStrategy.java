
public class CalculationStrategy implements IVehicle{

	private Vehicle smallVehicle;
	private Vehicle mediumVehicle;
	private Vehicle largeVehicle;
	private int totalCost;


	public CalculationStrategy() {
		this.smallVehicle = VehicleFactory.createVehicle("Small");
		this.mediumVehicle = VehicleFactory.createVehicle("Medium");
		this.largeVehicle = VehicleFactory.createVehicle("Large");
		this.totalCost = Integer.MAX_VALUE; 
	}


	@Override
	public void calculateResults(int seats) {
		for (int large = 0; large <= seats / largeVehicle.getSize(); large++) {
			
			for (int medium = 0; medium <= (seats - (large * largeVehicle.getSize())) / mediumVehicle.getSize(); medium++) {
				//2
				int remainingSeats = seats - (large * largeVehicle.getSize()) - (medium * mediumVehicle.getSize());
				int small = (remainingSeats + smallVehicle.getSize() - 1) / smallVehicle.getSize(); // Ceiling division

				int cost = large * largeVehicle.getPrice() + medium * mediumVehicle.getPrice() + small * smallVehicle.getPrice();

				if (cost < totalCost) {
					totalCost = cost;
					smallVehicle.setCount(small);
					int a = smallVehicle.getCount();
					mediumVehicle.setCount(medium);
					int b = mediumVehicle.getCount();
					largeVehicle.setCount(large);
					int c = largeVehicle.getCount();
				}
			}
		}	
	}



	@Override
	public void printResults() {
		if (largeVehicle.getCount() > 0) {
			System.out.println("Large x " + largeVehicle.getCount());
		}
		if (mediumVehicle.getCount() > 0) {
			System.out.println("Medium x " + mediumVehicle.getCount());
		}
		if (smallVehicle.getCount() > 0) {
			System.out.println("Small x " + smallVehicle.getCount());
		}
		System.out.println("Total = PHP " + totalCost);

	}

}
