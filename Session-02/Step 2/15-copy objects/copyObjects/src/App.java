public class App {
    public static void main(String[] args) throws Exception {

        Car car1 = new Car("chevrolet", "Camaro", 2020);
        Car car2 = new Car("Tesla", "series X", 2021);
        Car car3 = new Car(car2);  //calling copy in the constractor
        //car2 = car1; 
        //they points to the same car .. they are not equal
        //car1 is litterally car2 (same adress)

        car2.copy(car1);
        //they have two deffrent adresses but the same attributes

        System.out.println(car1);
        System.out.println(car2);
        System.out.println();
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println();
        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
        System.out.println();
        System.out.println(car3.getMake());
        System.out.println(car3.getModel());
        System.out.println(car3.getYear());
        
        
    }
}
