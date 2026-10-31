import java.util.Scanner;

class PredefinedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            String input = sc.nextLine();

            int age = Integer.parseInt(input);

            int result = 100 / (age - 18);

            System.out.println("Your age is: " + age);
            System.out.println("Result: " + result);
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number.");
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not possible.");
        }

        sc.close();
    }
}
