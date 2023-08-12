public abstract class WheeledVehicle implements Serviceable {
    private String modelName;
    private int wheelsCount;

    public WheeledVehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}
