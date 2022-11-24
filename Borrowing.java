package model;

public class Borrowing {
    int book_id;
    int students_id;
    int extra_days;
    int fineRate;

    public Borrowing(int book_id, int students_id, int extra_days, int fineRate) {
        this.book_id = book_id;
        this.students_id = students_id;
        this.extra_days = extra_days;
        this.fineRate = fineRate;
    }

    public void TotalFine(){
        System.out.println("The total fine for bookid "+ this.book_id+ "for "+ this.extra_days+ "is "+this.fineRate);
    }


}
