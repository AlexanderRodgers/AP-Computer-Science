/************
 * Student.java
 * @author Alex Rodgers
 * 18 October 2016
 * 
 * Creates a BandBooster object to track band boosting performance.
 ************/

public class BandBooster {
    private String name;
    private int boxesSold;

    public BandBooster(String n) {
        name = n;
        boxesSold = 0;
    }

    public String getName() {
        return name;
    }

    public void updateSales(int newBoxes) {
        boxesSold += newBoxes;
    }

    public String toString() {
        return (name + " sold " + boxesSold + " boxes");
    }

}