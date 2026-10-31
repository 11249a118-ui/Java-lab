import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (temp > 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, digits);
            temp = temp / 10;
        }

        if (sum == num) {
            System.out.println(num + " is an Armstrong Number");
        } else {
            System.out.println(num + " is Not an Armstrong Number");
        }

        sc.close();
    }
}
