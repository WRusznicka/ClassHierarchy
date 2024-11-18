package entities;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "\n\nStorage\n\nType: " + getType() + "\nCapacity: " + getCapacity();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Storage storage = (Storage) o;
        return Objects.equals(capacity, storage.capacity) && Objects.equals(type, storage.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity, type);
    }
}
