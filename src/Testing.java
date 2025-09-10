import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testing {
    @Test
    public void testSingleFamilyTier1(){
       Customer customer = new Customer();
       customer.customerType = 1;
       customer.gallonsUsed = 6000;
       customer.calculateBill();
       assertEquals(25.45, customer.bill, 0.01);
    }
    
    @Test
    public void testSingleFamilyTier2(){
        Customer customer = new Customer();
        customer.customerType = 1;
        customer.gallonsUsed = 8000;
        int somevalue = 0;
        customer.calculateBill();
        assertEquals(somevalue, customer.bill, 0.01);
        
    }
}
