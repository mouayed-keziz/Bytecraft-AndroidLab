public class P24OverLoadedMethods {
    public static void main (String[] args) {
        System.out.println("integers :");
        int a = 2;          System.out.println("a=2");
        int b = 6;          System.out.println("b=6");
        int c = 9;          System.out.println("c=9");
        int d = 4;          System.out.println("d=4");
        System.out.println("a+b= "+some(a,b));
        System.out.println("a+b+c= "+some(a,b,c));
        System.out.println("a+b+c+d= "+some(a,b,c,d));

        System.out.println();

        System.out.println("doubles :");
        double A = 3.11;    System.out.println("A=3.11");
        double B = 2.55;    System.out.println("B=2.55");
        double C = 9.16;    System.out.println("C=9.16");
        double D = 2.11;    System.out.println("D=2.11");
        System.out.println("A+B= "+some(A,B));
        System.out.println("A+B+C= "+some(A,B,C));
        System.out.println("A+B+C+D= "+some(A,B,C,D));
        
    }

    //suredefinition //  redefinition
    //overload      //  override (inheritance)

    static int some (int x, int y) {
        return x+y;
    }
    static int some (int x, int y, int z) {
        return x+y+z;
    }
    static int some (int x, int y, int z, int k) {
        return x+y+z+k;
    }
    static double some (double x, double y) {
        return x+y;
    }
    static double some (double x, double y, double z) {
        return x+y+z;
    }
    static double some (double x, double y, double z, double k) {
        return x+y+z+k;
    }
}
