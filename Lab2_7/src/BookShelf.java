import java.util.ArrayList;
public class BookShelf {
    private final ArrayList<Book> shelf = new ArrayList<>();
    private int amount = 0;
    public void addBook(Book book){
        shelf.add(book);
        amount++;
    }
    public void addBook(String autor, String name, int year, String color){
        shelf.add(new Book(autor, name, year, color));
        amount++;
    }
    public Book latest(){
        if (shelf.isEmpty()) return null;
        Book latest = shelf.get(0);
        for (Book x : shelf){
            if (x.getYear() > latest.getYear()) latest = x;
        }
        return latest;
    }
    public Book earliest(){
        if (shelf.isEmpty()) return null;
        Book earliest = shelf.get(0);
        for (Book x : shelf){
            if (x.getYear() <    earliest.getYear()) earliest = x;
        }
        return earliest;
    }

    public void sortBooks(){
        for(int x = 0; x < shelf.size() - 1; x++){
            for(int y = 0; y < shelf.size() - 1; y++){
                if(shelf.get(x).getYear() > shelf.get(x + 1).getYear()){
                    Book one = shelf.get(x);
                    shelf.set(x, shelf.get(x + 1));
                    shelf.set(x + 1, one);
                }
            }
        }
    }
}
