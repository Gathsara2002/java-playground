package oop.interfaces;

/**
 * @author : Gathsara
 * created : 1/19/2026 -- 11:37 AM
 **/

public class Fish implements Prey,Predator{
    @Override
    public void hunt() {
        System.out.println("Fish is hunting");
    }

    @Override
    public void flee() {
        System.out.println("Fish is swimming");
    }
}
