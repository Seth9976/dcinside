package com.google.common.collect;

import J1.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import o3.a;

@b
@C1
public abstract class g2 extends Y1 implements List {
    protected Iterator A0() {
        return this.listIterator();
    }

    protected int B0(@a Object object0) {
        return z3.n(this, object0);
    }

    protected ListIterator C0() {
        return this.listIterator(0);
    }

    protected ListIterator D0(int v) {
        return z3.p(this, v);
    }

    protected List F0(int v, int v1) {
        return z3.C(this, v, v1);
    }

    @Override  // com.google.common.collect.Y1
    protected Object K() {
        return this.s0();
    }

    @Override  // com.google.common.collect.Y1
    protected Collection M() {
        return this.s0();
    }

    @Override
    public void add(int v, @d4 Object object0) {
        this.s0().add(v, object0);
    }

    @Override
    @O1.a
    public boolean addAll(int v, Collection collection0) {
        return this.s0().addAll(v, collection0);
    }

    @Override
    public boolean equals(@a Object object0) {
        return object0 == this || this.s0().equals(object0);
    }

    @Override
    @d4
    public Object get(int v) {
        return this.s0().get(v);
    }

    @Override
    public int hashCode() {
        return this.s0().hashCode();
    }

    @Override
    public int indexOf(@a Object object0) {
        return this.s0().indexOf(object0);
    }

    @Override
    public int lastIndexOf(@a Object object0) {
        return this.s0().lastIndexOf(object0);
    }

    @Override
    public ListIterator listIterator() {
        return this.s0().listIterator();
    }

    @Override
    public ListIterator listIterator(int v) {
        return this.s0().listIterator(v);
    }

    @Override
    @O1.a
    @d4
    public Object remove(int v) {
        return this.s0().remove(v);
    }

    protected abstract List s0();

    @Override
    @O1.a
    @d4
    public Object set(int v, @d4 Object object0) {
        return this.s0().set(v, object0);
    }

    @Override
    public List subList(int v, int v1) {
        return this.s0().subList(v, v1);
    }

    protected boolean t0(@d4 Object object0) {
        this.add(this.size(), object0);
        return true;
    }

    protected boolean v0(int v, Iterable iterable0) {
        return z3.a(this, v, iterable0);
    }

    protected boolean w0(@a Object object0) {
        return z3.j(this, object0);
    }

    protected int y0() {
        return z3.k(this);
    }

    protected int z0(@a Object object0) {
        return z3.l(this, object0);
    }
}

