import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setGallonsUsed(1);
        customer.setName("");
        customer.printCustomerInfo();
    }
}
