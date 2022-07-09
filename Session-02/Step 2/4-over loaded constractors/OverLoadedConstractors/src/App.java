public class App {
    public static void main(String[] args) throws Exception {

        pizza PizzaTest1 = new pizza("thicc crust","tomato","modzarella","peperonni");
        System.out.println("\n\npizza 1");
        System.out.println("bread "+PizzaTest1.bread);
        System.out.println("sauce "+PizzaTest1.sauce);
        System.out.println("cheese "+PizzaTest1.cheese);
        System.out.println("Topping "+PizzaTest1.Topping);

        pizza PizzaTest2 = new pizza("thicc crust","tomato","modzarella");
        System.out.println("\n\npizza 2");
        System.out.println("bread "+PizzaTest2.bread);
        System.out.println("sauce "+PizzaTest2.sauce);
        System.out.println("cheese "+PizzaTest2.cheese);
        
        pizza PizzaTest3 = new pizza("thicc crust","tomato");
        System.out.println("\n\npizza 3");
        System.out.println("bread "+PizzaTest3.bread);
        System.out.println("sauce "+PizzaTest3.sauce);
        
    }
}
