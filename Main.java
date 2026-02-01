import java.util.Scanner;

public class Main {

    public static int duty;

    public static int calculateCustoms(int p1, int p2) {
     int duty = p1 / 100 + p2 * 100;
     return duty;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте!");
        System.out.println("Введите цену товара в рублях:");
        int price = scanner.nextInt();

        System.out.println("Введите вес товара в кг:");
        int weight = scanner.nextInt();

        duty = calculateCustoms(price, weight);

       System.out.println("Стоимость пошлины" + " = " + duty);




    }

}