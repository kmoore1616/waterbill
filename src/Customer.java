import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Customer {
    private String name  = null;
    int gallonsUsed = 0;
    int customerType = 0;  // 1- Single family
    double bill = 0;

    public void set_name(String new_name){
        name = new_name;
    }

    public String get_name(){
        return name;
    }

    /*

    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

    try {
        System.out.println("Enter customer type 1-Single Family, 2-Duplex: ");
        customerType = Integer.parseInt(bufferedReader.readLine());
        System.out.printf("Enter customer name: ");
        name = bufferedReader.readLine();
        System.out.printf("Enter gallons used: ");
        gallonsUsed = Integer.parseInt(bufferedReader.readLine());
    } catch (IOException e) {
        throw new RuntimeException(e);
    }


    if (customerType == 1) {
        if (gallonsUsed <= 7000) {
            bill = 13.21 + gallonsUsed * (2.04 / 1000.0);
        } else if (gallonsUsed <= 13000) {
            bill = 13.21 + 7000 * (2.04 / 1000.0)
                    + (gallonsUsed - 7000) * (2.35 / 1000.0);
        } else {
            bill = 13.21 + 7000 * (2.04 / 1000.0)
                    + 6000 * (2.35 / 1000.0)
                    + (gallonsUsed - 13000) * (2.70 / 1000.0);
        }
    } else {
        if (gallonsUsed <= 9000) {
            bill = 15.51 + gallonsUsed * (1.97 / 1000.0);
        } else if (gallonsUsed <= 13000) {
            bill = 15.51 + 9000 * (1.97 / 1000.0)
                    + (gallonsUsed - 9000) * (2.26 / 1000.0);
        } else {
            bill = 15.51 + 9000 * (1.97 / 1000.0)
                    + 4000 * (2.26 / 1000.0)
                    + (gallonsUsed - 13000) * (2.60 / 1000.0);
        }
    }

    System.out.println("Customer type: " + customerType);
    System.out.println("Customer name: " + name);
    System.out.println("Gallons used: " + gallonsUsed);
    System.out.printf("Total Bill: $%.2f\n", bill);

     */
}
