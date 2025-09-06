package kotlin.jvm.internal;

import kotlin.h0;
import kotlin.reflect.d;
import kotlin.reflect.h;

public class f0 extends e0 {
    @h0(version = "1.4")
    public f0(Class class0, String s, String s1, int v) {
        super(q.NO_RECEIVER, class0, s, s1, v);
    }

    @h0(version = "1.4")
    public f0(Object object0, Class class0, String s, String s1, int v) {
        super(object0, class0, s, s1, v);
    }

    public f0(h h0, String s, String s1) {
        Class class0 = ((t)h0).q();
        super(q.NO_RECEIVER, class0, s, s1, !(h0 instanceof d));
    }

    @Override  // kotlin.reflect.p
    public Object get() {
        return this.getGetter().call(new Object[0]);
    }
}

