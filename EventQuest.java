import java.util.Scanner;

abstract class Challenge {
    int choice;
    int points;

    abstract void startChallenge();

    void showPoints() {
        System.out.println("Challenge Points : " + points);
    }
}


class CampusMission extends Challenge {

    void startChallenge() {

        switch (choice) {

            case 1:
                System.out.println("Mission : Solve a Coding Puzzle");
                points = 50;
                System.out.println("Level   : Beginner");
                break;

            case 2:
                System.out.println("Mission : Build a Mini Prototype");
                points = 80;
                System.out.println("Level   : Intermediate");
                break;

            case 3:
                System.out.println("Mission : Present a New Idea");
                points = 100;
                System.out.println("Level   : Advanced");
                break;

            default:
                System.out.println("Invalid Challenge");
                points = 0;
        }
    }
}

public class EventQuest {


    static void showResult(Challenge c) {
        c.showPoints();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CampusMission m = new CampusMission();

        
        System.out.println("1. Coding Puzzle");
        System.out.println("2. Mini Prototype");
        System.out.println("3. Idea Presentation");

        System.out.print("Choose a Challenge: ");
        m.choice = sc.nextInt();

        m.startChallenge();

        showResult(m);

        sc.close();
    }
}