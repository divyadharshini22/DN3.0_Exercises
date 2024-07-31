public class Product {
    private String productName;
    private String productId;
    private int quantity;
    private double price;
    public Product(String productName, String productId, int quantity, double price) {
        this.productName = productName;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "productName=" + productName + ", productId=" + productId + ", quantity=" + quantity;
    }
}
