package FileInformationBlock;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Uday Kandpal
 */
public class FIBReader {

    private BufferedReader br;

    public FIBReader(String path) throws FileNotFoundException, IOException {
        br = new BufferedReader(new FileReader(new File(path)));
        int j = 0;
        char c;
        br.skip(1472);
        while((c = (char) br.read()) != -1) {
            if(Data.Manager.isASCII(c))
            System.out.print(c);
        }
    }

    public void readNext() {

    }
}
