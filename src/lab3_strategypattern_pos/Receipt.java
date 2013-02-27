package lab3_strategypattern_pos;

/**
 * @author Machi
 * 
 * Receipt class is responsible for:
 * looking up customer info
 * collecting products into array of lineItems
 * displaying sale info
 * 
 */
public class Receipt {
    
    private Customer customer;
    private LineItem[] lineItems = new LineItem[0];
    private FakeDatabase db;
    
    
    // constructor
    public Receipt(String custID) {
	
	db = new FakeDatabase();
	customer = db.findCustomer(custID);
    }
    
    public void addLineItem(String prodId, int qty) {
	
        LineItem item = new LineItem(prodId, qty);
        addToArray(item);
    
    }
    
    private void addToArray(LineItem item) {
	
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
	
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
    
    
    public String displaySaleInfo() {
	
	
	StringBuilder sale = new StringBuilder("\nThank You For Shopping With Us\n");
	
	sale.append(customer.getCustName());
	
	for(int i = 0; i < lineItems.length; i++) {
	    
	    sale.append(lineItems[i].getProduct().getProductName());
	}
	
	
	String str = sale + "\nHave a nice day!";
	
	return str;
    
    }

}
