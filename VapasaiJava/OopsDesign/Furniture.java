package OopsDesign;

public class Furniture {
    String furnitureType;
    String furnitureMaterial;
    String departmentFurniture;

    public static int noOfChairs;

    public Furniture(String furnitureType, String furnitureMaterial, String departmentFurniture){
        this.furnitureType = furnitureType;
        this.furnitureMaterial = furnitureMaterial;
        this.departmentFurniture = departmentFurniture;
        if(furnitureType.equals("Chair")){
            noOfChairs = noOfChairs + 1;
        }
    }

    public Furniture() {

    }

    public void printNoOfChairs(){
        System.out.println("Total number of Chairs are " + noOfChairs);
    }

}
