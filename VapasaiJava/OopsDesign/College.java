package OopsDesign;

import OopsDesign.Books;

import java.util.ArrayList;

public class College {

    public static void main(String[] args) {

        ArrayList<OopsDesign.Books> bookList = new ArrayList<>();
        bookList.add(new OopsDesign.Books("111896","Robin Sharma",false, "Engineering"));
        bookList.add(new OopsDesign.Books("111897","Yann Martel", true, "Arts"));
        bookList.add(new OopsDesign.Books("111898","Paulo Coelho",true, "Engineering"));
        bookList.add(new OopsDesign.Books("111899","Robert M Wild",false, "Arts"));
        bookList.add(new OopsDesign.Books("111895","Gregory David",true, "Engineering"));

        ArrayList<Furniture> furnitureList = new ArrayList<>();
        furnitureList.add(new Furniture("Chair","Wood","Engineering"));
        furnitureList.add(new Furniture("Table","Wood","Engineering"));
        furnitureList.add(new Furniture("Racks","Iron","Engineering"));
        furnitureList.add(new Furniture("Chair","Wood","Arts"));
        furnitureList.add(new Furniture("Table","Wood","Arts"));
        furnitureList.add(new Furniture("Racks","Iron","Arts"));


        ArrayList<Staff> staffList = new ArrayList<>();
        staffList.add(new Staff(25,"Renu", "Prasad","Engineering"));
        staffList.add(new Staff(23,"Ramesh", "Kulkarni","Arts"));
        staffList.add(new Staff(54,"Kamakshi", "Ranganathan","Engineering"));
        staffList.add(new Staff(35,"Anitha", "Kuppusamy","Arts"));
        staffList.add(new Staff(45,"Vivek", "Saxena","Engineering"));

        Books books = new Books();
        books.totalNoOfBooksAvailableInCollege();
        books.printNoOfRentedBooks();

        Furniture furniture = new Furniture();
        furniture.printNoOfChairs();

        Staff staff = new Staff();
        staff.printNoOfStaff();
        staff.printEldestStaffAge();

    }
}