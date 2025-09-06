package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.c;
import com.google.gson.stream.d;
import com.google.gson.t;
import com.google.gson.w;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;

public final class NumberTypeAdapter extends TypeAdapter {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[c.values().length];
            a.a = arr_v;
            try {
                arr_v[c.i.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.g.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.f.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private final x a;
    private static final y b;

    static {
        NumberTypeAdapter.b = NumberTypeAdapter.k(w.b);
    }

    private NumberTypeAdapter(x x0) {
        this.a = x0;
    }

    @Override  // com.google.gson.TypeAdapter
    public Object e(com.google.gson.stream.a a0) throws IOException {
        return this.l(a0);
    }

    @Override  // com.google.gson.TypeAdapter
    public void i(d d0, Object object0) throws IOException {
        this.m(d0, ((Number)object0));
    }

    public static y j(x x0) {
        return x0 == w.b ? NumberTypeAdapter.b : NumberTypeAdapter.k(x0);
    }

    private static y k(x x0) {
        return new y() {
            final NumberTypeAdapter a;

            @Override  // com.google.gson.y
            public TypeAdapter a(Gson gson0, com.google.gson.reflect.a a0) {
                return a0.f() == Number.class ? NumberTypeAdapter.this : null;
            }
        };
    }

    public Number l(com.google.gson.stream.a a0) throws IOException {
        c c0 = a0.f0();
        switch(c0) {
            case 1: {
                a0.T();
                return null;
            }
            case 2: 
            case 3: {
                return this.a.a(a0);
            }
            default: {
                throw new t("Expecting number, got: " + c0 + "; at path " + a0.getPath());
            }
        }
    }

    public void m(d d0, Number number0) throws IOException {
        d0.x0(number0);
    }
}

