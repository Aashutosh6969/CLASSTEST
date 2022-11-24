package model;

public class Students {
    String name;
    int grade;
    int books_borrowed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getBooks_borrowed() {
        return books_borrowed;
    }

    public void setBooks_borrowed(int books_borrowed) {
        this.books_borrowed = books_borrowed;
    }



    public Students(String name, int grade, int books_borrowed) {
        this.name = name;
        this.grade = grade;
        this.books_borrowed = books_borrowed;
    }
public void printFormat(){
    System.out.println("The student is "+ this.name + "of class" + this.grade+ "and has "+ this.books_borrowed+ "books borrowed") ;
}

}
