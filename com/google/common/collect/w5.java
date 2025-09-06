package com.google.common.collect;

import J1.b;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import o3.a;

@b(emulated = true)
@C1
final class w5 extends m implements M4 {
    @P1.b
    @a
    private transient w5 e;
    private static final long f;

    w5(M4 m40) {
        super(m40);
    }

    @Override  // com.google.common.collect.M4
    public M4 B3(@d4 Object object0, y y0) {
        return T3.C(this.G0().B3(object0, y0));
    }

    @Override  // com.google.common.collect.T3$m
    Set D0() {
        return this.F0();
    }

    NavigableSet F0() {
        return D4.P(this.G0().f());
    }

    protected M4 G0() {
        return (M4)super.s0();
    }

    @Override  // com.google.common.collect.T3$m
    protected Object K() {
        return this.G0();
    }

    @Override  // com.google.common.collect.T3$m
    protected Collection M() {
        return this.G0();
    }

    @Override  // com.google.common.collect.M4
    public M4 Y0() {
        w5 w50 = this.e;
        if(w50 == null) {
            w50 = new w5(this.G0().Y0());
            w50.e = this;
            this.e = w50;
        }
        return w50;
    }

    @Override  // com.google.common.collect.M4
    public M4 Y2(@d4 Object object0, y y0, @d4 Object object1, y y1) {
        return T3.C(this.G0().Y2(object0, y0, object1, y1));
    }

    @Override  // com.google.common.collect.M4
    public Comparator comparator() {
        return this.G0().comparator();
    }

    @Override  // com.google.common.collect.M4
    public NavigableSet f() {
        return (NavigableSet)super.f();
    }

    @Override  // com.google.common.collect.T3$m, com.google.common.collect.M4
    public Set f() {
        return this.f();
    }

    @Override  // com.google.common.collect.M4
    public SortedSet f() {
        return this.f();
    }

    @Override  // com.google.common.collect.M4
    @a
    public com.google.common.collect.S3.a firstEntry() {
        return this.G0().firstEntry();
    }

    @Override  // com.google.common.collect.M4
    @a
    public com.google.common.collect.S3.a lastEntry() {
        return this.G0().lastEntry();
    }

    @Override  // com.google.common.collect.M4
    @a
    public com.google.common.collect.S3.a pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.common.collect.M4
    @a
    public com.google.common.collect.S3.a pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.common.collect.T3$m
    protected S3 s0() {
        return this.G0();
    }

    @Override  // com.google.common.collect.M4
    public M4 t1(@d4 Object object0, y y0) {
        return T3.C(this.G0().t1(object0, y0));
    }
}

