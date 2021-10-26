package KR.Cloning.DeepWithStatic;

public class Main {
    public static void main(String[] args) {
        Human cloneHuman = Human.getHumanInstanceWithAgeAndName(20, "Bb");

        Car car = new Car(2600, "Aa");
        System.out.println("Car " + car);

        Car cloneCar = Car.deepCopyCar(car);
        System.out.println("Cloned car " + cloneCar);
    }
}
