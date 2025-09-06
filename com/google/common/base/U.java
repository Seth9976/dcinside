package com.google.common.base;

import J1.b;
import java.io.Serializable;
import o3.a;

@b
@k
final class u extends m implements Serializable {
    private final t a;
    private final m b;
    private static final long c;

    u(t t0, m m0) {
        this.a = (t)H.E(t0);
        this.b = (m)H.E(m0);
    }

    @Override  // com.google.common.base.m
    protected boolean a(Object object0, Object object1) {
        Object object2 = this.a.apply(object0);
        Object object3 = this.a.apply(object1);
        return this.b.d(object2, object3);
    }

    @Override  // com.google.common.base.m
    protected int b(Object object0) {
        Object object1 = this.a.apply(object0);
        return this.b.f(object1);
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(@a Object object0) {
        return object0 == this ? true : object0 instanceof u && (this.a.equals(((u)object0).a) && this.b.equals(((u)object0).b));
    }

    @Override
    public int hashCode() {
        return B.b(new Object[]{this.a, this.b});
    }

    @Override
    public String toString() {
        return this.b + ".onResultOf(" + this.a + ")";
    }
}

