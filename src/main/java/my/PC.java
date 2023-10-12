package my;

public class PC {
    private Monitor monitor;
    private TheCase thecase;
    private Motherboard motherboard;

    public PC(Monitor monitor, TheCase thecase, Motherboard motherboard) {
        this.monitor = monitor;
        this.thecase = thecase;
        this.motherboard = motherboard;
    }

    private void drawLogo(){
        monitor.drawPixel(5,5, "red");
    }
    public void description(){
        System.out.println("Welcome to worst buy! Below is the description of the PC on sale today:");
        System.out.println(monitor);
        System.out.println(thecase);
        System.out.println(motherboard);
    }
    public void powerUp(){
        TheCase.pressPowerButton();
        drawLogo();
        Motherboard.loadProgram("Photoshop");
    }

    @Override
    public String toString() {
        return "PC{" +
                "monitor=" + monitor +
                ", Case=" + thecase +
                ", motherboard=" + motherboard +
                '}';
    }}
