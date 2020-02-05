import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        recursion.printNumbersBefore(5);
        System.out.println();
        System.out.println(recursion.getSumOfNumberDigits(4444));
        System.out.println(recursion.isPalindrome("qweewq"));

        Product product1 = new Product(1, "Keyboard", 15);
        Product product2 = new Product(2, "Mouse", 100);
        Product product3 = new Product(3, "Monitor", 600);
        Product product4 = new Product(4, "Table", 111);
        Product product5 = new Product(5, "Chair", 1);
        Product product6 = new Product(6, "Bag", 65);
        Product product7 = new Product(7, "Cable", 78);
        Product product8 = new Product(8, "Cable", 88);
        Product product9 = new Product(9, "Door", 33);
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);

        Streams streams = new Streams();
        System.out.println(streams.getReverceNames(products));
        System.out.println(streams.getNamesAsc(products));
        System.out.println(streams.getSortedProductByPrice(products));
        System.out.println(streams.getAveragePrice(products));
        System.out.println(streams.getMapProductCount(products));
    }
}
