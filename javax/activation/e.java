package javax.activation;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.OutputStream;

public interface e {
    DataFlavor[] a();

    Object b(i arg1) throws IOException;

    void c(Object arg1, String arg2, OutputStream arg3) throws IOException;

    Object d(DataFlavor arg1, i arg2) throws UnsupportedFlavorException, IOException;
}

