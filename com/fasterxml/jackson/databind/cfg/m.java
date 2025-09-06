package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.core.util.h;
import com.fasterxml.jackson.core.util.z;
import java.io.Serializable;

public class m implements Serializable {
    static class a {
        private static final m a;

        static {
            a.a = new m(a.a(p.values()), 0, a.a(r.values()), 0);
        }

        private static int a(Enum[] arr_enum) {
            int v1 = 0;
            for(int v = 0; v < arr_enum.length; ++v) {
                Enum enum0 = arr_enum[v];
                if(((h)enum0).c()) {
                    v1 |= ((h)enum0).a();
                }
            }
            return v1;
        }

        public static m b() {
            return a.a;
        }
    }

    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private static final long e = 1L;
    protected static final int f = 0;
    protected static final int g = 1;

    protected m(int v, int v1, int v2, int v3) {
        this.a = v;
        this.c = v1;
        this.b = v2;
        this.d = v3;
    }

    private static final int a(l[] arr_l) {
        int v1 = 0;
        for(int v = 0; v < arr_l.length; ++v) {
            v1 |= arr_l[v].a();
        }
        return v1;
    }

    private m b(int v, int v1, int v2, int v3) {
        return this.a != v || this.c != v1 || this.b != v2 || this.d != v3 ? new m(v, v1, v2, v3) : this;
    }

    public static m c() {
        return a.b();
    }

    public Boolean d(l l0) {
        switch(l0.d()) {
            case 0: {
                return l0.b(this.c) ? Boolean.valueOf(l0.b(this.a)) : null;
            }
            case 1: {
                return l0.b(this.d) ? Boolean.valueOf(l0.b(this.b)) : null;
            }
            default: {
                z.f();
                return null;
            }
        }
    }

    public boolean e(l l0) {
        switch(l0.d()) {
            case 0: {
                return l0.b(this.a);
            }
            case 1: {
                return l0.b(this.b);
            }
            default: {
                z.f();
                return false;
            }
        }
    }

    public boolean f(l l0) {
        switch(l0.d()) {
            case 0: {
                return l0.b(this.c & ~this.a);
            }
            case 1: {
                return l0.b(this.d & ~this.b);
            }
            default: {
                z.f();
                return false;
            }
        }
    }

    public boolean g(l l0) {
        switch(l0.d()) {
            case 0: {
                return l0.b(this.c & this.a);
            }
            case 1: {
                return l0.b(this.d & this.b);
            }
            default: {
                z.f();
                return false;
            }
        }
    }

    public boolean h(l l0) {
        switch(l0.d()) {
            case 0: {
                return l0.b(this.c);
            }
            case 1: {
                return l0.b(this.d);
            }
            default: {
                z.f();
                return false;
            }
        }
    }

    public m i(l l0) {
        int v = l0.a();
        switch(l0.d()) {
            case 0: {
                return this.b(this.a | v, v | this.c, this.b, this.d);
            }
            case 1: {
                return this.b(this.a, this.c, this.b | v, v | this.d);
            }
            default: {
                z.f();
                return this;
            }
        }
    }

    public m j(l[] arr_l) {
        int v = m.a(arr_l);
        if(v == 0) {
            return this;
        }
        switch(arr_l[0].d()) {
            case 0: {
                return this.b(this.a | v, v | this.c, this.b, this.d);
            }
            case 1: {
                return this.b(this.a, this.c, this.b | v, v | this.d);
            }
            default: {
                z.f();
                return this;
            }
        }
    }

    public m k(l l0) {
        int v = l0.a();
        switch(l0.d()) {
            case 0: {
                return this.b(this.a & ~v, v | this.c, this.b, this.d);
            }
            case 1: {
                return this.b(this.a, this.c, this.b & ~v, v | this.d);
            }
            default: {
                z.f();
                return this;
            }
        }
    }

    public m l(l[] arr_l) {
        int v = m.a(arr_l);
        if(v == 0) {
            return this;
        }
        switch(arr_l[0].d()) {
            case 0: {
                return this.b(this.a & ~v, v | this.c, this.b, this.d);
            }
            case 1: {
                return this.b(this.a, this.c, this.b & ~v, v | this.d);
            }
            default: {
                z.f();
                return this;
            }
        }
    }
}

