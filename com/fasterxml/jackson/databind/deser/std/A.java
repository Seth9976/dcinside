package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.deser.B;
import com.fasterxml.jackson.databind.deser.v;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.jsontype.f;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

public class a extends i {
    private static final long o = 1L;

    protected a(a a0) {
        super(a0);
    }

    public a(m m0, n n0, f f0, B b0) {
        super(m0, n0, f0, b0);
    }

    protected a(m m0, n n0, f f0, B b0, n n1, v v0, Boolean boolean0) {
        super(m0, n0, f0, b0, n1, v0, boolean0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.i
    protected i D1(n n0, n n1, f f0, v v0, Boolean boolean0) {
        return this.E1(n0, n1, f0, v0, boolean0);
    }

    protected a E1(n n0, n n1, f f0, v v0, Boolean boolean0) {
        return new a(this.f, n1, f0, this.l, n0, v0, boolean0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.i
    public Object i(com.fasterxml.jackson.core.n n0, h h0, f f0) throws IOException {
        return f0.d(n0, h0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.i
    protected Collection v1(com.fasterxml.jackson.core.n n0, h h0, Collection collection0) throws IOException {
        if(collection0 == null) {
            collection0 = new ArrayList();
        }
        Collection collection1 = super.v1(n0, h0, collection0);
        return collection1.isEmpty() ? new ArrayBlockingQueue(1, false) : new ArrayBlockingQueue(collection1.size(), false, collection1);
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.i
    protected Collection z1(h h0) throws IOException {
        return null;
    }
}

