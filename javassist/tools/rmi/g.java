package javassist.tools.rmi;

import java.io.Serializable;

public class g implements Serializable {
    public int a;
    public String b;
    private static final long c = 1L;

    public g(int v) {
        this.a = v;
        this.b = null;
    }

    public g(int v, String s) {
        this.a = v;
        this.b = s;
    }
}

