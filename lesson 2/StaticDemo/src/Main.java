public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.setId(1);
        product.setName("Mouse");
        product.setPrice(400);

        productManager.add(product);

        DatabaseHelper.CRUD.add();     // Yanlış kullanımdır Solid'in S prensibini ezer
        DatabaseHelper.Connection.createCoonection(); //Benzer yapılar ayrılmalıdır
    }
}