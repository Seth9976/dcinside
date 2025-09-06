package com.google.common.collect;

import J1.b;
import com.google.common.base.H;
import com.google.common.math.f;
import j..util.DesugarCollections;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import o3.a;

@b
@C1
final class k5 {
    private final int a;
    private final Comparator b;
    private final Object[] c;
    private int d;
    @a
    private Object e;

    private k5(Comparator comparator0, int v) {
        this.b = (Comparator)H.F(comparator0, "comparator");
        this.a = v;
        boolean z = true;
        H.k(v >= 0, "k (%s) must be >= 0", v);
        if(v > 0x3FFFFFFF) {
            z = false;
        }
        H.k(z, "k (%s) must be <= Integer.MAX_VALUE / 2", v);
        this.c = new Object[f.d(v, 2)];
        this.d = 0;
        this.e = null;
    }

    k5 a(k5 k50) {
        for(int v = 0; v < k50.d; ++v) {
            this.f(W3.a(k50.c[v]));
        }
        return this;
    }

    public static k5 b(int v) {
        return k5.c(v, c4.K());
    }

    public static k5 c(int v, Comparator comparator0) {
        return new k5(c4.q(comparator0).P(), v);
    }

    public static k5 d(int v) {
        return k5.e(v, c4.K());
    }

    public static k5 e(int v, Comparator comparator0) {
        return new k5(comparator0, v);
    }

    public void f(@d4 Object object0) {
        int v = this.a;
        if(v == 0) {
            return;
        }
        int v1 = this.d;
        if(v1 == 0) {
            this.c[0] = object0;
            this.e = object0;
            this.d = 1;
            return;
        }
        if(v1 < v) {
            this.d = v1 + 1;
            this.c[v1] = object0;
            if(this.b.compare(object0, this.e) > 0) {
                this.e = object0;
            }
        }
        else if(this.b.compare(object0, this.e) < 0) {
            int v2 = this.d;
            this.d = v2 + 1;
            this.c[v2] = object0;
            if(v2 + 1 == this.a * 2) {
                this.l();
            }
        }
    }

    public void g(Iterable iterable0) {
        this.h(iterable0.iterator());
    }

    public void h(Iterator iterator0) {
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            this.f(object0);
        }
    }

    private int i(int v, int v1, int v2) {
        Object object0 = W3.a(this.c[v2]);
        this.c[v2] = this.c[v1];
        int v3 = v;
        while(v < v1) {
            if(this.b.compare(W3.a(this.c[v]), object0) < 0) {
                this.j(v3, v);
                ++v3;
            }
            ++v;
        }
        this.c[v1] = this.c[v3];
        this.c[v3] = object0;
        return v3;
    }

    private void j(int v, int v1) {
        Object object0 = this.c[v];
        this.c[v] = this.c[v1];
        this.c[v1] = object0;
    }

    public List k() {
        Object[] arr_object = this.c;
        Arrays.sort(arr_object, 0, this.d, this.b);
        int v = this.a;
        if(this.d > v) {
            Arrays.fill(this.c, v, this.c.length, null);
            this.d = this.a;
            this.e = this.c[this.a - 1];
        }
        return DesugarCollections.unmodifiableList(Arrays.asList(Arrays.copyOf(arr_object, this.d)));
    }

    private void l() {
        int v = this.a * 2 - 1;
        int v1 = f.p(v, RoundingMode.CEILING);
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        while(v2 < v) {
            int v5 = this.i(v2, v, v2 + v + 1 >>> 1);
            int v6 = this.a;
            if(v5 > v6) {
                v = v5 - 1;
            }
            else {
                if(v5 >= v6) {
                    break;
                }
                v2 = Math.max(v5, v2 + 1);
                v4 = v5;
            }
            ++v3;
            if(v3 >= v1 * 3) {
                Arrays.sort(this.c, v2, v + 1, this.b);
                break;
            }
            if(false) {
                break;
            }
        }
        this.d = this.a;
        this.e = W3.a(this.c[v4]);
        while(true) {
            ++v4;
            if(v4 >= this.a) {
                break;
            }
            if(this.b.compare(W3.a(this.c[v4]), this.e) > 0) {
                this.e = this.c[v4];
            }
        }
    }
}

