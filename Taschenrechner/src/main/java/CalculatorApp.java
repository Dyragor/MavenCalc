import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        boolean calculating = true;
        Calculator calc = new Calculator();
        while(calculating){
            Scanner scanner = new Scanner(System.in);
            System.out.print("(Start/Exit) -> ");
            String input = scanner.nextLine();
        }
    }
}
