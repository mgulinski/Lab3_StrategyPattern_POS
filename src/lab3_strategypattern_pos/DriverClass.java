
package lab3_strategypattern_pos;

/**
 *
 * @author Machi
 */
public class DriverClass {
    
    public static void main(String[] args) {
	
	CashRegister cr = new CashRegister();
	
	cr.startNewSale("MG0323");
	cr.addNewItemToSale("MSH05", 5);
	cr.addNewItemToSale("WS03", 4);
	
	cr.printReceipt();
	
	
    }
    
    
    
}
