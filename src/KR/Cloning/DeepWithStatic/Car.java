package KR.Cloning.DeepWithStatic;

public class Car {
    private int weight;
    private String model;

    public Car() {}

    public Car(int weight, String model) {
        this.weight = weight;
        this.model = model;
    }

    public static Car deepCopyCar(Car carToCopy){
        Car copiedCar = new Car();
        copiedCar.weight = carToCopy.weight;
        copiedCar.model = carToCopy.model;
        // если ссылочный тип, то создавать через new(как в .DeepWithConstructor)
        return copiedCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "weight=" + weight +
                ", model='" + model + '\'' +
                '}';
    }
}
