package Constractors;

public class Main {
    
    public static void main (String[] args) {
        Human person1 = new human("Mouayed keziz",19,191.00);
        Human person2 = new human("keziz"  ,13,176.10);
        System.out.println(person1.name+" "+person1.age+" "+person1.weight);
        System.out.println(person2.name+" "+person2.age+" "+person2.weight);
        person2.eat();
        person1.drink();
    }
    
}
