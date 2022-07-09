import java.util.ArrayList;

public class P22ForEachLoop {
    public static void main (String[] args) {
        System.out.println("arrayliste :");
        ArrayList<String> drinks = new ArrayList<String>();
        drinks.add("juice");
        drinks.add("water");
        drinks.add("coffe");
        drinks.add("soda");
        
        for (String A : drinks) {
             System.out.println(A);           
        }
        
        System.out.println();
        System.out.println("array :");
        String[] animals = {"cat","dog","cow","rat","bird",};
        for (String i : animals) {
            System.out.println(i);
        }
    }
}


