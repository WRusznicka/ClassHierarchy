public class Desktop extends Computer{
    private boolean hasTower;

    public Desktop(String model, String type, Display display, Graphics graphics, Processor processor, RAM ram, Storage storage, boolean hasTower) {
        super(model, type, display, graphics, processor, ram, storage);
        this.hasTower = hasTower;
    }

    public Desktop(){
        super();
    }

    public boolean isHasTower() {
        return hasTower;
    }

    public void setHasTower(boolean hasTower) {
        this.hasTower = hasTower;
    }

    @Override
    public String getSpecifications() {
        return super.printSpecs() + "\n\nTower: " + isHasTower();
    }
}
