package advanced.generics;

/**
 * @author : Gathsara
 * created : 1/22/2026 -- 3:37 PM
 **/

public class Main {
    public static void main(String[] args) {

        //Generics - they allow you to write a class or a method that can work with any data type (Compile time safety)

        Box<String> box = new Box<>();
        box.setItem("Banana");
        System.out.println(box.getItem());

        Product<String, Double> product = new Product<>("Ball", 100.0);
        System.out.println(product.getItem());
        System.out.println(product.getPrice());
    }
}
