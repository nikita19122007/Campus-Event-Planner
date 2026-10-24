import java.util.Scanner;

class Student {
    String name;
    String dept;

    void getDetails(String n, String d) {
        name = n;
        dept = d;
    }
}

class Event extends Student {

    String event;
    String day;
    String venue;
    int members;
    int fee;

    void getEvent(String e, String d, String v, int m, int f) {
        event = e;
        day = d;
        venue = v;
        members = m;
        fee = f;
    }

    void display() {
        System.out.println("\n----- EVENT DETAILS -----");
        System.out.println("Student Name : " + name);
        System.out.println("Department   : " + dept);
        System.out.println("Event        : " + event);
        System.out.println("Day          : " + day);
        System.out.println("Venue        : " + venue);
        System.out.println("Members      : " + members);
        System.out.println("Base Fee     : Rs." + fee);
    }

    void smartPass() {

        if (dept.equals("CSE") || dept.equals("IT") ||
            dept.equals("AIML") || dept.equals("AIDS") ||
            dept.equals("CSBS")) {

            System.out.println("Smart Pass   : TECHNICAL PASS");
        }
        else if (dept.equals("ECE") ||
                 dept.equals("Civil") ||
                 dept.equals("Mechanical")) {

            System.out.println("Smart Pass   : CORE PASS");
        }
        else {
            System.out.println("Smart Pass   : GENERAL PASS");
        }
    }

    void teamBonus() {

        if (members >= 4) {
            System.out.println("Team Bonus   : 30% Discount");
        }
        else {
            System.out.println("Team Bonus   : Not Available");
        }
    }

    void smartFee() {

        int finalFee = fee;

        if (members >= 4) {
            finalFee = fee - (fee * 30 / 100);
        }

        System.out.println("Final Fee    : Rs." + finalFee);
    }
}

public class Planner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Event e = new Event();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Event Name: ");
        String event = sc.nextLine();

        System.out.print("Enter Event Day: ");
        String day = sc.nextLine();

        System.out.print("Enter Venue: ");
        String venue = sc.nextLine();

        System.out.print("Enter Number of Members: ");
        int members = sc.nextInt();

        System.out.print("Enter Registration Fee: ");
        int fee = sc.nextInt();

        e.getDetails(name, dept);
        e.getEvent(event, day, venue, members, fee);

        e.display();

        System.out.println("\n----- SMART REGISTRATION -----");
        e.smartPass();
        e.teamBonus();
        e.smartFee();

        sc.close();
    }
}