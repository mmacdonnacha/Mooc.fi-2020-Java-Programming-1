/**
 *
 * @author micheal
 */
public class Book {
    private String title;
    private int pages;
    private int year;
    
    
    public Book(String name, int lengthInPages, int publicationYear){
        this.title = name;
        this.pages = lengthInPages;
        this.year = publicationYear;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    @Override
    public String toString(){
        return this.title + ", " + this.pages + " pages, " + this.year;
    }
}
