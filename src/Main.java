import java.io.BufferedReader;
import java.io.IOException;
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

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> todoList = new ArrayList<String>();
        System.out.println(" Добро пожаловать в список задач ");
        System.out.println(" 1.Просмотреть список задач : ");
        System.out.println(" 2.Добавить новою задачу :");
        System.out.println(" 3.Удалить задачу ");
        System.out.println(" 4.Выйти из програми ");
        int option = Integer.parseInt(br.readLine());

                String itemToAdd = null;



                switch (option) {
                    case 1:
                        System.out.println("Просмотреть список задач : ");
                        itemToAdd = br.readLine();
                        break;
                    case 2:
                        System.out.println("Добавить новою задачу : ");
                        itemToAdd = br.readLine();

                        break;
                    case 3:

                        System.out.println("Удалить задачу ");
                        itemToAdd = br.readLine();
                        break;
                    case 4:
                        System.out.println("Выйти из програми ");
                        itemToAdd = br.readLine();
                        break;


                }


    }
}