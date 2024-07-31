public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        image1.display(); // Loads and displays the image
        image2.display(); // Loads and displays the image
        image1.display(); // Just displays the image (cached)
    }
}
