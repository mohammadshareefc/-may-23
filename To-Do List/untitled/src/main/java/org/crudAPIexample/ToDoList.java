package org.crudAPIexample;

import java.io.*;
import java.util.*;

public class ToDoList {
    private static final String FILE_NAME = "tasks.txt";
    private static List<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        loadTasks();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTo-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: addTask(scanner); break;
                case 2: viewTasks(); break;
                case 3: markTaskCompleted(scanner); break;
                case 4: deleteTask(scanner); break;
                case 5: saveTasks(); System.out.println("Exiting..."); return;
                default: System.out.println("Invalid option! Try again.");
            }
        }
    }

    private static void loadTasks() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                tasks.add(line);
            }
        } catch (IOException e) {
            System.out.println("No previous tasks found.");
        }
    }

    private static void saveTasks() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String task : tasks) {
                writer.write(task);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving tasks: " + e.getMessage());
        }
    }

    private static void addTask(Scanner scanner) {
        System.out.print("Enter task: ");
        String task = scanner.nextLine();
        tasks.add("[Pending] " + task);
        System.out.println("Task added successfully.");
    }

    private static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    private static void markTaskCompleted(Scanner scanner) {
        viewTasks();
        System.out.print("Enter task number to mark as completed: ");
        int index = scanner.nextInt() - 1;
        if (index >= 0 && index < tasks.size()) {
            String updatedTask = tasks.get(index).replace("[Pending]", "[Completed]");
            tasks.set(index, updatedTask);
            System.out.println("Task marked as completed.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private static void deleteTask(Scanner scanner) {
        viewTasks();
        System.out.print("Enter task number to delete: ");
        int index = scanner.nextInt() - 1;
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Invalid task number.");
        }
    }
}

