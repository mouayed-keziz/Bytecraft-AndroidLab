public class Person {
    String name;
    int age;

    Person(String aName, int aAge) {
        this.name = aName;
        this.age = aAge;
    }
    
    public String toString() {
        return this.name+" "+this.age;
    }
}
