package javassist.compiler;

import javassist.E;
import javassist.b;

public class c extends Exception {
    private h a;
    private String b;
    private static final long c = 1L;

    public c(String s) {
        this.b = s;
        this.a = null;
    }

    public c(String s, h h0) {
        this.b = s;
        this.a = h0;
    }

    public c(E e0) {
        this("cannot find " + e0.getMessage());
    }

    public c(b b0) {
        this(b0.a());
    }

    public h a() {
        return this.a;
    }

    @Override
    public String getMessage() {
        return this.b;
    }

    @Override
    public String toString() {
        return "compile error: " + this.b;
    }
}

