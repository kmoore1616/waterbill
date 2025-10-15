import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Customer single_fam= new SingleFamily();
        single_fam.customerInput();
        single_fam.generateBill();

        Customer dup = new Duplex();
        dup.customerInput();
        dup.generateBill();

        Customer.sortCustomerBill();

        System.out.println("Low");
        System.out.println(Customer.getCustomers().get(0));
        System.out.println("High");
        System.out.println(Customer.getCustomers().get(1));

    }
}