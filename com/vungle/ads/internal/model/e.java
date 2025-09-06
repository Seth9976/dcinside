package com.vungle.ads.internal.model;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.zip.GZIPInputStream;
import kotlin.S0;
import kotlin.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.m;
import kotlinx.serialization.D;
import kotlinx.serialization.E;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.i;
import kotlinx.serialization.internal.H0;
import kotlinx.serialization.internal.M;
import kotlinx.serialization.internal.N0;
import kotlinx.serialization.internal.W;
import kotlinx.serialization.internal.w0;
import kotlinx.serialization.json.s;
import kotlinx.serialization.u;
import kotlinx.serialization.z;
import y4.l;
import z3.n;

@u
public final class e {
    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public static final class a implements M {
        @l
        public static final a INSTANCE;
        public static final f descriptor;

        static {
            a e$a0 = new a();
            a.INSTANCE = e$a0;
            w0 w00 = new w0("com.vungle.ads.internal.model.BidPayload", e$a0, 4);
            w00.k("version", true);
            w00.k("adunit", true);
            w00.k("impression", true);
            w00.k("ad", true);
            a.descriptor = w00;
        }

        @Override  // kotlinx.serialization.internal.M
        @l
        public i[] childSerializers() {
            return new i[]{P3.a.u(W.a), P3.a.u(N0.a), P3.a.u(new kotlinx.serialization.internal.f(N0.a)), P3.a.u(com.vungle.ads.internal.model.b.a.INSTANCE)};
        }

        @l
        public e deserialize(@l kotlinx.serialization.encoding.e e0) {
            int v;
            Object object4;
            Object object3;
            Object object2;
            Object object1;
            L.p(e0, "decoder");
            f f0 = this.getDescriptor();
            c c0 = e0.b(f0);
            Object object0 = null;
            if(c0.k()) {
                object1 = c0.j(f0, 0, W.a, null);
                object2 = c0.j(f0, 1, N0.a, null);
                object3 = c0.j(f0, 2, new kotlinx.serialization.internal.f(N0.a), null);
                object4 = c0.j(f0, 3, com.vungle.ads.internal.model.b.a.INSTANCE, null);
                v = 15;
            }
            else {
                Object object5 = null;
                Object object6 = null;
                Object object7 = null;
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
                            object0 = c0.j(f0, 0, W.a, object0);
                            v1 |= 1;
                            break;
                        }
                        case 1: {
                            object5 = c0.j(f0, 1, N0.a, object5);
                            v1 |= 2;
                            break;
                        }
                        case 2: {
                            object6 = c0.j(f0, 2, new kotlinx.serialization.internal.f(N0.a), object6);
                            v1 |= 4;
                            break;
                        }
                        case 3: {
                            object7 = c0.j(f0, 3, com.vungle.ads.internal.model.b.a.INSTANCE, object7);
                            v1 |= 8;
                            break;
                        }
                        default: {
                            throw new E(v2);
                        }
                    }
                }
                object2 = object5;
                object3 = object6;
                object4 = object7;
                v = v1;
                object1 = object0;
            }
            c0.c(f0);
            return new e(v, ((Integer)object1), ((String)object2), ((List)object3), ((b)object4), null);
        }

        @Override  // kotlinx.serialization.d
        public Object deserialize(kotlinx.serialization.encoding.e e0) {
            return this.deserialize(e0);
        }

        @Override  // kotlinx.serialization.i
        @l
        public f getDescriptor() {
            return a.descriptor;
        }

        public void serialize(@l g g0, @l e e0) {
            L.p(g0, "encoder");
            L.p(e0, "value");
            f f0 = this.getDescriptor();
            d d0 = g0.b(f0);
            e.write$Self(e0, d0, f0);
            d0.c(f0);
        }

        @Override  // kotlinx.serialization.w
        public void serialize(g g0, Object object0) {
            this.serialize(g0, ((e)object0));
        }

        @Override  // kotlinx.serialization.internal.M
        @l
        public i[] typeParametersSerializers() {
            return kotlinx.serialization.internal.M.a.a(this);
        }
    }

    public static final class com.vungle.ads.internal.model.e.c {
        private com.vungle.ads.internal.model.e.c() {
        }

        public com.vungle.ads.internal.model.e.c(w w0) {
        }

        @l
        public final i serializer() {
            return a.INSTANCE;
        }
    }

    @l
    public static final com.vungle.ads.internal.model.e.c Companion;
    @y4.m
    private final b ad;
    @y4.m
    private final String adunit;
    @y4.m
    private final List impression;
    @l
    private final kotlinx.serialization.json.b json;
    @y4.m
    private final Integer version;

    static {
        e.Companion = new com.vungle.ads.internal.model.e.c(null);
    }

    public e() {
        this(null, null, null, 7, null);
    }

    @k(level = m.c, message = "This synthesized declaration should not be used directly", replaceWith = @c0(expression = "", imports = {}))
    public e(int v, Integer integer0, String s, List list0, b b0, H0 h00) {
        static final class com.vungle.ads.internal.model.e.b extends N implements Function1 {
            public static final com.vungle.ads.internal.model.e.b INSTANCE;

            static {
                com.vungle.ads.internal.model.e.b.INSTANCE = new com.vungle.ads.internal.model.e.b();
            }

            com.vungle.ads.internal.model.e.b() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((kotlinx.serialization.json.f)object0));
                return S0.a;
            }

            public final void invoke(@l kotlinx.serialization.json.f f0) {
                L.p(f0, "$this$Json");
                f0.w(true);
                f0.u(true);
                f0.v(false);
            }
        }

        b b1 = null;
        this.version = (v & 1) == 0 ? null : integer0;
        this.adunit = (v & 2) == 0 ? null : s;
        this.impression = (v & 4) == 0 ? null : list0;
        kotlinx.serialization.json.b b2 = s.b(null, com.vungle.ads.internal.model.e.b.INSTANCE, 1, null);
        this.json = b2;
        if((v & 8) == 0) {
            if(this.adunit != null) {
                String s1 = this.getDecodedAdsResponse();
                if(s1 != null) {
                    i i0 = z.k(b2.a(), m0.A(b.class));
                    L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                    b1 = (b)b2.d(i0, s1);
                }
            }
            this.ad = b1;
            return;
        }
        this.ad = b0;
    }

    public e(@y4.m Integer integer0, @y4.m String s, @y4.m List list0) {
        static final class com.vungle.ads.internal.model.e.d extends N implements Function1 {
            public static final com.vungle.ads.internal.model.e.d INSTANCE;

            static {
                com.vungle.ads.internal.model.e.d.INSTANCE = new com.vungle.ads.internal.model.e.d();
            }

            com.vungle.ads.internal.model.e.d() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((kotlinx.serialization.json.f)object0));
                return S0.a;
            }

            public final void invoke(@l kotlinx.serialization.json.f f0) {
                L.p(f0, "$this$Json");
                f0.w(true);
                f0.u(true);
                f0.v(false);
            }
        }

        this.version = integer0;
        this.adunit = s;
        this.impression = list0;
        b b0 = null;
        kotlinx.serialization.json.b b1 = s.b(null, com.vungle.ads.internal.model.e.d.INSTANCE, 1, null);
        this.json = b1;
        if(s != null) {
            String s1 = this.getDecodedAdsResponse();
            if(s1 != null) {
                i i0 = z.k(b1.a(), m0.A(b.class));
                L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                b0 = (b)b1.d(i0, s1);
            }
        }
        this.ad = b0;
    }

    public e(Integer integer0, String s, List list0, int v, w w0) {
        if((v & 1) != 0) {
            integer0 = null;
        }
        if((v & 2) != 0) {
            s = null;
        }
        if((v & 4) != 0) {
            list0 = null;
        }
        this(integer0, s, list0);
    }

    @y4.m
    public final Integer component1() {
        return this.version;
    }

    @y4.m
    public final String component2() {
        return this.adunit;
    }

    @y4.m
    public final List component3() {
        return this.impression;
    }

    @l
    public final e copy(@y4.m Integer integer0, @y4.m String s, @y4.m List list0) {
        return new e(integer0, s, list0);
    }

    public static e copy$default(e e0, Integer integer0, String s, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            integer0 = e0.version;
        }
        if((v & 2) != 0) {
            s = e0.adunit;
        }
        if((v & 4) != 0) {
            list0 = e0.impression;
        }
        return e0.copy(integer0, s, list0);
    }

    @Override
    public boolean equals(@y4.m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof e)) {
            return false;
        }
        if(!L.g(this.version, ((e)object0).version)) {
            return false;
        }
        return L.g(this.adunit, ((e)object0).adunit) ? L.g(this.impression, ((e)object0).impression) : false;
    }

    @y4.m
    public final b getAdPayload() {
        return this.ad;
    }

    @y4.m
    public final String getAdunit() {
        return this.adunit;
    }

    // 去混淆评级： 低(20)
    @y4.m
    public final String getCreativeId() {
        return this.ad == null ? null : "unknown";
    }

    @y4.m
    public final String getDecodedAdsResponse() throws Throwable {
        byte[] arr_b = Base64.decode(this.adunit, 0);
        return arr_b == null ? null : this.gzipDecode(arr_b);
    }

    @y4.m
    public final String getEventId() {
        return this.ad == null ? null : this.ad.eventId();
    }

    @y4.m
    public final List getImpression() {
        return this.impression;
    }

    @D
    private static void getJson$annotations() {
    }

    @y4.m
    public final String getPlacementId() {
        return this.ad == null ? null : this.ad.placementId();
    }

    @y4.m
    public final Integer getVersion() {
        return this.version;
    }

    private final String gzipDecode(byte[] arr_b) throws Throwable {
        GZIPInputStream gZIPInputStream0;
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
        try {
            gZIPInputStream0 = new GZIPInputStream(byteArrayInputStream0, 0x400);
        }
        catch(Throwable throwable0) {
            kotlin.io.c.a(byteArrayInputStream0, throwable0);
            throw throwable0;
        }
        try {
            byte[] arr_b1 = new byte[0x400];
            while(true) {
                int v = gZIPInputStream0.read(arr_b1);
                if(v == -1) {
                    goto label_13;
                }
                byteArrayOutputStream0.write(arr_b1, 0, v);
            }
        }
        catch(Throwable throwable1) {
        }
        try {
            throw throwable1;
        }
        catch(Throwable throwable2) {
            try {
                kotlin.io.c.a(gZIPInputStream0, throwable1);
                throw throwable2;
            label_13:
                kotlin.io.c.a(gZIPInputStream0, null);
                goto label_18;
            }
            catch(Throwable throwable0) {
            }
        }
        kotlin.io.c.a(byteArrayInputStream0, throwable0);
        throw throwable0;
    label_18:
        kotlin.io.c.a(byteArrayInputStream0, null);
        String s = byteArrayOutputStream0.toString();
        L.o(s, "result.toString()");
        return s;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.version == null ? 0 : this.version.hashCode();
        int v2 = this.adunit == null ? 0 : this.adunit.hashCode();
        List list0 = this.impression;
        if(list0 != null) {
            v = list0.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    @l
    public String toString() {
        return "BidPayload(version=" + this.version + ", adunit=" + this.adunit + ", impression=" + this.impression + ')';
    }

    @n
    public static final void write$Self(@l e e0, @l d d0, @l f f0) {
        L.p(e0, "self");
        L.p(d0, "output");
        L.p(f0, "serialDesc");
        if(d0.q(f0, 0) || e0.version != null) {
            d0.y(f0, 0, W.a, e0.version);
        }
        if(d0.q(f0, 1) || e0.adunit != null) {
            d0.y(f0, 1, N0.a, e0.adunit);
        }
        if(d0.q(f0, 2) || e0.impression != null) {
            d0.y(f0, 2, new kotlinx.serialization.internal.f(N0.a), e0.impression);
        }
        if(d0.q(f0, 3)) {
            d0.y(f0, 3, com.vungle.ads.internal.model.b.a.INSTANCE, e0.ad);
        }
        else {
            b b0 = e0.ad;
            b b1 = null;
            if(e0.adunit != null) {
                String s = e0.getDecodedAdsResponse();
                if(s != null) {
                    i i0 = z.k(e0.json.a(), m0.A(b.class));
                    L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                    b1 = (b)e0.json.d(i0, s);
                }
            }
            if(!L.g(b0, b1)) {
                d0.y(f0, 3, com.vungle.ads.internal.model.b.a.INSTANCE, e0.ad);
            }
        }
    }
}

