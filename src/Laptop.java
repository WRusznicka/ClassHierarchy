public class Laptop extends Computer{
    protected Battery battery;

    public Laptop(String model, String type, Display display, Graphics graphics, Processor processor, RAM ram, Storage storage, Battery battery) {
        super(model, type, display, graphics, processor, ram, storage);
        this.battery = battery;
    }

    @Override
    public String getSpecifications() {
        return super.printSpecs() + battery;
    }
}
