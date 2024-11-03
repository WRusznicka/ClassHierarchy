public class Computer {
    private String model;
    private String type;
    private Battery battery;
    private Display display;
    private Graphics graphics;
    private Processor processor;
    private RAM ram;
    private Storage storage;

    public Computer(String model, String type, Battery battery, Display display, Graphics graphics, Processor processor, RAM ram, Storage storage) {
        this.model = model;
        this.type = type;
        this.battery = battery;
        this.display = display;
        this.graphics = graphics;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    public Computer() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Graphics getGraphics() {
        return graphics;
    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

}
