public class App {
    public static void main(String[] args) throws Exception {

        Car car = new Car("Tesla", "series X", 2021);

        //System.out.println(car.make); cannot do that, its private variable
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        //car.year = 2022; cannot do that its private variable
        car.setYear(2022);
        //System.out.println(car.getYear());  2022
    }
}
