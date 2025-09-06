package com.vungle.ads.internal.model;

import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import kotlinx.serialization.E;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.i;
import kotlinx.serialization.internal.H0;
import kotlinx.serialization.internal.M;
import kotlinx.serialization.internal.N0;
import kotlinx.serialization.internal.v0;
import kotlinx.serialization.internal.w0;
import kotlinx.serialization.t;
import kotlinx.serialization.u;
import y4.l;
import z3.n;

@u
public final class d {
    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public static final class a implements M {
        @l
        public static final a INSTANCE;
        public static final f descriptor;

        static {
            a d$a0 = new a();
            a.INSTANCE = d$a0;
            w0 w00 = new w0("com.vungle.ads.internal.model.AppNode", d$a0, 3);
            w00.k("bundle", false);
            w00.k("ver", false);
            w00.k("id", false);
            a.descriptor = w00;
        }

        @Override  // kotlinx.serialization.internal.M
        @l
        public i[] childSerializers() {
            return new i[]{N0.a, N0.a, N0.a};
        }

        @l
        public d deserialize(@l e e0) {
            int v;
            String s4;
            String s3;
            String s2;
            L.p(e0, "decoder");
            f f0 = this.getDescriptor();
            c c0 = e0.b(f0);
            if(c0.k()) {
                String s = c0.i(f0, 0);
                String s1 = c0.i(f0, 1);
                s2 = s;
                s3 = c0.i(f0, 2);
                s4 = s1;
                v = 7;
            }
            else {
                String s5 = null;
                String s6 = null;
                String s7 = null;
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
                            s5 = c0.i(f0, 0);
                            v1 |= 1;
                            break;
                        }
                        case 1: {
                            s7 = c0.i(f0, 1);
                            v1 |= 2;
                            break;
                        }
                        case 2: {
                            s6 = c0.i(f0, 2);
                            v1 |= 4;
                            break;
                        }
                        default: {
                            throw new E(v2);
                        }
                    }
                }
                s2 = s5;
                s3 = s6;
                s4 = s7;
                v = v1;
            }
            c0.c(f0);
            return new d(v, s2, s4, s3, null);
        }

        @Override  // kotlinx.serialization.d
        public Object deserialize(e e0) {
            return this.deserialize(e0);
        }

        @Override  // kotlinx.serialization.i
        @l
        public f getDescriptor() {
            return a.descriptor;
        }

        public void serialize(@l g g0, @l d d0) {
            L.p(g0, "encoder");
            L.p(d0, "value");
            f f0 = this.getDescriptor();
            kotlinx.serialization.encoding.d d1 = g0.b(f0);
            d.write$Self(d0, d1, f0);
            d1.c(f0);
        }

        @Override  // kotlinx.serialization.w
        public void serialize(g g0, Object object0) {
            this.serialize(g0, ((d)object0));
        }

        @Override  // kotlinx.serialization.internal.M
        @l
        public i[] typeParametersSerializers() {
            return kotlinx.serialization.internal.M.a.a(this);
        }
    }

    public static final class b {
        private b() {
        }

        public b(w w0) {
        }

        @l
        public final i serializer() {
            return a.INSTANCE;
        }
    }

    @l
    public static final b Companion;
    @l
    private final String appId;
    @l
    private final String bundle;
    @l
    private final String ver;

    static {
        d.Companion = new b(null);
    }

    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public d(int v, String s, String s1, @t("id") String s2, H0 h00) {
        if(7 != (v & 7)) {
            v0.b(v, 7, a.INSTANCE.getDescriptor());
        }
        super();
        this.bundle = s;
        this.ver = s1;
        this.appId = s2;
    }

    public d(@l String s, @l String s1, @l String s2) {
        L.p(s, "bundle");
        L.p(s1, "ver");
        L.p(s2, "appId");
        super();
        this.bundle = s;
        this.ver = s1;
        this.appId = s2;
    }

    @l
    public final String component1() {
        return this.bundle;
    }

    @l
    public final String component2() {
        return this.ver;
    }

    @l
    public final String component3() {
        return this.appId;
    }

    @l
    public final d copy(@l String s, @l String s1, @l String s2) {
        L.p(s, "bundle");
        L.p(s1, "ver");
        L.p(s2, "appId");
        return new d(s, s1, s2);
    }

    public static d copy$default(d d0, String s, String s1, String s2, int v, Object object0) {
        if((v & 1) != 0) {
            s = d0.bundle;
        }
        if((v & 2) != 0) {
            s1 = d0.ver;
        }
        if((v & 4) != 0) {
            s2 = d0.appId;
        }
        return d0.copy(s, s1, s2);
    }

    @Override
    public boolean equals(@y4.m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof d)) {
            return false;
        }
        if(!L.g(this.bundle, ((d)object0).bundle)) {
            return false;
        }
        return L.g(this.ver, ((d)object0).ver) ? L.g(this.appId, ((d)object0).appId) : false;
    }

    @l
    public final String getAppId() {
        return this.appId;
    }

    @t("id")
    public static void getAppId$annotations() {
    }

    @l
    public final String getBundle() {
        return this.bundle;
    }

    @l
    public final String getVer() {
        return this.ver;
    }

    @Override
    public int hashCode() {
        return (this.bundle.hashCode() * 0x1F + this.ver.hashCode()) * 0x1F + this.appId.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "AppNode(bundle=" + this.bundle + ", ver=" + this.ver + ", appId=" + this.appId + ')';
    }

    @n
    public static final void write$Self(@l d d0, @l kotlinx.serialization.encoding.d d1, @l f f0) {
        L.p(d0, "self");
        L.p(d1, "output");
        L.p(f0, "serialDesc");
        d1.p(f0, 0, d0.bundle);
        d1.p(f0, 1, d0.ver);
        d1.p(f0, 2, d0.appId);
    }
}

