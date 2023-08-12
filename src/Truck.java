public class Truck extends Car{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.print("Проверяем прицеп ");
    }

    @Override
    public void doService() {
        System.out.println("Обслуживаем:" + this.getModelName());
        updateTyre();
        checkEngine();
        checkTrailer();
        System.out.println();
    }
}