package com.vungle.ads.internal.model;

import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlinx.serialization.D;
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
import kotlinx.serialization.internal.v0;
import kotlinx.serialization.internal.w0;
import kotlinx.serialization.t;
import kotlinx.serialization.u;
import y4.l;
import z3.n;

@u
public final class m {
    @k(level = kotlin.m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public static final class a implements M {
        @l
        public static final a INSTANCE;
        public static final f descriptor;

        static {
            a m$a0 = new a();
            a.INSTANCE = m$a0;
            w0 w00 = new w0("com.vungle.ads.internal.model.Placement", m$a0, 3);
            w00.k("placement_ref_id", false);
            w00.k("is_hb", true);
            w00.k("type", true);
            a.descriptor = w00;
        }

        @Override  // kotlinx.serialization.internal.M
        @l
        public i[] childSerializers() {
            i i0 = P3.a.u(N0.a);
            return new i[]{N0.a, kotlinx.serialization.internal.i.a, i0};
        }

        @l
        public m deserialize(@l e e0) {
            int v;
            boolean z1;
            String s1;
            Object object0;
            L.p(e0, "decoder");
            f f0 = this.getDescriptor();
            c c0 = e0.b(f0);
            if(c0.k()) {
                String s = c0.i(f0, 0);
                boolean z = c0.C(f0, 1);
                object0 = c0.j(f0, 2, N0.a, null);
                s1 = s;
                z1 = z;
                v = 7;
            }
            else {
                String s2 = null;
                Object object1 = null;
                boolean z2 = false;
                int v1 = 0;
                boolean z3 = true;
                while(z3) {
                    int v2 = c0.w(f0);
                    switch(v2) {
                        case -1: {
                            z3 = false;
                            break;
                        }
                        case 0: {
                            s2 = c0.i(f0, 0);
                            v1 |= 1;
                            break;
                        }
                        case 1: {
                            z2 = c0.C(f0, 1);
                            v1 |= 2;
                            break;
                        }
                        case 2: {
                            object1 = c0.j(f0, 2, N0.a, object1);
                            v1 |= 4;
                            break;
                        }
                        default: {
                            throw new E(v2);
                        }
                    }
                }
                z1 = z2;
                v = v1;
                s1 = s2;
                object0 = object1;
            }
            c0.c(f0);
            return new m(v, s1, z1, ((String)object0), null);
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

        public void serialize(@l g g0, @l m m0) {
            L.p(g0, "encoder");
            L.p(m0, "value");
            f f0 = this.getDescriptor();
            d d0 = g0.b(f0);
            m.write$Self(m0, d0, f0);
            d0.c(f0);
        }

        @Override  // kotlinx.serialization.w
        public void serialize(g g0, Object object0) {
            this.serialize(g0, ((m)object0));
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
    private final boolean headerBidding;
    @l
    private final String referenceId;
    @y4.m
    private final String type;
    @y4.m
    private Long wakeupTime;

    static {
        m.Companion = new b(null);
    }

    @k(level = kotlin.m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public m(int v, @t("placement_ref_id") String s, @t("is_hb") boolean z, @t("type") String s1, H0 h00) {
        if(1 != (v & 1)) {
            v0.b(v, 1, a.INSTANCE.getDescriptor());
        }
        super();
        this.referenceId = s;
        this.headerBidding = (v & 2) == 0 ? false : z;
        this.type = (v & 4) == 0 ? null : s1;
        this.wakeupTime = null;
    }

    public m(@l String s, boolean z, @y4.m String s1) {
        L.p(s, "referenceId");
        super();
        this.referenceId = s;
        this.headerBidding = z;
        this.type = s1;
    }

    public m(String s, boolean z, String s1, int v, w w0) {
        if((v & 2) != 0) {
            z = false;
        }
        if((v & 4) != 0) {
            s1 = null;
        }
        this(s, z, s1);
    }

    @l
    public final String component1() {
        return this.referenceId;
    }

    public final boolean component2() {
        return this.headerBidding;
    }

    @y4.m
    public final String component3() {
        return this.type;
    }

    @l
    public final m copy(@l String s, boolean z, @y4.m String s1) {
        L.p(s, "referenceId");
        return new m(s, z, s1);
    }

    public static m copy$default(m m0, String s, boolean z, String s1, int v, Object object0) {
        if((v & 1) != 0) {
            s = m0.referenceId;
        }
        if((v & 2) != 0) {
            z = m0.headerBidding;
        }
        if((v & 4) != 0) {
            s1 = m0.type;
        }
        return m0.copy(s, z, s1);
    }

    @Override
    public boolean equals(@y4.m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof m)) {
            return false;
        }
        if(!L.g(this.referenceId, ((m)object0).referenceId)) {
            return false;
        }
        return this.headerBidding == ((m)object0).headerBidding ? L.g(this.type, ((m)object0).type) : false;
    }

    public final boolean getHeaderBidding() {
        return this.headerBidding;
    }

    @t("is_hb")
    public static void getHeaderBidding$annotations() {
    }

    @l
    public final String getReferenceId() {
        return this.referenceId;
    }

    @t("placement_ref_id")
    public static void getReferenceId$annotations() {
    }

    @y4.m
    public final String getType() {
        return this.type;
    }

    @t("type")
    public static void getType$annotations() {
    }

    @y4.m
    public final Long getWakeupTime() {
        return this.wakeupTime;
    }

    @D
    public static void getWakeupTime$annotations() {
    }

    @Override
    public int hashCode() {
        int v = this.referenceId.hashCode();
        int v1 = this.headerBidding;
        if(v1) {
            v1 = 1;
        }
        return this.type == null ? (v * 0x1F + v1) * 0x1F : (v * 0x1F + v1) * 0x1F + this.type.hashCode();
    }

    public final boolean isAppOpen() {
        return L.g(this.type, "appopen");
    }

    public final boolean isBanner() {
        return L.g(this.type, "banner");
    }

    public final boolean isInline() {
        return L.g(this.type, "in_line");
    }

    public final boolean isInterstitial() {
        return L.g(this.type, "interstitial");
    }

    public final boolean isMREC() {
        return L.g(this.type, "mrec");
    }

    public final boolean isNative() {
        return L.g(this.type, "native");
    }

    public final boolean isRewardedVideo() {
        return L.g(this.type, "rewarded");
    }

    public final void setWakeupTime(@y4.m Long long0) {
        this.wakeupTime = long0;
    }

    public final void snooze(long v) {
        this.wakeupTime = (long)(System.currentTimeMillis() + v * 1000L);
    }

    @Override
    @l
    public String toString() {
        return "Placement(referenceId=" + this.referenceId + ", headerBidding=" + this.headerBidding + ", type=" + this.type + ')';
    }

    @n
    public static final void write$Self(@l m m0, @l d d0, @l f f0) {
        L.p(m0, "self");
        L.p(d0, "output");
        L.p(f0, "serialDesc");
        d0.p(f0, 0, m0.referenceId);
        if(d0.q(f0, 1) || m0.headerBidding) {
            d0.o(f0, 1, m0.headerBidding);
        }
        if(d0.q(f0, 2) || m0.type != null) {
            d0.y(f0, 2, N0.a, m0.type);
        }
    }
}

