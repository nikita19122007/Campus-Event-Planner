import java.util.Scanner;

// Interface 1
interface EventResources {
    void planSeats(int participants);
}

// Interface 2
interface EventSupport {
    void planVolunteers(int volunteers);
}

// Multiple Inheritance
class EventManager implements EventResources, EventSupport {

    int participants;
    int volunteers;

    public void planSeats(int p) {
        participants = p;
    }

    public void planVolunteers(int v) {
        volunteers = v;
    }

    void generatePlan(int duration) {

        int seats = participants;
        int tokens = participants;
        int volunteerCapacity = volunteers * 10;
        int score = participants + volunteers * 5 + duration * 2;

        System.out.println("\n===== EVENTSYNC PLAN =====");
        System.out.println("Participants       : " + participants);
        System.out.println("Event Duration     : " + duration + " hours");
        System.out.println("Volunteers         : " + volunteers);
        System.out.println("Seats Required     : " + seats);
        System.out.println("Entry Tokens       : " + tokens);
        System.out.println("Volunteer Capacity : " + volunteerCapacity);
        System.out.println("Event Score        : " + score);
    }
}

// Main Class
public class EventSync {

    // Call by Reference using Object Reference
    static void showEvent(EventManager e) {
        System.out.println("\n----- EVENT SUMMARY -----");
        System.out.println("Participants : " + e.participants);
        System.out.println("Volunteers   : " + e.volunteers);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EventManager e = new EventManager();

        // Dynamic Method Dispatch
        EventResources r = e;
        EventSupport s = e;

        System.out.print("Enter Number of Participants: ");
        int participants = sc.nextInt();

        System.out.print("Enter Event Duration: ");
        int duration = sc.nextInt();

        System.out.print("Enter Number of Volunteers: ");
        int volunteers = sc.nextInt();

        r.planSeats(participants);
        s.planVolunteers(volunteers);

        e.generatePlan(duration);

        // Passing object reference
        showEvent(e);

        sc.close();
    }
}
