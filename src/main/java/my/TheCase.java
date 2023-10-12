package my;

public class TheCase {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;

    public TheCase(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }
    public static void pressPowerButton() {
        System.out.println("Power Button Pressed");
    }

    @Override
    public String toString() {
        return "TheCase{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", powerSupply='" + powerSupply + '\'' +
                ", dimensions=" + dimensions +
                '}';
    }
}
