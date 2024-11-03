public class RAM {
    private int capacity;
    private String type;

    public RAM(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }

    public RAM() {
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
