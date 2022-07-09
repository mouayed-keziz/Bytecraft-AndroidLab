public class food {
    
    String name;

    food(String Thename) {
        this.name = Thename;
    }

    public String toString() {
        return this.name;
    }


    public static char getFirstChar(String a) {
        return a.charAt(0);
    }
}
