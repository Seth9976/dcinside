package kotlin.jvm.internal;

import kotlin.h0;
import kotlin.reflect.d;
import kotlin.reflect.h;

public class a0 extends Z {
    @h0(version = "1.4")
    public a0(Class class0, String s, String s1, int v) {
        super(class0, s, s1, v);
    }

    public a0(h h0, String s, String s1) {
        super(((t)h0).q(), s, s1, !(h0 instanceof d));
    }

    @Override  // kotlin.reflect.r
    public Object Z(Object object0, Object object1) {
        return this.getGetter().call(new Object[]{object0, object1});
    }

    @Override  // kotlin.reflect.m
    public void t0(Object object0, Object object1, Object object2) {
        this.getSetter().call(new Object[]{object0, object1, object2});
    }
}

