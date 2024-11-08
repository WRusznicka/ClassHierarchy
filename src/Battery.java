import java.util.Objects;

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

    @Override
    public String toString() {
        return "\n\nBattery\n\nMaterial: " + getMaterial() +
                "\nNumber of cells: " + getNumberOfCells() + "\nCapacity: " + getCapacity() + "WHrs";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Battery battery = (Battery) o;
        return numberOfCells == battery.numberOfCells && capacity == battery.capacity && Objects.equals(material, battery.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, numberOfCells, capacity);
    }
}
