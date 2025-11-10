import javax.print.attribute.standard.NumberOfDocuments;

public interface CustomerPanel {
    public abstract Customer createCustomer(String name, int gallons_used); // Customer must have name and gallons_used
}