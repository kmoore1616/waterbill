import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public abstract class Customer {
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

    private final int TIER2_CUTOFF = 13000;
    private final double GALLONS = 1000.0;
    private double bill;

    private static ArrayList<Customer> customers = new ArrayList<>();

    private final double LOW_INCOME_DISCOUNT = 0.10;

    String name;
    private int gallonsUsed;
    private int customerType;  // 1- Single family

    public static ArrayList<Customer> getCustomers() {
        return customers;
    }

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

    protected abstract double calculateBill();

    public void generateBill(){
        double calculatedBill = calculateBill();
        double finalBill = applyDiscount(calculatedBill);
        if(finalBill< 0){
            System.out.println("Bill must be positive");
        }else {
            this.bill = finalBill;
            registerCustomer();
        }
    }

    protected double applyDiscount(double calculatedBill){
        return calculatedBill;
    }

    protected void registerCustomer(){
        customers.add(this);
    }

    public void printCustomerInfo(){

        System.out.println("Customer type: " + customerType);
        System.out.println("Customer name: " + name);
        System.out.println("Gallons used: " + gallonsUsed);
        System.out.printf("Total Bill: $%.2f\n", bill);
    }

}
