public class Main {
    public static void main(String[] args) {

        Author Vern = new Author("Жюль", " Верн", 10);
        Author Sapkowski = new Author("Анджей", " Сапковский", 10);
        Book book1 = new Book("Дети капитана Гранта ", Vern, 704, 1936);
        System.out.println(book1);
        System.out.println(book1.matches(""));

        Book book2 = new Book("Ведьмак: Последнее желание", Sapkowski, 416, 1993);
        System.out.println(book2);
        System.out.println(book2.matches(""));
    }
}