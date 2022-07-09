import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a whole number to divide : ");
        int x = scan.nextInt();

        System.out.println("enter a whole number to divide by : ");
        int y = scan.nextInt();
        try{ 
            int z = x/y;
            System.out.println("result = "+x+" / "+y+" = "+z);
        } catch(ArithmeticException e) {
            System.out.println("you cant devide by 0 ");
            return;
        }
    }
}

/*
try {...} catch (exeption) {error detailing or handling}
only used for unsafe code
*/


/*costume exeption*/

