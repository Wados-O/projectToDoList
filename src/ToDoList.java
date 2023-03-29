import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<String> tasks;
    private String fileName;

    public ToDoList(String fileName) {
        this.fileName = fileName;
        this.tasks = new ArrayList<>();
        readTasksFromFile();
    }

    private void readTasksFromFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String task;
            while ((task = br.readLine()) != null) {
                tasks.add(task);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Failed to read tasks from file: " + e.getMessage());
        }
    }

    private void writeTasksToFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (String task : tasks) {
                writer.write(task + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.err.println("Failed to write tasks to file: " + e.getMessage());
        }
    }

    public void addTask(String task) {
        tasks.add(task);
        writeTasksToFile();
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            writeTasksToFile();
        } else {
            System.out.println("Invalid task index: " + index);
        }
    }

    public void printTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + ": " + tasks.get(i));
            }
        }
    }
}