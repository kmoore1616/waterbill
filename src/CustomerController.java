import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerController {
    private CustomerGUI view;

    public CustomerController(CustomerGUI view){
        this.view = view;
        view.addActionListenerGenerateBill(new ActionListenerGenerateBill());
    }

    public class ActionListenerGenerateBill implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String name = view.getNameField().getText();
            int gallons_used = Integer.parseInt(view.getGallonsField().getText());

            Customer c = new Duplex(name, gallons_used);
            c.generateBill();
            c.printCustomerInfo();

        }
    }




}
