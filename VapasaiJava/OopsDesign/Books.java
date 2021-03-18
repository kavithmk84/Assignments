package OopsDesign;

import java.util.ArrayList;
import java.util.List;

public class Books {

    String ISBN;
    boolean isBookRented;
    String author;

    String departmentBooks;

    private static int rentedBookCount;
    static List<Books> booksList = new ArrayList<>();
    private String isBookRentedValue;

    public Books(){

    }

    public Books(String ISBN, String author, boolean isBookRented, String departmentBooks){
        //  this.bookNo = bookNo;
        this.ISBN = ISBN;
        this.author = author;
        this.isBookRented = isBookRented;
        this.departmentBooks = departmentBooks;
        booksList.add(this);
        if(isBookRented==true){
            rentedBookCount = rentedBookCount +1;
        }
        System.out.println("Rented book count:"+rentedBookCount);

    }

    public static int getRentedBookCount() {
        return rentedBookCount;
    }
    public static void setRentedBookCount(int rentedBookCount) {
        Books.rentedBookCount = rentedBookCount;
    }

    public int getBooksCount() {
        return Books.booksList.size();
    }

    public static List<Books> getBooksList() {
        return booksList;
    }

    public static void setBooksList(List<Books> booksList) {
        Books.booksList = booksList;
    }


    public void totalNoOfBooksAvailableInCollege () {
        System.out.println("Total number of books available in College both in arts and Engineering department are " + booksList.size());
    }

    public void printNoOfRentedBooks(){
        System.out.println("Total number of books rented are " + rentedBookCount);
    }

}
