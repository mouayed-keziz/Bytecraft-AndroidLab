public class App {
    public static void main(String[] args) throws Exception {

        System.out.println();
        Rabitt lapin = new Rabitt();
        lapin.flee();

        System.out.println();
        Hawk bird = new Hawk();
        bird.hunt();
        //bird.flee(); cuz hawk isnt a prey

        System.out.println();
        Fish poison = new Fish();
        poison.flee();
        poison.hunt();
    }
}
