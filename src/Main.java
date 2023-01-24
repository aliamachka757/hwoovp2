public class Main {
    public static void main(String[] args) {
        Car lada_granta = new Car("Lada", "Granta", 1.7, "Yellow", 2015, "Russia");
        Car audi_a8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Black", 2020, "Germany");
        Car bmw_z8 = new Car("BMW", "Z8", 3.0, "Black", 2021, "Germany");
        Car kia_sportage = new Car("Kia", "Sportage 4th generation", 2.4, "Red", 2018, "South Korea");
        Car hyundai_avante = new Car("Hyundai", "Avante", 1.6, "Orange", 2016, "South Korea");

        System.out.println(lada_granta);
        System.out.println(audi_a8);
        System.out.println(bmw_z8);
        System.out.println(kia_sportage);
        System.out.println(hyundai_avante);
    }
}
