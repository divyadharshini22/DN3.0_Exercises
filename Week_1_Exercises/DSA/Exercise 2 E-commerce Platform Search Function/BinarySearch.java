import java.util.Arrays;
public class BinarySearch {
        public static Product search(Product[] products, String productName) {
            int left = 0;
            int right = products.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                int comparison = products[mid].getProductName().compareToIgnoreCase(productName);

                if (comparison == 0) {
                    return products[mid];
                } else if (comparison < 0) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return null;
        }

        public static void sortProducts(Product[] products) {
            Arrays.sort(products, (p1, p2) -> p1.getProductName().compareToIgnoreCase(p2.getProductName()));
        }
    }

}
