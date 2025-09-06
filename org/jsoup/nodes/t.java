package org.jsoup.nodes;

import j..util.DesugarCollections;
import j..util.stream.Stream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import org.jsoup.i;
import org.jsoup.internal.n;
import org.jsoup.select.j;
import org.jsoup.select.l;

public abstract class t implements Cloneable {
    static class a implements l {
        private final Appendable a;
        private final org.jsoup.nodes.f.a b;

        a(Appendable appendable0, org.jsoup.nodes.f.a f$a0) {
            this.a = appendable0;
            this.b = f$a0;
            f$a0.o();
        }

        @Override  // org.jsoup.select.l
        public void a(t t0, int v) {
            if(!t0.N().equals("#text")) {
                try {
                    t0.V(this.a, v, this.b);
                }
                catch(IOException iOException0) {
                    throw new i(iOException0);
                }
            }
        }

        @Override  // org.jsoup.select.l
        public void b(t t0, int v) {
            try {
                t0.U(this.a, v, this.b);
            }
            catch(IOException iOException0) {
                throw new i(iOException0);
            }
        }
    }

    t a;
    int b;
    static final List c = null;
    static final String d = "";

    static {
        t.c = Collections.emptyList();
    }

    public t A() {
        return this.p() == 0 ? null : ((t)this.y().get(0));
    }

    public t B(Consumer consumer0) {
        org.jsoup.helper.i.o(consumer0);
        this.O().forEach(consumer0);
        return this;
    }

    private o C(o o0) {
        o o2;
        for(o o1 = o0.p1(); true; o1 = o0.p1()) {
            o2 = o0;
            o0 = o1;
            if(o0 == null) {
                break;
            }
        }
        return o2;
    }

    public boolean D(String s) {
        org.jsoup.helper.i.o(s);
        if(!this.E()) {
            return false;
        }
        if(s.startsWith("abs:")) {
            String s1 = s.substring(4);
            return !this.j().z(s1) || this.a(s1).isEmpty() ? this.j().z(s) : true;
        }
        return this.j().z(s);
    }

    protected abstract boolean E();

    public boolean F() {
        return this.a != null;
    }

    public boolean G(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 == null || this.getClass() != object0.getClass() ? false : this.S().equals(((t)object0).S());
    }

    public Appendable H(Appendable appendable0) {
        this.T(appendable0);
        return appendable0;
    }

    protected void I(Appendable appendable0, int v, org.jsoup.nodes.f.a f$a0) throws IOException {
        appendable0.append('\n').append(n.u(v * f$a0.h(), f$a0.k()));
    }

    final boolean J() {
        int v = this.b;
        if(v == 0) {
            return true;
        }
        if(v == 1) {
            t t0 = this.b0();
            return t0 instanceof y && ((y)t0).B0();
        }
        return false;
    }

    public t K() {
        int v = this.p();
        return v == 0 ? null : ((t)this.y().get(v - 1));
    }

    public boolean L(String s) {
        return this.R().equals(s);
    }

    public t M() {
        t t0 = this.a;
        if(t0 == null) {
            return null;
        }
        List list0 = t0.y();
        int v = this.b + 1;
        return list0.size() <= v ? null : ((t)list0.get(v));
    }

    public abstract String N();

    public Stream O() {
        return v.e(this, t.class);
    }

    public Stream P(Class class0) {
        return v.e(this, class0);
    }

    void Q() {
    }

    public String R() {
        return this.N();
    }

    public String S() {
        StringBuilder stringBuilder0 = n.d();
        this.T(stringBuilder0);
        return n.v(stringBuilder0);
    }

    protected void T(Appendable appendable0) {
        j.c(new a(appendable0, v.a(this)), this);
    }

    abstract void U(Appendable arg1, int arg2, org.jsoup.nodes.f.a arg3) throws IOException;

    abstract void V(Appendable arg1, int arg2, org.jsoup.nodes.f.a arg3) throws IOException;

    public f W() {
        t t0 = this.j0();
        return t0 instanceof f ? ((f)t0) : null;
    }

    public t X() {
        return this.a;
    }

    // 去混淆评级： 低(20)
    public boolean Y(String s, String s1) {
        return this.a != null && this.a instanceof o && ((o)this.a).h1(s, s1);
    }

    public boolean Z(String s) {
        return this.a != null && this.a.R().equals(s);
    }

    public String a(String s) {
        org.jsoup.helper.i.l(s);
        return !this.E() || !this.j().z(s) ? "" : n.w(this.l(), this.j().t(s));
    }

    public final t a0() {
        return this.a;
    }

    protected void b(int v, t[] arr_t) {
        org.jsoup.helper.i.o(arr_t);
        if(arr_t.length == 0) {
            return;
        }
        List list0 = this.y();
        t t0 = arr_t[0].X();
        if(t0 != null && t0.p() == arr_t.length) {
            List list1 = t0.y();
            int v2 = arr_t.length;
            while(v2 > 0) {
                if(arr_t[v2 - 1] != list1.get(v2 - 1)) {
                    goto label_24;
                }
                --v2;
            }
            boolean z = this.p() == 0;
            t0.x();
            list0.addAll(v, Arrays.asList(arr_t));
            for(int v3 = arr_t.length; v3 > 0; --v3) {
                arr_t[v3 - 1].a = this;
            }
            if(!z || arr_t[0].b != 0) {
                this.c0(v);
            }
            return;
        }
    label_24:
        org.jsoup.helper.i.j(arr_t);
        for(int v1 = 0; v1 < arr_t.length; ++v1) {
            this.g0(arr_t[v1]);
        }
        list0.addAll(v, Arrays.asList(arr_t));
        this.c0(v);
    }

    public t b0() {
        t t0 = this.a;
        if(t0 == null) {
            return null;
        }
        return this.b <= 0 ? null : ((t)t0.y().get(this.b - 1));
    }

    protected void c(t[] arr_t) {
        List list0 = this.y();
        for(int v = 0; v < arr_t.length; ++v) {
            t t0 = arr_t[v];
            this.g0(t0);
            list0.add(t0);
            t0.m0(list0.size() - 1);
        }
    }

    private void c0(int v) {
        int v1 = this.p();
        if(v1 == 0) {
            return;
        }
        List list0 = this.y();
        while(v < v1) {
            ((t)list0.get(v)).m0(v);
            ++v;
        }
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.u();
    }

    private void d(int v, String s) {
        org.jsoup.helper.i.o(s);
        org.jsoup.helper.i.o(this.a);
        o o0 = this.X() instanceof o ? ((o)this.X()) : null;
        List list0 = v.b(this).m(s, o0, this.l());
        this.a.b(v, ((t[])list0.toArray(new t[0])));
    }

    public void d0() {
        t t0 = this.a;
        if(t0 != null) {
            t0.f0(this);
        }
    }

    public t e(String s) {
        this.d(this.b + 1, s);
        return this;
    }

    public t e0(String s) {
        org.jsoup.helper.i.o(s);
        if(this.E()) {
            this.j().O(s);
        }
        return this;
    }

    @Override
    public boolean equals(Object object0) {
        return this == object0;
    }

    public t f(t t0) {
        org.jsoup.helper.i.o(t0);
        org.jsoup.helper.i.o(this.a);
        if(t0.a == this.a) {
            t0.d0();
        }
        this.a.b(this.b + 1, new t[]{t0});
        return this;
    }

    protected void f0(t t0) {
        org.jsoup.helper.i.h(t0.a == this);
        int v = t0.b;
        this.y().remove(v);
        this.c0(v);
        t0.a = null;
    }

    public String g(String s) {
        org.jsoup.helper.i.o(s);
        if(!this.E()) {
            return "";
        }
        String s1 = this.j().t(s);
        if(s1.length() > 0) {
            return s1;
        }
        return s.startsWith("abs:") ? this.a(s.substring(4)) : "";
    }

    protected void g0(t t0) {
        t0.l0(this);
    }

    public t h(String s, String s1) {
        String s2 = v.b(this).t().b(s);
        this.j().K(s2, s1);
        return this;
    }

    protected void h0(t t0, t t1) {
        org.jsoup.helper.i.h(t0.a == this);
        org.jsoup.helper.i.o(t1);
        if(t0 == t1) {
            return;
        }
        t t2 = t1.a;
        if(t2 != null) {
            t2.f0(t1);
        }
        int v = t0.b;
        this.y().set(v, t1);
        t1.a = this;
        t1.m0(v);
        t0.a = null;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void i0(t t0) {
        org.jsoup.helper.i.o(t0);
        org.jsoup.helper.i.o(this.a);
        this.a.h0(this, t0);
    }

    public abstract b j();

    public t j0() {
        t t0;
        while((t0 = this.a) != null) {
            this = t0;
        }
        return this;
    }

    // 去混淆评级： 低(20)
    public int k() {
        return this.E() ? this.j().size() : 0;
    }

    public void k0(String s) {
        org.jsoup.helper.i.o(s);
        this.w(s);
    }

    public abstract String l();

    protected void l0(t t0) {
        org.jsoup.helper.i.o(t0);
        t t1 = this.a;
        if(t1 != null) {
            t1.f0(this);
        }
        this.a = t0;
    }

    public t m(String s) {
        this.d(this.b, s);
        return this;
    }

    protected void m0(int v) {
        this.b = v;
    }

    public t n(t t0) {
        org.jsoup.helper.i.o(t0);
        org.jsoup.helper.i.o(this.a);
        if(t0.a == this.a) {
            t0.d0();
        }
        this.a.b(this.b, new t[]{t0});
        return this;
    }

    public t n0() {
        return this.v(null);
    }

    public t o(int v) {
        return (t)this.y().get(v);
    }

    public int o0() {
        return this.b;
    }

    public abstract int p();

    public List p0() {
        t t0 = this.a;
        if(t0 == null) {
            return Collections.emptyList();
        }
        List list0 = t0.y();
        List list1 = new ArrayList(list0.size() - 1);
        for(Object object0: list0) {
            t t1 = (t)object0;
            if(t1 != this) {
                list1.add(t1);
            }
        }
        return list1;
    }

    public List q() {
        if(this.p() == 0) {
            return t.c;
        }
        List list0 = this.y();
        ArrayList arrayList0 = new ArrayList(list0.size());
        arrayList0.addAll(list0);
        return DesugarCollections.unmodifiableList(arrayList0);
    }

    public x q0() {
        return x.f(this, true);
    }

    protected t[] r() {
        return (t[])this.y().toArray(new t[0]);
    }

    public t r0(l l0) {
        org.jsoup.helper.i.o(l0);
        j.c(l0, this);
        return this;
    }

    public List s() {
        List list0 = this.y();
        List list1 = new ArrayList(list0.size());
        for(Object object0: list0) {
            ((ArrayList)list1).add(((t)object0).u());
        }
        return list1;
    }

    public t s0() {
        org.jsoup.helper.i.o(this.a);
        t t0 = this.A();
        this.a.b(this.b, this.r());
        this.d0();
        return t0;
    }

    public t t() {
        if(this.E()) {
            Iterator iterator0 = this.j().iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
                iterator0.remove();
            }
        }
        return this;
    }

    public t t0(String s) {
        o o0;
        org.jsoup.helper.i.l(s);
        t t0 = this.a;
        if(t0 == null || !(t0 instanceof o)) {
            o0 = this instanceof o ? ((o)this) : null;
        }
        else {
            o0 = (o)t0;
        }
        List list0 = v.b(this).m(s, o0, this.l());
        t t1 = (t)list0.get(0);
        if(!(t1 instanceof o)) {
            return this;
        }
        o o1 = this.C(((o)t1));
        t t2 = this.a;
        if(t2 != null) {
            t2.h0(this, ((o)t1));
        }
        o1.c(new t[]{this});
        if(list0.size() > 0) {
            for(int v = 0; v < list0.size(); ++v) {
                t t3 = (t)list0.get(v);
                if(((o)t1) != t3) {
                    t t4 = t3.a;
                    if(t4 != null) {
                        t4.f0(t3);
                    }
                    ((o)t1).B0(t3);
                }
            }
        }
        return this;
    }

    @Override
    public String toString() {
        return this.S();
    }

    public t u() {
        t t0 = this.v(null);
        LinkedList linkedList0 = new LinkedList();
        linkedList0.add(t0);
        while(!linkedList0.isEmpty()) {
            t t1 = (t)linkedList0.remove();
            int v = t1.p();
            for(int v1 = 0; v1 < v; ++v1) {
                List list0 = t1.y();
                t t2 = ((t)list0.get(v1)).v(t1);
                list0.set(v1, t2);
                linkedList0.add(t2);
            }
        }
        return t0;
    }

    protected t v(t t0) {
        t t1;
        try {
            t1 = (t)super.clone();
            t1.a = t0;
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new RuntimeException(cloneNotSupportedException0);
        }
        t1.b = t0 == null ? 0 : this.b;
        if(t0 == null && !(this instanceof f)) {
            f f0 = this.W();
            if(f0 != null) {
                f f1 = f0.y3();
                t1.a = f1;
                f1.y().add(t1);
            }
        }
        return t1;
    }

    protected abstract void w(String arg1);

    public abstract t x();

    protected abstract List y();

    public t z(org.jsoup.select.i i0) {
        org.jsoup.helper.i.o(i0);
        j.a(i0, this);
        return this;
    }
}

