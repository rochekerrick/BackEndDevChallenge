
public class PriceCalculator {
	
	private CalculationStrategy calculate;
	
	public PriceCalculator(CalculationStrategy calculate) {
		this.calculate = calculate;
	}
	
	public void execute(int seats) {
		calculate.calculateResults(seats);
		calculate.printResults();
	}
	

}
