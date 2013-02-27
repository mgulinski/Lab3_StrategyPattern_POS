
package lab3_strategypattern_pos;

/**
 *
 * @author Machi
 */
public class DriverClass {
    
    public static void main(String[] args) {
	
	CashRegister cr = new CashRegister();
	
	cr.startNewSale("100");
	cr.addNewItemToSale("A101", 10);
	
	cr.printReceipt();
	
	
    }
    
    
    
}
