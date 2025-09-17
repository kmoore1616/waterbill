import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setUserInfo();
        customer.setGallonsUsed(200000000);
        customer.calculateBill();
        customer.printCustomerInfo();
    }
}
