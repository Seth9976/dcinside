package kotlin.jvm.internal;

import kotlin.reflect.d;
import kotlin.reflect.h;

public class h0 extends g0 {
    @kotlin.h0(version = "1.4")
    public h0(Class class0, String s, String s1, int v) {
        super(q.NO_RECEIVER, class0, s, s1, v);
    }

    @kotlin.h0(version = "1.4")
    public h0(Object object0, Class class0, String s, String s1, int v) {
        super(object0, class0, s, s1, v);
    }

    public h0(h h0, String s, String s1) {
        Class class0 = ((t)h0).q();
        super(q.NO_RECEIVER, class0, s, s1, !(h0 instanceof d));
    }

    @Override  // kotlin.reflect.q
    public Object get(Object object0) {
        return this.getGetter().call(new Object[]{object0});
    }
}

