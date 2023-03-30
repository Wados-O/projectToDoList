import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Task> tasks;
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
                tasks.add(new Task(task));
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Ошибка чтения с файла: " + e.getMessage());
        }
    }

    private void writeTasksToFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            for (Task task : tasks) {
                writer.write(task + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
        }
    }

    public void addTask(String title) {
        tasks.add(new Task(title));
        writeTasksToFile();
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            writeTasksToFile();
        } else {
            System.out.println("Неверный номер задачи " + index);
        }
    }


    public String printTasks() {
        String result = "";
        if (tasks.isEmpty()) {
            result += "Нет задачи.";
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                result += i + ": " + tasks.get(i) + "\n";
            }
        }
        return result;
    }
}