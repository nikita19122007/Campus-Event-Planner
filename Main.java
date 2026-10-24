class Event {

    String studentName;
    String department;
    String eventName;

    Event() {
        studentName = "Not Registered";
        department = "Not Assigned";
        eventName = "No Event";
    }

    Event(String name, String dept, String event) {
        studentName = name;
        department = dept;
        eventName = event;
    }

    void display() {
        System.out.println("Student Name : " + studentName);
        System.out.println("Department   : " + department);
        System.out.println("Event Name   : " + eventName);
    }
}

public class Main {
    public static void main(String[] args) {

        Event e1 = new Event();
        e1.display();

        Event e2 = new Event("Nikita", "IT", "Hackathon");
        e2.display();
    }
}