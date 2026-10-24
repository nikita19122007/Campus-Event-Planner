import java.util.Scanner;

class Registration {

    String studentName;
    String department;
    String eventName;

    Registration() {
        studentName = "Not Registered";
        department = "Not Assigned";
        eventName = "No Event";
    }

    Registration(String name, String dept, String event) {
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

public class ConstructorDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

 
        Registration r1 = new Registration();
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Event Name: ");
        String event = sc.nextLine();

        Registration r2 = new Registration(name, dept, event);

        System.out.println("\nDefault Constructor");
        r1.display();

        System.out.println("\nParameterized Constructor");
        r2.display();

        sc.close();
    }
}