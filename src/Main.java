import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        CustomerGUI gui = new CustomerGUI();
        gui.initializeUI();

        CustomerController controller = new CustomerController(gui);


    }
}