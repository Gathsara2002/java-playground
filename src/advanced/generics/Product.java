package advanced.generics;

/**
 * @author : Gathsara
 * created : 1/22/2026 -- 3:43 PM
 **/

public class Product<T, U> {
    T item;
    U price;

    public Product(T item, U price) {
        this.item = item;
        this.price = price;
    }

    public T getItem() {
        return item;
    }

    public U getPrice() {
        return price;
    }
}
