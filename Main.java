import java.util.Scanner;

public class Main {
    public static int count1(int earnings, int spendings) {
        int tax = (earnings - spendings) * 15 / 100;
        if(tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }

    public static int count2(int earnings) {
        int tax = earnings * 6 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int earnings = 0;
        int spendings = 0;

        while (true) {
            System.out.println(
                    "Выберите операцию и введите её номер:\n" +
                            "1. Добавить новый доход\n" +
                            "2. Добавить новый расход\n" +
                            "3. Выбрать систему налогообложения\n");

            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            int operation = Integer.parseInt(input);

            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    String income = scanner.nextLine();
                    int money1 = Integer.parseInt(income);
                    earnings += money1;
                    break;
                case 2:
                    System.out.println("Введите сумму расходов:");
                    String minus = scanner.nextLine();
                    int money2 = Integer.parseInt(minus);
                    spendings += money2;
                    break;
                case 3:
                    int tax1 = count1(earnings, spendings);
                    int tax2 = count2(earnings);

                    if (tax1 < tax2) {
                        System.out.println(
                                "Мы советуем вам УСН доходы\n" +
                                        "Ваш налог составит: " + tax1 + " рублей\n" +
                                        "Налог на другой системе: " + tax2 + " рублей\n" +
                                        "Экономия: " + (tax2 - tax1) + " рублей");
                    } else if (tax2 < tax1) {
                        System.out.println(
                                "Мы советуем вам УСН доходы минус расходы\n" +
                                        "Ваш налог составит: " + tax2 + " рублей\n" +
                                        "Налог на другой системе: " + tax1 + " рублей\n" +
                                        "Экономия: " + (tax1 - tax2) + " рублей");
                    } else {
                        System.out.println(
                                "Можете выбрать любую систему налогообложения\n" +
                                        "Налог составит: " + tax1 + " рублей");
                    }
                    break;

                default:
                    System.out.println("Такой операции нет");
            }
        }
        System.out.println("Программа завершена!");
    }
}
