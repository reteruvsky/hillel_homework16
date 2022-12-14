import java.util.List;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product(163453, Type.BOOK, 54, true, LocalDateTime.now()),
                new Product(126545, Type.FOOD, 56, false, LocalDateTime.now()),
                new Product(184235, Type.BOOK, 874, true, LocalDateTime.now()),
                new Product(1035343, Type.OFFICE, 75, true, LocalDateTime.now()),
                new Product(136534, Type.BOOK, 589, false, LocalDateTime.now()),
                new Product(175542, Type.BOOK, 454, true, LocalDateTime.now()),
                new Product(143234, Type.OFFICE, 103, false, LocalDateTime.now()),
                new Product(164345, Type.FOOD, 45, false, LocalDateTime.now()),
                new Product(154654, Type.BOOK, 352, false, LocalDateTime.now()),
                new Product(165342, Type.FOOD, 85, true, LocalDateTime.now()),
                new Product(184583, Type.BOOK, 843, true, LocalDateTime.now()),
                new Product(174364, Type.BOOK, 642, true, LocalDateTime.now())
        );

        System.out.println(ProductSort.productsTypeAndSale(products));
    }
}
