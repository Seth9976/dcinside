package com.fasterxml.jackson.core.sym;

public final class d extends f {
    private final int c;
    private final int d;

    d(String s, int v, int v1, int v2) {
        super(s, v);
        this.c = v1;
        this.d = v2;
    }

    @Override  // com.fasterxml.jackson.core.sym.f
    public boolean a(int v) {
        return false;
    }

    @Override  // com.fasterxml.jackson.core.sym.f
    public boolean b(int v, int v1) {
        return v == this.c && v1 == this.d;
    }

    @Override  // com.fasterxml.jackson.core.sym.f
    public boolean c(int v, int v1, int v2) {
        return false;
    }

    @Override  // com.fasterxml.jackson.core.sym.f
    public boolean d(int[] arr_v, int v) {
        return v == 2 && arr_v[0] == this.c && arr_v[1] == this.d;
    }
}

