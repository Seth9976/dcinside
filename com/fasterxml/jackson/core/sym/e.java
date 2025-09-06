package com.fasterxml.jackson.core.sym;

public final class e extends f {
    private final int c;
    private final int d;
    private final int e;

    e(String s, int v, int v1, int v2, int v3) {
        super(s, v);
        this.c = v1;
        this.d = v2;
        this.e = v3;
    }

    @Override  // com.fasterxml.jackson.core.sym.f
    public boolean a(int v) {
        return false;
    }

    @Override  // com.fasterxml.jackson.core.sym.f
    public boolean b(int v, int v1) {
        return false;
    }

    @Override  // com.fasterxml.jackson.core.sym.f
    public boolean c(int v, int v1, int v2) {
        return this.c == v && this.d == v1 && this.e == v2;
    }

    @Override  // com.fasterxml.jackson.core.sym.f
    public boolean d(int[] arr_v, int v) {
        return v == 3 && arr_v[0] == this.c && arr_v[1] == this.d && arr_v[2] == this.e;
    }
}

