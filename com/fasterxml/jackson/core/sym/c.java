package com.fasterxml.jackson.core.sym;

public final class c extends f {
    private final int c;
    private static final c d;

    static {
        c.d = new c("", 0, 0);
    }

    c(String s, int v, int v1) {
        super(s, v);
        this.c = v1;
    }

    @Override  // com.fasterxml.jackson.core.sym.f
    public boolean a(int v) {
        return v == this.c;
    }

    @Override  // com.fasterxml.jackson.core.sym.f
    public boolean b(int v, int v1) {
        return v == this.c && v1 == 0;
    }

    @Override  // com.fasterxml.jackson.core.sym.f
    public boolean c(int v, int v1, int v2) {
        return false;
    }

    @Override  // com.fasterxml.jackson.core.sym.f
    public boolean d(int[] arr_v, int v) {
        return v == 1 && arr_v[0] == this.c;
    }

    public static c f() {
        return c.d;
    }
}

