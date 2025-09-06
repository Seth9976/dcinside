package kotlin.jvm.internal;

import kotlin.h0;
import kotlin.reflect.c;
import kotlin.reflect.r.b;
import kotlin.reflect.r;

public abstract class i0 extends k0 implements r {
    public i0() {
    }

    @h0(version = "1.4")
    public i0(Class class0, String s, String s1, int v) {
        super(q.NO_RECEIVER, class0, s, s1, v);
    }

    @Override  // kotlin.reflect.r
    @h0(version = "1.1")
    public Object O0(Object object0, Object object1) {
        return ((r)this.getReflected()).O0(object0, object1);
    }

    @Override  // kotlin.jvm.internal.q
    protected c computeReflected() {
        return m0.v(this);
    }

    @Override  // kotlin.reflect.o
    public kotlin.reflect.o.c getGetter() {
        return this.getGetter();
    }

    @Override  // kotlin.reflect.r
    public b getGetter() {
        return ((r)this.getReflected()).getGetter();
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.Z(object0, object1);
    }
}

