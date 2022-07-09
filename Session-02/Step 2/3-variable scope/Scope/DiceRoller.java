package Scope;
import java.util.Random;

public class DiceRoller {
 
    Random random;
    int number ;
    
    DiceRoller(){
        random = new Random();
        roll();
    }
    
    void roll() {
        this.number = random.nextInt(6)+1;
        System.out.println(number);
    }
}