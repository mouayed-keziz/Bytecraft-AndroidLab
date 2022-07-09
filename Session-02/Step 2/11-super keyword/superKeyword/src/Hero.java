public class Hero extends Person {
    String power;

    Hero(String aName, int aAge, String aPower) {
        super(aName, aAge);
        this.power = aPower;
    }

    public String toString() {
        return  super.toString() + " " + this.power;
    }
}
