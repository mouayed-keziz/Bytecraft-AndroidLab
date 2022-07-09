public class P26FinalKeyWord {
    public static void main (String[] args) {
        int a = 5;
        a = 2;
        System.out.println(a);  //the value of a could be changed

        final int b = 6;
        //b = 2;
        System.out.println(b);  //the value of b could never be changed
    }
}
