import javax.swing.*;
import java.awt.*;

public class SingleFamilyPanel extends JPanel implements CustomerPanel {

    private JCheckBox lowIncomeBox;

    public SingleFamilyPanel(){
        lowIncomeBox = new JCheckBox("Is Low Income");
        initUi();

    }

    private void initUi(){
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(lowIncomeBox);
    }



    @Override
    public Customer createCustomer(String name, int gallons_used) {
        return new SingleFamily(name, gallons_used, lowIncomeBox.isSelected());
    }
}