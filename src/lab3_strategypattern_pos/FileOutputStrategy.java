package lab3_strategypattern_pos;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Machi
 */
public class FileOutputStrategy implements ReceiptOutputStrategy {

    @Override
    public void outputReceipt(String receipt) {

	PrintWriter receiptFile = null;
	try {
	    receiptFile = new PrintWriter("C:/Temp/Receipt.txt");
	} catch (FileNotFoundException ex) {
	    Logger.getLogger(FileOutputStrategy.class.getName()).log(Level.SEVERE, null, ex);
	}
	receiptFile.println(receipt);
	receiptFile.close();

    }
}

