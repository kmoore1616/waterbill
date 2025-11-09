import javax.swing.*;

public class BaseCustomerPanel extends JPanel implements CustomerPanel{
    @Override
    public Customer createCustomer(String name, int gallons_used) {
        // Controller is going to decide what customer to create!
        return null;
    }
}
