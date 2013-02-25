package lab3_strategypattern_pos;

/**
 *
 * @author Machi
 */
public class VariableQtyRateDiscount implements DiscountStrategy {

    private double discountRate;
      

    public VariableQtyRateDiscount() {
    }

    
    public VariableQtyRateDiscount(double discountRate) {
	this.discountRate = discountRate;
    }
    
    // it makes more sense to me to calculate discount based of the same rate
    // that gets mulitplied by different factor depending on qty
    @Override
    public double getDiscountAmt(double unitCost, int qty) {

	if (qty >= 20) {

	    discountRate *= 4;

	} else if (qty >= 10) {

	    discountRate *= 2;
	    
	} else if (qty >= 5) {

	    discountRate *= 1;	
	}
	
	else {

	    setDiscountRate(0);
	}
	
	return discountRate * unitCost * qty;
	
    }
    
   
      
    @Override
    public double getDiscountRate() {
	return discountRate;
    }

   
    @Override
    public void setDiscountRate(double discountRate) {
	this.discountRate = discountRate;
    }

    // testing VariableQtyRateDiscount class    
    public static void main(String[] args) {
	
	DiscountStrategy mydiscount = new VariableQtyRateDiscount(0.2);
	
	//mydiscount.setDiscountRate(0.1);
	
	System.out.println("Discount 1 is now: " + mydiscount.getDiscountAmt(1, 5));
	
	
	DiscountStrategy mydiscount1 = new VariableQtyRateDiscount();
	
	mydiscount1.setDiscountRate(0.1);
	
	System.out.println("Discount 2 is now: " + mydiscount1.getDiscountAmt(1, 30));
   
	
    }

    
}

