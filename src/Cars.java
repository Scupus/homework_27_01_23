class Cars extends Transport {


    public Cars(String className, String brand, String model, float engineVolume) {
        super(className, brand, model, engineVolume);
    }

    @Override
    public void printDoDiagnostic() {
        System.out.println("Легковой автомобиль марки: " + brand + ", модель: " + model + " находится на диагностике!");
    }

    @Override
    public String toString() {
        return "";
    }


}

