public class Main {
    public static void main(String[] args) {
        Book myBook = new Book("Шантарам", 2003, "Грегори Дэвид Робертс", 864);
        System.out.println(myBook);

        boolean isBookBig = myBook.isBig();
        System.out.println("Книга Шантарам большая? " + isBookBig);

        boolean hasMatches = myBook.matches("рам");
        System.out.println("Есть ли слово 'рам' в название или имени автора? " + hasMatches);

        int priceBook = myBook.estimatePrice();
        System.out.println("Цена книги " + priceBook + " рублей");


    }
}