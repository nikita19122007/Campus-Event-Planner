 import java.lang.*;
class SmartEvent {
    boolean eventReady = false;
    synchronized void updateEvent() {
        System.out.println("Event Management: Venue preparation completed");
        eventReady = true;
        notifyAll();
    }
    synchronized void checkEvent() {
        while (!eventReady) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Event Monitoring: Venue is ready");
    }
}
class EventUpdate extends Thread {
    SmartEvent event;

    EventUpdate(SmartEvent e) {
        event = e;
    }
    public void run() {
        event.updateEvent();
    }
}
class EventMonitor extends Thread {
    SmartEvent event;
    EventMonitor(SmartEvent e) {
        event = e;
    }
    public void run() {
        event.checkEvent();
    }
}
public class SmartEventPlanner {
    public static void main(String[] args) {
        System.out.println("Smart Event Planner");
        System.out.println("-------------------");
        SmartEvent event = new SmartEvent();
        EventUpdate t1 = new EventUpdate(event);
        EventMonitor t2 = new EventMonitor(event);

        t2.start();
        t1.start();
    }
}

