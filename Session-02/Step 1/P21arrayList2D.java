
import java.util.ArrayList;

public class P21arrayList2D {
    public static void main (String[] args) {
        
        //list 01 : 3 elements
        ArrayList<String> name = new ArrayList<String>();
        name.add("mouayed");
        name.add("mouayedkeziz");
        name.add("keziz");
        
        //list 02 : 2 elements
        ArrayList<String> fruit = new ArrayList<String>();
        fruit.add("apple");
        fruit.add("orange");

        //list 03 : 4 elements
        ArrayList<String> drinks = new ArrayList<String>();
        drinks.add("juice");
        drinks.add("water");
        drinks.add("coffe");
        drinks.add("soda");

        //2D arrayList that contains all previous arrayLists
        ArrayList<ArrayList<String>> allListsIn2Dlist = new ArrayList<ArrayList<String>>();
        allListsIn2Dlist.add(fruit);
        allListsIn2Dlist.add(name);
        allListsIn2Dlist.add(drinks);
        
        //System.out.println(allListsIn2Dlist);
        System.out.println(allListsIn2Dlist.get(2).get(0));

        
    }
}