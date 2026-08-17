public class Person {

    String name;
    String building;
    double latitude;
    double longitude;

    Person(String name, String building,
           double latitude, double longitude) {

        this.name = name;
        this.building = building;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    void displayDetails() {

        System.out.println("\n===== EMERGENCY DETAILS =====");

        System.out.println("Person     : " + name);
        System.out.println("Building   : " + building);
        System.out.println("Latitude   : " + latitude);
        System.out.println("Longitude  : " + longitude);
    }
}