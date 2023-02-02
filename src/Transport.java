import java.io.IOException;
import java.util.Objects;

public class Transport {

    final String className;
    final String brand;
    final String model;
    final float engineVolume;


    public Transport(String className, String brand, String model, float engineVolume) {
        this.className = className;
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public String getClassName() {
        return className;
    }


    public void printDoDiagnostic() {
        if (className.equals("Автобус")) {
            try {
                throw new IOException();
            } catch (IOException e) {
                System.out.println("Данная категория ТС не проходит диагностику!!!");
            }
        }
        System.out.println();
    }

    @Override

    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Float.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) && model.equals(transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }


}
