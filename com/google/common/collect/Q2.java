package com.google.common.collect;

import J1.b;
import O1.a;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Queue;

@b
@C1
public abstract class q2 extends Y1 implements Queue {
    @Override  // com.google.common.collect.Y1
    protected Object K() {
        return this.s0();
    }

    @Override  // com.google.common.collect.Y1
    protected Collection M() {
        return this.s0();
    }

    @Override
    @d4
    public Object element() {
        return this.s0().element();
    }

    @Override
    @a
    public boolean offer(@d4 Object object0) {
        return this.s0().offer(object0);
    }

    @Override
    @o3.a
    public Object peek() {
        return this.s0().peek();
    }

    @Override
    @a
    @o3.a
    public Object poll() {
        return this.s0().poll();
    }

    @Override
    @a
    @d4
    public Object remove() {
        return this.s0().remove();
    }

    protected abstract Queue s0();

    protected boolean t0(@d4 Object object0) {
        try {
            return this.add(object0);
        }
        catch(IllegalStateException unused_ex) {
            return false;
        }
    }

    @o3.a
    protected Object v0() {
        try {
            return this.element();
        }
        catch(NoSuchElementException unused_ex) {
            return null;
        }
    }

    @o3.a
    protected Object w0() {
        try {
            return this.remove();
        }
        catch(NoSuchElementException unused_ex) {
            return null;
        }
    }
}

