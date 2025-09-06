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
import kotlinx.serialization.i;
import kotlinx.serialization.internal.H0;
import kotlinx.serialization.internal.M;
import kotlinx.serialization.internal.N0;
import kotlinx.serialization.internal.w0;
import kotlinx.serialization.t;
import kotlinx.serialization.u;
import y4.l;
import z3.n;

@u
public final class g {
    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public static final class a implements M {
        @l
        public static final a INSTANCE;
        public static final f descriptor;

        static {
            a g$a0 = new a();
            a.INSTANCE = g$a0;
            w0 w00 = new w0("com.vungle.ads.internal.model.ConfigExtension", g$a0, 2);
            w00.k("need_refresh", true);
            w00.k("config_extension", true);
            a.descriptor = w00;
        }

        @Override  // kotlinx.serialization.internal.M
        @l
        public i[] childSerializers() {
            return new i[]{P3.a.u(kotlinx.serialization.internal.i.a), P3.a.u(N0.a)};
        }

        @l
        public g deserialize(@l e e0) {
            int v;
            Object object1;
            Object object0;
            L.p(e0, "decoder");
            f f0 = this.getDescriptor();
            c c0 = e0.b(f0);
            if(c0.k()) {
                object0 = c0.j(f0, 0, kotlinx.serialization.internal.i.a, null);
                object1 = c0.j(f0, 1, N0.a, null);
                v = 3;
            }
            else {
                object0 = null;
                Object object2 = null;
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
                            object0 = c0.j(f0, 0, kotlinx.serialization.internal.i.a, object0);
                            v1 |= 1;
                            break;
                        }
                        case 1: {
                            object2 = c0.j(f0, 1, N0.a, object2);
                            v1 |= 2;
                            break;
                        }
                        default: {
                            throw new E(v2);
                        }
                    }
                }
                object1 = object2;
                v = v1;
            }
            c0.c(f0);
            return new g(v, ((Boolean)object0), ((String)object1), null);
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

        public void serialize(@l kotlinx.serialization.encoding.g g0, @l g g1) {
            L.p(g0, "encoder");
            L.p(g1, "value");
            f f0 = this.getDescriptor();
            d d0 = g0.b(f0);
            g.write$Self(g1, d0, f0);
            d0.c(f0);
        }

        @Override  // kotlinx.serialization.w
        public void serialize(kotlinx.serialization.encoding.g g0, Object object0) {
            this.serialize(g0, ((g)object0));
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
    private final String configExt;
    @y4.m
    private final Boolean needRefresh;

    static {
        g.Companion = new b(null);
    }

    public g() {
        this(null, null, 3, null);
    }

    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public g(int v, @t("need_refresh") Boolean boolean0, @t("config_extension") String s, H0 h00) {
        this.needRefresh = (v & 1) == 0 ? null : boolean0;
        if((v & 2) == 0) {
            this.configExt = null;
            return;
        }
        this.configExt = s;
    }

    public g(@y4.m Boolean boolean0, @y4.m String s) {
        this.needRefresh = boolean0;
        this.configExt = s;
    }

    public g(Boolean boolean0, String s, int v, w w0) {
        if((v & 1) != 0) {
            boolean0 = null;
        }
        if((v & 2) != 0) {
            s = null;
        }
        this(boolean0, s);
    }

    @y4.m
    public final Boolean component1() {
        return this.needRefresh;
    }

    @y4.m
    public final String component2() {
        return this.configExt;
    }

    @l
    public final g copy(@y4.m Boolean boolean0, @y4.m String s) {
        return new g(boolean0, s);
    }

    public static g copy$default(g g0, Boolean boolean0, String s, int v, Object object0) {
        if((v & 1) != 0) {
            boolean0 = g0.needRefresh;
        }
        if((v & 2) != 0) {
            s = g0.configExt;
        }
        return g0.copy(boolean0, s);
    }

    @Override
    public boolean equals(@y4.m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof g)) {
            return false;
        }
        return L.g(this.needRefresh, ((g)object0).needRefresh) ? L.g(this.configExt, ((g)object0).configExt) : false;
    }

    @y4.m
    public final String getConfigExt() {
        return this.configExt;
    }

    @t("config_extension")
    public static void getConfigExt$annotations() {
    }

    @y4.m
    public final Boolean getNeedRefresh() {
        return this.needRefresh;
    }

    @t("need_refresh")
    public static void getNeedRefresh$annotations() {
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.needRefresh == null ? 0 : this.needRefresh.hashCode();
        String s = this.configExt;
        if(s != null) {
            v = s.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    @l
    public String toString() {
        return "ConfigExtension(needRefresh=" + this.needRefresh + ", configExt=" + this.configExt + ')';
    }

    @n
    public static final void write$Self(@l g g0, @l d d0, @l f f0) {
        L.p(g0, "self");
        L.p(d0, "output");
        L.p(f0, "serialDesc");
        if(d0.q(f0, 0) || g0.needRefresh != null) {
            d0.y(f0, 0, kotlinx.serialization.internal.i.a, g0.needRefresh);
        }
        if(d0.q(f0, 1) || g0.configExt != null) {
            d0.y(f0, 1, N0.a, g0.configExt);
        }
    }
}

