//project 4

public class P4SwapTwoVariables {
    public static void main (String[] args) {
        int x = 123;
        int y = 321;
        int temp;

        System.out.println("before swap");
        System.out.println("x : "+x+"\ny : "+y+"\n");

        temp = x;
        x = y;
        y = temp;

        System.out.println("after swap");
        System.out.println("x : "+x+"\ny : "+y);
    }

}