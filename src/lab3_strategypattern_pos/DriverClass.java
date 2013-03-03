
package lab3_strategypattern_pos;

/**
 *
 * @author Machi
 */
public class DriverClass {
    
    public static void main(String[] args) {
	
	ReceiptOutputStrategy out = new ConsoleOutputStrategy();
	ReceiptOutputStrategy out2 = new GuiOutputStrategy();
	ReceiptOutputStrategy out3 = new FileOutputStrategy();
	
	CashRegister cr = new CashRegister(out3);
	
	cr.startNewSale("AD1212");
	cr.addNewItemToSale("MDS02",10);
	cr.addNewItemToSale("SMT00", 5);
	cr.addNewItemToSale("WU880", 10);
	
	
	cr.printReceipt();
	
	
    }
    
    
    
}
