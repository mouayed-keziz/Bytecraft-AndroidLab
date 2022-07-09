public class App {
    public static void main(String[] args) throws Exception {
        
        Garage garage = new Garage();

        Car car1 = new Car ("BMW");
        Car car2 = new Car ("Tesla");

        garage.park(car1);
        garage.park(car2);
    }
}
