package org.jsoup.select;

import j..lang.Iterable.-CC;
import j..util.Collection.-CC;
import j..util.List.-CC;
import j..util.List;
import j..util.Spliterator.Wrapper;
import j..util.Spliterator;
import j..util.stream.Stream.Wrapper;
import j..util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import org.jsoup.helper.i;
import org.jsoup.internal.n;
import org.jsoup.nodes.d;
import org.jsoup.nodes.o;
import org.jsoup.nodes.r;
import org.jsoup.nodes.t;
import org.jsoup.nodes.y;

public class e extends ArrayList implements List {
    public e() {
    }

    public e(int v) {
        super(v);
    }

    public e(Collection collection0) {
        super(collection0);
    }

    public e(java.util.List list0) {
        super(list0);
    }

    public e(o[] arr_o) {
        super(Arrays.asList(arr_o));
    }

    public boolean A() {
        for(Object object0: this) {
            if(((o)object0).S1()) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public String B() {
        StringBuilder stringBuilder0 = n.d();
        for(Object object0: this) {
            if(stringBuilder0.length() != 0) {
                stringBuilder0.append("\n");
            }
            stringBuilder0.append(((o)object0).T1());
        }
        return n.v(stringBuilder0);
    }

    public e C(String s) {
        for(Object object0: this) {
            ((o)object0).U1(s);
        }
        return this;
    }

    public boolean D(String s) {
        g g0 = m.t(s);
        for(Object object0: this) {
            if(((o)object0).b2(g0)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    // 去混淆评级： 低(20)
    public o E() {
        return this.isEmpty() ? null : ((o)this.get(this.size() - 1));
    }

    public e F() {
        return this.Y(null, true, false);
    }

    public e G(String s) {
        return this.Y(s, true, false);
    }

    public e H() {
        return this.Y(null, true, true);
    }

    public e I(String s) {
        return this.Y(s, true, true);
    }

    public e J(String s) {
        return org.jsoup.select.n.a(this, org.jsoup.select.n.b(s, this));
    }

    public String K() [...] // 潜在的解密器

    public e M() {
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        for(Object object0: this) {
            linkedHashSet0.addAll(((o)object0).q2());
        }
        return new e(linkedHashSet0);
    }

    public e N(String s) {
        for(Object object0: this) {
            ((o)object0).r2(s);
        }
        return this;
    }

    public e O() {
        return this.Y(null, false, false);
    }

    public e P(String s) {
        return this.Y(s, false, false);
    }

    public e Q() {
        return this.Y(null, false, true);
    }

    public e R(String s) {
        return this.Y(s, false, true);
    }

    public o S(int v) {
        o o0 = (o)super.remove(v);
        o0.d0();
        return o0;
    }

    public e T() {
        for(Object object0: this) {
            ((o)object0).d0();
        }
        return this;
    }

    public e U(String s) {
        for(Object object0: this) {
            ((o)object0).A2(s);
        }
        return this;
    }

    public e V(String s) {
        for(Object object0: this) {
            ((o)object0).B2(s);
        }
        return this;
    }

    public e W(String s) {
        return org.jsoup.select.n.b(s, this);
    }

    public o X(int v, o o0) {
        i.o(o0);
        o o1 = (o)super.set(v, o0);
        o1.i0(o0);
        return o1;
    }

    private e Y(String s, boolean z, boolean z1) {
        e e0 = new e();
        g g0 = s == null ? null : m.t(s);
        Iterator iterator0 = this.iterator();
    label_3:
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            o o0 = (o)object0;
            do {
                o0 = z ? o0.k2() : o0.y2();
                if(o0 == null) {
                    continue label_3;
                }
                if(g0 == null) {
                    e0.add(o0);
                }
                else if(o0.b2(g0)) {
                    e0.add(o0);
                }
            }
            while(z1);
        }
        return e0;
    }

    public e Z(String s) {
        for(Object object0: this) {
            ((o)object0).Q2(s);
        }
        return this;
    }

    public e a(String s) {
        for(Object object0: this) {
            ((o)object0).z0(s);
        }
        return this;
    }

    public String a0() {
        StringBuilder stringBuilder0 = n.d();
        for(Object object0: this) {
            if(stringBuilder0.length() != 0) {
                stringBuilder0.append(" ");
            }
            stringBuilder0.append(((o)object0).S2());
        }
        return n.v(stringBuilder0);
    }

    public e b(String s) {
        for(Object object0: this) {
            ((o)object0).A0(s);
        }
        return this;
    }

    public java.util.List b0() {
        return this.j(y.class);
    }

    public e c(String s) {
        for(Object object0: this) {
            ((o)object0).C0(s);
        }
        return this;
    }

    public e c0(String s) {
        for(Object object0: this) {
            ((o)object0).V2(s);
        }
        return this;
    }

    @Override
    public void clear() {
        this.T();
        super.clear();
    }

    @Override
    public Object clone() {
        return this.k();
    }

    public String d(String s) [...] // 潜在的解密器

    @Override  // j$.util.Collection
    public void forEach(Consumer consumer0) {
        Iterable.-CC.$default$forEach(this, consumer0);
    }

    public e g(String s, String s1) {
        for(Object object0: this) {
            ((o)object0).L0(s, s1);
        }
        return this;
    }

    public e g0(l l0) {
        j.d(l0, this);
        return this;
    }

    public e h(String s) {
        for(Object object0: this) {
            ((o)object0).O0(s);
        }
        return this;
    }

    public e h0() {
        for(Object object0: this) {
            ((o)object0).s0();
        }
        return this;
    }

    public String i0() {
        return this.size() <= 0 ? "" : this.u().X2();
    }

    private java.util.List j(Class class0) {
        java.util.List list0 = new ArrayList();
        for(Object object0: this) {
            o o0 = (o)object0;
            for(int v = 0; v < o0.p(); ++v) {
                t t0 = o0.o(v);
                if(class0.isInstance(t0)) {
                    ((ArrayList)list0).add(((t)class0.cast(t0)));
                }
            }
        }
        return list0;
    }

    public e j0(String s) {
        for(Object object0: this) {
            ((o)object0).Y2(s);
        }
        return this;
    }

    public e k() {
        e e0 = new e(this.size());
        for(Object object0: this) {
            e0.add(((o)object0).Y0());
        }
        return e0;
    }

    public e k0(String s) {
        i.l(s);
        for(Object object0: this) {
            ((o)object0).b3(s);
        }
        return this;
    }

    public java.util.List l() {
        return this.j(d.class);
    }

    public java.util.List m() {
        return this.j(org.jsoup.nodes.e.class);
    }

    public java.util.List n(String s) {
        java.util.List list0 = new ArrayList(this.size());
        for(Object object0: this) {
            o o0 = (o)object0;
            if(o0.D(s)) {
                list0.add(o0.g(s));
            }
        }
        return list0;
    }

    public java.util.List o() {
        java.util.List list0 = new ArrayList(this.size());
        for(Object object0: this) {
            o o0 = (o)object0;
            if(o0.S1()) {
                ((ArrayList)list0).add(o0.S2());
            }
        }
        return list0;
    }

    public e p() {
        for(Object object0: this) {
            ((o)object0).j1();
        }
        return this;
    }

    @Override  // j$.util.Collection
    public Stream parallelStream() {
        return Collection.-CC.$default$parallelStream(this);
    }

    @Override
    public java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(this.parallelStream());
    }

    public e q(int v) {
        return this.size() <= v ? new e() : new e(new o[]{((o)this.get(v))});
    }

    public e r(org.jsoup.select.i i0) {
        j.b(i0, this);
        return this;
    }

    @Override
    public Object remove(int v) {
        return this.S(v);
    }

    @Override
    public boolean remove(Object object0) {
        int v = super.indexOf(object0);
        if(v == -1) {
            return false;
        }
        this.S(v);
        return true;
    }

    @Override
    public boolean removeAll(Collection collection0) {
        boolean z = false;
        for(Object object0: collection0) {
            z |= this.remove(object0);
        }
        return z;
    }

    @Override  // j$.util.Collection
    public boolean removeIf(Predicate predicate0) {
        boolean z = false;
        Iterator iterator0 = this.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(predicate0.test(((o)object0))) {
                iterator0.remove();
                z = true;
            }
        }
        return z;
    }

    @Override  // j$.util.List
    public void replaceAll(UnaryOperator unaryOperator0) {
        for(int v = 0; v < this.size(); ++v) {
            this.X(v, ((o)unaryOperator0.apply(((o)this.get(v)))));
        }
    }

    @Override
    public boolean retainAll(Collection collection0) {
        boolean z = false;
        Iterator iterator0 = this.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(!collection0.contains(((o)object0))) {
                iterator0.remove();
                z = true;
            }
        }
        return z;
    }

    @Override
    public Object set(int v, Object object0) {
        return this.X(v, ((o)object0));
    }

    @Override  // j$.util.List
    public void sort(Comparator comparator0) {
        List.-CC.$default$sort(this, comparator0);
    }

    @Override  // j$.util.List
    public Spliterator spliterator() {
        return List.-CC.$default$spliterator(this);
    }

    @Override
    public java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.spliterator());
    }

    @Override  // j$.util.Collection
    public Stream stream() {
        return Collection.-CC.$default$stream(this);
    }

    @Override
    public java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(this.stream());
    }

    @Override  // j$.util.Collection
    public Object[] toArray(IntFunction intFunction0) {
        return Collection.-CC.$default$toArray(this, intFunction0);
    }

    // 去混淆评级： 低(20)
    @Override
    public String toString() {
        return "";
    }

    // 去混淆评级： 低(20)
    public o u() {
        return this.isEmpty() ? null : ((o)this.get(0));
    }

    public java.util.List x() {
        java.util.List list0 = new ArrayList();
        for(Object object0: this) {
            o o0 = (o)object0;
            if(o0 instanceof r) {
                ((ArrayList)list0).add(((r)o0));
            }
        }
        return list0;
    }

    public boolean y(String s) {
        for(Object object0: this) {
            if(((o)object0).D(s)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public boolean z(String s) {
        for(Object object0: this) {
            if(((o)object0).R1(s)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }
}

