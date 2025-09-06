package com.vungle.ads.internal.model;

import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import kotlinx.serialization.E;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.i;
import kotlinx.serialization.internal.H0;
import kotlinx.serialization.internal.M;
import kotlinx.serialization.internal.N0;
import kotlinx.serialization.internal.w0;
import kotlinx.serialization.u;
import z3.n;

@u
public final class l {
    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public static final class a implements M {
        @y4.l
        public static final a INSTANCE;
        public static final f descriptor;

        static {
            a l$a0 = new a();
            a.INSTANCE = l$a0;
            w0 w00 = new w0("com.vungle.ads.internal.model.OmSdkData", l$a0, 3);
            w00.k("params", true);
            w00.k("vendorKey", true);
            w00.k("vendorURL", true);
            a.descriptor = w00;
        }

        @Override  // kotlinx.serialization.internal.M
        @y4.l
        public i[] childSerializers() {
            return new i[]{P3.a.u(N0.a), P3.a.u(N0.a), P3.a.u(N0.a)};
        }

        @y4.l
        public l deserialize(@y4.l e e0) {
            int v;
            Object object4;
            Object object3;
            Object object1;
            L.p(e0, "decoder");
            f f0 = this.getDescriptor();
            c c0 = e0.b(f0);
            Object object0 = null;
            if(c0.k()) {
                object1 = c0.j(f0, 0, N0.a, null);
                Object object2 = c0.j(f0, 1, N0.a, null);
                object3 = c0.j(f0, 2, N0.a, null);
                object4 = object2;
                v = 7;
            }
            else {
                object4 = null;
                Object object5 = null;
                int v1 = 0;
                boolean z = true;
                while(z) {
                    int v2 = c0.w(f0);
                    switch(v2) {
                        case -1: {
                            z = false;
                            break;
                        }
                        case 0: {
                            object0 = c0.j(f0, 0, N0.a, object0);
                            v1 |= 1;
                            break;
                        }
                        case 1: {
                            object4 = c0.j(f0, 1, N0.a, object4);
                            v1 |= 2;
                            break;
                        }
                        case 2: {
                            object5 = c0.j(f0, 2, N0.a, object5);
                            v1 |= 4;
                            break;
                        }
                        default: {
                            throw new E(v2);
                        }
                    }
                }
                v = v1;
                object1 = object0;
                object3 = object5;
            }
            c0.c(f0);
            return new l(v, ((String)object1), ((String)object4), ((String)object3), null);
        }

        @Override  // kotlinx.serialization.d
        public Object deserialize(e e0) {
            return this.deserialize(e0);
        }

        @Override  // kotlinx.serialization.i
        @y4.l
        public f getDescriptor() {
            return a.descriptor;
        }

        public void serialize(@y4.l g g0, @y4.l l l0) {
            L.p(g0, "encoder");
            L.p(l0, "value");
            f f0 = this.getDescriptor();
            d d0 = g0.b(f0);
            l.write$Self(l0, d0, f0);
            d0.c(f0);
        }

        @Override  // kotlinx.serialization.w
        public void serialize(g g0, Object object0) {
            this.serialize(g0, ((l)object0));
        }

        @Override  // kotlinx.serialization.internal.M
        @y4.l
        public i[] typeParametersSerializers() {
            return kotlinx.serialization.internal.M.a.a(this);
        }
    }

    public static final class b {
        private b() {
        }

        public b(w w0) {
        }

        @y4.l
        public final i serializer() {
            return a.INSTANCE;
        }
    }

    @y4.l
    public static final b Companion;
    @y4.m
    private final String params;
    @y4.m
    private final String vendorKey;
    @y4.m
    private final String vendorURL;

    static {
        l.Companion = new b(null);
    }

    public l() {
        this(null, null, null, 7, null);
    }

    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public l(int v, String s, String s1, String s2, H0 h00) {
        this.params = (v & 1) == 0 ? null : s;
        this.vendorKey = (v & 2) == 0 ? null : s1;
        if((v & 4) == 0) {
            this.vendorURL = null;
            return;
        }
        this.vendorURL = s2;
    }

    public l(@y4.m String s, @y4.m String s1, @y4.m String s2) {
        this.params = s;
        this.vendorKey = s1;
        this.vendorURL = s2;
    }

    public l(String s, String s1, String s2, int v, w w0) {
        if((v & 1) != 0) {
            s = null;
        }
        if((v & 2) != 0) {
            s1 = null;
        }
        if((v & 4) != 0) {
            s2 = null;
        }
        this(s, s1, s2);
    }

    @y4.m
    public final String component1() {
        return this.params;
    }

    @y4.m
    public final String component2() {
        return this.vendorKey;
    }

    @y4.m
    public final String component3() {
        return this.vendorURL;
    }

    @y4.l
    public final l copy(@y4.m String s, @y4.m String s1, @y4.m String s2) {
        return new l(s, s1, s2);
    }

    public static l copy$default(l l0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = l0.params;
        }
        if((v & 2) != 0) {
            s1 = l0.vendorKey;
        }
        if((v & 4) != 0) {
            s2 = l0.vendorURL;
        }
        return l0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(@y4.m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof l)) {
            return false;
        }
        if(!L.g(this.params, ((l)object0).params)) {
            return false;
        }
        return L.g(this.vendorKey, ((l)object0).vendorKey) ? L.g(this.vendorURL, ((l)object0).vendorURL) : false;
    }

    @y4.m
    public final String getParams() {
        return this.params;
    }

    @y4.m
    public final String getVendorKey() {
        return this.vendorKey;
    }

    @y4.m
    public final String getVendorURL() {
        return this.vendorURL;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.params == null ? 0 : this.params.hashCode();
        int v2 = this.vendorKey == null ? 0 : this.vendorKey.hashCode();
        String s = this.vendorURL;
        if(s != null) {
            v = s.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    @y4.l
    public String toString() {
        return "OmSdkData(params=" + this.params + ", vendorKey=" + this.vendorKey + ", vendorURL=" + this.vendorURL + ')';
    }

    @n
    public static final void write$Self(@y4.l l l0, @y4.l d d0, @y4.l f f0) {
        L.p(l0, "self");
        L.p(d0, "output");
        L.p(f0, "serialDesc");
        if(d0.q(f0, 0) || l0.params != null) {
            d0.y(f0, 0, N0.a, l0.params);
        }
        if(d0.q(f0, 1) || l0.vendorKey != null) {
            d0.y(f0, 1, N0.a, l0.vendorKey);
        }
        if(d0.q(f0, 2) || l0.vendorURL != null) {
            d0.y(f0, 2, N0.a, l0.vendorURL);
        }
    }
}

