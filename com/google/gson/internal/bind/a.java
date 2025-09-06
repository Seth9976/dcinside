package com.google.gson.internal.bind;

import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.p;
import com.google.gson.stream.c;
import com.google.gson.stream.e;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map.Entry;

public final class a extends com.google.gson.stream.a {
    class com.google.gson.internal.bind.a.a extends Reader {
        com.google.gson.internal.bind.a.a() {
            super();
        }

        @Override
        public void close() {
            throw new AssertionError();
        }

        @Override
        public int read(char[] arr_c, int v, int v1) {
            throw new AssertionError();
        }
    }

    static class b {
        static final int[] a;

        static {
            int[] arr_v = new int[c.values().length];
            b.a = arr_v;
            try {
                arr_v[c.e.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[c.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[c.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                b.a[c.j.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private int[] M8;
    private static final Reader N8;
    private static final Object O8;
    private Object[] X;
    private int Y;
    private String[] Z;

    static {
        a.N8 = new com.google.gson.internal.bind.a.a();
        a.O8 = new Object();
    }

    public a(j j0) {
        super(a.N8);
        this.X = new Object[0x20];
        this.Y = 0;
        this.Z = new String[0x20];
        this.M8 = new int[0x20];
        this.t1(j0);
    }

    @Override  // com.google.gson.stream.a
    public long L() throws IOException {
        c c0 = this.f0();
        c c1 = c.g;
        if(c0 != c1 && c0 != c.f) {
            throw new IllegalStateException("Expected " + c1 + " but was " + c0 + this.t());
        }
        long v = ((p)this.i1()).p();
        this.j1();
        int v1 = this.Y;
        if(v1 > 0) {
            ++this.M8[v1 - 1];
        }
        return v;
    }

    @Override  // com.google.gson.stream.a
    public String Q() throws IOException {
        return this.h1(false);
    }

    @Override  // com.google.gson.stream.a
    public void T() throws IOException {
        this.c1(c.i);
        this.j1();
        int v = this.Y;
        if(v > 0) {
            ++this.M8[v - 1];
        }
    }

    @Override  // com.google.gson.stream.a
    public void Y1() throws IOException {
        switch(this.f0()) {
            case 1: {
                this.h1(true);
                break;
            }
            case 2: {
                this.i();
                return;
            }
            case 3: {
                this.j();
                return;
            label_6:
                this.j1();
                int v = this.Y;
                if(v > 0) {
                    ++this.M8[v - 1];
                    return;
                }
                break;
            }
            case 4: {
                break;
            }
            default: {
                goto label_6;
            }
        }
    }

    @Override  // com.google.gson.stream.a
    public void a() throws IOException {
        this.c1(c.a);
        this.t1(((g)this.i1()).iterator());
        this.M8[this.Y - 1] = 0;
    }

    @Override  // com.google.gson.stream.a
    public void b() throws IOException {
        this.c1(c.c);
        this.t1(((m)this.i1()).entrySet().iterator());
    }

    private void c1(c c0) throws IOException {
        if(this.f0() != c0) {
            throw new IllegalStateException("Expected " + c0 + " but was " + this.f0() + this.t());
        }
    }

    @Override  // com.google.gson.stream.a
    public void close() throws IOException {
        this.X = new Object[]{a.O8};
        this.Y = 1;
    }

    @Override  // com.google.gson.stream.a
    public String d0() throws IOException {
        c c0 = this.f0();
        c c1 = c.f;
        if(c0 != c1 && c0 != c.g) {
            throw new IllegalStateException("Expected " + c1 + " but was " + c0 + this.t());
        }
        String s = ((p)this.j1()).t();
        int v = this.Y;
        if(v > 0) {
            ++this.M8[v - 1];
        }
        return s;
    }

    j d1() throws IOException {
        c c0 = this.f0();
        if(c0 == c.e || c0 == c.b || c0 == c.d || c0 == c.j) {
            throw new IllegalStateException("Unexpected " + c0 + " when reading a JsonElement.");
        }
        j j0 = (j)this.i1();
        this.Y1();
        return j0;
    }

    @Override  // com.google.gson.stream.a
    public c f0() throws IOException {
        if(this.Y == 0) {
            return c.j;
        }
        Object object0 = this.i1();
        if(object0 instanceof Iterator) {
            boolean z = this.X[this.Y - 2] instanceof m;
            if(((Iterator)object0).hasNext()) {
                if(z) {
                    return c.e;
                }
                Object object1 = ((Iterator)object0).next();
                this.t1(object1);
                return this.f0();
            }
            return z ? c.d : c.b;
        }
        if(object0 instanceof m) {
            return c.c;
        }
        if(object0 instanceof g) {
            return c.a;
        }
        if(object0 instanceof p) {
            if(((p)object0).D()) {
                return c.f;
            }
            if(((p)object0).A()) {
                return c.h;
            }
            if(!((p)object0).C()) {
                throw new AssertionError();
            }
            return c.g;
        }
        if(object0 instanceof l) {
            return c.i;
        }
        if(object0 != a.O8) {
            throw new e("Custom JsonElement subclass " + object0.getClass().getName() + " is not supported");
        }
        throw new IllegalStateException("JsonReader is closed");
    }

    @Override  // com.google.gson.stream.a
    public String getPath() {
        return this.n(false);
    }

    private String h1(boolean z) throws IOException {
        this.c1(c.e);
        Object object0 = ((Iterator)this.i1()).next();
        String s = (String)((Map.Entry)object0).getKey();
        this.Z[this.Y - 1] = z ? "<skipped>" : s;
        this.t1(((Map.Entry)object0).getValue());
        return s;
    }

    @Override  // com.google.gson.stream.a
    public void i() throws IOException {
        this.c1(c.b);
        this.j1();
        this.j1();
        int v = this.Y;
        if(v > 0) {
            ++this.M8[v - 1];
        }
    }

    private Object i1() {
        return this.X[this.Y - 1];
    }

    @Override  // com.google.gson.stream.a
    public void j() throws IOException {
        this.c1(c.d);
        this.Z[this.Y - 1] = null;
        this.j1();
        this.j1();
        int v = this.Y;
        if(v > 0) {
            ++this.M8[v - 1];
        }
    }

    private Object j1() {
        Object[] arr_object = this.X;
        int v = this.Y - 1;
        this.Y = v;
        Object object0 = arr_object[v];
        arr_object[v] = null;
        return object0;
    }

    public void l1() throws IOException {
        this.c1(c.e);
        Object object0 = ((Iterator)this.i1()).next();
        this.t1(((Map.Entry)object0).getValue());
        this.t1(new p(((String)((Map.Entry)object0).getKey())));
    }

    private String n(boolean z) {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append('$');
        for(int v = 0; true; ++v) {
            int v1 = this.Y;
            if(v >= v1) {
                break;
            }
            Object[] arr_object = this.X;
            Object object0 = arr_object[v];
            if(object0 instanceof g) {
                ++v;
                if(v < v1 && arr_object[v] instanceof Iterator) {
                    int v2 = this.M8[v];
                    if(z && v2 > 0 && (v == v1 - 1 || v == v1 - 2)) {
                        --v2;
                    }
                    stringBuilder0.append('[');
                    stringBuilder0.append(v2);
                    stringBuilder0.append(']');
                }
            }
            else if(object0 instanceof m) {
                ++v;
                if(v < v1 && arr_object[v] instanceof Iterator) {
                    stringBuilder0.append('.');
                    String s = this.Z[v];
                    if(s != null) {
                        stringBuilder0.append(s);
                    }
                }
            }
        }
        return stringBuilder0.toString();
    }

    @Override  // com.google.gson.stream.a
    public String o() {
        return this.n(true);
    }

    @Override  // com.google.gson.stream.a
    public boolean p() throws IOException {
        c c0 = this.f0();
        return c0 != c.d && c0 != c.b && c0 != c.j;
    }

    private String t() {
        return " at path " + this.getPath();
    }

    private void t1(Object object0) {
        int v = this.Y;
        Object[] arr_object = this.X;
        if(v == arr_object.length) {
            this.X = Arrays.copyOf(arr_object, v * 2);
            this.M8 = Arrays.copyOf(this.M8, v * 2);
            this.Z = (String[])Arrays.copyOf(this.Z, v * 2);
        }
        int v1 = this.Y;
        this.Y = v1 + 1;
        this.X[v1] = object0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.gson.stream.a
    public String toString() {
        return "a" + this.t();
    }

    @Override  // com.google.gson.stream.a
    public boolean v() throws IOException {
        this.c1(c.h);
        boolean z = ((p)this.j1()).d();
        int v = this.Y;
        if(v > 0) {
            ++this.M8[v - 1];
        }
        return z;
    }

    @Override  // com.google.gson.stream.a
    public double w() throws IOException {
        c c0 = this.f0();
        c c1 = c.g;
        if(c0 != c1 && c0 != c.f) {
            throw new IllegalStateException("Expected " + c1 + " but was " + c0 + this.t());
        }
        double f = ((p)this.i1()).i();
        if(!this.q() && (Double.isNaN(f) || Double.isInfinite(f))) {
            throw new e("JSON forbids NaN and infinities: " + f);
        }
        this.j1();
        int v = this.Y;
        if(v > 0) {
            ++this.M8[v - 1];
        }
        return f;
    }

    @Override  // com.google.gson.stream.a
    public int x() throws IOException {
        c c0 = this.f0();
        c c1 = c.g;
        if(c0 != c1 && c0 != c.f) {
            throw new IllegalStateException("Expected " + c1 + " but was " + c0 + this.t());
        }
        int v = ((p)this.i1()).k();
        this.j1();
        int v1 = this.Y;
        if(v1 > 0) {
            ++this.M8[v1 - 1];
        }
        return v;
    }
}

