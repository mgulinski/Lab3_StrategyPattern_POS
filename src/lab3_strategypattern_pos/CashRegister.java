package lab3_strategypattern_pos;

/**
 *
 * @author Machi
 */
public class CashRegister {

    private Receipt receipt;
    private ReceiptOutputStrategy printReceipt;
    

    public CashRegister(ReceiptOutputStrategy printReceipt) {
	
	this.printReceipt = printReceipt;
    }

    public void startNewSale(String custId) {
	receipt = new Receipt(custId);
    }

    public void addNewItemToSale(String prodId, int qty) {
	receipt.addLineItem(prodId, qty);
    }

    public void printReceipt() {

	printReceipt.outputReceipt(receipt.displaySaleInfo());
    }
}

