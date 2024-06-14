import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input number of seats: ");
        int totalSeats = scanner.nextInt();
        
        PriceCalculator calculate = new PriceCalculator(new CalculationStrategy());
        calculate.execute(totalSeats);
        
    }


}
