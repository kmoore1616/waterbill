import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Customer {
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


    private final int TIER2_CUTOFF = 13000;
    private final double GALLONS = 1000.0;


    private final double LOW_INCOME_DISCOUNT = 0.10;

    String name;
    private int gallonsUsed;
    private int customerType;  // 1- Single family
    private double bill;

    public int getTIER2_CUTOFF() {
        return TIER2_CUTOFF;
    }

    public double getGALLONS() {
        return GALLONS;
    }

    public int getGallonsUsed() {
        return gallonsUsed;
    }

    public void setGallonsUsed(int gallonsUsed) {
        if (gallonsUsed < 0) {
            System.out.println("Gallons must be greater than 0!");
        }else{
            this.gallonsUsed = gallonsUsed;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")){
            System.out.println("Enter a Name!");
        }else{
            this.name = name;
        }
    }

    public int getCustomerType() {
        return customerType;
    }

    public void setCustomerType(int customerType) {
        this.customerType = customerType;
    }

    public double getBill() {
        return bill;
    }

    public void customerInput() {
        try {
            System.out.println("Enter customer type 1-Single Family, 2-Duplex: ");
            this.customerType = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Enter customer name: ");
            this.name = bufferedReader.readLine();
            System.out.print("Enter gallons used: ");
            this.gallonsUsed = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void printCustomerInfo(){

        System.out.println("Customer type: " + customerType);
        System.out.println("Customer name: " + name);
        System.out.println("Gallons used: " + gallonsUsed);
        System.out.printf("Total Bill: $%.2f\n", bill);
    }
}
