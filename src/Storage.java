public class Storage {
    private String capacity;
    private String type;

    public Storage(String capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }

    public Storage() {
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
