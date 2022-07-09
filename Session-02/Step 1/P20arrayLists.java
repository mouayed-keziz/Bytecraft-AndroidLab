
import java.util.ArrayList;

public class P20arrayLists {    
    public static void main (String[] args) {
        //generics ===== generateurs
        ArrayList<String> name = new ArrayList<String>();
        //arrayList stores refrence data types only
        name.add("Mouayed");
        name.add("keziz");
        name.add("randomName");
        System.out.println(name);
        name.set(2, "namechanged");
        name.remove(1);
        //name.clear();


        for (int i = 0 ; i < name.size() ; i++) {
            System.out.println(name.get(i));            
        }

        for (String s : name) {
            System.out.println(s);
        }
    }    
}
