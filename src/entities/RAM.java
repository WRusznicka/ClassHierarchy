package entities;

import exceptions.InvalidRAMCapacity;
import interfaces.ICheckUsage;
import interfaces.Upgradable;

import java.util.Objects;

public class RAM implements Upgradable, ICheckUsage {
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

    public void setCapacity(int capacity) throws InvalidRAMCapacity {
        if (capacity <= 0 || capacity > 128 ){
            throw new InvalidRAMCapacity();
        }
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
        return "\n\nRAM\n\nCapacity: " + getCapacity() + "GB" + "\nType: " + getType();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RAM ram = (RAM) o;
        return capacity == ram.capacity && Objects.equals(type, ram.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity, type);
    }

    @Override
    public boolean isUpgradable() {
        return true;
    }

    @Override
    public void upgrade(int additionalSize) {
        if(isUpgradable()){
            capacity += additionalSize;
            successUpgrade();
        }
        else{
            System.out.println("RAM can not be upgraded");
        }
    }

    @Override
    public void checkUsage() {
        System.out.println("Checking RAM usage...");
    }
}
