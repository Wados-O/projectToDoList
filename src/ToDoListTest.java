import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ToDoListTest {
    @Test
    public void addTask(){
        ToDoList list = new ToDoList("test.txt");

        list.addTask("test");

        assertTrue(list.printTasks().contains("test"));
    }


}

