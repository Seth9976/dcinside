package javassist.compiler;

import java.util.HashMap;
import javassist.compiler.ast.i;

public final class n extends HashMap {
    private n a;
    private static final long b = 1L;

    public n() {
        this(null);
    }

    public n(n n0) {
        this.a = n0;
    }

    public void a(String s, i i0) {
        this.put(s, i0);
    }

    public n b() {
        return this.a;
    }

    public i c(String s) {
        i i0 = (i)this.get(s);
        if(i0 == null) {
            return this.a == null ? null : this.a.c(s);
        }
        return i0;
    }
}

