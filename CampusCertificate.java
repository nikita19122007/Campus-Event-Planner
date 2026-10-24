import java.util.Scanner;

class Participant {
    String name;
    String rollNo;

    void getParticipant(String n, String r) {
        name = n;
        rollNo = r;
    }
}

class Registration extends Participant {
    String department;
    String eventName;
    String eventDay;

    void getRegistration(String d, String e, String day) {
        department = d;
        eventName = e;
        eventDay = day;
    }
}


class Certificate extends Registration {
    String venue;
    String coordinator;
    int type;

    void getCertificate(String v, String c, int t) {
        venue = v;
        coordinator = c;
        type = t;
    }

    void display() {
        System.out.println("\n===== SMART CAMPUS CERTIFICATE =====");
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
        System.out.println("Department   : " + department);
        System.out.println("Event Name   : " + eventName);
        System.out.println("Event Day    : " + eventDay);
        System.out.println("Venue        : " + venue);
        System.out.println("Coordinator  : " + coordinator);

        if (type == 1) {
            System.out.println("Certificate : Participation");
        } 
        else if (type == 2) {
            System.out.println("Certificate : Winner");
        } 
        else {
            System.out.println("Certificate : Pending");
        }
    }
}

public class CampusCertificate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Certificate c = new Certificate();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        String roll = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Event Name: ");
        String event = sc.nextLine();

        System.out.print("Enter Event Day: ");
        String day = sc.nextLine();

        System.out.print("Enter Venue: ");
        String venue = sc.nextLine();

        System.out.print("Enter Coordinator Name: ");
        String coordinator = sc.nextLine();

        System.out.println("Certificate Type");
        System.out.println("1. Participation");
        System.out.println("2. Winner");
        System.out.print("Enter Choice: ");
        int type = sc.nextInt();

        c.getParticipant(name, roll);
        c.getRegistration(dept, event, day);
        c.getCertificate(venue, coordinator, type);

        c.display();

        sc.close();
    }
}