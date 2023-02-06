import java.time.LocalDateTime;

public class Product {
    private int number;
    private Type type;
    private int price;
    private boolean sale;
    private LocalDateTime date;

    public Product(int number, Type type, int price, boolean sale, LocalDateTime date) {
        setNumber(number);
        setType(type);
        setPrice(price);
        setSale(sale);
        setDate(date);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean getSale() {
        return sale;
    }

    public void setSale(boolean sale) {
        this.sale = sale;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String toString() {
        return "Identification number: " + getNumber() + "   " +
                "Type: " + getType() + "   " +
                "Price: " + getPrice() + "   " +
                "Sale: " + getSale() + "   " +
                "Current Date: " + getDate();
    }
}
