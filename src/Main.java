
public class Main {
    public static void main(String[] args) {
        Battery battery = new Battery("Li-ion", 4, 63);
        Display display = new Display("2880 x 1800", "OLED", 60, 13.3f);
        Graphics graphics = new Graphics("Intel Graphics");
        Processor processor = new Processor("Intel Core Ultra 7 14gen 155U", 4.8f, 12, "12 MB");
        RAM ram = new RAM (32, "LPDDR5X");
        Storage storage = new Storage("1 TB", "SSD");
        Computer computer = new Computer("ASUS Zenbook S 13 OLED (UX5304)", "laptop", battery, display, graphics, processor, ram, storage);

        System.out.println("This is specifications of the created computer: \n" + "Type of the computer: " + computer.getType() +
                "\nModel: " + computer.getModel());
        System.out.println("\n\nBattery\n\nMaterial: " + computer.getBattery().getMaterial() +
                "\nNumber of cells: " + computer.getBattery().getNumberOfCells() + "\nCapacity: " + computer.getBattery().getCapacity() + "WHrs");
        System.out.println("\n\nDisplay\n\nResolution: " + computer.getDisplay().getResolution() + "\nType: " + computer.getDisplay().getType() +
                "\nRefresh rate: " + computer.getDisplay().getRefreshRate() + "Hz\nSize: " + computer.getDisplay().getSize() + " inches" );
        System.out.println("\n\nGraphics\n\nModel: " + computer.getGraphics().getModel());
        System.out.println("\n\nProcessor\n\nModel: " + computer.getProcessor().getModel() + "\nMaximum frequency: " + computer.getProcessor().getMaxFrequency() +
                "GHz\nNumber of cores: " + computer.getProcessor().getNumberOfCores() + "\nCache: " + computer.getProcessor().getCache());
        System.out.println("\n\nRAM\n\nCapacity: " + computer.getRam().getCapacity() + "GB" + "\nType: " + computer.getRam().getType());
        System.out.println("\n\nStorage\n\nType: " + computer.getStorage().getType() + "\nCapacity: " + computer.getStorage().getCapacity());
    }
}