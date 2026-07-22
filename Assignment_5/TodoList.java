/*
 * Assignment No: 5
 * Program 1: To-Do List Application
 *
 * Aim:
 * To demonstrate the use of ArrayList for storing tasks
 * and StringBuffer for displaying the task list.
 */

import java.util.ArrayList;

public class TodoList {

    public static void main(String[] args) {

        // Creating an ArrayList to store tasks
        ArrayList<String> tasks = new ArrayList<>();

        // Adding tasks to the list
        tasks.add("Complete Java Assignment");
        tasks.add("Study Wrapper Classes");
        tasks.add("Prepare for Practical Exam");
        tasks.add("Submit Lab Record");

        // Display all tasks using StringBuffer
        StringBuffer sb = new StringBuffer();

        sb.append("====== TO-DO LIST ======\n");

        for (int i = 0; i < tasks.size(); i++) {
            sb.append((i + 1) + ". " + tasks.get(i) + "\n");
        }

        // Print task list
        System.out.println(sb);

        // Remove a completed task
        tasks.remove("Study Wrapper Classes");

        // Display updated list
        sb.setLength(0); // Clears StringBuffer

        sb.append("====== UPDATED TO-DO LIST ======\n");

        for (int i = 0; i < tasks.size(); i++) {
            sb.append((i + 1) + ". " + tasks.get(i) + "\n");
        }

        System.out.println(sb);
    }
}