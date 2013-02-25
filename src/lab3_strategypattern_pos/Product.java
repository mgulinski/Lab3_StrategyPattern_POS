
package lab3_strategypattern_pos;

/**
 *
 * @author Machi
 */
public class Product {
    
    private String productID;
    private String productName;
    private double unitCost;
    
    private DiscountStrategy discount;
    

    public Product() {
	
    }

    public Product(String productID, String productName, DiscountStrategy discount) {
	this.productID = productID;
	this.productName = productName;
	this.discount = discount;
    }

   
    
    public Product(String productID, String productName, double unitCost, DiscountStrategy discount) {
	
	this.productID = productID;
	this.productName = productName;
	this.unitCost = unitCost;
	this.discount = discount;
	
    }

    
    // getters and setters for DiscountStrategy variable
    public DiscountStrategy getDiscount() {
	return discount;
    }

    public void setDiscount(DiscountStrategy discount) {
	this.discount = discount;
    }
    
    
    
    public String getProductID() {
	return productID;
    }

    public void setProductID(String productID) {
	this.productID = productID;
    }
    
    public String getProductName() {
	return productName;
    }

    public void setProductName(String productName) {
	this.productName = productName;
    }

     
    public double getUnitCost() {
	return unitCost;
    }

    public void setUnitCost(double unitCost) {
	this.unitCost = unitCost;
    }

    
    // testing product class
    public static void main(String[] args) {
	
	Product myproduct = new Product("100", "Toilet Paper", new VariableRateDiscount(0.25));
	
	//myproduct.discount.setDiscountRate(0.1);
	
	System.out.println("Todays discount for " + myproduct.productName + " is: " 
						  + myproduct.discount.getDiscountAmt(1, 3));
	
	
	Product myproduct2 = new Product("99", "Beer", new VariableQtyRateDiscount(0.1));
	
	
	
	System.out.println("Todays discount for " + myproduct2.productName + " is: " 
						  + myproduct2.discount.getDiscountAmt(1, 10));
	
	
	Product myproduct3 = new Product("89", "Wine", new VariableQtyRateDiscount(0.1));
	
	
	
	System.out.println("Todays discount for " + myproduct3.productName + " is: " 
						  + myproduct3.discount.getDiscountAmt(1, 30));
	
    }
}
