public class Bicycle extends WheeledVehicle {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        for (int i = 0; i < this.getWheelsCount(); i++) {
            System.out.print("Меняем покрышку ");
        }
    }

    @Override
    public void doService() {
        System.out.println("Обслуживаем:" + this.getModelName());
        updateTyre();
        System.out.println();
    }
}
