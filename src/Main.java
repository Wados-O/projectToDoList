import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    //пишем меню для приложенния
    //программа должна уметь:
    // показывать список задач
    //запоминать задачи
    //добавлять и удаллять задачи при неопходимости
    //

    // план работы
    // меню
    // список функций
    // создать класы для каждой функцыии
    // сделать клас задача добавить кампаратор
    // добавить енам для команд меню


    //

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TodoList todoList = new TodoList("tasks.txt");
//        ArrayList<String> todoList = new ArrayList<String>();

//        System.out.println(" Добро пожаловать в список задач ");
//        System.out.println(" 1.Просмотреть список задач : ");
//        System.out.println(" 2.Добавить новою задачу :");
//        System.out.println(" 3.Удалить задачу ");
//        System.out.println(" 4.Выйти из програми ");
        while (true) {

            System.out.println("1.Добавить новою задачу :");
            System.out.println("2.Удалить задачу");
            System.out.println("3.Просмотреть список задач :");
            System.out.println("4.Выйти из программы");
            System.out.println("Выберете опцию: ");



            int option = Integer.parseInt(br.readLine());
            Integer.parseInt(br.readLine());

            switch (option) {
                case 1:
                    System.out.print("Выберите задачу : ");
                    int task = Integer.parseInt(br.readLine());
                    todoList.addTask(task);
                    break;

                case 2:
                    System.out.print("Укажите позицию задачи в списке: ");
                    int index = Integer.parseInt(br.readLine());
                    Integer.parseInt(br.readLine());
                    todoList.removeTask(index);
                    break;
                case 3:
                    todoList.printTasks();
                    break;
                case 4:
                    System.out.println("Хорошего дня,!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный ввод: " + option);


            }

        }
    }
}