package oop.generics;

/**
 * @author : Gathsara
 * created : 1/22/2026 -- 3:37 PM
 **/

public class Box<T> {
    T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }
}
