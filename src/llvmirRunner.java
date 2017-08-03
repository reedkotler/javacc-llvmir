import sun.java2d.pipe.SpanShapeRenderer;

import java.io.*;

public class llvmirRunner {
    public static void main(String[] args) {
        StringReader sr = new StringReader(args[0]);
        //SimpleCharStream scs = new SimpleCharStream(sr);
        if (args.length != 0) {
            try {
              FileInputStream x = new FileInputStream(args[0]);
              llvmirTokenManager mgr = new llvmirTokenManager(new SimpleCharStream(x));
              for (Token t  = mgr.getNextToken(); t.kind != llvmirConstants.EOF;
                 t = mgr.getNextToken()) {
                 System.out.println("Found token: " + t.image + " " +
                 llvmirConstants.tokenImage[t.kind]);
              }
            }
            catch(Exception e) {}
        }
    }
}
