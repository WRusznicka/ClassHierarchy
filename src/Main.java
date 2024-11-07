
public class Main {
    public static void main(String[] args) {
        Battery battery = new Battery("Li-ion", 4, 63);
        Display display = new Display("2880 x 1800", "OLED", 60, 13.3f);
        Graphics graphics = new Graphics("Intel Graphics");
        Processor processor = new Processor("Intel Core Ultra 7 14gen 155U", 4.8f, 12, "12 MB");
        RAM ram = new RAM (32, "LPDDR5X");
        Storage storage = new Storage("1 TB", "SSD");

        Computer laptop = new Laptop("ASUS Zenbook S 13 OLED (UX5304)", "Ultrabook", display, graphics, processor, ram, storage, battery);
        Computer desktop = new Desktop("HP EliteDesk 800", "Desktop", display, graphics, processor, ram, storage, true);

        printSpecifications(laptop);
        printSpecifications(desktop);

        Battery batteryToCompare = new Battery("Li-ion", 4, 63);
        Display displayToCompare = new Display("2880 x 1800", "OLED", 60, 16.0f);
        Graphics graphicsToCompare = new Graphics("Intel Graphics");
        RAM ramToCompare = new RAM (16, "LPDDR5X");
        Storage storageToCompare = new Storage("1 TB", "SSD");

        System.out.println("\n\nBattery hash code: " + battery.hashCode() + "\nBattery 2 hash code: " + batteryToCompare.hashCode());
        System.out.println("\nComparation: " + battery.equals(batteryToCompare));
        System.out.println("\n\nDisplay hash code: " + display.hashCode() + "\nDisplay 2 hash code: " + displayToCompare.hashCode());
        System.out.println("\nComparation: " + display.equals(displayToCompare));
        System.out.println("\n\nGraphics hash code: " + graphics.hashCode() + "\nGraphics 2 hash code: " + graphicsToCompare.hashCode());
        System.out.println("\nComparation: " + graphics.equals(graphicsToCompare));
        System.out.println("\n\nRAM hash code: " + ram.hashCode() + "\nRAM 2 hash code: " + ramToCompare.hashCode());
        System.out.println("\nComparation: " + ram.equals(ramToCompare));
        System.out.println("\n\nStorage hash code: " + storage.hashCode() + "\nStorage 2 hash code: " + storageToCompare.hashCode());
        System.out.println("\nComparation: " + storage.equals(storageToCompare));
    }

    public static void printSpecifications(Computer computer){
        System.out.println("\n\n" + computer.getSpecifications());
    }
}