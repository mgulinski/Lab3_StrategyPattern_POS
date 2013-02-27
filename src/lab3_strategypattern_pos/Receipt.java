package lab3_strategypattern_pos;

import java.text.DecimalFormat;

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
    
    DecimalFormat fprice = new DecimalFormat("$#,##0.00");
    
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
	
	
	StringBuilder sale = new StringBuilder("\n~ THANK YOU FOR SHOPPING WITH US ~\n");
	
	sale.append("\nWelcome, ").append(customer.getCustName());
	sale.append("\n\nProduct Name\t").append("Price\t").append("Qty\t").append("Extended\t").append("Discount\t").append("You Pay");
	sale.append("\n-----------------------------------------------------------------------\n");
	
	for(int i = 0; i < lineItems.length; i++) {
	    
	    sale.append(lineItems[i].getProduct().getProductName());
	    sale.append("\t").append(fprice.format(lineItems[i].getProduct().getUnitCost()));
	    sale.append("\t").append(lineItems[i].getQty());
	    sale.append("\t").append(fprice.format(lineItems[i].getItemExtendedPrice()));
	    sale.append("\t\t").append(fprice.format(lineItems[i].getProduct().getDiscount().getDiscountAmt(lineItems[i].getProduct().getUnitCost(), lineItems[i].getQty())));
	    sale.append("\t\t").append(fprice.format(lineItems[i].getItemFinalPrice())).append("\n");
	}
	
	
	String str = sale + "\n\n~ HAVE A NICE DAY! ~\n";
	
	return str;
    
    }

}
