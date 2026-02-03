import java.time.Year;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год в формате ''yyyy'' ");
        int year = scanner.nextInt();

         if(year % 400 == 0) {
             System.out.println("Колличество дней 366");
         } else if (year % 4 == 0) {
             System.out.println("Колличество дней 366");
         } else {
             System.out.println("Колличество дней 365");
         }


    }

}