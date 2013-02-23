package lab3_strategypattern_pos;

/**
 *
 * @author Machi
 */
public class VariableQtyDiscount implements DiscountStrategy {

    private double discountRate;

    public VariableQtyDiscount() {
    }

    @Override
    public double getDiscountAmt(double unitCost, int qty) {

	if (qty >= 5) {

	    discountRate = 0.1;

	} else if (qty >= 10) {

	    discountRate = 0.2;
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
}
