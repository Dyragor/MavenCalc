import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Zahl ");
        String input1 = scanner.nextLine();
        System.out.print("2. Zahl ");
        String input2 = scanner.nextLine();
        System.out.println(calc.addition(Double.parseDouble(input1), Double.parseDouble(input2)));
        scanner.close();
    }
}
