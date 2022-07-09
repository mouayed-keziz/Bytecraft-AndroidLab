
public class P23methods {

    public static int some(int x, int y) {
        //traitement
        return x+y;
    }
    public static void main (String[] args) {
        System.out.println(some(4,2));
        int x = 3, y = 2;
        int z = some(x, y);
        //some(x, y);        void only
        System.out.println(z); 
    }
}
