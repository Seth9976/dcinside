package kotlin.jvm.internal;

import kotlin.h0;
import kotlin.reflect.c;
import kotlin.reflect.q.b;
import kotlin.reflect.q;

public abstract class g0 extends k0 implements q {
    public g0() {
    }

    @h0(version = "1.1")
    public g0(Object object0) {
        super(object0);
    }

    @h0(version = "1.4")
    public g0(Object object0, Class class0, String s, String s1, int v) {
        super(object0, class0, s, s1, v);
    }

    @Override  // kotlin.jvm.internal.q
    protected c computeReflected() {
        return m0.u(this);
    }

    @Override  // kotlin.reflect.q
    @h0(version = "1.1")
    public Object f0(Object object0) {
        return ((q)this.getReflected()).f0(object0);
    }

    @Override  // kotlin.reflect.o
    public kotlin.reflect.o.c getGetter() {
        return this.getGetter();
    }

    @Override  // kotlin.reflect.q
    public b getGetter() {
        return ((q)this.getReflected()).getGetter();
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.get(object0);
    }
}

