import java.util.ArrayList;
import java.util.List;

public class ToDoList {
  private List<String> task;
  private String fileName;

  public void TodoList(String fileName) {
    this.fileName = fileName;
    this.task = new ArrayList<>();
  }


}
