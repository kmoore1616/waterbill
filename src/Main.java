import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Customer th = new Townhouse() {
            @Override
            public double calculateBill() {
                return 999999;
            }
        };
        th.generateBill();
        System.out.println(th.getBill());
    }
}
