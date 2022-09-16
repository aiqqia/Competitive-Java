import java.util.*;

public class Library {
    private int number_of_books;
    private String name;
    private Map<String, Integer> bookGenres;
    Library(){
        this.number_of_books = 0;
        this.name = "";
        this.bookGenres = new HashMap<String,Integer>();
    }
    public int getNumber_of_books(){
        return this.number_of_books;
    }
    public String getName(){
        return this.name;
    }
    public Map<String, Integer> getBookGenres(){
        return this.bookGenres;
    }

    public void setNumber_of_books(int number_of_books){
        this.number_of_books = number_of_books;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBookGenres(Map<String, Integer> bookGenres){
        this.bookGenres = bookGenres;
    }

    public String toString(){
        return "Name: "+ this.name + "\nNumber: " + this.number_of_books + "\nGenres: " + this.bookGenres;
    }

    public static void main(String[] args) {
        Library lib1 = new Library();
        Library lib2 = new Library();
        lib1.setName("Ishika");
        //lib1.setNumber_of_books(5);
        System.out.println(lib1.getName());

        //lib2.setName("Ayush");
        //lib2.setNumber_of_books(10);
        //System.out.println(lib2);
    }
}
