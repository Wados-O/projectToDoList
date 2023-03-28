import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

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

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> todoList = new ArrayList<String>();
        System.out.println(" Добро пожаловать в список задач ");
        int option = Integer.parseInt(br.readLine());
                switch () {
                    case 1:
                        System.out.println("Просмотреть список задач : ");

                        break;
                    case 2:
                        System.out.println("Добавить новою задачу : ");
                        break;
                    case 3:

                        System.out.println("Удалить задачу ");
                        break;
                    case 4:
                        System.out.println("Выйти из програми ");
                        break;


                }


    }
}