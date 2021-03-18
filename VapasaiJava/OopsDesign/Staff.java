package OopsDesign;

public class Staff {
    int staffAge;
    String fName;
    String lName;
    String staffDepartment;

    public static int staffCount;
    public static int eldestStaffAge;

    public Staff(int staffAge, String fName, String lName,String staffDepartment){
        this.staffAge = staffAge;
        this.fName = fName;
        this.lName = lName;
        this.staffDepartment = staffDepartment;

        staffCount = staffCount+1;

        if(this.staffAge>eldestStaffAge){
            eldestStaffAge=this.staffAge;
        }
    }
    public Staff(){

    }
    public void printNoOfStaff(){
        System.out.println("Total number of Staffs are " + staffCount);
    }
    public void printEldestStaffAge(){
        System.out.println("Eldest Staff Age is " + eldestStaffAge);
    }
}
