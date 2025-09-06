package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.c;
import com.fasterxml.jackson.databind.deser.B;
import com.fasterxml.jackson.databind.deser.C.a;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.type.b;
import java.io.Serializable;
import java.util.HashMap;

public class f extends a implements Serializable {
    protected HashMap a;
    private static final long b = 0x8414725AA51C90C6L;

    public f() {
        this.a = new HashMap();
    }

    @Override  // com.fasterxml.jackson.databind.deser.C$a
    public B a(g g0, c c0, B b0) {
        B b1 = (B)this.a.get(new b(c0.y()));
        return b1 == null ? b0 : b1;
    }

    public f b(Class class0, B b0) {
        this.a.put(new b(class0), b0);
        return this;
    }
}

