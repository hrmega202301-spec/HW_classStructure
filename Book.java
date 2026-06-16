public class Book {
    public String title;
    public int releaseYear;
    public Author author;
    public int pages;


    public Book(String title, Author author, int pages, int releaseYear) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.releaseYear = releaseYear;
    }

    public boolean isBig() {
        if (pages > 500) {
            return true;
        } else {
            return false;
        }
    }

    public boolean matches(String word) {
        if (author.name.contains(word) || author.surname.contains(word) || title.contains(word)) {
            return true;
        } else {
            return false;
        }
    }

    public int estimatePrice() {
        int price = (int) Math.floor(pages * 3 * Math.sqrt(author.rating));
        if (price < 250) {
            return 250;
        } else {
            return price;
        }
    }

    public String toString() {
        if (isBig()) {
            return ("Добрый день!\n" + "Книга: " + author + "- " + title + ", вышла в " + releaseYear + " году,она большая - " + pages + " страниц и стоит " + estimatePrice() + " рублей!");

        } else {
            return ("Добрый день!\n" + "Книга: " + author + "- " + title + ", вышла в " + releaseYear + " году,она небольшая - " + pages + " страниц и стоит " + estimatePrice() + " рублей!");
        }
    }
}
