public class Car {
    String manufacturer;
    String modelName;
    int year;

    @Override
    public String toString() {
        return "Car{" + "manufacturer=" + manufacturer + ", modelName=" + modelName + ", year=" + year + '}';
    }

    public Car(String manufacturer, String modelName, int year) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.year = year;
    }
}
