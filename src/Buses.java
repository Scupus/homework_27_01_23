public class Buses extends Transport {


    public Buses(String className, String brand, String model, float engineVolume) {
        super(className, brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return className + brand + model + engineVolume;
    }

}
