public class RescueSystem {

    RescueTeam team = new RescueTeam();

    void sendSOS(Person person) {

        System.out.println("\n📡 Sending SOS...");
        System.out.println("🚨 SOS ALERT SENT!");

        person.displayDetails();

        System.out.println("\n📡 GPS Location received by Control Room.");

        team.dispatchTeam();

        team.navigate(
            person.latitude,
            person.longitude
        );

        team.rescuePerson();
    }
}