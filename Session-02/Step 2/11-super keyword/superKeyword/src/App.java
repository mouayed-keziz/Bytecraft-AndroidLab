public class App {
    public static void main(String[] args) throws Exception {
        
        Hero hero1 = new Hero("SuperMan",42 ,"all powers");;
        //System.out.println(hero1.name+" "+hero1.age+" "+hero1.power);

        System.out.println(hero1.toString());

        Hero hero2 = new Hero("BatMan", 40, "money");
        //System.out.println(hero2.name+" "+hero2.age+" "+hero2.power);
        System.out.println(hero2.toString());
    }
}
