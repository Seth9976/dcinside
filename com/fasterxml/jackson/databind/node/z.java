package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.G;
import com.fasterxml.jackson.core.k;
import com.fasterxml.jackson.core.o;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.type.c;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.p;
import java.io.IOException;
import java.util.List;

public abstract class z extends b {
    private static final long b = 1L;

    @Override  // com.fasterxml.jackson.databind.p
    public p B0(String s) {
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public G D(int v) {
        return this.s1(v);
    }

    @Override  // com.fasterxml.jackson.databind.p
    public final List D0(String s, List list0) {
        return list0;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public final p F0(String s) {
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public void H(k k0, I i0, j j0) throws IOException {
        c c0 = j0.o(k0, j0.f(this, this.h()));
        this.P(k0, i0);
        j0.v(k0, c0);
    }

    @Override  // com.fasterxml.jackson.databind.p
    public final List H0(String s, List list0) {
        return list0;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public final List J0(String s, List list0) {
        return list0;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public final p M0(int v) [...] // Inlined contents

    @Override  // com.fasterxml.jackson.databind.p
    public final p N0(String s) [...] // Inlined contents

    @Override  // com.fasterxml.jackson.databind.p
    public final boolean P0(int v) {
        return false;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public final boolean Q0(String s) {
        return false;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public final boolean R0(int v) {
        return false;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public final boolean S0(String s) {
        return false;
    }

    @Override  // com.fasterxml.jackson.databind.p
    protected p V(o o0) {
        return null;
    }

    public final u b2(String s) [...] // Inlined contents

    @Override  // com.fasterxml.jackson.databind.p
    public G get(int v) {
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public G get(String s) {
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.node.b
    public abstract r h();

    @Override  // com.fasterxml.jackson.databind.p
    public boolean isEmpty() {
        return true;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public final p s1(int v) {
        return com.fasterxml.jackson.databind.node.p.c2();
    }

    @Override  // com.fasterxml.jackson.databind.p
    public p v0() {
        return this;
    }

    @Override  // com.fasterxml.jackson.databind.p
    public final p v1(String s) {
        return com.fasterxml.jackson.databind.node.p.c2();
    }

    @Override  // com.fasterxml.jackson.databind.p
    public G x(String s) {
        return this.v1(s);
    }
}

