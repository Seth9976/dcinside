package com.google.crypto.tink;

import com.google.crypto.tink.internal.i;
import com.google.crypto.tink.internal.j;
import com.google.crypto.tink.internal.n;
import com.google.crypto.tink.internal.u;
import com.google.crypto.tink.internal.v;
import com.google.crypto.tink.internal.z;
import com.google.crypto.tink.proto.F2;
import com.google.crypto.tink.proto.W0;
import com.google.crypto.tink.proto.k2;
import com.google.crypto.tink.proto.m2;
import com.google.crypto.tink.proto.n2;
import com.google.crypto.tink.proto.r2.c;
import com.google.crypto.tink.proto.r2;
import com.google.crypto.tink.proto.s2;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.y0;
import j..util.DesugarCollections;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o3.h;

public final class w {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[m2.values().length];
            a.a = arr_v;
            try {
                arr_v[m2.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[m2.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[m2.e.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static final class b {
        public static final class com.google.crypto.tink.w.b.a {
            private boolean a;
            private s b;
            @h
            private final o c;
            @h
            private final E d;
            private com.google.crypto.tink.w.b.b e;
            @h
            private b f;

            private com.google.crypto.tink.w.b.a(E e0) {
                this.b = s.b;
                this.e = null;
                this.f = null;
                this.c = null;
                this.d = e0;
            }

            com.google.crypto.tink.w.b.a(E e0, a w$a0) {
                this(e0);
            }

            private com.google.crypto.tink.w.b.a(o o0) {
                this.b = s.b;
                this.e = null;
                this.f = null;
                this.c = o0;
                this.d = null;
            }

            com.google.crypto.tink.w.b.a(o o0, a w$a0) {
                this(o0);
            }

            public s i() {
                return this.b;
            }

            public boolean j() {
                return this.a;
            }

            @O1.a
            public com.google.crypto.tink.w.b.a k() {
                b w$b0 = this.f;
                if(w$b0 != null) {
                    w$b0.e();
                }
                this.a = true;
                return this;
            }

            @O1.a
            public com.google.crypto.tink.w.b.a l(s s0) {
                this.b = s0;
                return this;
            }

            @O1.a
            public com.google.crypto.tink.w.b.a m(int v) {
                this.e = com.google.crypto.tink.w.b.b.e(v);
                return this;
            }

            @O1.a
            public com.google.crypto.tink.w.b.a n() {
                this.e = com.google.crypto.tink.w.b.b.g();
                return this;
            }
        }

        static class com.google.crypto.tink.w.b.b {
            private final int a;
            private static final com.google.crypto.tink.w.b.b b;

            static {
                com.google.crypto.tink.w.b.b.b = new com.google.crypto.tink.w.b.b();
            }

            private com.google.crypto.tink.w.b.b() {
                this.a = 0;
            }

            private com.google.crypto.tink.w.b.b(int v) {
                this.a = v;
            }

            private static com.google.crypto.tink.w.b.b e(int v) {
                return new com.google.crypto.tink.w.b.b(v);
            }

            private int f() {
                return this.a;
            }

            private static com.google.crypto.tink.w.b.b g() {
                return com.google.crypto.tink.w.b.b.b;
            }
        }

        private final List a;

        public b() {
            this.a = new ArrayList();
        }

        @O1.a
        public b b(com.google.crypto.tink.w.b.a w$b$a0) {
            if(w$b$a0.f != null) {
                throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
            }
            if(w$b$a0.a) {
                this.e();
            }
            w$b$a0.f = this;
            this.a.add(w$b$a0);
            return this;
        }

        public w c() throws GeneralSecurityException {
            com.google.crypto.tink.proto.r2.b r2$b0 = r2.V2();
            b.d(this.a);
            HashSet hashSet0 = new HashSet();
            Integer integer0 = null;
            for(Object object0: this.a) {
                if(((com.google.crypto.tink.w.b.a)object0).b == null) {
                    throw new GeneralSecurityException("Key Status not set.");
                }
                int v = b.j(((com.google.crypto.tink.w.b.a)object0), hashSet0);
                if(hashSet0.contains(v)) {
                    throw new GeneralSecurityException("Id " + v + " is used twice in the keyset");
                }
                hashSet0.add(v);
                r2$b0.U1(b.g(((com.google.crypto.tink.w.b.a)object0), v));
                if(((com.google.crypto.tink.w.b.a)object0).a) {
                    if(integer0 != null) {
                        throw new GeneralSecurityException("Two primaries were set");
                    }
                    integer0 = v;
                }
            }
            if(integer0 == null) {
                throw new GeneralSecurityException("No primary was set");
            }
            r2$b0.a2(((int)integer0));
            return w.k(((r2)r2$b0.B1()));
        }

        private static void d(List list0) throws GeneralSecurityException {
            for(int v = 0; v < list0.size() - 1; ++v) {
                if(((com.google.crypto.tink.w.b.a)list0.get(v)).e == com.google.crypto.tink.w.b.b.b && ((com.google.crypto.tink.w.b.a)list0.get(v + 1)).e != com.google.crypto.tink.w.b.b.b) {
                    throw new GeneralSecurityException("Entries with \'withRandomId()\' may only be followed by other entries with \'withRandomId()\'.");
                }
            }
        }

        private void e() {
            for(Object object0: this.a) {
                ((com.google.crypto.tink.w.b.a)object0).a = false;
            }
        }

        private static c f(E e0, int v, m2 m20) throws GeneralSecurityException {
            v v1 = e0 instanceof j ? ((j)e0).b() : ((v)n.a().o(e0, v.class));
            k2 k20 = O.y(v1.d());
            return (c)c.V2().X1(v).a2(m20).W1(k20).Y1(v1.d().y()).B1();
        }

        private static c g(com.google.crypto.tink.w.b.a w$b$a0, int v) throws GeneralSecurityException {
            u u0;
            if(w$b$a0.c == null) {
                return b.f(w$b$a0.d, v, w.K(w$b$a0.i()));
            }
            if(w$b$a0.c instanceof i) {
                u0 = ((i)w$b$a0.c).d(l.a());
            }
            else {
                P p0 = l.a();
                u0 = (u)n.a().n(w$b$a0.c, u.class, p0);
            }
            Integer integer0 = u0.c();
            if(integer0 != null && ((int)integer0) != v) {
                throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
            }
            return w.M(v, w.K(w$b$a0.i()), u0);
        }

        @O1.a
        public b h(int v) {
            this.a.remove(v);
            return this;
        }

        public com.google.crypto.tink.w.b.a i(int v) {
            return (com.google.crypto.tink.w.b.a)this.a.get(v);
        }

        private static int j(com.google.crypto.tink.w.b.a w$b$a0, Set set0) throws GeneralSecurityException {
            if(w$b$a0.e == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            return w$b$a0.e == com.google.crypto.tink.w.b.b.b ? b.k(set0) : w$b$a0.e.f();
        }

        private static int k(Set set0) {
            int v;
            for(v = 0; v == 0 || set0.contains(v); v = z.c()) {
            }
            return v;
        }

        @O1.a
        @Deprecated
        public com.google.crypto.tink.w.b.a l(int v) {
            return (com.google.crypto.tink.w.b.a)this.a.remove(v);
        }

        public int m() {
            return this.a.size();
        }
    }

    @L1.a
    @O1.j
    public static final class com.google.crypto.tink.w.c {
        private final o a;
        private final s b;
        private final int c;
        private final boolean d;

        private com.google.crypto.tink.w.c(o o0, s s0, int v, boolean z) {
            this.a = o0;
            this.b = s0;
            this.c = v;
            this.d = z;
        }

        com.google.crypto.tink.w.c(o o0, s s0, int v, boolean z, a w$a0) {
            this(o0, s0, v, z);
        }

        public int a() {
            return this.c;
        }

        public o b() {
            return this.a;
        }

        public s c() {
            return this.b;
        }

        public boolean d() {
            return this.d;
        }
    }

    private final r2 a;
    private final List b;
    private final com.google.crypto.tink.monitoring.a c;

    private w(r2 r20, List list0) {
        this.a = r20;
        this.b = list0;
        this.c = com.google.crypto.tink.monitoring.a.b;
    }

    private w(r2 r20, List list0, com.google.crypto.tink.monitoring.a a0) {
        this.a = r20;
        this.b = list0;
        this.c = a0;
    }

    public w A() throws GeneralSecurityException {
        if(this.a == null) {
            throw new GeneralSecurityException("cleartext keyset is not available");
        }
        com.google.crypto.tink.proto.r2.b r2$b0 = r2.V2();
        for(Object object0: this.a.R0()) {
            k2 k20 = w.g(((c)object0).Z0());
            r2$b0.U1(((c)((com.google.crypto.tink.proto.r2.c.a)((c)object0).C2()).W1(k20).B1()));
        }
        r2$b0.a2(this.a.M());
        return w.k(((r2)r2$b0.B1()));
    }

    public static com.google.crypto.tink.w.b.a B(o o0) {
        com.google.crypto.tink.w.b.a w$b$a0 = new com.google.crypto.tink.w.b.a(o0, null);
        Integer integer0 = o0.b();
        if(integer0 != null) {
            w$b$a0.m(((int)integer0));
        }
        return w$b$a0;
    }

    public static b C() {
        return new b();
    }

    public static b D(w w0) {
        b w$b0 = new b();
        for(int v = 0; v < w0.L(); ++v) {
            com.google.crypto.tink.w.c w$c0 = w0.j(v);
            com.google.crypto.tink.w.b.a w$b$a0 = w.B(w$c0.b()).m(w$c0.a());
            w$b$a0.l(w$c0.c());
            if(w$c0.d()) {
                w$b$a0.k();
            }
            w$b0.b(w$b$a0);
        }
        return w$b0;
    }

    private static s E(m2 m20) throws GeneralSecurityException {
        switch(m20) {
            case 1: {
                return s.b;
            }
            case 2: {
                return s.c;
            }
            case 3: {
                return s.d;
            }
            default: {
                throw new GeneralSecurityException("Unknown key status");
            }
        }
    }

    @Deprecated
    public com.google.crypto.tink.tinkkey.b F() throws GeneralSecurityException {
        int v = this.a.M();
        for(Object object0: this.a.R0()) {
            c r2$c0 = (c)object0;
            if(r2$c0.H() == v) {
                return new N1.a(new N1.b(r2$c0.Z0(), t.b(r2$c0.y())), r2$c0.getStatus(), r2$c0.H());
            }
            if(false) {
                break;
            }
        }
        throw new GeneralSecurityException("No primary key found in keyset.");
    }

    public static final w G(y y0, com.google.crypto.tink.b b0) throws GeneralSecurityException, IOException {
        return w.J(y0, b0, new byte[0]);
    }

    public static final w H(y y0) throws GeneralSecurityException, IOException {
        try {
            r2 r20 = y0.read();
            w.e(r20);
            return w.k(r20);
        }
        catch(y0 unused_ex) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    @Deprecated
    public static final w I(byte[] arr_b) throws GeneralSecurityException {
        try {
            r2 r20 = r2.j3(arr_b, V.d());
            w.e(r20);
            return w.k(r20);
        }
        catch(y0 unused_ex) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    public static final w J(y y0, com.google.crypto.tink.b b0, byte[] arr_b) throws GeneralSecurityException, IOException {
        W0 w00 = y0.a();
        w.c(w00);
        return w.k(w.h(w00, b0, arr_b));
    }

    private static m2 K(s s0) {
        if(s.b.equals(s0)) {
            return m2.c;
        }
        if(s.c.equals(s0)) {
            return m2.d;
        }
        if(!s.d.equals(s0)) {
            throw new IllegalStateException("Unknown key status");
        }
        return m2.e;
    }

    public int L() {
        return this.a.l0();
    }

    private static c M(int v, m2 m20, u u0) {
        return (c)c.V2().V1(k2.Q2().V1(u0.f()).X1(u0.g()).T1(u0.d())).a2(m20).X1(v).Y1(u0.e()).B1();
    }

    private static u N(c r2$c0) {
        Integer integer0 = r2$c0.y() == F2.e ? null : r2$c0.H();
        try {
            return u.b(r2$c0.Z0().getTypeUrl(), r2$c0.Z0().getValue(), r2$c0.Z0().E0(), r2$c0.y(), integer0);
        }
        catch(GeneralSecurityException generalSecurityException0) {
            throw new com.google.crypto.tink.internal.y("Creating a protokey serialization failed", generalSecurityException0);
        }
    }

    private static void O(k2 k20) throws GeneralSecurityException {
        O.j(k20);
    }

    public void P(com.google.crypto.tink.z z0, com.google.crypto.tink.b b0) throws GeneralSecurityException, IOException {
        this.R(z0, b0, new byte[0]);
    }

    public void Q(com.google.crypto.tink.z z0) throws GeneralSecurityException, IOException {
        w.e(this.a);
        z0.a(this.a);
    }

    public void R(com.google.crypto.tink.z z0, com.google.crypto.tink.b b0, byte[] arr_b) throws GeneralSecurityException, IOException {
        z0.b(w.i(this.a, b0, arr_b));
    }

    private static void c(W0 w00) throws GeneralSecurityException {
        if(w00 == null || w00.h0().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static void d(r2 r20) throws GeneralSecurityException {
        if(r20 == null || r20.l0() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static void e(r2 r20) throws GeneralSecurityException {
        for(Object object0: r20.R0()) {
            c r2$c0 = (c)object0;
            if(r2$c0.Z0().E0() == com.google.crypto.tink.proto.k2.c.b || r2$c0.Z0().E0() == com.google.crypto.tink.proto.k2.c.c || r2$c0.Z0().E0() == com.google.crypto.tink.proto.k2.c.d) {
                throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", r2$c0.Z0().E0().name(), r2$c0.Z0().getTypeUrl()));
            }
            if(false) {
                break;
            }
        }
    }

    @Deprecated
    public static final w f(com.google.crypto.tink.tinkkey.b b0, com.google.crypto.tink.tinkkey.a a0) throws GeneralSecurityException {
        x x0 = x.r().c(b0);
        x0.q(x0.k().v().U0(0).H());
        return x0.k();
    }

    private static k2 g(k2 k20) throws GeneralSecurityException {
        if(k20.E0() != com.google.crypto.tink.proto.k2.c.d) {
            throw new GeneralSecurityException("The keyset contains a non-private key");
        }
        k2 k21 = O.r(k20.getTypeUrl(), k20.getValue());
        w.O(k21);
        return k21;
    }

    private static r2 h(W0 w00, com.google.crypto.tink.b b0, byte[] arr_b) throws GeneralSecurityException {
        try {
            r2 r20 = r2.j3(b0.b(w00.h0().a0(), arr_b), V.d());
            w.d(r20);
            return r20;
        }
        catch(y0 unused_ex) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static W0 i(r2 r20, com.google.crypto.tink.b b0, byte[] arr_b) throws GeneralSecurityException {
        byte[] arr_b1 = b0.a(r20.toByteArray(), arr_b);
        try {
            if(!r2.j3(b0.b(arr_b1, arr_b), V.d()).equals(r20)) {
                throw new GeneralSecurityException("cannot encrypt keyset");
            }
        }
        catch(y0 unused_ex) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
        return (W0)W0.N2().T1(com.google.crypto.tink.shaded.protobuf.u.p(arr_b1)).V1(U.b(r20)).B1();
    }

    private com.google.crypto.tink.w.c j(int v) {
        if(this.b.get(v) == null) {
            throw new IllegalStateException("Keyset-Entry at position i has wrong status or key parsing failed");
        }
        return (com.google.crypto.tink.w.c)this.b.get(v);
    }

    static final w k(r2 r20) throws GeneralSecurityException {
        w.d(r20);
        return new w(r20, w.r(r20));
    }

    static final w l(r2 r20, com.google.crypto.tink.monitoring.a a0) throws GeneralSecurityException {
        w.d(r20);
        return new w(r20, w.r(r20), a0);
    }

    public static com.google.crypto.tink.w.b.a m(E e0) {
        return new com.google.crypto.tink.w.b.a(e0, null);
    }

    public static com.google.crypto.tink.w.b.a n(String s) throws GeneralSecurityException {
        if(!O.t().containsKey(s)) {
            throw new GeneralSecurityException("cannot find key template: " + s);
        }
        return new com.google.crypto.tink.w.b.a(n.a().i(v.b(((t)O.t().get(s)).d())), null);
    }

    public static final w o(t t0) throws GeneralSecurityException {
        j j0 = new j(v.b(t0.d()));
        return w.C().b(w.m(j0).k().n()).c();
    }

    @Deprecated
    public static final w p(n2 n20) throws GeneralSecurityException {
        j j0 = new j(v.b(n20));
        return w.C().b(w.m(j0).k().n()).c();
    }

    public com.google.crypto.tink.w.c q(int v) {
        if(v < 0 || v >= this.L()) {
            throw new IndexOutOfBoundsException("Invalid index " + v + " for keyset of size " + this.L());
        }
        return this.j(v);
    }

    private static List r(r2 r20) {
        ArrayList arrayList0 = new ArrayList(r20.l0());
        for(Object object0: r20.R0()) {
            c r2$c0 = (c)object0;
            int v = r2$c0.H();
            u u0 = w.N(r2$c0);
            try {
                arrayList0.add(new com.google.crypto.tink.w.c(n.a().g(u0, l.a()), w.E(r2$c0.getStatus()), v, v == r20.M(), null));
            }
            catch(GeneralSecurityException unused_ex) {
                arrayList0.add(null);
            }
        }
        return DesugarCollections.unmodifiableList(arrayList0);
    }

    @h
    private Object s(o o0, Class class0) throws GeneralSecurityException {
        try {
            return O.f(o0, class0);
        }
        catch(GeneralSecurityException unused_ex) {
            return null;
        }
    }

    @Deprecated
    public List t() {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.a.R0()) {
            arrayList0.add(new N1.a(new N1.b(((c)object0).Z0(), t.b(((c)object0).y())), ((c)object0).getStatus(), ((c)object0).H()));
        }
        return DesugarCollections.unmodifiableList(arrayList0);
    }

    @Override
    public String toString() {
        return this.v().toString();
    }

    r2 u() {
        return this.a;
    }

    public s2 v() {
        return U.b(this.a);
    }

    @h
    private static Object w(c r2$c0, Class class0) throws GeneralSecurityException {
        try {
            return O.k(r2$c0.Z0(), class0);
        }
        catch(GeneralSecurityException generalSecurityException0) {
            if(!generalSecurityException0.getMessage().contains("No key manager found for key type ") && !generalSecurityException0.getMessage().contains(" not supported by key manager of type ")) {
                throw generalSecurityException0;
            }
            return null;
        }
    }

    public com.google.crypto.tink.w.c x() {
        for(int v = 0; v < this.a.l0(); ++v) {
            if(this.a.D(v).H() == this.a.M()) {
                com.google.crypto.tink.w.c w$c0 = this.j(v);
                if(w$c0.c() != s.b) {
                    throw new IllegalStateException("Keyset has primary which isn\'t enabled");
                }
                return w$c0;
            }
        }
        throw new IllegalStateException("Keyset has no primary");
    }

    public Object y(Class class0) throws GeneralSecurityException {
        Class class1 = O.g(class0);
        if(class1 == null) {
            throw new GeneralSecurityException("No wrapper found for " + class0.getName());
        }
        return this.z(class0, class1);
    }

    private Object z(Class class0, Class class1) throws GeneralSecurityException {
        U.e(this.a);
        com.google.crypto.tink.G.b g$b0 = G.k(class1);
        g$b0.g(this.c);
        for(int v = 0; v < this.L(); ++v) {
            c r2$c0 = this.a.D(v);
            if(r2$c0.getStatus().equals(m2.c)) {
                Object object0 = w.w(r2$c0, class1);
                Object object1 = this.b.get(v) == null ? null : this.s(((com.google.crypto.tink.w.c)this.b.get(v)).b(), class1);
                if(r2$c0.H() == this.a.M()) {
                    g$b0.b(object1, object0, r2$c0);
                }
                else {
                    g$b0.a(object1, object0, r2$c0);
                }
            }
        }
        return O.L(g$b0.f(), class0);
    }
}

