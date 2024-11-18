package entities;

public class Processor {
    private String model;
    private float maxFrequency;
    private int numberOfCores;
    private String cache;

    public Processor(String model, float maxFrequency, int numberOfCores, String cache) {
        this.model = model;
        this.maxFrequency = maxFrequency;
        this.numberOfCores = numberOfCores;
        this.cache = cache;
    }

    public Processor() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getMaxFrequency() {
        return maxFrequency;
    }

    public void setMaxFrequency(float maxFrequency) {
        this.maxFrequency = maxFrequency;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }

    @Override
    public String toString() {
        return "\n\nProcessor\n\nModel: " + getModel() + "\nMaximum frequency: " + getMaxFrequency() +
                "GHz\nNumber of cores: " + getNumberOfCores() + "\nCache: " + getCache();
    }
}
