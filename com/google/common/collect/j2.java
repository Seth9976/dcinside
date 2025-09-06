package com.google.common.collect;

import J1.c;
import O1.e;
import O1.j;
import com.google.common.base.H;
import com.google.common.primitives.q;
import java.io.Serializable;
import java.util.Map.Entry;
import java.util.Map;

@c
@j(containerOf = {"B"})
@C1
public final class J2 extends j2 implements B, Serializable {
    static class a {
    }

    public static final class b {
        private final com.google.common.collect.Q2.b a;

        public b() {
            this.a = Q2.b();
        }

        public J2 a() {
            Q2 q20 = this.a.d();
            return q20.isEmpty() ? J2.s0() : new J2(q20, null);
        }

        private static Object b(Class class0, Object object0) {
            return q.f(class0).cast(object0);
        }

        @O1.a
        public b c(Class class0, Object object0) {
            this.a.i(class0, object0);
            return this;
        }

        @O1.a
        public b d(Map map0) {
            for(Object object0: map0.entrySet()) {
                Class class0 = (Class)((Map.Entry)object0).getKey();
                Object object1 = b.b(class0, ((Map.Entry)object0).getValue());
                this.a.i(class0, object1);
            }
            return this;
        }
    }

    private final Q2 a;
    private static final J2 b;

    static {
        J2.b = new J2(Q2.u());
    }

    private J2(Q2 q20) {
        this.a = q20;
    }

    J2(Q2 q20, a j2$a0) {
        this(q20);
    }

    @Override  // com.google.common.collect.j2
    protected Object K() {
        return this.M();
    }

    @Override  // com.google.common.collect.j2
    protected Map M() {
        return this.a;
    }

    @Override  // com.google.common.collect.B
    @O1.a
    @e("Always throws UnsupportedOperationException")
    @Deprecated
    @o3.a
    public Object k(Class class0, Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.common.collect.B
    @o3.a
    public Object p(Class class0) {
        Object object0 = H.E(class0);
        return this.a.get(object0);
    }

    public static b q0() {
        return new b();
    }

    // 去混淆评级： 低(20)
    public static J2 r0(Map map0) {
        return map0 instanceof J2 ? ((J2)map0) : new b().d(map0).a();
    }

    public static J2 s0() {
        return J2.b;
    }

    public static J2 t0(Class class0, Object object0) {
        return new J2(Q2.w(class0, object0));
    }

    // 去混淆评级： 低(20)
    Object v0() {
        return this.isEmpty() ? J2.s0() : this;
    }
}

