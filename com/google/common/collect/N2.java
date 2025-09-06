package com.google.common.collect;

import J1.c;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedMap;

@c
@C1
public abstract class n2 extends t2 implements NavigableMap {
    public class a extends q {
        final n2 d;

        @Override  // com.google.common.collect.D3$q
        protected Iterator r0() {
            class com.google.common.collect.n2.a.a implements Iterator {
                @o3.a
                private Map.Entry a;
                @o3.a
                private Map.Entry b;
                final a c;

                com.google.common.collect.n2.a.a() {
                    this.a = null;
                    this.b = n2$a0.s0().lastEntry();
                }

                public Map.Entry a() {
                    Map.Entry map$Entry0 = this.b;
                    if(map$Entry0 == null) {
                        throw new NoSuchElementException();
                    }
                    this.a = map$Entry0;
                    Object object0 = this.b.getKey();
                    this.b = a.this.s0().lowerEntry(object0);
                    return map$Entry0;
                }

                @Override
                public boolean hasNext() {
                    return this.b != null;
                }

                @Override
                public Object next() {
                    return this.a();
                }

                @Override
                public void remove() {
                    if(this.a == null) {
                        throw new IllegalStateException("no calls to next() since the last call to remove()");
                    }
                    Object object0 = this.a.getKey();
                    a.this.s0().remove(object0);
                    this.a = null;
                }
            }

            return new com.google.common.collect.n2.a.a(this);
        }

        @Override  // com.google.common.collect.D3$q
        NavigableMap s0() {
            return n2.this;
        }
    }

    public class b extends E {
    }

    protected Object A0() {
        Map.Entry map$Entry0 = this.firstEntry();
        if(map$Entry0 == null) {
            throw new NoSuchElementException();
        }
        return map$Entry0.getKey();
    }

    @o3.a
    protected Map.Entry B0(@d4 Object object0) {
        return this.headMap(object0, true).lastEntry();
    }

    @o3.a
    protected Object C0(@d4 Object object0) {
        return D3.T(this.floorEntry(object0));
    }

    protected SortedMap D0(@d4 Object object0) {
        return this.headMap(object0, false);
    }

    @o3.a
    protected Map.Entry F0(@d4 Object object0) {
        return this.tailMap(object0, false).firstEntry();
    }

    @o3.a
    protected Object G0(@d4 Object object0) {
        return D3.T(this.higherEntry(object0));
    }

    @o3.a
    protected Map.Entry H0() {
        return (Map.Entry)p3.v(this.descendingMap().entrySet(), null);
    }

    protected Object I0() {
        Map.Entry map$Entry0 = this.lastEntry();
        if(map$Entry0 == null) {
            throw new NoSuchElementException();
        }
        return map$Entry0.getKey();
    }

    @o3.a
    protected Map.Entry J0(@d4 Object object0) {
        return this.headMap(object0, false).lastEntry();
    }

    @Override  // com.google.common.collect.t2
    protected Object K() {
        return this.t0();
    }

    @o3.a
    protected Object K0(@d4 Object object0) {
        return D3.T(this.lowerEntry(object0));
    }

    @Override  // com.google.common.collect.t2
    protected Map M() {
        return this.t0();
    }

    @o3.a
    protected Map.Entry M0() {
        return (Map.Entry)q3.T(this.entrySet().iterator());
    }

    @o3.a
    protected Map.Entry N0() {
        return (Map.Entry)q3.T(this.descendingMap().entrySet().iterator());
    }

    protected SortedMap O0(@d4 Object object0) {
        return this.tailMap(object0, true);
    }

    @Override
    @o3.a
    public Map.Entry ceilingEntry(@d4 Object object0) {
        return this.t0().ceilingEntry(object0);
    }

    @Override
    @o3.a
    public Object ceilingKey(@d4 Object object0) {
        return this.t0().ceilingKey(object0);
    }

    @Override
    public NavigableSet descendingKeySet() {
        return this.t0().descendingKeySet();
    }

    @Override
    public NavigableMap descendingMap() {
        return this.t0().descendingMap();
    }

    @Override
    @o3.a
    public Map.Entry firstEntry() {
        return this.t0().firstEntry();
    }

    @Override
    @o3.a
    public Map.Entry floorEntry(@d4 Object object0) {
        return this.t0().floorEntry(object0);
    }

    @Override
    @o3.a
    public Object floorKey(@d4 Object object0) {
        return this.t0().floorKey(object0);
    }

    @Override
    public NavigableMap headMap(@d4 Object object0, boolean z) {
        return this.t0().headMap(object0, z);
    }

    @Override
    @o3.a
    public Map.Entry higherEntry(@d4 Object object0) {
        return this.t0().higherEntry(object0);
    }

    @Override
    @o3.a
    public Object higherKey(@d4 Object object0) {
        return this.t0().higherKey(object0);
    }

    @Override
    @o3.a
    public Map.Entry lastEntry() {
        return this.t0().lastEntry();
    }

    @Override
    @o3.a
    public Map.Entry lowerEntry(@d4 Object object0) {
        return this.t0().lowerEntry(object0);
    }

    @Override
    @o3.a
    public Object lowerKey(@d4 Object object0) {
        return this.t0().lowerKey(object0);
    }

    @Override
    public NavigableSet navigableKeySet() {
        return this.t0().navigableKeySet();
    }

    @Override
    @o3.a
    public Map.Entry pollFirstEntry() {
        return this.t0().pollFirstEntry();
    }

    @Override
    @o3.a
    public Map.Entry pollLastEntry() {
        return this.t0().pollLastEntry();
    }

    @Override  // com.google.common.collect.t2
    protected SortedMap q0() {
        return this.t0();
    }

    @Override  // com.google.common.collect.t2
    protected SortedMap r0(@d4 Object object0, @d4 Object object1) {
        return this.subMap(object0, true, object1, false);
    }

    @Override
    public NavigableMap subMap(@d4 Object object0, boolean z, @d4 Object object1, boolean z1) {
        return this.t0().subMap(object0, z, object1, z1);
    }

    protected abstract NavigableMap t0();

    @Override
    public NavigableMap tailMap(@d4 Object object0, boolean z) {
        return this.t0().tailMap(object0, z);
    }

    @o3.a
    protected Map.Entry v0(@d4 Object object0) {
        return this.tailMap(object0, true).firstEntry();
    }

    @o3.a
    protected Object w0(@d4 Object object0) {
        return D3.T(this.ceilingEntry(object0));
    }

    protected NavigableSet y0() {
        return this.descendingMap().navigableKeySet();
    }

    @o3.a
    protected Map.Entry z0() {
        return (Map.Entry)p3.v(this.entrySet(), null);
    }
}

