package com.fasterxml.jackson.core.sym;

public abstract class f {
    protected final String a;
    protected final int b;

    protected f(String s, int v) {
        this.a = s;
        this.b = v;
    }

    public abstract boolean a(int arg1);

    public abstract boolean b(int arg1, int arg2);

    public abstract boolean c(int arg1, int arg2, int arg3);

    public abstract boolean d(int[] arg1, int arg2);

    public String e() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        return object0 == this;
    }

    @Override
    public final int hashCode() {
        return this.b;
    }

    @Override
    public String toString() {
        return this.a;
    }
}

