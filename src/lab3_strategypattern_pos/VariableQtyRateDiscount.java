package lab3_strategypattern_pos;

/**
 *
 * @author Machi
 */
public class VariableQtyRateDiscount implements DiscountStrategy {
    
    
    private double discountRate;
        
    public VariableQtyRateDiscount() {
	
    }
        
   /**
    * getDiscountAmt method takes accepts two parameters
    * it assigns appropriate discount rate based on purchase quantity
    * lastly it calculates discount amount for purchased line item
    * @param unitCost
    * @param qty
    * @return 
    */
    @Override
    public double getDiscountAmt(double unitCost, int qty) {

	if (qty >= 20) {

	    discountRate = 0.2;

	} else if (qty >= 10) {

	    discountRate = 0.15;
	    
	} else if (qty >= 5) {

	    discountRate = 0.1;	
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

}

