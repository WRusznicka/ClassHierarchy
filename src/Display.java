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

    public void setSize(float size) {
        this.size = size;
    }
}
