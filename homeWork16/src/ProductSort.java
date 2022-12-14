import java.util.List;
import java.util.stream.*;

public class ProductSort {
    public static List<Product> productsTypeAndPrice(List<Product> products) {
        return products.stream().filter(product -> product.getType().equals(Type.BOOK) && product.getPrice() > 250).collect(Collectors.toList());
    }

    public static List<Product> productsTypeAndSale(List<Product> products) {
        products.stream().filter(product -> (product.getType().equals(Type.BOOK) && (product.getSale()))).forEach(product -> product.setPrice((product.getPrice() / 100) * 90));
        return products;
    }

    public static List<Product> productsCheapest(List<Product> products) {
        return null;
    }

    public static List<Product> productsThreeLast(List<Product> products) {
        return null;
    }

    public static List<Product> productsSumPrice(List<Product> products) {
        return null;
    }

    public static List<Product> productsGroupByType(List<Product> products) {
        return null;
    }
}
