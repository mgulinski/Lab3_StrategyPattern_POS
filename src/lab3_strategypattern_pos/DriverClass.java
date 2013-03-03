
package lab3_strategypattern_pos;

/**
 *
 * @author Machi
 */
public class DriverClass {
    
    public static void main(String[] args) {
	
	CashRegister cr = new CashRegister();
	
	cr.startNewSale("AD1212");
	cr.addNewItemToSale("MDS02",10);
	cr.addNewItemToSale("SMT00", 5);
	cr.addNewItemToSale("WU880", 10);
	
	
	cr.printReceipt();
	
	
    }
    
    
    
}
