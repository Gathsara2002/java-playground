/**
 * @author : Gathsara
 * created : 12/31/2025 -- 10:52 AM
 **/

public class StringMethods {
    public static void main(String[] args) {

        //String - string is a sequence of characters surrounded by double quotes ("")

        String name= "John Doe";

        int length = name.length();
        System.out.println(length);

        char letter = name.charAt(4);
        System.out.println(letter);

        int index = name.indexOf(" ");
        System.out.println(index);


        String email = "John@gmail.com";
        String username = email.substring(0,3);
        System.out.println(username);
        String domain = email.substring(5);
        System.out.println(domain);

    }
}
