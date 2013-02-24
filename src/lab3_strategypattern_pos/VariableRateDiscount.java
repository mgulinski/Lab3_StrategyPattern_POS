package lab3_strategypattern_pos;

/**
 *
 * @author Machi
 */
public class VariableRateDiscount implements DiscountStrategy {

    private double discountRate = 0;
    
    public VariableRateDiscount() {
    }

    public VariableRateDiscount(double discountRate) {
	this.discountRate = discountRate;
	
    }
    

    @Override
    public double getDiscountAmt(double unitCost, int qty) {
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
	
	VariableRateDiscount mydiscount = new VariableRateDiscount();
	mydiscount.setDiscountRate(0.1);
	
	System.out.println("My discount is " + mydiscount.getDiscountAmt(10, 10));
    }
}