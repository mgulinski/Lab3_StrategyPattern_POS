
package lab3_strategypattern_pos;

/**
 * @author Machi
 */
public class Customer {
    
    private String custName;
    private String custId;

    public Customer() {
    }
    
    public Customer(String custId, String custName) {
	
	this.custName = custName;
	this.custId = custId;
    }

    
    // getters and setters
    public String getCustName() {
	return custName;
    }

    public void setCustName(String custName) {
	this.custName = custName;
    }

    public String getCustId() {
	return custId;
    }

    public void setCustId(String custId) {
	this.custId = custId;
    }
    
}
