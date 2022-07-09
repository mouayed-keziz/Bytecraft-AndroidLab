//project 8

public class P8Mathclass {
    public static void main (String[] args) {
        
        double x = 3.14;
        double y = -10;
        System.out.printf("x = %f    y = %f\n",x,y);
        System.out.println("max(x, y) = "+Math.max(x, y));                      //max between x and y
        System.out.println("abs(y) = "+Math.abs(y));                            //absolute value
        System.out.println("square root (x) = sqrt(x) = "+Math.sqrt(x));        //square root
        System.out.println("x^y = power(x, y) = "+Math.pow(x, y));              //x^y
        System.out.println("round(x) = "+Math.round(x));                        //round
        System.out.println("flour(x) = E(x) = "+Math.floor(x));                 //E(x)
        System.out.println("ceil(x) = E(x)+1 = "+Math.ceil(x));                 //E(x)+1
        System.out.println("E = "+Math.E);                                      //e
        System.out.println("Pi = "+Math.PI);                                    //PI
        System.out.println("random = "+Math.random());                          //random number (0-0.99)
        //...
    }
    
}
