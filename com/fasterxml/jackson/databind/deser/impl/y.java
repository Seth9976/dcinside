package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.databind.f;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.i;
import com.fasterxml.jackson.databind.introspect.k;
import com.fasterxml.jackson.databind.o;
import java.io.IOException;
import java.util.BitSet;

public class y {
    protected final n a;
    protected final h b;
    protected final s c;
    protected final Object[] d;
    protected int e;
    protected int f;
    protected final BitSet g;
    protected x h;
    protected Object i;

    public y(n n0, h h0, int v, s s0) {
        this.a = n0;
        this.b = h0;
        this.e = v;
        this.c = s0;
        this.d = new Object[v];
        if(v < 0x20) {
            this.g = null;
            return;
        }
        this.g = new BitSet();
    }

    protected Object a(com.fasterxml.jackson.databind.deser.y y0) throws o {
        if(y0.z() != null) {
            return this.b.Y(y0.z(), y0, null);
        }
        if(y0.c()) {
            Object[] arr_object = {y0.getName(), y0.x()};
            this.b.Y0(y0, "Missing required creator property \'%s\' (index %d)", arr_object);
        }
        if(this.b.J0(i.n)) {
            Object[] arr_object1 = {y0.getName(), y0.x()};
            this.b.Y0(y0, "Missing creator property \'%s\' (index %d); `DeserializationFeature.FAIL_ON_MISSING_CREATOR_PROPERTIES` enabled", arr_object1);
        }
        try {
            Object object0 = y0.B().f(this.b);
            return object0 == null ? y0.E().f(this.b) : object0;
        }
        catch(f f0) {
            k k0 = y0.h();
            if(k0 != null) {
                f0.g(k0.m(), y0.getName());
            }
            throw f0;
        }
    }

    public boolean b(com.fasterxml.jackson.databind.deser.y y0, Object object0) {
        int v = y0.x();
        this.d[v] = object0;
        BitSet bitSet0 = this.g;
        if(bitSet0 == null) {
            int v1 = 1 << v | this.f;
            if(this.f != v1) {
                this.f = v1;
                int v2 = this.e - 1;
                this.e = v2;
                return v2 <= 0 && (this.c == null || this.i != null);
            }
        }
        else if(!bitSet0.get(v)) {
            this.g.set(v);
            --this.e;
        }
        return false;
    }

    public void c(com.fasterxml.jackson.databind.deser.x x0, String s, Object object0) {
        this.h = new a(this.h, object0, x0, s);
    }

    public void d(Object object0, Object object1) {
        this.h = new b(this.h, object1, object0);
    }

    public void e(com.fasterxml.jackson.databind.deser.y y0, Object object0) {
        this.h = new c(this.h, object0, y0);
    }

    protected x f() {
        return this.h;
    }

    public Object g(com.fasterxml.jackson.databind.deser.y y0) throws o {
        Object object0;
        if(this.j(y0)) {
            object0 = this.d[y0.x()];
        }
        else {
            int v = y0.x();
            Object object1 = this.a(y0);
            this.d[v] = object1;
            object0 = object1;
        }
        if(object0 == null && this.b.J0(i.o)) {
            Object[] arr_object = {y0.getName(), y0.x()};
            return this.b.Y0(y0, "Null value for creator property \'%s\' (index %d); `DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES` enabled", arr_object);
        }
        return object0;
    }

    public Object[] h(com.fasterxml.jackson.databind.deser.y[] arr_y) throws o {
        if(this.e > 0) {
            if(this.g == null) {
                int v = this.f;
                int v1 = 0;
                while(v1 < this.d.length) {
                    if((v & 1) == 0) {
                        this.d[v1] = this.a(arr_y[v1]);
                    }
                    ++v1;
                    v >>= 1;
                }
            }
            else {
                int v3;
                for(int v2 = 0; (v3 = this.g.nextClearBit(v2)) < this.d.length; v2 = v3 + 1) {
                    this.d[v3] = this.a(arr_y[v3]);
                }
            }
        }
        if(this.b.J0(i.o)) {
            for(int v4 = 0; v4 < arr_y.length; ++v4) {
                if(this.d[v4] == null) {
                    com.fasterxml.jackson.databind.deser.y y0 = arr_y[v4];
                    Object[] arr_object = {y0.getName(), arr_y[v4].x()};
                    this.b.Y0(y0, "Null value for creator property \'%s\' (index %d); `DeserializationFeature.FAIL_ON_NULL_CREATOR_PROPERTIES` enabled", arr_object);
                }
            }
        }
        return this.d;
    }

    public Object i(h h0, Object object0) throws IOException {
        s s0 = this.c;
        if(s0 != null) {
            Object object1 = this.i;
            if(object1 != null) {
                h0.b0(object1, s0.c, s0.d).b(object0);
                com.fasterxml.jackson.databind.deser.y y0 = this.c.f;
                return y0 == null ? object0 : y0.N(object0, this.i);
            }
            h0.g1(s0, object0);
        }
        return object0;
    }

    public final boolean j(com.fasterxml.jackson.databind.deser.y y0) {
        return this.g == null ? (this.f >> y0.x() & 1) == 1 : this.g.get(y0.x());
    }

    public boolean k() {
        return this.e <= 0;
    }

    public boolean l(String s) throws IOException {
        if(this.c != null && s.equals(this.c.b.d())) {
            this.i = this.c.f(this.a, this.b);
            return true;
        }
        return false;
    }
}

