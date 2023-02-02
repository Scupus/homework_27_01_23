public class Trucks extends Transport {


    public Trucks(String className, String brand, String model, float engineVolume) {
        super(className, brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public void printDoDiagnostic() {
        System.out.println("Грузовик марки: " + brand + ", модель: " + model + " находится на диагностике!");

    }
}


