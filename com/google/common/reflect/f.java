package com.google.common.reflect;

import O1.e;
import com.google.common.collect.Q2;
import com.google.common.collect.j2;
import java.util.Map;

@d
public final class f extends j2 implements p {
    static class a {
    }

    public static final class b {
        private final com.google.common.collect.Q2.b a;

        private b() {
            this.a = Q2.b();
        }

        b(a f$a0) {
        }

        public f a() {
            return new f(this.a.d(), null);
        }

        @O1.a
        public b b(q q0, Object object0) {
            q q1 = q0.W();
            this.a.i(q1, object0);
            return this;
        }

        @O1.a
        public b c(Class class0, Object object0) {
            q q0 = q.U(class0);
            this.a.i(q0, object0);
            return this;
        }
    }

    private final Q2 a;

    private f(Q2 q20) {
        this.a = q20;
    }

    f(Q2 q20, a f$a0) {
        this(q20);
    }

    @Override  // com.google.common.reflect.p
    @o3.a
    public Object E0(q q0) {
        return this.t0(q0.W());
    }

    @Override  // com.google.common.collect.j2
    protected Object K() {
        return this.M();
    }

    @Override  // com.google.common.collect.j2
    protected Map M() {
        return this.a;
    }

    @Override  // com.google.common.reflect.p
    @O1.a
    @e("Always throws UnsupportedOperationException")
    @Deprecated
    @o3.a
    public Object e3(q q0, Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.common.reflect.p
    @O1.a
    @e("Always throws UnsupportedOperationException")
    @Deprecated
    @o3.a
    public Object k(Class class0, Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.common.reflect.p
    @o3.a
    public Object p(Class class0) {
        return this.t0(q.U(class0));
    }

    @Override  // com.google.common.collect.j2
    @O1.a
    @e("Always throws UnsupportedOperationException")
    @Deprecated
    @o3.a
    public Object put(Object object0, Object object1) {
        return this.s0(((q)object0), object1);
    }

    @Override  // com.google.common.collect.j2
    @e("Always throws UnsupportedOperationException")
    @Deprecated
    public void putAll(Map map0) {
        throw new UnsupportedOperationException();
    }

    public static b q0() {
        return new b(null);
    }

    public static f r0() {
        return new f(Q2.u());
    }

    @O1.a
    @e("Always throws UnsupportedOperationException")
    @Deprecated
    @o3.a
    public Object s0(q q0, Object object0) {
        throw new UnsupportedOperationException();
    }

    @o3.a
    private Object t0(q q0) {
        return this.a.get(q0);
    }
}

