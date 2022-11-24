import model.Books;
import model.Borrowing;
import model.Students;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Students student1 = new Students("leo",12,5);
        Students student2 = new Students("Sam",11,6);
        Students student3 = new Students("Harry",10,7);
        Books book1 = new Books("J.k Rowling","Harry Potter",12345,1990);
        Books book2 = new Books("Ram","Ikigai",12346,1991);
        Books book3 = new Books("Ashraya","Fat kid rules the world",12347,2000);
        Borrowing first = new Borrowing(1,10,2,500);
        Borrowing second = new Borrowing(2,15,0,400);
        Borrowing third = new Borrowing(3,16,5,900);

        book1.printFormat();
        book2.printFormat();
        book3.printFormat();
        student1.printFormat();
        student2.printFormat();
        student3.printFormat();
        first.TotalFine();
        second.TotalFine();
        third.TotalFine();
    }
}