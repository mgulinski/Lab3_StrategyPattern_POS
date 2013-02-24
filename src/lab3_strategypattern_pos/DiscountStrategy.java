package lab3_strategypattern_pos;

/**
 *
 * @author Machi
 */
public interface DiscountStrategy {
    
    public abstract double getDiscountAmt(double unitCost, int qty);

    public abstract void setDiscountRate(double discountRate);

    public abstract double getDiscountRate();

   
}
