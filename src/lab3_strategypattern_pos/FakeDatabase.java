package lab3_strategypattern_pos;

/**
 * @author Machi
 */
public class FakeDatabase {

    private Customer[] customers = {
	new Customer("MG0323", "Machi Gulinski"),
	new Customer("AD1212", "Alex Druzny"),
	new Customer("SG0503", "Sebastian Gulinski"),
	new Customer("EG0303", "Evan Gulinski")
    };
    // Notice we assign a default discount strategy component object to each product
    Product[] products = {
	new Product("BH01", "Baseball Hat\t", 19.95, new VariableRateDiscount(0.15)),
	new Product("MDS02","Men's Dress Shirt", 35.50, new VariableQtyRateDiscount()),
	new Product("WS03", "Women's Socks\t", 3.50, new VariableRateDiscount(0.20)),
	new Product("MSH05", "Men's Shorts\t", 12.50, new VariableQtyRateDiscount()),
	new Product("SMT00", "Spider-man T-Shirt", 15.99, new VariableRateDiscount(0.25)),
	new Product("WU880", "Women's Underware", 2.99, new VariableQtyRateDiscount())
    };

    // Just call this method to find a customer in the array by its id.
    // Returns null if not found.
    public final Customer findCustomer(final String custId) {
	// validation is needed
	Customer customer = null;
	
	for (Customer c : customers) {
	    if (custId.equals(c.getCustId())) {
		customer = c;
		break;
	    }
	}

	return customer;
    }

    // Just call this method to find a product in the array by its id.
    // Returns null if not found.
    public final Product findProduct(final String prodId) {
	// validation is needed
	Product product = null;

	for (Product p : products) {

	    if (prodId.equals(p.getProductId())) {
		product = p;
		break;
	    }
	}

	return product;
    }
}
