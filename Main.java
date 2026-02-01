import java.util.Scanner;

public class Main {
    public static int calculateCustoms(int price, int weight) {
     int duty = price / 100 + weight * 100;
        System.out.println(" Стоимость пошлины:" + duty);
        return duty;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте!");
        System.out.println("Введите цену товара в рублях:");
        int price = scanner.nextInt();

        System.out.println("Введите вес товара в кг:");
        int weight = scanner.nextInt();

       calculateCustoms(price, weight);



    }

}