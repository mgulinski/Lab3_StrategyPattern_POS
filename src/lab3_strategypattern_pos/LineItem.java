package lab3_strategypattern_pos;

/**
 * @author Machi
 */
public class LineItem {

    private Product product;
    private int qty;
    
    
     public LineItem(Product product) {

	this.product = product;
     }

    public LineItem(Product product, int qty) {

	this.product = product;
	this.qty = qty;
    }

    public double getItemExtendedPrice() {
	return product.getUnitCost() * qty;

    }

    
    // getters and setters
    public Product getProduct() {
	return product;
    }

    public void setProduct(Product product) {
	this.product = product;
    }

    public int getQty() {
	return qty;
    }

    public void setQty(int qty) {
	this.qty = qty;
    }
    
    

    public static void main(String[] args) {
	
	
	LineItem item1 = new LineItem(new Product("001PB", "Pen", 2, new VariableQtyRateDiscount(0.1)));
	item1.setQty(11);
	
	double itemDiscountAmt = item1.product.getDiscount().getDiscountAmt(item1.product.getUnitCost(), item1.qty);
	System.out.println("Item name: " + item1.product.getProductName() 
			+ " Price: " + item1.product.getUnitCost()
			+ " Qty: " + item1.qty
			+ " Extended Price: " + item1.getItemExtendedPrice()
			+ " Discount Amount: " + itemDiscountAmt
			+ "\nDiscounted Price: " + (item1.getItemExtendedPrice() - itemDiscountAmt));
	
    }
}
