package com.github.mikephil.charting.utils;

import java.util.List;

public class h {
    public static abstract class a {
        int a;
        public static int b = -1;

        static {
        }

        public a() {
            this.a = -1;
        }

        protected abstract a a();
    }

    private int a;
    private int b;
    private Object[] c;
    private int d;
    private a e;
    private float f;
    private static int g;

    static {
    }

    private h(int v, a h$a0) {
        if(v <= 0) {
            throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
        }
        this.b = v;
        this.c = new Object[v];
        this.d = 0;
        this.e = h$a0;
        this.f = 1.0f;
        this.i();
    }

    public static h a(int v, a h$a0) {
        synchronized(h.class) {
            h h0 = new h(v, h$a0);
            h0.a = 1;
            h.g = 2;
            return h0;
        }
    }

    public a b() {
        synchronized(this) {
            if(this.d == -1 && this.f > 0.0f) {
                this.i();
            }
            int v1 = this.d;
            a h$a0 = (a)this.c[v1];
            h$a0.a = -1;
            this.d = v1 - 1;
            return h$a0;
        }
    }

    public int c() {
        return this.c.length;
    }

    public int d() {
        return this.d + 1;
    }

    public int e() {
        return this.a;
    }

    public float f() {
        return this.f;
    }

    public void g(a h$a0) {
        synchronized(this) {
            int v1 = h$a0.a;
            if(v1 != -1) {
                if(v1 != this.a) {
                    throw new IllegalArgumentException("The object to recycle already belongs to poolId " + h$a0.a + ".  Object cannot belong to two different pool instances simultaneously!");
                }
                throw new IllegalArgumentException("The object passed is already stored in this pool!");
            }
            int v2 = this.d + 1;
            this.d = v2;
            if(v2 >= this.c.length) {
                this.k();
            }
            h$a0.a = this.a;
            this.c[this.d] = h$a0;
        }
        return;
    }

    public void h(List list0) {
        synchronized(this) {
            while(list0.size() + this.d + 1 > this.b) {
                this.k();
            }
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                a h$a0 = (a)list0.get(v2);
                int v3 = h$a0.a;
                if(v3 != -1) {
                    if(v3 == this.a) {
                        throw new IllegalArgumentException("The object passed is already stored in this pool!");
                    }
                    throw new IllegalArgumentException("The object to recycle already belongs to poolId " + h$a0.a + ".  Object cannot belong to two different pool instances simultaneously!");
                }
                h$a0.a = this.a;
                this.c[this.d + 1 + v2] = h$a0;
            }
            this.d += v1;
        }
        return;
    }

    private void i() {
        this.j(this.f);
    }

    private void j(float f) {
        int v = this.b;
        int v1 = (int)(((float)v) * f);
        if(v1 < 1) {
            v = 1;
        }
        else if(v1 <= v) {
            v = v1;
        }
        for(int v2 = 0; v2 < v; ++v2) {
            Object[] arr_object = this.c;
            arr_object[v2] = this.e.a();
        }
        this.d = v - 1;
    }

    private void k() {
        int v = this.b;
        this.b = v * 2;
        Object[] arr_object = new Object[v * 2];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = this.c[v1];
        }
        this.c = arr_object;
    }

    public void l(float f) {
        if(f > 1.0f) {
            f = 1.0f;
        }
        else if(f < 0.0f) {
            f = 0.0f;
        }
        this.f = f;
    }
}

