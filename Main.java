import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("   FLOOD EMERGENCY RESCUE SYSTEM");
        System.out.println("=================================");

        System.out.print("Enter Person Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Building Name: ");
        String building = sc.nextLine();

        System.out.print("Enter Latitude: ");
        double latitude = sc.nextDouble();

        System.out.print("Enter Longitude: ");
        double longitude = sc.nextDouble();

        Person person = new Person(
            name,
            building,
            latitude,
            longitude
        );

        RescueSystem system = new RescueSystem();

        system.sendSOS(person);

        sc.close();
    }
}