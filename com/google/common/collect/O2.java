package com.google.common.collect;

import J1.c;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

@c
@C1
public abstract class o2 extends v2 implements NavigableSet {
    public class a extends g {
    }

    @o3.a
    protected Object A0(@d4 Object object0) {
        return q3.I(this.tailSet(object0, true).iterator(), null);
    }

    @d4
    protected Object B0() {
        return this.iterator().next();
    }

    @o3.a
    protected Object C0(@d4 Object object0) {
        return q3.I(this.headSet(object0, true).descendingIterator(), null);
    }

    protected SortedSet D0(@d4 Object object0) {
        return this.headSet(object0, false);
    }

    @o3.a
    protected Object F0(@d4 Object object0) {
        return q3.I(this.tailSet(object0, false).iterator(), null);
    }

    @d4
    protected Object G0() {
        return this.descendingIterator().next();
    }

    @o3.a
    protected Object H0(@d4 Object object0) {
        return q3.I(this.headSet(object0, false).descendingIterator(), null);
    }

    @o3.a
    protected Object I0() {
        return q3.T(this.iterator());
    }

    @o3.a
    protected Object J0() {
        return q3.T(this.descendingIterator());
    }

    @Override  // com.google.common.collect.v2
    protected Object K() {
        return this.z0();
    }

    protected NavigableSet K0(@d4 Object object0, boolean z, @d4 Object object1, boolean z1) {
        return this.tailSet(object0, z).headSet(object1, z1);
    }

    @Override  // com.google.common.collect.v2
    protected Collection M() {
        return this.z0();
    }

    protected SortedSet M0(@d4 Object object0) {
        return this.tailSet(object0, true);
    }

    @Override
    @o3.a
    public Object ceiling(@d4 Object object0) {
        return this.z0().ceiling(object0);
    }

    @Override
    public Iterator descendingIterator() {
        return this.z0().descendingIterator();
    }

    @Override
    public NavigableSet descendingSet() {
        return this.z0().descendingSet();
    }

    @Override
    @o3.a
    public Object floor(@d4 Object object0) {
        return this.z0().floor(object0);
    }

    @Override
    public NavigableSet headSet(@d4 Object object0, boolean z) {
        return this.z0().headSet(object0, z);
    }

    @Override
    @o3.a
    public Object higher(@d4 Object object0) {
        return this.z0().higher(object0);
    }

    @Override
    @o3.a
    public Object lower(@d4 Object object0) {
        return this.z0().lower(object0);
    }

    @Override
    @o3.a
    public Object pollFirst() {
        return this.z0().pollFirst();
    }

    @Override
    @o3.a
    public Object pollLast() {
        return this.z0().pollLast();
    }

    @Override  // com.google.common.collect.v2
    protected Set s0() {
        return this.z0();
    }

    @Override
    public NavigableSet subSet(@d4 Object object0, boolean z, @d4 Object object1, boolean z1) {
        return this.z0().subSet(object0, z, object1, z1);
    }

    @Override
    public NavigableSet tailSet(@d4 Object object0, boolean z) {
        return this.z0().tailSet(object0, z);
    }

    @Override  // com.google.common.collect.v2
    protected SortedSet w0() {
        return this.z0();
    }

    @Override  // com.google.common.collect.v2
    protected SortedSet y0(@d4 Object object0, @d4 Object object1) {
        return this.subSet(object0, true, object1, false);
    }

    protected abstract NavigableSet z0();
}

