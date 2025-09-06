package io.realm;

import io.realm.internal.OsResults;
import io.realm.internal.UncheckedRow;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Locale;
import o3.h;

public class y0 extends x0 {
    private int g;

    y0(a a0, OsResults osResults0, Class class0) {
        super(a0, osResults0.m(), class0);
        this.g = -1;
    }

    y0(a a0, OsResults osResults0, String s) {
        super(a0, osResults0.m(), s);
        this.g = -1;
    }

    @Override  // io.realm.x0
    public g1 A2(String s, r1 r10) {
        throw this.l("sort");
    }

    @Override  // io.realm.x0
    @h
    public Object C2(@h Object object0) {
        return super.C2(object0);
    }

    @Override  // io.realm.x0
    @h
    public Object I4(@h Object object0) {
        return super.I4(object0);
    }

    @Override  // io.realm.x0
    public boolean L() {
        return super.L();
    }

    @Override  // io.realm.x0
    public boolean L0() {
        return super.L0();
    }

    @Override  // io.realm.internal.j
    public boolean M3() {
        return false;
    }

    @Override  // io.realm.x0
    public g1 N4(String s, r1 r10, String s1, r1 r11) {
        throw this.l("sort");
    }

    @Override  // io.realm.x0
    public void T3(int v) {
        this.a.n();
        if(this.d.v(v).s()) {
            this.d.n(((long)v));
        }
    }

    @Override  // io.realm.x0
    @Deprecated
    public void add(int v, Object object0) {
        super.add(v, object0);
    }

    @Override  // io.realm.x0
    @Deprecated
    public boolean add(Object object0) {
        return super.add(object0);
    }

    @Override  // io.realm.x0
    @Deprecated
    public boolean addAll(int v, Collection collection0) {
        return super.addAll(v, collection0);
    }

    @Override  // io.realm.x0
    @Deprecated
    public boolean addAll(Collection collection0) {
        return super.addAll(collection0);
    }

    @Override  // io.realm.x0
    public boolean c1() {
        this.a.n();
        UncheckedRow uncheckedRow0 = this.d.A();
        return uncheckedRow0 != null && uncheckedRow0.s() && this.d.p();
    }

    @Override  // io.realm.x0
    @Deprecated
    public void clear() {
        super.clear();
    }

    @Override  // io.realm.x0
    public boolean contains(@h Object object0) {
        return super.contains(object0);
    }

    @Override  // io.realm.x0
    public boolean d1() {
        this.a.n();
        UncheckedRow uncheckedRow0 = this.d.r();
        return uncheckedRow0 != null && uncheckedRow0.s() && this.d.o();
    }

    @Override  // io.realm.RealmCollection
    public boolean e0() {
        return true;
    }

    @Override  // io.realm.x0
    public g1 e2(String[] arr_s, r1[] arr_r1) {
        throw this.l("sort");
    }

    @Override  // io.realm.x0
    @h
    public Object first() {
        return super.first();
    }

    @Override  // io.realm.internal.f
    public Object freeze() {
        return this.k();
    }

    @Override  // io.realm.x0
    @h
    public Object get(int v) {
        return super.get(v);
    }

    @Override  // io.realm.x0
    public F0 h() {
        return super.h();
    }

    @Override  // io.realm.x0
    public y0 i2() {
        this.a.k();
        return this;
    }

    @Override  // io.realm.x0
    public Iterator iterator() {
        return super.iterator();
    }

    public OrderedRealmCollection k() {
        throw this.l("freeze");
    }

    @Override  // io.realm.x0
    public Number k4(String s) {
        return super.k4(s);
    }

    private UnsupportedOperationException l(String s) {
        return new UnsupportedOperationException(String.format(Locale.US, "\'%s()\' is not supported by OrderedRealmCollectionSnapshot. Call \'%s()\' on the original \'RealmCollection\' instead.", s, s));
    }

    @Override  // io.realm.x0
    @h
    public Object last() {
        return super.last();
    }

    @Override  // io.realm.x0
    public ListIterator listIterator() {
        return super.listIterator();
    }

    @Override  // io.realm.x0
    public ListIterator listIterator(int v) {
        return super.listIterator(v);
    }

    @Override  // io.realm.x0
    public g1 p3(String s) {
        throw this.l("sort");
    }

    @Override  // io.realm.x0
    @h
    public Date q4(String s) {
        return super.q4(s);
    }

    @Override  // io.realm.x0
    @Deprecated
    public Object remove(int v) {
        return super.remove(v);
    }

    @Override  // io.realm.x0
    @Deprecated
    public boolean remove(Object object0) {
        return super.remove(object0);
    }

    @Override  // io.realm.x0
    @Deprecated
    public boolean removeAll(Collection collection0) {
        return super.removeAll(collection0);
    }

    @Override  // io.realm.x0
    @Deprecated
    public boolean retainAll(Collection collection0) {
        return super.retainAll(collection0);
    }

    @Override  // io.realm.x0
    public boolean s() {
        return super.s();
    }

    @Override  // io.realm.x0
    @Deprecated
    public Object set(int v, Object object0) {
        return super.set(v, object0);
    }

    @Override  // io.realm.x0
    public int size() {
        if(this.g == -1) {
            this.g = super.size();
        }
        return this.g;
    }

    @Override  // io.realm.x0
    public Number u1(String s) {
        return super.u1(s);
    }

    @Override  // io.realm.x0
    public Date v3(String s) {
        return super.v3(s);
    }

    @Override  // io.realm.RealmCollection
    public boolean w() {
        return true;
    }

    @Override  // io.realm.x0
    public double x0(String s) {
        return super.x0(s);
    }

    @Override  // io.realm.RealmCollection
    @Deprecated
    public RealmQuery x4() {
        throw this.l("where");
    }

    @Override  // io.realm.x0
    public Number z4(String s) {
        return super.z4(s);
    }
}

