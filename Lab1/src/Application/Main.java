package Application;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        MyList List1 = new MyList();
        int i = 1;
        System.out.println("Добро пожаловать в программу для создания списков");
        while (i !=0) {
            System.out.println("Введите команду для выполнения операции");
            System.out.println("Существующие команды:");
            System.out.println("1 - Добавить элемент в список после элемента с выбранным индексом");
            System.out.println("2 - Удалить элемент по его индексу");
            System.out.println("3 - Вывести список на экран");
            System.out.println("0 - Выход из программы");
            Scanner into = new Scanner(System.in);
            String cmd = into.nextLine();
            switch(cmd){

                case "1" :
                    System.out.println("Введите индекс после которого необходимо добавить новый элемент и через пробел значение элемента");
                    int a = into.nextInt();
                    String b = into.nextLine();
                    List1.add(a,b);
                    System.out.println();
                    break;

                case "2" :
                    System.out.println("Введите индекс элемента который необходимо удалить");
                    int c = into.nextInt();
                    List1.remove(c);
                    System.out.println("Элемент успешно удален");
                    System.out.println();
                    break;

                case "3" :
                    System.out.println("Ваш список:");
                    List1.ShowList();
                    break;

                case "0" :
                    i = 0;
                    System.out.println("Программа завершена");
                    break;

                default :
                    System.out.println("Введена неверная команда");
                    System.out.println();
            }
        }
    }
}
