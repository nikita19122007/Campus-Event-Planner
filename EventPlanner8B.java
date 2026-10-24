
class Event8B implements Runnable {
    public void run() {
        System.out.println("Event Registration System");
        System.out.println("------------------------");
        System.out.println("Student Registration: Active");
        System.out.println("Team Formation: Available");
        System.out.println("Event Pass: Ready");
        System.out.println("Participant List: Updated");
        System.out.println("Entry Verification: Active");
        System.out.println("Registration Process Completed");
    }
}
class EventPlanner8B {
    public static void main(String[] args) {
        System.out.println("Registration Center Started");
        Event8B event = new Event8B();
        System.out.println("Starting Registration Service...");
        Thread t = new Thread(event);
        t.start();
        System.out.println("Registration monitoring started");
    }
}

