// UseCase15CargoAssignment.java
public class UseCase15CargoAssignment {

    public static void main(String[] args) {

        System.out.println("Safe Cargo Assignment\n");

        GoodsBogie bogie1 = new GoodsBogie("Rectangular");

        // unsafe case
        bogie1.assignCargo("Petroleum");

        // safe case
        bogie1.assignCargo("Coal");

        System.out.println("Program continues safely...");
    }
}