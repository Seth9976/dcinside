package org.jsoup.select;

import j..util.Comparator.-CC;
import j..util.List.-EL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import org.jsoup.internal.n;
import org.jsoup.nodes.o;

public abstract class d extends g {
    public static final class a extends d {
        a(Collection collection0) {
            super(collection0);
        }

        a(g[] arr_g) {
            this(Arrays.asList(arr_g));
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            for(int v = 0; v < this.c; ++v) {
                if(!((g)this.b.get(v)).e(o0, o1)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public String toString() {
            return n.m(this.a, "");
        }
    }

    public static final class b extends d {
        b() {
        }

        b(Collection collection0) {
            if(this.c > 1) {
                a d$a0 = new a(collection0);
                this.a.add(d$a0);
            }
            else {
                this.a.addAll(collection0);
            }
            this.i();
        }

        b(g[] arr_g) {
            this(Arrays.asList(arr_g));
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            for(int v = 0; v < this.c; ++v) {
                if(((g)this.b.get(v)).e(o0, o1)) {
                    return true;
                }
            }
            return false;
        }

        public void j(g g0) {
            this.a.add(g0);
            this.i();
        }

        @Override
        public String toString() {
            return n.m(this.a, ", ");
        }
    }

    final ArrayList a;
    final List b;
    int c;
    int d;

    d() {
        this.c = 0;
        this.d = 0;
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    d(Collection collection0) {
        this.a.addAll(collection0);
        this.i();
    }

    @Override  // org.jsoup.select.g
    protected int c() {
        return this.d;
    }

    @Override  // org.jsoup.select.g
    protected void f() {
        for(Object object0: this.a) {
            ((g)object0).f();
        }
        super.f();
    }

    void g(g g0) {
        this.a.set(this.c - 1, g0);
        this.i();
    }

    g h() {
        return this.c <= 0 ? null : ((g)this.a.get(this.c - 1));
    }

    void i() {
        this.c = this.a.size();
        this.d = 0;
        for(Object object0: this.a) {
            this.d += ((g)object0).c();
        }
        this.b.clear();
        this.b.addAll(this.a);
        Comparator comparator0 = Comparator.-CC.comparingInt(new c());
        List.-EL.sort(this.b, comparator0);
    }
}

