package advanced.recordClass;

/**
 * @author : Gathsara
 * created : 1/27/2026 -- 4:52 PM
 **/

public class Main {
    public static void main(String[] args) {

        //Record class - special class and acts as data carrier. If normal class use as DTO need to write a lot of boilerplate codes.
        //But with help of record can write same DTO in couple lines.
        //By default, record's instance variables are private and final
        //Record already comes with toString(), equals() and hashCode()
        //Record comes with canonical constructor
        //Record class is final so can't extend
        //Can't create instance variables inside record but ca  create static variables

        //Using class.
        UserDTO userDTO1 = new UserDTO(1, "Alex");
        UserDTO userDTO2 = new UserDTO(1, "Alex");

        System.out.println(userDTO1);
        System.out.println(userDTO2);
        System.out.println(userDTO1.equals(userDTO2));

        //using record
        User user1 = new User(1,"John");
        User user2 = new User(1,"John");

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user1.id());
        System.out.println(user1.name());
        System.out.println(user1.equals(user2));

    }
}
