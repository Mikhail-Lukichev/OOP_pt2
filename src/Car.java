public class Car extends Bicycle {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.print("Проверяем двигатель ");
    }

    @Override
    public void doService() {
        System.out.println("Обслуживаем:" + this.getModelName());
        updateTyre();
        checkEngine();
        System.out.println();
    }
}
