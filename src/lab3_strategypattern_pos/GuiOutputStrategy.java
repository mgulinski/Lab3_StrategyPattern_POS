package lab3_strategypattern_pos;

import javax.swing.JOptionPane;

/**
 * @author Machi
 * low level derived class that implements outputMessage method
 */
public class GuiOutputStrategy implements ReceiptOutputStrategy {
    
    @Override
    public void outputReceipt(String receipt) {
    
	JOptionPane.showMessageDialog(null, (receipt));
	
    }
    
}
