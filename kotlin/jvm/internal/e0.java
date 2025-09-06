package kotlin.jvm.internal;

import kotlin.h0;
import kotlin.reflect.c;
import kotlin.reflect.p.b;
import kotlin.reflect.p;

public abstract class e0 extends k0 implements p {
    public e0() {
    }

    @h0(version = "1.1")
    public e0(Object object0) {
        super(object0);
    }

    @h0(version = "1.4")
    public e0(Object object0, Class class0, String s, String s1, int v) {
        super(object0, class0, s, s1, v);
    }

    @Override  // kotlin.jvm.internal.q
    protected c computeReflected() {
        return m0.t(this);
    }

    @Override  // kotlin.reflect.p
    @h0(version = "1.1")
    public Object getDelegate() {
        return ((p)this.getReflected()).getDelegate();
    }

    @Override  // kotlin.reflect.o
    public kotlin.reflect.o.c getGetter() {
        return this.getGetter();
    }

    @Override  // kotlin.reflect.p
    public b getGetter() {
        return ((p)this.getReflected()).getGetter();
    }

    @Override  // A3.a
    public Object invoke() {
        return this.get();
    }
}

