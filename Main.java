import java.util.Scanner;

public class Main {
    public static void dutyCost(double finish) {
        System.out.println(finish);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добрый день!");
        System.out.print("Сколько рублей стоит ваш товар?");
        int price = scanner.nextInt();

        System.out.print("Сколько кг весит ваш товар?");
        int weight = scanner. nextInt();

        System.out.println("Ваша стоимость пошлины составит");

        double p1 = price;
        double p2 = weight;

        dutyCost(p1 * 0.01 + p2 * 100);
    }
}