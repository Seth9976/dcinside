package com.vungle.ads.internal.network;

import java.util.Map;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import kotlinx.serialization.E;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.i;
import kotlinx.serialization.internal.H0;
import kotlinx.serialization.internal.M;
import kotlinx.serialization.internal.N0;
import kotlinx.serialization.internal.W;
import kotlinx.serialization.internal.b0;
import kotlinx.serialization.internal.w0;
import kotlinx.serialization.u;
import y4.l;
import z3.n;

@u
public final class c {
    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public static final class a implements M {
        @l
        public static final a INSTANCE;
        public static final f descriptor;

        static {
            a c$a0 = new a();
            a.INSTANCE = c$a0;
            w0 w00 = new w0("com.vungle.ads.internal.network.GenericTpatRequest", c$a0, 4);
            w00.k("method", true);
            w00.k("headers", true);
            w00.k("body", true);
            w00.k("attempt", true);
            a.descriptor = w00;
        }

        @Override  // kotlinx.serialization.internal.M
        @l
        public i[] childSerializers() {
            i i0 = P3.a.u(new b0(N0.a, N0.a));
            i i1 = P3.a.u(N0.a);
            return new i[]{com.vungle.ads.internal.network.d.a.INSTANCE, i0, i1, W.a};
        }

        @l
        public c deserialize(@l e e0) {
            int v1;
            Object object3;
            int v;
            Object object1;
            Object object0;
            L.p(e0, "decoder");
            f f0 = this.getDescriptor();
            kotlinx.serialization.encoding.c c0 = e0.b(f0);
            if(c0.k()) {
                object0 = c0.p(f0, 0, com.vungle.ads.internal.network.d.a.INSTANCE, null);
                object1 = c0.j(f0, 1, new b0(N0.a, N0.a), null);
                Object object2 = c0.j(f0, 2, N0.a, null);
                v = c0.f(f0, 3);
                object3 = object2;
                v1 = 15;
            }
            else {
                Object object4 = null;
                Object object5 = null;
                object3 = null;
                int v2 = 0;
                int v3 = 0;
                boolean z = true;
                while(z) {
                    int v4 = c0.w(f0);
                    switch(v4) {
                        case -1: {
                            z = false;
                            break;
                        }
                        case 0: {
                            object4 = c0.p(f0, 0, com.vungle.ads.internal.network.d.a.INSTANCE, object4);
                            v3 |= 1;
                            break;
                        }
                        case 1: {
                            object5 = c0.j(f0, 1, new b0(N0.a, N0.a), object5);
                            v3 |= 2;
                            break;
                        }
                        case 2: {
                            object3 = c0.j(f0, 2, N0.a, object3);
                            v3 |= 4;
                            break;
                        }
                        case 3: {
                            v2 = c0.f(f0, 3);
                            v3 |= 8;
                            break;
                        }
                        default: {
                            throw new E(v4);
                        }
                    }
                }
                v1 = v3;
                object1 = object5;
                v = v2;
                object0 = object4;
            }
            c0.c(f0);
            return new c(v1, ((d)object0), ((Map)object1), ((String)object3), v, null);
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

        public void serialize(@l g g0, @l c c0) {
            L.p(g0, "encoder");
            L.p(c0, "value");
            f f0 = this.getDescriptor();
            kotlinx.serialization.encoding.d d0 = g0.b(f0);
            c.write$Self(c0, d0, f0);
            d0.c(f0);
        }

        @Override  // kotlinx.serialization.w
        public void serialize(g g0, Object object0) {
            this.serialize(g0, ((c)object0));
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
    private int attempt;
    @y4.m
    private final String body;
    @y4.m
    private final Map headers;
    @l
    private final d method;

    static {
        c.Companion = new b(null);
    }

    public c() {
        this(null, null, null, 0, 15, null);
    }

    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public c(int v, d d0, Map map0, String s, int v1, H0 h00) {
        if((v & 1) == 0) {
            d0 = d.GET;
        }
        this.method = d0;
        this.headers = (v & 2) == 0 ? null : map0;
        this.body = (v & 4) == 0 ? null : s;
        if((v & 8) == 0) {
            this.attempt = 0;
            return;
        }
        this.attempt = v1;
    }

    public c(@l d d0, @y4.m Map map0, @y4.m String s, int v) {
        L.p(d0, "method");
        super();
        this.method = d0;
        this.headers = map0;
        this.body = s;
        this.attempt = v;
    }

    public c(d d0, Map map0, String s, int v, int v1, w w0) {
        if((v1 & 1) != 0) {
            d0 = d.GET;
        }
        if((v1 & 2) != 0) {
            map0 = null;
        }
        if((v1 & 4) != 0) {
            s = null;
        }
        if((v1 & 8) != 0) {
            v = 0;
        }
        this(d0, map0, s, v);
    }

    @l
    public final d component1() {
        return this.method;
    }

    @y4.m
    public final Map component2() {
        return this.headers;
    }

    @y4.m
    public final String component3() {
        return this.body;
    }

    public final int component4() {
        return this.attempt;
    }

    @l
    public final c copy(@l d d0, @y4.m Map map0, @y4.m String s, int v) {
        L.p(d0, "method");
        return new c(d0, map0, s, v);
    }

    public static c copy$default(c c0, d d0, Map map0, String s, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            d0 = c0.method;
        }
        if((v1 & 2) != 0) {
            map0 = c0.headers;
        }
        if((v1 & 4) != 0) {
            s = c0.body;
        }
        if((v1 & 8) != 0) {
            v = c0.attempt;
        }
        return c0.copy(d0, map0, s, v);
    }

    @Override
    public boolean equals(@y4.m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof c)) {
            return false;
        }
        if(this.method != ((c)object0).method) {
            return false;
        }
        if(!L.g(this.headers, ((c)object0).headers)) {
            return false;
        }
        return L.g(this.body, ((c)object0).body) ? this.attempt == ((c)object0).attempt : false;
    }

    public final int getAttempt() {
        return this.attempt;
    }

    @y4.m
    public final String getBody() {
        return this.body;
    }

    @y4.m
    public final Map getHeaders() {
        return this.headers;
    }

    @l
    public final d getMethod() {
        return this.method;
    }

    @Override
    public int hashCode() {
        int v = this.method.hashCode();
        int v1 = 0;
        int v2 = this.headers == null ? 0 : this.headers.hashCode();
        String s = this.body;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((v * 0x1F + v2) * 0x1F + v1) * 0x1F + this.attempt;
    }

    public final void setAttempt(int v) {
        this.attempt = v;
    }

    @Override
    @l
    public String toString() {
        return "GenericTpatRequest(method=" + this.method + ", headers=" + this.headers + ", body=" + this.body + ", attempt=" + this.attempt + ')';
    }

    @n
    public static final void write$Self(@l c c0, @l kotlinx.serialization.encoding.d d0, @l f f0) {
        L.p(c0, "self");
        L.p(d0, "output");
        L.p(f0, "serialDesc");
        if(d0.q(f0, 0) || c0.method != d.GET) {
            d0.G(f0, 0, com.vungle.ads.internal.network.d.a.INSTANCE, c0.method);
        }
        if(d0.q(f0, 1) || c0.headers != null) {
            d0.y(f0, 1, new b0(N0.a, N0.a), c0.headers);
        }
        if(d0.q(f0, 2) || c0.body != null) {
            d0.y(f0, 2, N0.a, c0.body);
        }
        if(d0.q(f0, 3) || c0.attempt != 0) {
            d0.n(f0, 3, c0.attempt);
        }
    }
}

