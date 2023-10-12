package my;

public class Main {
    public static void main(String[] args) {
        Motherboard theMotherboard = new Motherboard("sony23", "Sony", 2, 4, "Sony-bios");
        Dimensions dimensions = new Dimensions(200, 200, 100);
        TheCase theCase = new TheCase("Windows xp", "Microsoft", "220 volts", dimensions);
        Resolution monitorResolution = new Resolution(50, 50);
        Monitor theMonitor = new Monitor(monitorResolution, "HP24m", "HP");
        PC pc = new PC(theMonitor, theCase, theMotherboard);

        pc.description();
        pc.powerUp();
    }
}
