import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        Animal animal;

        //A a = new B();
        //B b = new A();
        //A extends B;

        System.out.println("what animal do you want?");
        System.out.println("1 : dog"+"\n"+"2 : cat");
        int choise = scan.nextInt();

        if (choise == 1) {
            animal = new Dog();
            animal.speak();
        }
        else if (choise == 2) {
            animal = new Cat();
            animal.speak();
        }
        else {
            animal = new Animal();
            System.out.println("choise is invalide");
            animal.speak();
        }
    }
}
