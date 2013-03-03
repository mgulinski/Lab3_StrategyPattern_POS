package lab3_strategypattern_pos;

/**
 * @author Machi
 * 
 * low level derived class that implements outputMessage method
 */
public class ConsoleOutputStrategy implements ReceiptOutputStrategy {
    
    @Override
    public void outputReceipt(String receipt) {
    
	System.out.println(receipt);
    
    }
    
}
