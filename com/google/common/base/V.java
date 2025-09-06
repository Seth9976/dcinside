package com.google.common.base;

import J1.b;
import java.io.Serializable;
import java.util.Map;

@b
@k
public final class v {
    static class a {
    }

    static class com.google.common.base.v.b implements t, Serializable {
        @E
        private final Object a;
        private static final long b;

        public com.google.common.base.v.b(@E Object object0) {
            this.a = object0;
        }

        @Override  // com.google.common.base.t
        @E
        public Object apply(@o3.a Object object0) {
            return this.a;
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.common.base.t
        public boolean equals(@o3.a Object object0) {
            return object0 instanceof com.google.common.base.v.b ? B.a(this.a, ((com.google.common.base.v.b)object0).a) : false;
        }

        @Override
        public int hashCode() {
            return this.a == null ? 0 : this.a.hashCode();
        }

        @Override
        public String toString() {
            return "Functions.constant(" + this.a + ")";
        }
    }

    static class c implements t, Serializable {
        final Map a;
        @E
        final Object b;
        private static final long c;

        c(Map map0, @E Object object0) {
            this.a = (Map)H.E(map0);
            this.b = object0;
        }

        @Override  // com.google.common.base.t
        @E
        public Object apply(@E Object object0) {
            Object object1 = this.a.get(object0);
            return object1 != null || this.a.containsKey(object0) ? object1 : this.b;
        }

        // 去混淆评级： 低(30)
        @Override  // com.google.common.base.t
        public boolean equals(@o3.a Object object0) {
            return object0 instanceof c && this.a.equals(((c)object0).a) && B.a(this.b, ((c)object0).b);
        }

        @Override
        public int hashCode() {
            return B.b(new Object[]{this.a, this.b});
        }

        @Override
        public String toString() {
            return "Functions.forMap(" + this.a + ", defaultValue=" + this.b + ")";
        }
    }

    static class d implements t, Serializable {
        private final t a;
        private final t b;
        private static final long c;

        public d(t t0, t t1) {
            this.a = (t)H.E(t0);
            this.b = (t)H.E(t1);
        }

        @Override  // com.google.common.base.t
        @E
        public Object apply(@E Object object0) {
            Object object1 = this.b.apply(object0);
            return this.a.apply(object1);
        }

        // 去混淆评级： 低(30)
        @Override  // com.google.common.base.t
        public boolean equals(@o3.a Object object0) {
            return object0 instanceof d && this.b.equals(((d)object0).b) && this.a.equals(((d)object0).a);
        }

        @Override
        public int hashCode() {
            return this.b.hashCode() ^ this.a.hashCode();
        }

        @Override
        public String toString() {
            return this.a + "(" + this.b + ")";
        }
    }

    static class e implements t, Serializable {
        final Map a;
        private static final long b;

        e(Map map0) {
            this.a = (Map)H.E(map0);
        }

        @Override  // com.google.common.base.t
        @E
        public Object apply(@E Object object0) {
            Object object1 = this.a.get(object0);
            H.u(object1 != null || this.a.containsKey(object0), "Key \'%s\' not present in map", object0);
            return object1;
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.common.base.t
        public boolean equals(@o3.a Object object0) {
            return object0 instanceof e ? this.a.equals(((e)object0).a) : false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        public String toString() {
            return "Functions.forMap(" + this.a + ")";
        }
    }

    static enum f implements t {
        INSTANCE;

        private static f[] a() [...] // Inlined contents

        @Override  // com.google.common.base.t
        @o3.a
        public Object apply(@o3.a Object o) {
            return o;
        }

        @Override
        public String toString() {
            return "Functions.identity()";
        }
    }

    static class g implements t, Serializable {
        private final I a;
        private static final long b;

        private g(I i0) {
            this.a = (I)H.E(i0);
        }

        g(I i0, a v$a0) {
            this(i0);
        }

        public Boolean a(@E Object object0) {
            return Boolean.valueOf(this.a.apply(object0));
        }

        @Override  // com.google.common.base.t
        public Object apply(@E Object object0) {
            return this.a(object0);
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.common.base.t
        public boolean equals(@o3.a Object object0) {
            return object0 instanceof g ? this.a.equals(((g)object0).a) : false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        public String toString() {
            return "Functions.forPredicate(" + this.a + ")";
        }
    }

    static class h implements t, Serializable {
        private final Q a;
        private static final long b;

        private h(Q q0) {
            this.a = (Q)H.E(q0);
        }

        h(Q q0, a v$a0) {
            this(q0);
        }

        @Override  // com.google.common.base.t
        @E
        public Object apply(@E Object object0) {
            return this.a.get();
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.common.base.t
        public boolean equals(@o3.a Object object0) {
            return object0 instanceof h ? this.a.equals(((h)object0).a) : false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        public String toString() {
            return "Functions.forSupplier(" + this.a + ")";
        }
    }

    static enum i implements t {
        INSTANCE;

        private static i[] a() [...] // Inlined contents

        @Override  // com.google.common.base.t
        public Object apply(Object object0) {
            return this.b(object0);
        }

        public String b(Object object0) {
            H.E(object0);
            return object0.toString();
        }

        @Override
        public String toString() {
            return "Functions.toStringFunction()";
        }
    }

    public static t a(t t0, t t1) {
        return new d(t0, t1);
    }

    public static t b(@E Object object0) {
        return new com.google.common.base.v.b(object0);
    }

    public static t c(Map map0) {
        return new e(map0);
    }

    public static t d(Map map0, @E Object object0) {
        return new c(map0, object0);
    }

    public static t e(I i0) {
        return new g(i0, null);
    }

    public static t f(Q q0) {
        return new h(q0, null);
    }

    public static t g() {
        return f.a;
    }

    public static t h() {
        return i.a;
    }
}

