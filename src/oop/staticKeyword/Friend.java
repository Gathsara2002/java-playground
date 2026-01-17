package oop.staticKeyword;

/**
 * @author : Gathsara
 * created : 1/17/2026 -- 5:01 PM
 **/

public class Friend {
    String name;
    static int numOfFriends;

    public Friend(String name) {
        this.name = name;
        numOfFriends++;
    }
}
