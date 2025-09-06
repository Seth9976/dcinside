package com.facebook.imagepipeline.core;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import androidx.annotation.VisibleForTesting;
import com.facebook.cache.disk.d;
import com.facebook.common.executors.h;
import com.facebook.common.internal.r;
import com.facebook.common.memory.e;
import com.facebook.imagepipeline.cache.B;
import com.facebook.imagepipeline.cache.E;
import com.facebook.imagepipeline.cache.F;
import com.facebook.imagepipeline.cache.b;
import com.facebook.imagepipeline.cache.n;
import com.facebook.imagepipeline.cache.o;
import com.facebook.imagepipeline.cache.s;
import com.facebook.imagepipeline.cache.t;
import com.facebook.imagepipeline.cache.u;
import com.facebook.imagepipeline.cache.x;
import com.facebook.imagepipeline.decoder.c;
import com.facebook.imagepipeline.decoder.f;
import com.facebook.imagepipeline.memory.N;
import com.facebook.imagepipeline.producers.Z;
import java.util.Map;
import java.util.Set;
import kotlin.collections.k0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import y4.m;

@s0({"SMAP\nImagePipelineConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImagePipelineConfig.kt\ncom/facebook/imagepipeline/core/ImagePipelineConfig\n+ 2 FrescoSystrace.kt\ncom/facebook/imagepipeline/systrace/FrescoSystrace\n*L\n1#1,577:1\n40#2,9:578\n*S KotlinDebug\n*F\n+ 1 ImagePipelineConfig.kt\ncom/facebook/imagepipeline/core/ImagePipelineConfig\n*L\n159#1:578,9\n*E\n"})
public final class y implements z {
    @s0({"SMAP\nImagePipelineConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImagePipelineConfig.kt\ncom/facebook/imagepipeline/core/ImagePipelineConfig$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,577:1\n1#2:578\n*E\n"})
    public static final class a {
        private boolean A;
        @m
        private d B;
        @m
        private q C;
        @m
        private com.facebook.common.internal.q D;
        @m
        private com.facebook.imagepipeline.decoder.d E;
        private int F;
        @l
        private final com.facebook.imagepipeline.core.l0.a G;
        private boolean H;
        @m
        private s0.a I;
        @l
        private b1.a J;
        @m
        private B K;
        @m
        private B L;
        @m
        private h M;
        @m
        private b N;
        @m
        private Map O;
        @m
        private Bitmap.Config a;
        @m
        private com.facebook.common.internal.q b;
        @m
        private com.facebook.imagepipeline.cache.q.b c;
        @m
        private com.facebook.imagepipeline.cache.B.a d;
        @m
        private com.facebook.imagepipeline.cache.B.a e;
        @m
        private n f;
        @l
        private final Context g;
        @l
        private com.facebook.imagepipeline.core.n h;
        @m
        private com.facebook.common.internal.q i;
        @m
        private p j;
        @m
        private x k;
        @m
        private c l;
        @m
        private com.facebook.common.internal.q m;
        @m
        private com.facebook.imagepipeline.transcoder.d n;
        @m
        private Integer o;
        @m
        private com.facebook.common.internal.q p;
        @m
        private d q;
        @m
        private e r;
        @m
        private Integer s;
        @m
        private Z t;
        @m
        private com.facebook.imagepipeline.bitmaps.e u;
        @m
        private N v;
        @m
        private f w;
        @m
        private Set x;
        @m
        private Set y;
        @m
        private Set z;

        public a(@l Context context0) {
            L.p(context0, "context");
            super();
            this.h = com.facebook.imagepipeline.core.n.b;
            this.A = true;
            this.F = -1;
            this.G = new com.facebook.imagepipeline.core.l0.a(this);
            this.H = true;
            this.J = new b1.b();
            this.g = context0;
        }

        @m
        public final c A() {
            return this.l;
        }

        @l
        public final a A0(int v) {
            this.s = v;
            return this;
        }

        @m
        public final com.facebook.imagepipeline.decoder.d B() {
            return this.E;
        }

        public final void B0(@m Integer integer0) {
            this.s = integer0;
        }

        @m
        public final com.facebook.imagepipeline.transcoder.d C() {
            return this.n;
        }

        @l
        public final a C0(@m e e0) {
            this.r = e0;
            return this;
        }

        @m
        public final Integer D() {
            return this.o;
        }

        @l
        public final a D0(@m Z z0) {
            this.t = z0;
            return this;
        }

        public static void E() {
        }

        @l
        public final a E0(@m com.facebook.imagepipeline.bitmaps.e e0) {
            this.u = e0;
            return this;
        }

        @m
        public final d F() {
            return this.q;
        }

        @l
        public final a F0(@m N n0) {
            this.v = n0;
            return this;
        }

        @m
        public final Integer G() {
            return this.s;
        }

        @l
        public final a G0(@m f f0) {
            this.w = f0;
            return this;
        }

        public static void H() {
        }

        @l
        public final a H0(@m Set set0) {
            this.y = set0;
            return this;
        }

        @m
        public final e I() {
            return this.r;
        }

        @l
        public final a I0(@m Set set0) {
            this.x = set0;
            return this;
        }

        @m
        public final Z J() {
            return this.t;
        }

        @l
        public final a J0(boolean z) {
            this.A = z;
            return this;
        }

        @m
        public final com.facebook.imagepipeline.bitmaps.e K() {
            return this.u;
        }

        @l
        public final a K0(@m d d0) {
            this.B = d0;
            return this;
        }

        @m
        public final N L() {
            return this.v;
        }

        @m
        public final f M() {
            return this.w;
        }

        @m
        public final Set N() {
            return this.y;
        }

        @m
        public final Set O() {
            return this.x;
        }

        public final boolean P() {
            return this.A;
        }

        @m
        public final h Q() {
            return this.M;
        }

        @m
        public final d R() {
            return this.B;
        }

        public final boolean S() {
            return this.H;
        }

        public final boolean T() {
            return this.h == com.facebook.imagepipeline.core.n.a;
        }

        @m
        public final com.facebook.common.internal.q U() {
            return this.p;
        }

        @l
        public final a V(@m B b0) {
            this.K = b0;
            return this;
        }

        @l
        public final a W(@m com.facebook.imagepipeline.cache.q.b q$b0) {
            this.c = q$b0;
            return this;
        }

        @l
        public final a X(@m b b0) {
            this.N = b0;
            return this;
        }

        @l
        public final a Y(@m com.facebook.common.internal.q q0) {
            if(q0 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            this.b = q0;
            return this;
        }

        @l
        public final a Z(@m com.facebook.imagepipeline.cache.B.a b$a0) {
            this.d = b$a0;
            return this;
        }

        @l
        public final y a() {
            return new y(this, null);
        }

        @l
        public final a a0(@m Bitmap.Config bitmap$Config0) {
            this.a = bitmap$Config0;
            return this;
        }

        @l
        public final com.facebook.imagepipeline.core.l0.a b() {
            return this.G;
        }

        @l
        public final a b0(@m n n0) {
            this.f = n0;
            return this;
        }

        @m
        public final Bitmap.Config c() {
            return this.a;
        }

        @l
        public final a c0(@m s0.a a0) {
            this.I = a0;
            return this;
        }

        @m
        public final B d() {
            return this.K;
        }

        @l
        public final a d0(@l b1.a a0) {
            L.p(a0, "closeableReferenceLeakTracker");
            this.J = a0;
            return this;
        }

        @m
        public final com.facebook.imagepipeline.cache.q.b e() {
            return this.c;
        }

        @l
        public final a e0(@m Set set0) {
            this.z = set0;
            return this;
        }

        @m
        public final b f() {
            return this.N;
        }

        @l
        public final a f0(boolean z) {
            this.H = z;
            return this;
        }

        @m
        public final com.facebook.common.internal.q g() {
            return this.b;
        }

        @l
        public final a g0(@l com.facebook.common.internal.q q0) {
            L.p(q0, "diskCachesStoreSupplier");
            this.D = q0;
            return this;
        }

        @m
        public final com.facebook.imagepipeline.cache.B.a h() {
            return this.d;
        }

        @k(message = "Use the new setDownsampleMode() method")
        @l
        public final a h0(boolean z) {
            if(z) {
                this.i0(com.facebook.imagepipeline.core.n.a);
                return this;
            }
            this.i0(com.facebook.imagepipeline.core.n.b);
            return this;
        }

        @m
        public final n i() {
            return this.f;
        }

        @l
        public final a i0(@l com.facebook.imagepipeline.core.n n0) {
            L.p(n0, "downsampleMode");
            this.h = n0;
            return this;
        }

        @m
        public final s0.a j() {
            return this.I;
        }

        @l
        public final a j0(@l Map map0) {
            L.p(map0, "dynamicDiskCacheConfigMap");
            this.O = map0;
            return this;
        }

        @l
        public final b1.a k() {
            return this.J;
        }

        @l
        public final a k0(@m com.facebook.common.internal.q q0) {
            this.m = q0;
            return this;
        }

        @l
        public final Context l() {
            return this.g;
        }

        @l
        public final a l0(@m B b0) {
            this.L = b0;
            return this;
        }

        @m
        public final Set m() {
            return this.z;
        }

        @l
        public final a m0(@m com.facebook.common.internal.q q0) {
            if(q0 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            this.i = q0;
            return this;
        }

        public final boolean n() {
            return this.H;
        }

        @l
        public final a n0(@m com.facebook.imagepipeline.cache.B.a b$a0) {
            this.e = b$a0;
            return this;
        }

        @m
        public final com.facebook.common.internal.q o() {
            return this.D;
        }

        @l
        public final a o0(@m h h0) {
            this.M = h0;
            return this;
        }

        @l
        public final com.facebook.imagepipeline.core.n p() {
            return this.h;
        }

        @l
        public final a p0(@m p p0) {
            this.j = p0;
            return this;
        }

        @m
        public final Map q() {
            return this.O;
        }

        @l
        public final a q0(@l q q0) {
            L.p(q0, "fileCacheFactory");
            this.C = q0;
            return this;
        }

        @m
        public final com.facebook.common.internal.q r() {
            return this.m;
        }

        @l
        public final a r0(int v) {
            this.F = v;
            return this;
        }

        @m
        public final B s() {
            return this.L;
        }

        @l
        public final a s0(@m x x0) {
            this.k = x0;
            return this;
        }

        @m
        public final com.facebook.common.internal.q t() {
            return this.i;
        }

        @l
        public final a t0(@m c c0) {
            this.l = c0;
            return this;
        }

        @m
        public final com.facebook.imagepipeline.cache.B.a u() {
            return this.e;
        }

        @l
        public final a u0(@m com.facebook.imagepipeline.decoder.d d0) {
            this.E = d0;
            return this;
        }

        @m
        public final p v() {
            return this.j;
        }

        @l
        public final a v0(@m com.facebook.imagepipeline.transcoder.d d0) {
            this.n = d0;
            return this;
        }

        @l
        public final com.facebook.imagepipeline.core.l0.a w() {
            return this.G;
        }

        @l
        public final a w0(int v) {
            this.o = v;
            return this;
        }

        @m
        public final q x() {
            return this.C;
        }

        public final void x0(@m Integer integer0) {
            this.o = integer0;
        }

        public final int y() {
            return this.F;
        }

        @l
        public final a y0(@m com.facebook.common.internal.q q0) {
            this.p = q0;
            return this;
        }

        @m
        public final x z() {
            return this.k;
        }

        @l
        public final a z0(@m d d0) {
            this.q = d0;
            return this;
        }
    }

    @s0({"SMAP\nImagePipelineConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImagePipelineConfig.kt\ncom/facebook/imagepipeline/core/ImagePipelineConfig$Companion\n+ 2 FrescoSystrace.kt\ncom/facebook/imagepipeline/systrace/FrescoSystrace\n*L\n1#1,577:1\n40#2,9:578\n*S KotlinDebug\n*F\n+ 1 ImagePipelineConfig.kt\ncom/facebook/imagepipeline/core/ImagePipelineConfig$Companion\n*L\n537#1:578,9\n*E\n"})
    public static final class com.facebook.imagepipeline.core.y.b {
        private com.facebook.imagepipeline.core.y.b() {
        }

        public com.facebook.imagepipeline.core.y.b(w w0) {
        }

        @l
        public final com.facebook.imagepipeline.core.y.c e() {
            return y.P;
        }

        @z3.n
        public static void f() {
        }

        private final d g(Context context0) {
            d d0;
            if(com.facebook.imagepipeline.systrace.b.e()) {
                com.facebook.imagepipeline.systrace.b.a("DiskCacheConfig.getDefaultMainDiskCacheConfig");
                try {
                    d0 = d.n(context0).n();
                }
                finally {
                    com.facebook.imagepipeline.systrace.b.c();
                }
            }
            else {
                d0 = d.n(context0).n();
            }
            L.o(d0, "traceSection(...)");
            return d0;
        }

        private final com.facebook.imagepipeline.transcoder.d h(a y$a0) {
            if(y$a0.C() != null && y$a0.D() != null) {
                throw new IllegalStateException("You can\'t define a custom ImageTranscoderFactory and provide an ImageTranscoderType");
            }
            return y$a0.C();
        }

        private final int i(a y$a0, l0 l00) {
            Integer integer0 = y$a0.G();
            if(integer0 != null) {
                return (int)integer0;
            }
            if(l00.n() == 2L && Build.VERSION.SDK_INT >= 27) {
                return 2;
            }
            return l00.n() == 1L ? 1 : 0;
        }

        @l
        @z3.n
        public final a j(@l Context context0) {
            L.p(context0, "context");
            return new a(context0);
        }

        @VisibleForTesting
        @z3.n
        public final void k() {
            y.P = new com.facebook.imagepipeline.core.y.c();
        }

        private final void l(A0.b b0, l0 l00, A0.a a0) {
            A0.c.c = b0;
            A0.b.a b$a0 = l00.A();
            if(b$a0 != null) {
                b0.d(b$a0);
            }
            if(a0 != null) {
                b0.a(a0);
            }
        }
    }

    public static final class com.facebook.imagepipeline.core.y.c {
        private boolean a;

        public final boolean a() {
            return this.a;
        }

        public final void b(boolean z) {
            this.a = z;
        }
    }

    @l
    private final Set A;
    @l
    private final Set B;
    private final boolean C;
    @l
    private final d D;
    @m
    private final com.facebook.imagepipeline.decoder.d E;
    @l
    private final l0 F;
    private final boolean G;
    @m
    private final s0.a H;
    @l
    private final b1.a I;
    @m
    private final B J;
    @m
    private final B K;
    @m
    private final h L;
    @l
    private final b M;
    @m
    private final Map N;
    @l
    public static final com.facebook.imagepipeline.core.y.b O;
    @l
    private static com.facebook.imagepipeline.core.y.c P;
    @l
    private final Bitmap.Config a;
    @l
    private final com.facebook.common.internal.q b;
    @l
    private final com.facebook.imagepipeline.cache.B.a c;
    @l
    private final com.facebook.imagepipeline.cache.B.a d;
    @m
    private final com.facebook.imagepipeline.cache.q.b e;
    @l
    private final n f;
    @l
    private final Context g;
    @l
    private final com.facebook.imagepipeline.core.n h;
    @l
    private final com.facebook.common.internal.q i;
    @l
    private final com.facebook.common.internal.q j;
    @l
    private final p k;
    @l
    private final x l;
    @m
    private final c m;
    @m
    private final com.facebook.imagepipeline.transcoder.d n;
    @l
    private final com.facebook.common.internal.q o;
    @m
    private final Integer p;
    @l
    private final com.facebook.common.internal.q q;
    @l
    private final d r;
    @l
    private final e s;
    private final int t;
    @l
    private final Z u;
    private final int v;
    @m
    private final com.facebook.imagepipeline.bitmaps.e w;
    @l
    private final N x;
    @l
    private final f y;
    @l
    private final Set z;

    static {
        y.O = new com.facebook.imagepipeline.core.y.b(null);
        y.P = new com.facebook.imagepipeline.core.y.c();
    }

    private y(a y$a0) {
        Z z0;
        if(com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("ImagePipelineConfig()");
        }
        this.F = y$a0.w().L();
        com.facebook.common.internal.q q0 = y$a0.g();
        if(q0 == null) {
            Object object0 = y$a0.l().getSystemService("activity");
            if(object0 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            L.n(object0, "null cannot be cast to non-null type android.app.ActivityManager");
            q0 = new s(((ActivityManager)object0));
        }
        this.b = q0;
        com.facebook.imagepipeline.cache.B.a b$a0 = y$a0.h();
        if(b$a0 == null) {
            b$a0 = new com.facebook.imagepipeline.cache.d();
        }
        this.c = b$a0;
        com.facebook.imagepipeline.cache.B.a b$a1 = y$a0.u();
        if(b$a1 == null) {
            b$a1 = new E();
        }
        this.d = b$a1;
        this.e = y$a0.e();
        this.a = y$a0.c() == null ? Bitmap.Config.ARGB_8888 : y$a0.c();
        n n0 = y$a0.i();
        if(n0 == null) {
            n0 = t.f();
            L.o(n0, "getInstance(...)");
        }
        this.f = n0;
        Context context0 = y$a0.l();
        if(context0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.g = context0;
        this.h = y$a0.p();
        com.facebook.common.internal.q q1 = y$a0.t();
        if(q1 == null) {
            q1 = new u();
        }
        this.j = q1;
        x x0 = y$a0.z();
        if(x0 == null) {
            x0 = F.o();
            L.o(x0, "getInstance(...)");
        }
        this.l = x0;
        this.m = y$a0.A();
        com.facebook.common.internal.q q2 = y$a0.r();
        if(q2 == null) {
            q2 = r.b;
            L.o(q2, "BOOLEAN_FALSE");
        }
        this.o = q2;
        com.facebook.imagepipeline.core.y.b y$b0 = y.O;
        this.n = y$b0.h(y$a0);
        this.p = y$a0.D();
        com.facebook.common.internal.q q3 = y$a0.U();
        if(q3 == null) {
            q3 = r.a;
            L.o(q3, "BOOLEAN_TRUE");
        }
        this.q = q3;
        this.r = y$a0.F() == null ? y$b0.g(y$a0.l()) : y$a0.F();
        e e0 = y$a0.I();
        if(e0 == null) {
            e0 = com.facebook.common.memory.f.c();
            L.o(e0, "getInstance(...)");
        }
        this.s = e0;
        this.t = y$b0.i(y$a0, this.q());
        int v = y$a0.y() >= 0 ? y$a0.y() : 30000;
        this.v = v;
        if(com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.a("ImagePipelineConfig->mNetworkFetcher");
            try {
                z0 = y$a0.J();
                if(z0 == null) {
                    z0 = new com.facebook.imagepipeline.producers.E(v);
                }
            }
            finally {
                com.facebook.imagepipeline.systrace.b.c();
            }
        }
        else {
            z0 = y$a0.J();
            if(z0 == null) {
                z0 = new com.facebook.imagepipeline.producers.E(v);
            }
        }
        this.u = z0;
        this.w = y$a0.K();
        this.x = y$a0.L() == null ? new N(com.facebook.imagepipeline.memory.L.n().m()) : y$a0.L();
        f f0 = y$a0.M();
        if(f0 == null) {
            f0 = new com.facebook.imagepipeline.decoder.h();
        }
        this.y = f0;
        this.z = y$a0.O() == null ? k0.k() : y$a0.O();
        this.A = y$a0.N() == null ? k0.k() : y$a0.N();
        this.B = y$a0.m() == null ? k0.k() : y$a0.m();
        this.C = y$a0.P();
        this.D = y$a0.R() == null ? this.s() : y$a0.R();
        this.E = y$a0.B();
        int v2 = this.k().e();
        p p0 = y$a0.v();
        if(p0 == null) {
            p0 = new com.facebook.imagepipeline.core.b(v2);
        }
        this.k = p0;
        this.G = y$a0.n();
        this.H = y$a0.j();
        this.I = y$a0.k();
        this.J = y$a0.d();
        b b0 = y$a0.f();
        if(b0 == null) {
            b0 = new o();
        }
        this.M = b0;
        this.K = y$a0.s();
        this.L = y$a0.Q();
        this.N = y$a0.q();
        com.facebook.common.internal.q q4 = y$a0.o();
        if(q4 == null) {
            q q5 = y$a0.x();
            if(q5 == null) {
                q5 = new com.facebook.imagepipeline.core.l(new com.facebook.imagepipeline.core.o());
            }
            q4 = new com.facebook.imagepipeline.core.k(q5, this);
        }
        this.i = q4;
        A0.b b1 = this.q().z();
        if(b1 != null) {
            y$b0.l(b1, this.q(), new com.facebook.imagepipeline.bitmaps.c(this.k()));
        }
        if(com.facebook.imagepipeline.systrace.b.e()) {
            com.facebook.imagepipeline.systrace.b.c();
        }
    }

    public y(a y$a0, w w0) {
        this(y$a0);
    }

    @Override  // com.facebook.imagepipeline.core.z
    @m
    public com.facebook.imagepipeline.decoder.d A() {
        return this.E;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @l
    public com.facebook.common.internal.q B() {
        return this.b;
    }

    @Override  // com.facebook.imagepipeline.core.z
    public int C() {
        return this.t;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @l
    public com.facebook.common.internal.q D() {
        return this.i;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @l
    public b E() {
        return this.M;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @l
    public n F() {
        return this.f;
    }

    @Override  // com.facebook.imagepipeline.core.z
    public boolean G() {
        return this.C;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @l
    public Set H() {
        return this.B;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @l
    public com.facebook.common.internal.q I() {
        return this.o;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @l
    public com.facebook.imagepipeline.core.n J() {
        return this.h;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @m
    public s0.a K() {
        return this.H;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @l
    public p L() {
        return this.k;
    }

    @l
    public static final com.facebook.imagepipeline.core.y.c O() {
        return y.O.e();
    }

    public static void P() {
    }

    public static void Q() {
    }

    @l
    @z3.n
    public static final a R(@l Context context0) {
        return y.O.j(context0);
    }

    @VisibleForTesting
    @z3.n
    public static final void S() {
        y.O.k();
    }

    @Override  // com.facebook.imagepipeline.core.z
    @l
    public Set a() {
        return this.A;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @l
    public Bitmap.Config b() {
        return this.a;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @m
    public B c() {
        return this.K;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @m
    public com.facebook.imagepipeline.bitmaps.e d() {
        return this.w;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @l
    public f e() {
        return this.y;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @m
    public Map f() {
        return this.N;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @m
    public com.facebook.imagepipeline.cache.q.b g() {
        return this.e;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @l
    public Context getContext() {
        return this.g;
    }

    @Override  // com.facebook.imagepipeline.core.z
    public boolean h() {
        return this.G;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @m
    public c i() {
        return this.m;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @l
    public com.facebook.common.internal.q j() {
        return this.j;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @l
    public N k() {
        return this.x;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @l
    public b1.a l() {
        return this.I;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @l
    public x m() {
        return this.l;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @l
    public com.facebook.common.internal.q n() {
        return this.q;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @m
    public B o() {
        return this.J;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @l
    public e p() {
        return this.s;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @l
    public l0 q() {
        return this.F;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @l
    public Z r() {
        return this.u;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @l
    public d s() {
        return this.r;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @l
    public Set t() {
        return this.z;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @l
    public com.facebook.imagepipeline.cache.B.a u() {
        return this.d;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @l
    public com.facebook.imagepipeline.cache.B.a v() {
        return this.c;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @l
    public d w() {
        return this.D;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @m
    public h x() {
        return this.L;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @m
    public Integer y() {
        return this.p;
    }

    @Override  // com.facebook.imagepipeline.core.z
    @m
    public com.facebook.imagepipeline.transcoder.d z() {
        return this.n;
    }
}

