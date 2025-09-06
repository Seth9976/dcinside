package javassist;

import javassist.compiler.c;

public class b extends Exception {
    private Throwable a;
    private String b;
    private static final long c = 1L;

    public b(ClassFormatError classFormatError0, String s) {
        this("invalid class format: " + s, classFormatError0);
    }

    public b(ClassNotFoundException classNotFoundException0, String s) {
        this("cannot find " + s, classNotFoundException0);
    }

    public b(String s) {
        super(s);
        this.b = s;
        this.initCause(null);
    }

    public b(String s, Throwable throwable0) {
        this(s);
        this.initCause(throwable0);
    }

    public b(Throwable throwable0) {
        super("by " + throwable0.toString());
        this.b = null;
        this.initCause(throwable0);
    }

    public b(E e0) {
        this("cannot find " + e0.getMessage(), e0);
    }

    public b(c c0) {
        this("[source error] " + c0.getMessage(), c0);
    }

    public String a() {
        return this.b == null ? this.toString() : this.b;
    }

    @Override
    public Throwable getCause() {
        synchronized(this) {
        }
        return this.a == this ? null : this.a;
    }

    @Override
    public Throwable initCause(Throwable throwable0) {
        synchronized(this) {
            this.a = throwable0;
        }
        return this;
    }
}

