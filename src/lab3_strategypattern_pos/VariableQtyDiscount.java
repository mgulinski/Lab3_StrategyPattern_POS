package lab3_strategypattern_pos;

/**
 *
 * @author Machi
 */
public class VariableQtyDiscount implements DiscountStrategy {

    private double discountRate;
      

    public VariableQtyDiscount() {
    }

    
    public VariableQtyDiscount(double discountRate) {
	this.discountRate = discountRate;
    }
    
    
    @Override
    public double getDiscountAmt(double unitCost, int qty) {

	if (qty >= 5) {

	    discountRate *= 1;

	} else if (qty >= 10) {

	    discountRate *= 2;
	} else {

	    discountRate = 0;
	}

	return unitCost * qty * discountRate;
    }
    
   
      
    @Override
    public double getDiscountRate() {
	return discountRate;
    }

   
    @Override
    public void setDiscountRate(double discountRate) {
	this.discountRate = discountRate;
    }

        
    public static void main(String[] args) {
	
	DiscountStrategy mydiscount = new VariableQtyDiscount(0.2);
	
	//mydiscount.setDiscountRate(0.1);
	
	System.out.println("Discount 1 is now: " + mydiscount.getDiscountAmt(1, 10));
	
	
	DiscountStrategy mydiscount1 = new VariableQtyDiscount(0.1);
	
	//mydiscount.setDiscountRate(0.1);
	
	System.out.println("Discount 2 is now: " + mydiscount1.getDiscountAmt(1, 10));
   
	
    }

    
}

