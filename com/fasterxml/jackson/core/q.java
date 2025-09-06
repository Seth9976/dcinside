package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.c;
import com.fasterxml.jackson.core.io.e;

public abstract class q {
    protected int a;
    protected int b;
    protected int c;
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;

    protected q() {
    }

    protected q(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    protected q(q q0) {
        this.a = q0.a;
        this.b = q0.b;
    }

    public final int a() {
        return this.b >= 0 ? this.b : 0;
    }

    public abstract String b();

    public Object c() {
        return null;
    }

    public final int d() {
        return this.b + 1;
    }

    public final int e() {
        return this.c;
    }

    public abstract q f();

    @Deprecated
    public l g(Object object0) {
        return l.i;
    }

    @Deprecated
    public final String h() {
        switch(this.a) {
            case 0: {
                return "ROOT";
            }
            case 1: {
                return "ARRAY";
            }
            case 2: {
                return "OBJECT";
            }
            default: {
                return "?";
            }
        }
    }

    public boolean i() {
        return this.b >= 0;
    }

    public boolean j() {
        return this.b() != null;
    }

    public boolean k() {
        int v = this.a;
        if(v == 2) {
            return this.j();
        }
        return v == 1 ? this.i() : false;
    }

    public final boolean l() {
        return this.a == 1;
    }

    public final boolean m() {
        return this.a == 2;
    }

    public final boolean n() {
        return this.a == 0;
    }

    public o o() {
        return o.o(this, false);
    }

    public o p(boolean z) {
        return o.o(this, z);
    }

    public void q(Object object0) {
    }

    public l r(e e0) {
        return l.i;
    }

    public String s() [...] // 潜在的解密器

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x40);
        switch(this.a) {
            case 0: {
                stringBuilder0.append("/");
                return stringBuilder0.toString();
            }
            case 1: {
                stringBuilder0.append('[');
                stringBuilder0.append(this.a());
                stringBuilder0.append(']');
                return stringBuilder0.toString();
            }
            default: {
                stringBuilder0.append('{');
                String s = this.b();
                if(s == null) {
                    stringBuilder0.append('?');
                }
                else {
                    stringBuilder0.append('\"');
                    c.a(stringBuilder0, s);
                    stringBuilder0.append('\"');
                }
                stringBuilder0.append('}');
                return stringBuilder0.toString();
            }
        }
    }
}

