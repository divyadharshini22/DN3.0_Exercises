public class Main {

    // Define the Customer class
    public static class Customer {
        private int id;
        private String name;
        private String email;

        public Customer(int id, String name, String email) {
            this.id = id;
            this.name = name;
            this.email = email;
        }

        // Getters and toString method
        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }
    }

    // Define the CustomerRepository interface
    public interface CustomerRepository {
        Customer findCustomerById(int id);
    }

    // Implement the CustomerRepository interface
    public static class CustomerRepositoryImpl implements CustomerRepository {
        @Override
        public Customer findCustomerById(int id) {
            // Implementation to find customer by ID, e.g., from a database
            // For simplicity, let's return a mock customer object
            return new Customer(id, "John Doe", "john.doe@example.com");
        }
    }

    // Define the CustomerService class
    public static class CustomerService {
        private final CustomerRepository customerRepository;

        // Constructor injection
        public CustomerService(CustomerRepository customerRepository) {
            this.customerRepository = customerRepository;
        }

        public Customer getCustomerById(int id) {
            return customerRepository.findCustomerById(id);
        }
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        // Create a CustomerRepository implementation
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject the repository into the service
        CustomerService customerService = new CustomerService(customerRepository);

        // Use the service to find a customer
        Customer customer = customerService.getCustomerById(1);
        System.out.println(customer);
    }
}
