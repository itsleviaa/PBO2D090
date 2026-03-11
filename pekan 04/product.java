public class product {

    //Modifiers
    private String productName;
    private double price;
    private int stock;
    public static final String STORE_NAME = "Gadget Store";

    // Constructor
    public product(String productName, double price, int stock) {
        this.productName = productName; // penggunaan this
        this.price = price;
        this.stock = stock;
    }
    // Method menampilkan informasi produk
    public void displayProduct() {
        System.out.println("Store: " + STORE_NAME);
        System.out.println("Product Name: " + this.productName);
        System.out.println("Price: $" + this.price);
        System.out.println("Stock: " + this.stock);
    }
    // Method pembelian produk
    public void buyProduct(int quantity) {
        if (quantity <= stock) {
            this.stock -= quantity;
            System.out.println("Purchase successful! Remaining stock: " + this.stock);
        } else {
            System.out.println("Stock not enough!");
        }
    }
    // Main method utama
    public static void main(String[] args) {

        // Membuat objek menggunakan constructor
        product p1 = new product("Laptop", 850.0, 10);
        p1.displayProduct(); // Menampilkan informasi produk
        System.out.println("-------------------");
        p1.buyProduct(3); // Simulasi membeli produk
        System.out.println("-------------------");
        p1.displayProduct(); // Menampilkan data setelah pembelian
    }
}
