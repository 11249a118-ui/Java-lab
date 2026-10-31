import java.util.Scanner;

class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String trains[] = {"TN01", "TN02", "TN03", "TN04", "TN05"};

        System.out.print("Enter train index: ");
        int index = sc.nextInt();

        try {
            System.out.println("Train Code: " + trains[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid train index!");
        }

        sc.close();
    }
}
