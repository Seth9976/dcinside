package javax.activation;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

class r implements e {
    private DataFlavor[] a;
    private Object b;
    private String c;
    private e d;

    public r(e e0, Object object0, String s) {
        this.a = null;
        this.b = object0;
        this.c = s;
        this.d = e0;
    }

    @Override  // javax.activation.e
    public DataFlavor[] a() {
        synchronized(this) {
            if(this.a == null) {
                e e0 = this.d;
                if(e0 == null) {
                    DataFlavor[] arr_dataFlavor = new DataFlavor[1];
                    this.a = arr_dataFlavor;
                    arr_dataFlavor[0] = new a(this.b.getClass(), this.c, this.c);
                }
                else {
                    this.a = e0.a();
                }
            }
            return this.a;
        }
    }

    @Override  // javax.activation.e
    public Object b(i i0) {
        return this.b;
    }

    @Override  // javax.activation.e
    public void c(Object object0, String s, OutputStream outputStream0) throws IOException {
        e e0 = this.d;
        if(e0 != null) {
            e0.c(object0, s, outputStream0);
            return;
        }
        if(object0 instanceof byte[]) {
            outputStream0.write(((byte[])object0));
            return;
        }
        if(!(object0 instanceof String)) {
            throw new u("no object DCH for MIME type " + this.c);
        }
        OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter(outputStream0);
        outputStreamWriter0.write(((String)object0));
        outputStreamWriter0.flush();
    }

    @Override  // javax.activation.e
    public Object d(DataFlavor dataFlavor0, i i0) throws UnsupportedFlavorException, IOException {
        e e0 = this.d;
        if(e0 != null) {
            return e0.d(dataFlavor0, i0);
        }
        if(!dataFlavor0.equals(this.a()[0])) {
            throw new UnsupportedFlavorException(dataFlavor0);
        }
        return this.b;
    }

    public e e() {
        return this.d;
    }
}

