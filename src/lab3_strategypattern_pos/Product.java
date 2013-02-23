
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

    public static void main(String[] args) {
	
	Product myproduct = new Product("100", "Toilet Paper", 10, new VariableQtyDiscount());
	
	System.out.println("Todays discount is: " + myproduct.getDiscount());
	
	
	
    }
}
