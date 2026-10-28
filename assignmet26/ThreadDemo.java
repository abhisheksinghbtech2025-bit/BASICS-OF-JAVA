class Task implements java.lang.Runnable {
    String name;

    Task(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println(name + ": " + i);
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        new Thread(new Task("Task 1")).start();
        new Thread(new Task("Task 2")).start();
    }
}