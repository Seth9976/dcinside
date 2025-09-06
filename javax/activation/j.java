package javax.activation;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.OutputStream;

class j implements e {
    private i a;
    private DataFlavor[] b;
    private e c;

    public j(e e0, i i0) {
        this.b = null;
        this.a = i0;
        this.c = e0;
    }

    @Override  // javax.activation.e
    public DataFlavor[] a() {
        if(this.b == null) {
            e e0 = this.c;
            if(e0 != null) {
                this.b = e0.a();
                return this.b;
            }
            DataFlavor[] arr_dataFlavor = new DataFlavor[1];
            this.b = arr_dataFlavor;
            arr_dataFlavor[0] = new a(this.a.x(), this.a.x());
        }
        return this.b;
    }

    @Override  // javax.activation.e
    public Object b(i i0) throws IOException {
        e e0 = this.c;
        return e0 != null ? e0.b(i0) : i0.b();
    }

    @Override  // javax.activation.e
    public void c(Object object0, String s, OutputStream outputStream0) throws IOException {
        e e0 = this.c;
        if(e0 == null) {
            throw new u("no DCH for content type " + this.a.x());
        }
        e0.c(object0, s, outputStream0);
    }

    @Override  // javax.activation.e
    public Object d(DataFlavor dataFlavor0, i i0) throws UnsupportedFlavorException, IOException {
        e e0 = this.c;
        if(e0 != null) {
            return e0.d(dataFlavor0, i0);
        }
        if(!dataFlavor0.equals(this.a()[0])) {
            throw new UnsupportedFlavorException(dataFlavor0);
        }
        return i0.b();
    }
}

