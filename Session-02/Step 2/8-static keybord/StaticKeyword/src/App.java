public class App {
    public static void main(String[] args) throws Exception {

        Friend friend1 = new Friend("mouayed");
        Friend friend2 = new Friend("Mr him");
        Friend friend3 = new Friend("l7ouma");
        Friend friend4 = new Friend("hadak l3abd");

        System.out.println(friend2.name);
        System.out.println(Friend.numofFriends);
        Friend.displayFriends();
    }
}
