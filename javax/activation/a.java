package javax.activation;

import java.awt.datatransfer.DataFlavor;
import java.io.InputStream;

public class a extends DataFlavor {
    private String a;
    private n b;
    private String c;
    private Class d;

    public a(Class class0, String s) {
        super(class0, s);
        this.b = null;
        this.c = null;
        this.d = null;
        this.a = super.getMimeType();
        this.d = class0;
        this.c = s;
    }

    public a(Class class0, String s, String s1) {
        super(s, s1);
        this.b = null;
        this.a = s;
        this.c = s1;
        this.d = class0;
    }

    public a(String s, String s1) {
        super(s, s1);
        this.b = null;
        this.a = s;
        this.d = InputStream.class;
        this.c = s1;
    }

    public boolean a(DataFlavor dataFlavor0) {
        return this.isMimeTypeEqual(dataFlavor0) && dataFlavor0.getRepresentationClass() == this.d;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.a;
    }

    public Class d() {
        return this.d;
    }

    public boolean e(String s) {
        try {
            if(this.b == null) {
                this.b = new n(this.a);
            }
            n n0 = new n(s);
            return this.b.i(n0);
        }
        catch(p unused_ex) {
            return this.a.equalsIgnoreCase(s);
        }
    }

    protected String f(String s) {
        return s;
    }

    protected String g(String s, String s1) {
        return s1;
    }

    public void h(String s) {
        this.c = s;
    }
}

