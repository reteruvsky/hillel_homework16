public class TypeNotFoundException extends Exception {

    public TypeNotFoundException() {
        System.out.println("Product " + Type.BOOK + " is not founded");
    }
}
