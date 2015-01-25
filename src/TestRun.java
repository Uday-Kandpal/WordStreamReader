
import FileInformationBlock.FIBReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Uday Kandpal
 */
public class TestRun {

    static FIBReader fib;

    public static void main(String args[]) {
        try {
            fib = new FIBReader("C:\\Users\\Uday Kandpal\\Desktop\\recommendation.doc");
            fib.readNext();
        } catch (IOException ex) {
            Logger.getLogger(TestRun.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
