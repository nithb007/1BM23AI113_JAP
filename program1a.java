import java.util.Scanner;
public class program1a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("GYM MEMBERSHIP MANAGEMENT PROGRAM");

        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter membership status (Active/Inactive): ");
        String membership_status = scanner.next();

        System.out.print("Enter membership duration (in months): ");
        int mem_duration = scanner.nextInt();


        double monthlyFee = 1000.00;
        double totalFee = mem_duration * monthlyFee;

        System.out.println("\nCUSTOMER DETAILS:");
        System.out.println("Customer Name : " + name);
        System.out.println("Customer Age: " + age);
        System.out.println("Membership status: " + membership_status);
        System.out.println("Membership duration: " + mem_duration + " months");
        System.out.printf("Total Membership fee: "+ totalFee);
    }
}

