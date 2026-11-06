import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag){
            printInfo();
            System.out.print("Ваш выбор: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 0:
                    System.out.println("Программа завершена");
                    flag = false;
                    break;
                case 1:
                    System.out.print("Введите название задачи: ");
                    list.add(scanner.nextLine());
                    System.out.println("Добавлено!");
                    printDeals(list);
                    continue;
                case 2:
                    printDeals(list);
                    continue;
                case 3:
                    System.out.print("Введите номер для удаления: ");
                    list.remove(Integer.parseInt(scanner.nextLine())-1);
                    printDeals(list);
                    continue;
                case 4:
                    System.out.print("Введите задачу для удаления: ");
                    list.remove(scanner.nextLine());
                    printDeals(list);
                    continue;
                case 5:
                    System.out.print("Введи текст по которому удалить: ");
                    removeList(list,scanner.nextLine());
                    printDeals(list);
                    continue;
                default:
                    System.out.print("Неверные параметры");
                    break;
            }
        }
        }

    public static void printInfo() {
        System.out.println("Выберите операцию:");
        System.out.println("0. Выход из программы");
        System.out.println("1. Добавить дело");
        System.out.println("2. Показать дела");
        System.out.println("3. Удалить дело по номеру");
        System.out.println("4. Удалить дело по названию");
        System.out.println("5. Удалить по ключевому слову");
    }

    public static void printDeals(List<String> list){
        System.out.println("Ваш список дел:");
        for (int i = 0; i < list.size(); i++){
            System.out.println(i+1 + "." + " " + list.get(i));
        }
    }

    public static void removeList(List<String> list, String delete){
        list.removeIf(deals -> deals.contains(delete));
    }
}