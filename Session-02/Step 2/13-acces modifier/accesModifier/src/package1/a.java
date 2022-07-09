package package1;
import package2.*;

public class a {
    public static void main(String[] args) {
        b b_object = new b();
        //System.out.println(b.privateMessage);
    }
}

/*
defaule access (no access modifier):
    visible to all classes in the same package only
public access :
    visible to all classes in all packages (everything in the project folder)
protected access :
    visible only to children class
    example :
        class 1 has protected x
        class 2 extends class 1 (inhebision)
        ---> x is visible in class 2
private access :
    visible to the class that it contains and nothing else even if its in the same package
*/