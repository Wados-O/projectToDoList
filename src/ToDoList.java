import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static jdk.internal.org.jline.utils.ShutdownHooks.tasks;

public class ToDoList {
  private List<String> task;
  private String fileName;

  public void TodoList(String fileName) {
    this.fileName = fileName;
    this.task = new ArrayList<>();
    readTasksFromFile();
  }

  private void readTaskFromFile() {
    try {
      BufferedReader br = new BufferedReader(new FileReader(fileName));
      String task;
      while ((task = br.readLine()) !=null) {
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
    }
  }


}
