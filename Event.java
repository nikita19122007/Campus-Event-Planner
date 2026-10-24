class Event {

    public String eventName = "Hackathon";
    private String department = "IT";
    static String college = "KPRIET";

    void display() {
        System.out.println("Event Name : " + eventName);
    }

    void display(String day) {
        System.out.println("Department : " + department);
        System.out.println("Event Day  : " + day);
    }

    static void showCollege() {
        System.out.println("College : " + college);
    }

    public static void main(String[] args) {
        Event e = new Event();

        e.display();
        e.display("Friday");

        Event.showCollege();

        System.out.println("Public Variable : " + e.eventName);
    }
}