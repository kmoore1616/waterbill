import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Customer single_fam= new SingleFamily();

        Customer dup = new Duplex();
        System.out.println(dup);
        dup.customerInput();
        dup.generateBill();

        System.out.println("high");
        System.out.println(Customer.getHighestBill());
        System.out.println("low");
        System.out.println(Customer.getLowestBill());

    }
}