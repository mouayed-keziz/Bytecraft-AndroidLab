public class App {
    public static void main(String[] args) throws Exception {

        //polymorphism is the ability of an object to identify as more than one type

        Car car = new Car();
        Bycicle velo = new Bycicle();
        Boat babor = new Boat();

        vehicle[] racers = {car, velo, babor};
        //arrays arraylist stack queue ...etc
        
        /*car.go();
        velo.go();
        babor.go();*/

        for (vehicle x : racers) {
            x.go();
        }
    }
}
