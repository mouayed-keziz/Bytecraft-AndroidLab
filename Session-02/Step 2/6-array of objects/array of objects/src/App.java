public class App {
    public static void main(String[] args) throws Exception {

        food food1 = new food("chorba");
        food food2 = new food("boorak");
        food food3 = new food("kesra");

        // method 1:
        food[] dinner = new food[3];
        dinner[0] = food1;
        dinner[1] = food2;
        dinner[2] = food3;

        // method 2:
        // food[] dinner = {food1,food2,food3};

        for (food i : dinner)
            System.out.println(i);
    }
}
