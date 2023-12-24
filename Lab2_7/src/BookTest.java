public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Ivanov", "1984", 1905, "Red");
        System.out.println(book.getAutor());
        System.out.println(book.getName());
        System.out.println(book.getYear());
        System.out.println(book.getColor());
        BookShelf shelf = new BookShelf();
        shelf.addBook("Aut1", "Nam1", 1912, "Green");
        shelf.addBook("Aut2", "Nam2", 1999, "Yellow");
        shelf.addBook("Aut3", "Nam3", 1954, "White");
        shelf.addBook(book);
        System.out.println(shelf.earliest());
        System.out.println(shelf.latest());
        shelf.sortBooks();
    }
}