package entities;

import exceptions.InvalidSize;

import java.util.Objects;

public class Display {
    private String resolution;
    private String type;
    private int refreshRate;
    private float size;

    public Display(String resolution, String type, int refreshRate, float size) {
        this.resolution = resolution;
        this.type = type;
        this.refreshRate = refreshRate;
        this.size = size;
    }

    public Display() {
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) throws InvalidSize {
        if(size <= 0.0) {
            throw new InvalidSize();
        }
        this.size = size;
    }

    @Override
    public String toString() {
        return "\n\nDisplay\n\nResolution: " + getResolution() + "\nType: " + getType() +
                "\nRefresh rate: " + getRefreshRate() + "Hz\nSize: " + getSize() + " inches";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Display display = (Display) o;
        return refreshRate == display.refreshRate && Float.compare(size, display.size) == 0 && Objects.equals(resolution, display.resolution) && Objects.equals(type, display.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolution, type, refreshRate, size);
    }
}
