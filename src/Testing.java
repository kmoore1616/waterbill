import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testing {

    //
    // Single Family Tier 1 Testing
    //
    @Test
    public void testSingleFamilyTier1(){
        Customer customer = new Customer();
        customer.setCustomerType(1);
        customer.setGallonsUsed(6000);
        customer.calculateBill();

        assertEquals(25.45, customer.getBill(), 0.01);
    }

    @Test
    public void testSingleFamily_Below7000(){
        Customer customer = new Customer();
        customer.setCustomerType(1);
        customer.setGallonsUsed(6999);
        customer.calculateBill();

        assertEquals(27.497, customer.getBill(), 0.01);
    }

    @Test
    public void testSingleFamily_At7000(){
        Customer customer = new Customer();
        customer.setCustomerType(1);
        customer.setGallonsUsed(7000);
        customer.calculateBill();

        assertEquals(27.490, customer.getBill(), 0.01);
    }

    //
    // Single Family Tier 2 Testing
    //
    @Test
    public void testSingleFamilyTier2(){
        Customer customer = new Customer();
        customer.setCustomerType(1);
        customer.setGallonsUsed(9000);
        customer.calculateBill();

        assertEquals(32.190, customer.getBill(), 0.01);
    }

    @Test
    public void testSingleFamily_Above7000(){
        Customer customer = new Customer();
        customer.setCustomerType(1);
        customer.setGallonsUsed(7001);
        customer.calculateBill();

        assertEquals(27.492, customer.getBill(), 0.01);
    }

    @Test
    public void testSingleFamily_Below13000(){
        Customer customer = new Customer();
        customer.setCustomerType(1);
        customer.setGallonsUsed(12999);
        customer.calculateBill();

        assertEquals(41.58, customer.getBill(), 0.01);
    }

    @Test
    public void testSingleFamily_At13000(){
        Customer customer = new Customer();
        customer.setCustomerType(1);
        customer.setGallonsUsed(13000);
        customer.calculateBill();

        assertEquals(41.59, customer.getBill(), 0.01);
    }

    //
    // Single Family Tier 3 Testing
    //
    @Test
    public void testSingleFamilyTier3(){
        Customer customer = new Customer();
        customer.setCustomerType(1);
        customer.setGallonsUsed(16000);
        customer.calculateBill();

        assertEquals(49.69, customer.getBill(), 0.01);
    }

    @Test
    public void testSingleFamily_Above13000(){
        Customer customer = new Customer();
        customer.setCustomerType(1);
        customer.setGallonsUsed(13001);
        customer.calculateBill();

        assertEquals(41.59, customer.getBill(), 0.01);
    }

    //
    // Duplex Tier 1 Testing
    //
    @Test
    public void testDuplexTier1(){
        Customer customer = new Customer();
        customer.setCustomerType(1);
        customer.setGallonsUsed(6000);
        customer.calculateBill();

        assertEquals(25.45, customer.getBill(), 0.01);
    }

    @Test
    public void testDuplex_Below9000(){
        Customer customer = new Customer();
        customer.setCustomerType(1);
        customer.setGallonsUsed(8999);
        customer.calculateBill();

        assertEquals(32.18, customer.getBill(), 0.01);
    }

    @Test
    public void testDuplex_At9000(){
        Customer customer = new Customer();
        customer.setCustomerType(1);
        customer.setGallonsUsed(9000);
        customer.calculateBill();

        assertEquals(32.19, customer.getBill(), 0.01);
    }

    //
    // Duplex Tier 2 Testing
    //
    @Test
    public void testDuplexTier2(){
        Customer customer = new Customer();
        customer.setCustomerType(1);
        customer.setGallonsUsed(10000);
        customer.calculateBill();

        assertEquals(34.54, customer.getBill(), 0.01);
    }

    @Test
    public void testDuplex_Above9000(){
        Customer customer = new Customer();
        customer.setCustomerType(1);
        customer.setGallonsUsed(9001);
        customer.calculateBill();

        assertEquals(32.19, customer.getBill(), 0.01);
    }

    @Test
    public void testDuplex_Below13000(){
        Customer customer = new Customer();
        customer.setCustomerType(1);
        customer.setGallonsUsed(12999);
        customer.calculateBill();

        assertEquals(41.58, customer.getBill(), 0.01);
    }

    @Test
    public void testDuplex_At13000(){
        Customer customer = new Customer();
        customer.setCustomerType(1);
        customer.setGallonsUsed(13000);
        customer.calculateBill();

        assertEquals(41.59, customer.getBill(), 0.01);
    }

    //
    // Duplex Tier 3 Testing
    //
    @Test
    public void testDuplexTier3(){
        Customer customer = new Customer();
        customer.setCustomerType(1);
        customer.setGallonsUsed(16000);
        customer.calculateBill();

        assertEquals(49.69, customer.getBill(), 0.01);
    }

    @Test
    public void testDuplex_Above13000(){
        Customer customer = new Customer();
        customer.setCustomerType(1);
        customer.setGallonsUsed(13001);
        customer.calculateBill();

        assertEquals(41.59, customer.getBill(), 0.01);
    }
}
