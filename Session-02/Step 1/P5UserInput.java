//project 5

import java.util.Scanner;

public class P5UserInput {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);

        System.out.println("what is your name ?");
        String name;
        name = scan.nextLine();
        
        System.out.println("how old are you ?");
        int age;
        age = scan.nextInt();
        scan.nextLine();
        
        System.out.println("what is your favorite food ?");
        String food;
        food = scan.nextLine();
        
        System.out.println("\nyour name is "+name);
        System.out.println("you are "+age+" years old");
        System.out.println("your favorite food is "+food);
        
    }
    
}
