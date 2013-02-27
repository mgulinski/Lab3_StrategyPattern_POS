package lab3_strategypattern_pos;

/**
 * @author Machi
 * 
 * LineItem class is responsible for:
 * looking up a product info
 * knowing qty of a product
 * 
 * 
 */
public class LineItem {

    private Product product;
    private int qty;
    private FakeDatabase db;

    
    
    public LineItem(String productId, int qty) {
	
	db = new FakeDatabase();
	product = db.findProduct(productId);
	this.qty = qty;
    }
    
    

    public double getItemExtendedPrice() {
	return product.getUnitCost() * qty;

    }
    
    public double getItemFinalPrice() {
	return getItemExtendedPrice() - product.getDiscount().getDiscountAmt(product.getUnitCost(), qty);

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
    
    
// testing LineItem class
// public static void main(String[] args) {
	
//	
//	FakeDatabase db = new FakeDatabase();
//	
//	Product myproduct = new Product();
	
	
	
//	
//	LineItem item1 = new LineItem(new Product("001PB", "Pen", 2, new VariableQtyRateDiscount(0.1)));
//	item1.setQty(11);
//	
//	double itemDiscountAmt = item1.product.getDiscount().getDiscountAmt(item1.product.getUnitCost(), item1.qty);
//	System.out.println("Item name: " + item1.product.getProductName() 
//			+ " Price: " + item1.product.getUnitCost()
//			+ " Qty: " + item1.qty
//			+ " Extended Price: " + item1.getItemExtendedPrice()
//			+ " Discount Amount: " + itemDiscountAmt
//			+ "\nDiscounted Price: " + (item1.getItemExtendedPrice() - itemDiscountAmt));
	
//    }
}
