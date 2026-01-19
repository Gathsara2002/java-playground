package oop.interfaces;

/**
 * @author : Gathsara
 * created : 1/19/2026 -- 11:35 AM
 **/

public class Main {
    public static void main(String[] args) {

        //Interface - 100% abstract
        //Interface support multiple inheritance

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.hunt();
        fish.flee();
    }
}
