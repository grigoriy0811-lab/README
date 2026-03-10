import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию:\n" +
                    "0. Выход из программы\n" +
                    "1. Добавить дело\n" +
                    "2. Показать дела\n" +
                    "3. Удалить дело по номеру\n" +
                    "4. Удалить дело по названию");
            String number = scanner.nextLine();
            int numberFinish = Integer.parseInt(number);

            if (numberFinish <= 0) {
                System.out.println("Выход из программы!");
                break;
            }
            if (numberFinish == 1) {
                System.out.println("Ващ выбор " + numberFinish);
                System.out.print("Введите название задачи: ");
                String task = scanner.nextLine();
                arrayList.add(task);
                System.out.println("Добавлено!");
                System.out.println("Ваш список дел:");
                for (int i = 0; i < arrayList.size(); i++) {
                    System.out.println((i + 1) + " . " + arrayList.get(i));
                }
            }
            if (numberFinish == 2) {
                System.out.println("Ваш выбор " + numberFinish);
                System.out.println("Ваш список дел:");
                for (int i = 0; i < arrayList.size(); i++) {
                    System.out.println((i + 1) + " . " + arrayList.get(i));

                }
            }
            if (numberFinish == 3) {
                System.out.println("Ваш выбор " + numberFinish);
                System.out.print("Введите номер для удаления: ");
                String stg = scanner.nextLine();
                int numberDelete = Integer.parseInt(stg);
                if (numberDelete >= 1 && numberDelete <= arrayList.size()) {
                    arrayList.remove(numberDelete - 1);
                    System.out.println("Удаленно!");
                } else {
                    System.out.println("Задачи с таким номер нет!");
                }
                System.out.println("Ваш список дел:");
                for (int i = 0; i < arrayList.size(); i++) {
                    System.out.println((i + 1) + " . " + arrayList.get(i));
                }
            }
            if (numberFinish == 4) {
                System.out.println("Ваш выбор " + numberFinish);
                System.out.print("Введите задачу для удаления: ");
                String taskDelete = scanner.nextLine();

                int oldSize = arrayList.size();

                Iterator<String> iterator = arrayList.iterator();

                while (iterator.hasNext()) {
                    String task = iterator.next();
                    if (task.equals(taskDelete)) {
                        iterator.remove();
                    }
                }
                if (arrayList.size() < oldSize) {
                    System.out.println("Удаленно!");
                } else {
                    System.out.println("Задачи с таким значением нет!");
                }
                System.out.println("Ваш список дел:");
                for (int i = 0; i < arrayList.size(); i++) {
                    System.out.println((i + 1) + " . " + arrayList.get(i));
                }
            }
        }
    }
}


