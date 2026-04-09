// GoodsBogie.java
public class GoodsBogie {

    private String shape;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargoType) {

        try {
            // unsafe rule
            if (cargoType.equalsIgnoreCase("Petroleum") &&
                shape.equalsIgnoreCase("Rectangular")) {

                throw new CargoSafetyException(
                    "Unsafe cargo: Petroleum cannot be assigned to rectangular bogie."
                );
            }

            System.out.println("Cargo assigned successfully: " + cargoType);

        } catch (CargoSafetyException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            System.out.println("Cargo assignment process completed.\n");
        }
    }
}