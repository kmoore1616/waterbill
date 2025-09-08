import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.set_name("ME!");
        System.out.println(customer.get_name());

    }
}