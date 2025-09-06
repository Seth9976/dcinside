package com.google.common.reflect;

import O1.e;
import com.google.common.base.H;
import com.google.common.collect.D3;
import com.google.common.collect.j2;
import com.google.common.collect.k2;
import com.google.common.collect.q3;
import com.google.common.collect.r2;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

@d
public final class i extends j2 implements p {
    static final class a extends k2 {
        private final Map.Entry a;

        private a(Map.Entry map$Entry0) {
            this.a = (Map.Entry)H.E(map$Entry0);
        }

        @Override  // com.google.common.collect.k2
        protected Object K() {
            return this.M();
        }

        @Override  // com.google.common.collect.k2
        protected Map.Entry M() {
            return this.a;
        }

        // 检测为 Lambda 实现
        public static a S(Map.Entry map$Entry0) [...]

        private static Iterator V(Iterator iterator0) {
            return q3.b0(iterator0, (Map.Entry map$Entry0) -> new a(map$Entry0));
        }

        static Set W(Set set0) {
            class com.google.common.reflect.i.a.a extends r2 {
                final Set a;

                com.google.common.reflect.i.a.a(Set set0) {
                }

                @Override  // com.google.common.collect.r2
                protected Object K() {
                    return this.s0();
                }

                @Override  // com.google.common.collect.r2
                protected Collection M() {
                    return this.s0();
                }

                @Override  // com.google.common.collect.Y1
                public Iterator iterator() {
                    return a.V(super.iterator());
                }

                @Override  // com.google.common.collect.r2
                protected Set s0() {
                    return this.a;
                }

                @Override  // com.google.common.collect.Y1
                public Object[] toArray() {
                    return this.p0();
                }

                @Override  // com.google.common.collect.Y1
                public Object[] toArray(Object[] arr_object) {
                    return this.q0(arr_object);
                }
            }

            return new com.google.common.reflect.i.a.a(set0);
        }

        @Override  // com.google.common.collect.k2
        @k
        public Object setValue(@k Object object0) {
            throw new UnsupportedOperationException();
        }
    }

    private final Map a;

    public i() {
        this.a = D3.Y();
    }

    @Override  // com.google.common.reflect.p
    @o3.a
    public Object E0(q q0) {
        return this.r0(q0.W());
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
    @o3.a
    public Object e3(q q0, @k Object object0) {
        return this.s0(q0.W(), object0);
    }

    @Override  // com.google.common.collect.j2
    public Set entrySet() {
        return a.W(super.entrySet());
    }

    @Override  // com.google.common.reflect.p
    @O1.a
    @o3.a
    public Object k(Class class0, @k Object object0) {
        return this.s0(q.U(class0), object0);
    }

    @Override  // com.google.common.reflect.p
    @o3.a
    public Object p(Class class0) {
        return this.r0(q.U(class0));
    }

    @Override  // com.google.common.collect.j2
    @O1.a
    @e("Always throws UnsupportedOperationException")
    @Deprecated
    @o3.a
    public Object put(Object object0, @k Object object1) {
        return this.q0(((q)object0), object1);
    }

    @Override  // com.google.common.collect.j2
    @e("Always throws UnsupportedOperationException")
    @Deprecated
    public void putAll(Map map0) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    @O1.a
    @e("Always throws UnsupportedOperationException")
    @Deprecated
    @o3.a
    public Object q0(q q0, @k Object object0) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    @o3.a
    private Object r0(q q0) {
        return this.a.get(q0);
    }

    @o3.a
    private Object s0(q q0, @k Object object0) {
        return this.a.put(q0, object0);
    }
}

