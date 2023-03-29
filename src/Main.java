import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // пишем меню для приложения
    // программа должна уметь:
    // показывать список задач
    // запоминать задачи
    // добавлять и удаллять задачи при необходимости
    // план работы
    // меню
    // список функций
    // создать классы для каждой функции
    // сделать класс задача добавить компаратор
    // добавить enum для команд меню

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ToDoList toDoList = new ToDoList("tasks.txt");

        while (true) {
            System.out.println("\u001B[31m============================\u001B");
            System.out.println("\u001B[35m1.Добавить новую задачу:\u001B");
            System.out.println("\u001B[35m2.Удалить задачу:\u001B");
            System.out.println("\u001B[33m3.Просмотреть список задач:");
            System.out.println("\u001B[36m4.Выйти из программы:\u001B[0m");
            System.out.println("== Выберите опцию ==");
            System.out.println("\u001B[31m============================\u001B[0m");

            int option = Integer.parseInt(br.readLine());

            switch (option) {
                case 1:
                    System.out.print("Введите задачу: ");
                    String task = br.readLine();
                    toDoList.addTask(task);
                    break;
                case 2:
                    System.out.print("Укажите позицию задачи в списке: ");
                    int index = Integer.parseInt(br.readLine());
                    toDoList.removeTask(index);
                    break;
                case 3:
                    toDoList.printTasks();
                    break;
                case 4:
                    System.out.println("Хорошего дня!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный ввод: " + option);
                    break;
            }
        }
    }
}