import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Customer singlefam = new SingleFamily();
        singlefam.customerInput();
        singlefam.generateBill();

        Customer dup = new Duplex();
        dup.customerInput();
        dup.generateBill();

        for(Customer c : Customer.getCustomers()){
            c.printCustomerInfo();
        }
    }
}