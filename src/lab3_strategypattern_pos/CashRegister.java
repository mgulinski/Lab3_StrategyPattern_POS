package lab3_strategypattern_pos;

/**
 *
 * @author Machi
 */
public class CashRegister {
    
    private Receipt receipt;
    
    
    public CashRegister() {    
    }
    
    
    public void startNewSale(String custId) {
	receipt = new Receipt(custId);
    }
    
    
    public void addNewItemToSale(String prodId, int qty) {
	receipt.addLineItem(prodId, qty);
    }
    
    public void printReceipt() {
	
	System.out.println(receipt.displaySaleInfo());
    
    }
    
}
