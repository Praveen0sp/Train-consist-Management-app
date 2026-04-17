class CargoSafetyException extends RuntimeException {

    public CargoSafetyException(String message) {
        super(message);
    }
}
class GoodsBogie {
    private String id;
    private String type;   
    private String cargo;

    public GoodsBogie(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public void assignCargo(String cargo) {
        try {
            if (type.equalsIgnoreCase("Rectangular") &&
                cargo.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                    "Petroleum cannot be assigned to Rectangular bogie"
                );
            }
            this.cargo = cargo;
            System.out.println("Cargo assigned successfully to " + id);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Assignment attempt completed for " + id);
        }
    }
    public String getCargo() {
        return cargo;
    }
    @Override
    public String toString() {
        return "[" + id + " - " + type + " - " + cargo + "]";
    }
}
public class TrainConsistApp {
    public static void main(String[] args) {
        GoodsBogie g1 = new GoodsBogie("G1", "Cylindrical");
        GoodsBogie g2 = new GoodsBogie("G2", "Rectangular");
        g1.assignCargo("Petroleum");
        g2.assignCargo("Petroleum");
        g2.assignCargo("Coal");
      
        System.out.println("\nFinal State:");
        System.out.println(g1);
        System.out.println(g2);
    }
}
