package oop.anonymous;

/**
 * @author : Gathsara
 * created : 1/20/2026 -- 4:21 PM
 **/

public class Main {
    public static void main(String[] args) {

        //Anonymous class - Inner class that is declared and instantiated at the same time. It has no name

        //In here dog has speak() which display dog is barking.
        // But talking dog is speaking not barking, so extend dog class ans override speak() which is display dog is speaking
        Dog dog = new Dog();
        dog.speak();

        TalkingDog talkingDog = new TalkingDog();
        talkingDog.speak();

        //The only use of talking dog class is just override speak(). so instead of doing that we can use anonymous class
        Dog dog1 = new Dog(){
            @Override
            void speak(){
                System.out.println("This dog is speaking");
            }
        };
        dog1.speak();
    }
}
