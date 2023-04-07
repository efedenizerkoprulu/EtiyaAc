public class ProductValidator {
    static {
        System.out.println("Static constructor oluştu.");

    }

    public static boolean isValid(Product product) {
        if (product.getPrice() > 0 && !product.getName().isEmpty())
            return true;
        else {
            return false;
        }
    }
}
