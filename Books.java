package model;

public class Books {
    String author_name;
    String book_name;
    int ISBN;
    int published_year;

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getPublished_year() {
        return published_year;
    }

    public void setPublished_year(int published_year) {
        this.published_year = published_year;
    }



    public Books(String author_name, String book_name, int ISBN, int published_year) {
        this.author_name = author_name;
        this.book_name = book_name;
        this.ISBN = ISBN;
        this.published_year = published_year;
    }
public void printFormat(){
    System.out.println("Name :" + this.book_name);
    System.out.println("Author :" + this.author_name);
    System.out.println("ISBN :" + this.ISBN);
    System.out.println("Published Year: " + this.published_year);
}

}
