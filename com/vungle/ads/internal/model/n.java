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
import kotlinx.serialization.t;
import kotlinx.serialization.u;
import y4.l;

@u
public final class n {
    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public static final class a implements M {
        @l
        public static final a INSTANCE;
        public static final f descriptor;

        static {
            a n$a0 = new a();
            a.INSTANCE = n$a0;
            w0 w00 = new w0("com.vungle.ads.internal.model.RtbRequest", n$a0, 1);
            w00.k("sdk_user_agent", true);
            a.descriptor = w00;
        }

        @Override  // kotlinx.serialization.internal.M
        @l
        public i[] childSerializers() {
            return new i[]{P3.a.u(N0.a)};
        }

        @l
        public n deserialize(@l e e0) {
            Object object0;
            L.p(e0, "decoder");
            f f0 = this.getDescriptor();
            c c0 = e0.b(f0);
            int v = 1;
            if(c0.k()) {
                object0 = c0.j(f0, 0, N0.a, null);
            }
            else {
                object0 = null;
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
                            v1 = 1;
                            break;
                        }
                        default: {
                            throw new E(v2);
                        }
                    }
                }
                v = v1;
            }
            c0.c(f0);
            return new n(v, ((String)object0), null);
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

        public void serialize(@l g g0, @l n n0) {
            L.p(g0, "encoder");
            L.p(n0, "value");
            f f0 = this.getDescriptor();
            d d0 = g0.b(f0);
            n.write$Self(n0, d0, f0);
            d0.c(f0);
        }

        @Override  // kotlinx.serialization.w
        public void serialize(g g0, Object object0) {
            this.serialize(g0, ((n)object0));
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
    @y4.m
    private final String sdkUserAgent;

    static {
        n.Companion = new b(null);
    }

    public n() {
        this(null, 1, null);
    }

    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public n(int v, @t("sdk_user_agent") String s, H0 h00) {
        if((v & 1) == 0) {
            this.sdkUserAgent = null;
            return;
        }
        this.sdkUserAgent = s;
    }

    public n(@y4.m String s) {
        this.sdkUserAgent = s;
    }

    public n(String s, int v, w w0) {
        if((v & 1) != 0) {
            s = null;
        }
        this(s);
    }

    @y4.m
    public final String component1() {
        return this.sdkUserAgent;
    }

    @l
    public final n copy(@y4.m String s) {
        return new n(s);
    }

    public static n copy$default(n n0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = n0.sdkUserAgent;
        }
        return n0.copy(s);
    }

    @Override
    public boolean equals(@y4.m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof n ? L.g(this.sdkUserAgent, ((n)object0).sdkUserAgent) : false;
    }

    @y4.m
    public final String getSdkUserAgent() {
        return this.sdkUserAgent;
    }

    @t("sdk_user_agent")
    public static void getSdkUserAgent$annotations() {
    }

    @Override
    public int hashCode() {
        return this.sdkUserAgent == null ? 0 : this.sdkUserAgent.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "RtbRequest(sdkUserAgent=" + this.sdkUserAgent + ')';
    }

    @z3.n
    public static final void write$Self(@l n n0, @l d d0, @l f f0) {
        L.p(n0, "self");
        L.p(d0, "output");
        L.p(f0, "serialDesc");
        if(d0.q(f0, 0) || n0.sdkUserAgent != null) {
            d0.y(f0, 0, N0.a, n0.sdkUserAgent);
        }
    }
}

