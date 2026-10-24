import java.util.Scanner;

// User-defined exception
class EventException extends Exception {
    public EventException(String message) {
        super(message);
    }
}

// Event Planner class
class EventPlanner {
    String eventName;
    String date;
    int guests;

    EventPlanner(String eventName, String date, int guests) {
        this.eventName = eventName;
        this.date = date;
        this.guests = guests;
    }

    void validateEvent() throws EventException {
        if (eventName == null || eventName.trim().isEmpty()) {
            throw new EventException("Event name cannot be empty.");
        }

        if (date == null || date.trim().isEmpty()) {
            throw new EventException("Event date cannot be empty.");
        }

        if (guests <= 0) {
            throw new EventException("Number of guests must be greater than 0.");
        }

        if (guests > 500) {
            throw new EventException("Maximum limit is 500 guests.");
        }
    }

    void displayEvent() {
        System.out.println("\n----- Event Details -----");
        System.out.println("Event Name : " + eventName);
        System.out.println("Date       : " + date);
        System.out.println("Guests     : " + guests);
        System.out.println("Event Status: Successfully Planned");
    }
}

public class EventPlannerApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== EVENT PLANNER APPLICATION =====");

        System.out.print("Enter Event Name: ");
        String eventName = sc.nextLine();

        System.out.print("Enter Event Date: ");
        String date = sc.nextLine();

        System.out.print("Enter Number of Guests: ");
        int guests = sc.nextInt();

        EventPlanner event = new EventPlanner(eventName, date, guests);

        try {
            event.validateEvent();
            event.displayEvent();
        } 
        catch (EventException e) {
            System.out.println("\nEvent Planning Failed!");
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
