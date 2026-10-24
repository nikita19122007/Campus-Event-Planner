
class Event8A extends Thread {
    public void run() {
        System.out.println("Smart Event Planner");
        System.out.println("Registration: Registration system is active");
        System.out.println("Venue: Venue is ready");
        System.out.println("Volunteers: Volunteers are available");
        System.out.println("Schedule: Event schedule is confirmed");
        System.out.println("Certificates: Certificate system is ready");
        System.out.println("Refreshments: Arrangements are completed");
        System.out.println("All Event Services are Operational");
    }
}
class EventPlanner8A {
    public static void main(String[] args) {
        System.out.println("Event Control Center Started");
        Event8A event = new Event8A();
        System.out.println("Connecting to Event Services...");
        Thread t = new Thread(event);
        t.start();
        System.out.println("Event monitoring started");
    }
}
