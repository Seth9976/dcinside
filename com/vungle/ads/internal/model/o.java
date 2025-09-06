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
import kotlinx.serialization.internal.W;
import kotlinx.serialization.internal.v0;
import kotlinx.serialization.internal.w0;
import kotlinx.serialization.t;
import kotlinx.serialization.u;
import y4.l;

@u
public final class o {
    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public static final class a implements M {
        @l
        public static final a INSTANCE;
        public static final f descriptor;

        static {
            a o$a0 = new a();
            a.INSTANCE = o$a0;
            w0 w00 = new w0("com.vungle.ads.internal.model.RtbToken", o$a0, 5);
            w00.k("device", false);
            w00.k("user", true);
            w00.k("ext", true);
            w00.k("request", true);
            w00.k("ordinal_view", false);
            a.descriptor = w00;
        }

        @Override  // kotlinx.serialization.internal.M
        @l
        public i[] childSerializers() {
            i i0 = P3.a.u(com.vungle.ads.internal.model.f.j.a.INSTANCE);
            i i1 = P3.a.u(com.vungle.ads.internal.model.f.h.a.INSTANCE);
            i i2 = P3.a.u(com.vungle.ads.internal.model.n.a.INSTANCE);
            return new i[]{com.vungle.ads.internal.model.j.a.INSTANCE, i0, i1, i2, W.a};
        }

        @l
        public o deserialize(@l e e0) {
            int v1;
            Object object4;
            int v;
            Object object3;
            Object object1;
            Object object0;
            L.p(e0, "decoder");
            f f0 = this.getDescriptor();
            c c0 = e0.b(f0);
            if(c0.k()) {
                object0 = c0.p(f0, 0, com.vungle.ads.internal.model.j.a.INSTANCE, null);
                object1 = c0.j(f0, 1, com.vungle.ads.internal.model.f.j.a.INSTANCE, null);
                Object object2 = c0.j(f0, 2, com.vungle.ads.internal.model.f.h.a.INSTANCE, null);
                object3 = c0.j(f0, 3, com.vungle.ads.internal.model.n.a.INSTANCE, null);
                v = c0.f(f0, 4);
                object4 = object2;
                v1 = 0x1F;
            }
            else {
                Object object5 = null;
                Object object6 = null;
                object4 = null;
                Object object7 = null;
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
                            object5 = c0.p(f0, 0, com.vungle.ads.internal.model.j.a.INSTANCE, object5);
                            v3 |= 1;
                            break;
                        }
                        case 1: {
                            object6 = c0.j(f0, 1, com.vungle.ads.internal.model.f.j.a.INSTANCE, object6);
                            v3 |= 2;
                            break;
                        }
                        case 2: {
                            object4 = c0.j(f0, 2, com.vungle.ads.internal.model.f.h.a.INSTANCE, object4);
                            v3 |= 4;
                            break;
                        }
                        case 3: {
                            object7 = c0.j(f0, 3, com.vungle.ads.internal.model.n.a.INSTANCE, object7);
                            v3 |= 8;
                            break;
                        }
                        case 4: {
                            v2 = c0.f(f0, 4);
                            v3 |= 16;
                            break;
                        }
                        default: {
                            throw new E(v4);
                        }
                    }
                }
                v1 = v3;
                object1 = object6;
                object3 = object7;
                v = v2;
                object0 = object5;
            }
            c0.c(f0);
            return new o(v1, ((j)object0), ((com.vungle.ads.internal.model.f.j)object1), ((h)object4), ((n)object3), v, null);
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

        public void serialize(@l g g0, @l o o0) {
            L.p(g0, "encoder");
            L.p(o0, "value");
            f f0 = this.getDescriptor();
            d d0 = g0.b(f0);
            o.write$Self(o0, d0, f0);
            d0.c(f0);
        }

        @Override  // kotlinx.serialization.w
        public void serialize(g g0, Object object0) {
            this.serialize(g0, ((o)object0));
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
    private final j device;
    @y4.m
    private final h ext;
    private final int ordinalView;
    @y4.m
    private final n request;
    @y4.m
    private final com.vungle.ads.internal.model.f.j user;

    static {
        o.Companion = new b(null);
    }

    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public o(int v, j j0, com.vungle.ads.internal.model.f.j f$j0, h f$h0, n n0, @t("ordinal_view") int v1, H0 h00) {
        if(17 != (v & 17)) {
            v0.b(v, 17, a.INSTANCE.getDescriptor());
        }
        super();
        this.device = j0;
        this.user = (v & 2) == 0 ? null : f$j0;
        this.ext = (v & 4) == 0 ? null : f$h0;
        this.request = (v & 8) == 0 ? null : n0;
        this.ordinalView = v1;
    }

    public o(@l j j0, @y4.m com.vungle.ads.internal.model.f.j f$j0, @y4.m h f$h0, @y4.m n n0, int v) {
        L.p(j0, "device");
        super();
        this.device = j0;
        this.user = f$j0;
        this.ext = f$h0;
        this.request = n0;
        this.ordinalView = v;
    }

    public o(j j0, com.vungle.ads.internal.model.f.j f$j0, h f$h0, n n0, int v, int v1, w w0) {
        this(j0, ((v1 & 2) == 0 ? f$j0 : null), ((v1 & 4) == 0 ? f$h0 : null), ((v1 & 8) == 0 ? n0 : null), v);
    }

    @l
    public final j component1() {
        return this.device;
    }

    @y4.m
    public final com.vungle.ads.internal.model.f.j component2() {
        return this.user;
    }

    @y4.m
    public final h component3() {
        return this.ext;
    }

    @y4.m
    public final n component4() {
        return this.request;
    }

    public final int component5() {
        return this.ordinalView;
    }

    @l
    public final o copy(@l j j0, @y4.m com.vungle.ads.internal.model.f.j f$j0, @y4.m h f$h0, @y4.m n n0, int v) {
        L.p(j0, "device");
        return new o(j0, f$j0, f$h0, n0, v);
    }

    public static o copy$default(o o0, j j0, com.vungle.ads.internal.model.f.j f$j0, h f$h0, n n0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            j0 = o0.device;
        }
        if((v1 & 2) != 0) {
            f$j0 = o0.user;
        }
        if((v1 & 4) != 0) {
            f$h0 = o0.ext;
        }
        if((v1 & 8) != 0) {
            n0 = o0.request;
        }
        if((v1 & 16) != 0) {
            v = o0.ordinalView;
        }
        return o0.copy(j0, f$j0, f$h0, n0, v);
    }

    @Override
    public boolean equals(@y4.m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof o)) {
            return false;
        }
        if(!L.g(this.device, ((o)object0).device)) {
            return false;
        }
        if(!L.g(this.user, ((o)object0).user)) {
            return false;
        }
        if(!L.g(this.ext, ((o)object0).ext)) {
            return false;
        }
        return L.g(this.request, ((o)object0).request) ? this.ordinalView == ((o)object0).ordinalView : false;
    }

    @l
    public final j getDevice() {
        return this.device;
    }

    @y4.m
    public final h getExt() {
        return this.ext;
    }

    public final int getOrdinalView() {
        return this.ordinalView;
    }

    @t("ordinal_view")
    public static void getOrdinalView$annotations() {
    }

    @y4.m
    public final n getRequest() {
        return this.request;
    }

    @y4.m
    public final com.vungle.ads.internal.model.f.j getUser() {
        return this.user;
    }

    @Override
    public int hashCode() {
        int v = this.device.hashCode();
        int v1 = 0;
        int v2 = this.user == null ? 0 : this.user.hashCode();
        int v3 = this.ext == null ? 0 : this.ext.hashCode();
        n n0 = this.request;
        if(n0 != null) {
            v1 = n0.hashCode();
        }
        return (((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v1) * 0x1F + this.ordinalView;
    }

    @Override
    @l
    public String toString() {
        return "RtbToken(device=" + this.device + ", user=" + this.user + ", ext=" + this.ext + ", request=" + this.request + ", ordinalView=" + this.ordinalView + ')';
    }

    @z3.n
    public static final void write$Self(@l o o0, @l d d0, @l f f0) {
        L.p(o0, "self");
        L.p(d0, "output");
        L.p(f0, "serialDesc");
        d0.G(f0, 0, com.vungle.ads.internal.model.j.a.INSTANCE, o0.device);
        if(d0.q(f0, 1) || o0.user != null) {
            d0.y(f0, 1, com.vungle.ads.internal.model.f.j.a.INSTANCE, o0.user);
        }
        if(d0.q(f0, 2) || o0.ext != null) {
            d0.y(f0, 2, com.vungle.ads.internal.model.f.h.a.INSTANCE, o0.ext);
        }
        if(d0.q(f0, 3) || o0.request != null) {
            d0.y(f0, 3, com.vungle.ads.internal.model.n.a.INSTANCE, o0.request);
        }
        d0.n(f0, 4, o0.ordinalView);
    }
}

