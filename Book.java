public class Book {
    String title;
    int yearOfRelease;
    String author;
    int pages;

    public Book(String title, int yearOfRelease, String author, int pages) {
        this.title = title;
        this.yearOfRelease = yearOfRelease;
        this.author = author;
        this.pages = pages;
    }

    public String toString() {
        return "Книга: " + title + ", год: " + yearOfRelease +
                ", aвтор: " + author + ", страниц: " + pages;
    }

    public boolean isBig() {
        return (pages > 500);
    }

    public boolean matches(String word) {
        boolean inTitle = title.contains(word);
        boolean inAuthor = author.contains(word);
        return inTitle || inAuthor;
    }

    public int estimatePrice() {
        int price = pages * 3;
        if (price < 250) {
            return 250;
        } else {
            return price;
        }
    }

}
