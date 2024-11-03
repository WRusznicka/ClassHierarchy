public class Battery {
    private String material;
    private int numberOfCells;
    private int capacity;

    public Battery(String material, int numberOfCells, int capacity) {
        this.material = material;
        this.numberOfCells = numberOfCells;
        this.capacity = capacity;
    }

    public Battery() {
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getNumberOfCells() {
        return numberOfCells;
    }

    public void setNumberOfCells(int numberOfCells) {
        this.numberOfCells = numberOfCells;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
