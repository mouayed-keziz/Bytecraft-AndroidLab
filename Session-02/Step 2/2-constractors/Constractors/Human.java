package Constractors;

public class Human {
    String name;
    int age;
    double weight;

    human(String name, int age, double weight) {
        //memory allocation
        //do the rest "down here"
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat () {
        System.out.println(this.name+" is eating");
    }
    void drink () {
        System.out.println(this.name+" is drinking");
    }
}
