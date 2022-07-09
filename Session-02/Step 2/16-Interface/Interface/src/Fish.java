public class Fish implements Prey, Predator {

    @Override
    public void hunt() {
        System.out.println("this fish is hunting a smaller fish");
    }

    @Override
    public void flee() {
        System.out.println("the fish is fleeing from a bigger fish");        
    }
    
}
