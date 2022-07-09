public class Friend {
    
    String name;
    static int numofFriends;  //any variable if its not assigned 

    Friend (String theName) {
        this.name = theName;
        numofFriends++;
    }

    static void displayFriends () {
        System.out.println("you have "+numofFriends+" friends");
    }

}
