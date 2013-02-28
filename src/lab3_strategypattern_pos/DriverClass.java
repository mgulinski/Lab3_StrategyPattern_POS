
package lab3_strategypattern_pos;

/**
 *
 * @author Machi
 */
public class DriverClass {
    
    public static void main(String[] args) {
	
	CashRegister cr = new CashRegister();
	
	cr.startNewSale("MG0323");
	cr.addNewItemToSale("BH01",10);
	cr.addNewItemToSale("MDS02", 5);
	cr.addNewItemToSale("MSH05", 5);
	
	cr.printReceipt();
	
	
    }
    
    
    
}
