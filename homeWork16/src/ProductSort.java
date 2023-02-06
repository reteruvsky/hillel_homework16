import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.*;
import java.util.function.Function;

public class ProductSort {
    public static List<Product> productsTypeAndPrice(List<Product> products) {
        return products.stream().filter(product -> product.getType().equals(Type.BOOK)
                        && product.getPrice() > 250)
                .collect(Collectors.toList());
    }

    public static List<Product> productsTypeAndSale(List<Product> products) {
        return products.stream().filter(product -> product.getType().equals(Type.BOOK)
                        && product.getSale())
                .peek(product -> product.setPrice((product.getPrice() - product.getPrice() * 10 / 100)))
                .collect(Collectors.toList());
    }

    public static Product productsCheapest(List<Product> products) throws TypeNotFoundException {
        return products.stream().filter(product -> product.getType().equals(Type.BOOK))
                .min(Comparator.comparingInt(Product::getPrice))
                .orElseThrow(TypeNotFoundException::new);
    }

    public static List<Product> productsThreeLast(List<Product> products) {
        return products.stream().sorted(Comparator.comparing(Product::getDate))
                .skip(products.size() - 3)
                .collect(Collectors.toList());
    }

    public static int productsSumPrice(List<Product> products, LocalDateTime localDateTime) {
        return products.stream()
                .filter(product -> product.getDate().isAfter(LocalDateTime.of(2022, 1, 1, 0, 0))
                        && product.getDate().isBefore(LocalDateTime.of(2022, 12, 31, 23, 59))
                        && product.getType().equals(Type.BOOK)
                        && product.getPrice() < 75)
                .mapToInt(Product::getPrice).sum();
    }

    public static Map<Type, List<Product>> productsGroupByType(List<Product> products) {
        return products.stream().collect(Collectors.groupingBy(Product::getType));
    }
}
