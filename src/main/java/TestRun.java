import lesson1.hw1.shop.Product;
import lesson1.hw1.shop.Shop;

public class TestRun {



    public static void main(String[] args) {
        Product product1 = new Product("Product 1", 100);
        Product product2 = new Product("Product 2", 50);
        Product product3 = new Product("Product 3", 75);

        Shop shop = new Shop();
        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);

        System.out.println(shop.sortProductsByPrice());
        System.out.println(shop.getMostExpensiveProduct());

    }

}
