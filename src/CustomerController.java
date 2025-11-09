import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerController {
    private CustomerGUI view;

    public CustomerController(CustomerGUI view){
        this.view = view;
        view.addActionListenerGenerateBill(new ActionListenerGenerateBill());
        view.addActionListenerDuplex(new ActionListenerDuplex());
        view.addActionListenerSingleFamily(new ActionListenerSingleFamily());
    }

    public class ActionListenerDuplex implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ;
        }
    }

    public class ActionListenerSingleFamily implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            view.switchPanel(view.getSingleFamilyPanel());

        }
    }

    public class ActionListenerGenerateBill implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String name = view.getNameField().getText();
            int gallons_used = Integer.parseInt(view.getGallonsField().getText());

            Customer c = view.getCurrentPanel().createCustomer(name, gallons_used);
            c.generateBill();

            view.setOutputArea("Added \n" + c.printCustomerInfo());

        }
    }




}
