import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TodoList {
  private List<String> tasks;
  private String fileName;

  public void TodoList(String fileName) {
    this.fileName = fileName;
    this.tasks = new ArrayList<>();
    readTaskFromFile();
  }

  private void readTaskFromFile() {
    try {
      BufferedReader br = new BufferedReader(new FileReader(fileName));
      String task;
      while ((task = br.readLine()) != null) {
        tasks.add(task);
      }
      br.close();
    } catch (IOException e) {
      System.out.println(" Failed to read task from file: " + e.getMessage());
    }
  }

  private void writeTaskToFile() {
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
    writeTaskToFile();
  }

  public void removeTask(int index) {
    if (index >= 0 && index < tasks.size()) {
      tasks.remove(index);
      writeTaskToFile();
    } else {
      System.out.println("Invalid task index: " + index);
    }
  }

  public void printTasks() {
    if (tasks.isEmpty()) {
      System.out.println("No tasks. ");
    } else {
      for (int i = 0; i < tasks.size(); i++) {
        System.out.println(i + ": " + tasks.get(i));
      }
    }
  }
}
