public class Main {
    public static void main(String[] args) {
        Buses bus1 = new Buses("Автобус", "Икарус", "СТ18", 3.8f);
        Buses bus2 = new Buses("Автобус", "Дэу", "РС160", 4.2f);
        Buses bus3 = new Buses("Автобус", "МАЗ", "МА17", 4.6f);
        Buses bus4 = new Buses("Автобус", "ЛАЗ", "ЛА38", 4.0f);

        Cars car1 = new Cars("Легковой автомобиль", "Лада", "Приора", 1.8f);
        Cars car2 = new Cars("Легковой автомобиль", "БМВ", "Z.3", 2.4f);
        Cars car3 = new Cars("Легковой автомобиль", "Мерседес", "SLK/8", 3.2f);
        Cars car4 = new Cars("Легковой автомобиль", "Додж", "VIPER", 3.4f);

        Trucks truck1 = new Trucks("Грузовой автомобиль", "Мерседес", "Актос.6", 5.8f);
        Trucks truck2 = new Trucks("Грузовой автомобиль", "Ивеко", "С-Вэй", 6.4f);
        Trucks truck3 = new Trucks("Грузовой автомобиль", "Вольво", "W32", 7.2f);
        Trucks truck4 = new Trucks("Грузовой автомобиль", "Даф", "XF105", 7.0f);

        car3.printDoDiagnostic();
        truck1.printDoDiagnostic();
        bus4.printDoDiagnostic();
       
    }
}