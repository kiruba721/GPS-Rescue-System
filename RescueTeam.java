public class RescueTeam {

    void dispatchTeam() {

        System.out.println("\n🚨 Rescue Team Dispatched!");
    }

    void navigate(double latitude, double longitude) {

        System.out.println("\n📍 Navigating to:");
        System.out.println("Latitude  : " + latitude);
        System.out.println("Longitude : " + longitude);
    }

    void rescuePerson() {

        System.out.println("\n🏢 Person located on LAST FLOOR.");
        System.out.println("🚨 Rescue operation started...");
        System.out.println("✅ Person safely rescued!");
    }
}