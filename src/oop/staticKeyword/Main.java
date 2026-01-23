package oop.staticKeyword;

/**
 * @author : Gathsara
 * created : 1/17/2026 -- 5:01 PM
 **/

public class Main {

    //Static block - load only once because it initiate when class loader load class to JVM
    static{
        System.out.println("Static block in main");
    }

    public static void main(String[] args) {

        //Static - make variable or method belongs to class rather than any object
        //Commonly used for utility methods or shared resources

        Friend friend1 = new Friend("Jon");
        System.out.println(friend1.name);
        System.out.println(Friend.numOfFriends);

        Friend friend2 = new Friend("Frank");
        System.out.println(friend2.name);
        System.out.println(Friend.numOfFriends);


    }
}
