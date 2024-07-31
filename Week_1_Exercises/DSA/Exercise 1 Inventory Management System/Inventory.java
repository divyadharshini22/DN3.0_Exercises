import java.util.HashMap;
public class Inventory {
    private HashMap<String, Product> products;
    public Inventory() {
        products = new HashMap<>();
    }

    public void addpro(Product p) {
        products.put(p.getProductId(),p);
    }
    public void removepro(String productId) {
        products.remove(productId);
    }
    public Product getpro(String productId) {
        return products.get(productId);
    }
    public void updatepro(String productId,int quantity,double price) {
        Product p = products.get(productId);
        if(p!=null){
            p.setQuantity(quantity);
            p.setPrice(price);
        }
    }
}
