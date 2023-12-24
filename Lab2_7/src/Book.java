public class Book {
    private String autor;
    private String name;
    private int year;
    private String color;
    public Book(String autor,String name, int year, String color){
        this.autor = autor;
        this.name = name;
        this.year = year;
        this.color = color;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override public String toString(){
        return "Autor: " + autor + ", name: " + name + ", year: " + year + ", color: " + color;
    }
}
