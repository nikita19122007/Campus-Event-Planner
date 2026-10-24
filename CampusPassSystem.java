import java.util.Scanner;

class Participant {
    String name;

    void getName(String n) {
        name = n;
    }

    void display() {
        System.out.println("Participant : " + name);
    }
}

class Registration extends Participant {
    String department;

    void getDepartment(String d) {
        department = d;
    }

    void display() {
        System.out.println("Participant : " + name);
        System.out.println("Department  : " + department);
    }
}

class CampusPass extends Registration {
    String event;
    int points;

    void getEvent(String e, int p) {
        event = e;
        points = p;
    }

    void display() {
        System.out.println("Student       : " + name);
        System.out.println("Department    : " + department);
        System.out.println("Event         : " + event);
        System.out.println("Event Points  : " + points);

        if (points >= 80) {
            System.out.println("Achievement   : Gold Participant");
        }
        else if (points >= 50) {
            System.out.println("Achievement   : Silver Participant");
        }
        else {
            System.out.println("Achievement   : Active Participant");
        }

        if (points >= 50) {
            System.out.println("Campus Pass   : Premium Pass");
            System.out.println("Certificate   : Eligible");
        }
        else {
            System.out.println("Campus Pass   : Basic Pass");
            System.out.println("Certificate   : Participation");
        }
    }
}

public class CampusPassSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CampusPass c = new CampusPass();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Event Name: ");
        String event = sc.nextLine();

        System.out.print("Enter Participation Points: ");
        int points = sc.nextInt();

        c.getName(name);
        c.getDepartment(dept);
        c.getEvent(event, points);

        c.display();

        sc.close();
    }
}
