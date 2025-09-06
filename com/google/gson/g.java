package com.google.gson;

import com.google.gson.internal.i;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class g extends j implements Iterable {
    private final ArrayList a;

    public g() {
        this.a = new ArrayList();
    }

    public g(int v) {
        this.a = new ArrayList(v);
    }

    public void A(Boolean boolean0) {
        ArrayList arrayList0 = this.a;
        l l0 = boolean0 == null ? l.a : new p(boolean0);
        arrayList0.add(l0);
    }

    public void B(Character character0) {
        ArrayList arrayList0 = this.a;
        l l0 = character0 == null ? l.a : new p(character0);
        arrayList0.add(l0);
    }

    public void C(Number number0) {
        ArrayList arrayList0 = this.a;
        l l0 = number0 == null ? l.a : new p(number0);
        arrayList0.add(l0);
    }

    public void D(String s) {
        ArrayList arrayList0 = this.a;
        l l0 = s == null ? l.a : new p(s);
        arrayList0.add(l0);
    }

    public void E(g g0) {
        this.a.addAll(g0.a);
    }

    public List F() {
        return new i(this.a);
    }

    public boolean G(j j0) {
        return this.a.contains(j0);
    }

    public g H() {
        if(!this.a.isEmpty()) {
            g g0 = new g(this.a.size());
            for(Object object0: this.a) {
                g0.z(((j)object0).a());
            }
            return g0;
        }
        return new g();
    }

    public j I(int v) {
        return (j)this.a.get(v);
    }

    private j J() {
        int v = this.a.size();
        if(v != 1) {
            throw new IllegalStateException("Array must have size 1, but has size " + v);
        }
        return (j)this.a.get(0);
    }

    public j K(int v) {
        return (j)this.a.remove(v);
    }

    public boolean M(j j0) {
        return this.a.remove(j0);
    }

    public j N(int v, j j0) {
        ArrayList arrayList0 = this.a;
        if(j0 == null) {
            j0 = l.a;
        }
        return (j)arrayList0.set(v, j0);
    }

    @Override  // com.google.gson.j
    public j a() {
        return this.H();
    }

    @Override  // com.google.gson.j
    public BigDecimal b() {
        return this.J().b();
    }

    @Override  // com.google.gson.j
    public BigInteger c() {
        return this.J().c();
    }

    @Override  // com.google.gson.j
    public boolean d() {
        return this.J().d();
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 == this || object0 instanceof g && ((g)object0).a.equals(this.a);
    }

    @Override  // com.google.gson.j
    public byte g() {
        return this.J().g();
    }

    @Override  // com.google.gson.j
    @Deprecated
    public char h() {
        return this.J().h();
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override  // com.google.gson.j
    public double i() {
        return this.J().i();
    }

    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return this.a.iterator();
    }

    @Override  // com.google.gson.j
    public float j() {
        return this.J().j();
    }

    @Override  // com.google.gson.j
    public int k() {
        return this.J().k();
    }

    @Override  // com.google.gson.j
    public long p() {
        return this.J().p();
    }

    @Override  // com.google.gson.j
    public Number q() {
        return this.J().q();
    }

    @Override  // com.google.gson.j
    public short r() {
        return this.J().r();
    }

    public int size() {
        return this.a.size();
    }

    @Override  // com.google.gson.j
    public String t() {
        return this.J().t();
    }

    public void z(j j0) {
        if(j0 == null) {
            j0 = l.a;
        }
        this.a.add(j0);
    }
}

