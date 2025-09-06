package com.facebook.imagepipeline.core;

import A0.b;
import android.content.Context;
import com.facebook.common.internal.q;
import com.facebook.common.internal.r;
import com.facebook.common.memory.j;
import com.facebook.imagepipeline.bitmaps.e;
import com.facebook.imagepipeline.cache.B;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;
import z3.n;

public final class l0 {
    public static final class a {
        @f
        public boolean A;
        @f
        public boolean B;
        @f
        public boolean C;
        @f
        public int D;
        @f
        public boolean E;
        @f
        public boolean F;
        @f
        public boolean G;
        @f
        public boolean H;
        @f
        public boolean I;
        @f
        public int J;
        @f
        public boolean K;
        @f
        public boolean L;
        @l
        @f
        public com.facebook.imagepipeline.platform.f M;
        @f
        public boolean N;
        @l
        private final com.facebook.imagepipeline.core.y.a a;
        @f
        public boolean b;
        @f
        public boolean c;
        @m
        @f
        public A0.b.a d;
        @f
        public boolean e;
        @m
        @f
        public b f;
        @f
        public boolean g;
        @f
        public boolean h;
        @f
        public boolean i;
        @f
        public int j;
        @f
        public int k;
        @f
        public int l;
        @f
        public boolean m;
        @f
        public int n;
        @f
        public boolean o;
        @f
        public boolean p;
        @m
        @f
        public d q;
        @m
        @f
        public q r;
        @f
        public boolean s;
        @f
        public boolean t;
        @l
        @f
        public q u;
        @f
        public boolean v;
        @f
        public long w;
        @f
        public boolean x;
        @f
        public boolean y;
        @f
        public boolean z;

        public a(@l com.facebook.imagepipeline.core.y.a y$a0) {
            L.p(y$a0, "configBuilder");
            super();
            this.a = y$a0;
            this.j = 1000;
            this.n = 0x800;
            q q0 = r.a(Boolean.FALSE);
            L.o(q0, "of(...)");
            this.u = q0;
            this.z = true;
            this.A = true;
            this.D = 20;
            this.J = 30;
            this.M = new com.facebook.imagepipeline.platform.f(false, false, 3, null);
        }

        @l
        public final a A0(@m q q0) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.r = q0;
                return S0.a;
            });
        }

        // 检测为 Lambda 实现
        private static final S0 B0(a l0$a0, q q0) [...]

        @l
        public final a C0(int v) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.n = v;
                return S0.a;
            });
        }

        // 检测为 Lambda 实现
        private static final S0 D0(a l0$a0, int v) [...]

        @l
        public final a E0(boolean z) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.o = z;
                return S0.a;
            });
        }

        // 检测为 Lambda 实现
        private static final S0 F0(a l0$a0, boolean z) [...]

        @l
        public final a G0(boolean z) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.p = z;
                return S0.a;
            });
        }

        // 检测为 Lambda 实现
        private static final S0 H0(a l0$a0, boolean z) [...]

        @l
        public final a I0(@l com.facebook.imagepipeline.platform.f f0) {
            L.p(f0, "platformDecoderOptions");
            return this.K(() -> {
                L.p(this, "this$0");
                L.p(f0, "$platformDecoderOptions");
                this.M = f0;
                return S0.a;
            });
        }

        // 检测为 Lambda 实现
        private static final S0 J0(a l0$a0, com.facebook.imagepipeline.platform.f f0) [...]

        private final a K(A3.a a0) {
            a0.invoke();
            return this;
        }

        @l
        public final a K0(boolean z) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.L = z;
                return S0.a;
            });
        }

        @l
        public final l0 L() {
            return new l0(this, null);
        }

        // 检测为 Lambda 实现
        private static final S0 L0(a l0$a0, boolean z) [...]

        @l
        public final a M(boolean z) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.E = z;
                return S0.a;
            });
        }

        @l
        public final a M0(@m d l0$d0) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.q = l0$d0;
                return S0.a;
            });
        }

        // 检测为 Lambda 实现
        private static final S0 N(a l0$a0, boolean z) [...]

        // 检测为 Lambda 实现
        private static final S0 N0(a l0$a0, d l0$d0) [...]

        @l
        public final a O(boolean z) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.I = z;
                return S0.a;
            });
        }

        @l
        public final a O0(boolean z) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.t = z;
                return S0.a;
            });
        }

        // 检测为 Lambda 实现
        private static final S0 P(a l0$a0, boolean z) [...]

        // 检测为 Lambda 实现
        private static final S0 P0(a l0$a0, boolean z) [...]

        @l
        public final a Q(int v) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.J = v;
                return S0.a;
            });
        }

        @l
        public final a Q0(boolean z) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.b = z;
                return S0.a;
            });
        }

        // 检测为 Lambda 实现
        private static final S0 R(a l0$a0, int v) [...]

        // 检测为 Lambda 实现
        private static final S0 R0(a l0$a0, boolean z) [...]

        @l
        public final a S(int v) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.j = v;
                return S0.a;
            });
        }

        @l
        public final a S0(boolean z) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.G = z;
                return S0.a;
            });
        }

        // 检测为 Lambda 实现
        private static final S0 T(a l0$a0, int v) [...]

        // 检测为 Lambda 实现
        private static final S0 T0(a l0$a0, boolean z) [...]

        @l
        public final a U(boolean z) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.i = z;
                return S0.a;
            });
        }

        @l
        public final a U0(@l q q0) {
            L.p(q0, "suppressBitmapPrefetchingSupplier");
            return this.K(() -> {
                L.p(this, "this$0");
                L.p(q0, "$suppressBitmapPrefetchingSupplier");
                this.u = q0;
                return S0.a;
            });
        }

        // 检测为 Lambda 实现
        private static final S0 V(a l0$a0, boolean z) [...]

        // 检测为 Lambda 实现
        private static final S0 V0(a l0$a0, q q0) [...]

        @l
        public final a W(boolean z) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.N = z;
                return S0.a;
            });
        }

        @l
        public final a W0(int v) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.D = v;
                return S0.a;
            });
        }

        // 检测为 Lambda 实现
        private static final S0 X(a l0$a0, boolean z) [...]

        // 检测为 Lambda 实现
        private static final S0 X0(a l0$a0, int v) [...]

        @l
        public final a Y(boolean z, int v, int v1, boolean z1) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.h = z;
                this.k = v;
                this.l = v1;
                this.m = z1;
                return S0.a;
            });
        }

        @l
        public final a Y0(boolean z) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.g = z;
                return S0.a;
            });
        }

        // 检测为 Lambda 实现
        private static final S0 Z(a l0$a0, boolean z, int v, int v1, boolean z1) [...]

        // 检测为 Lambda 实现
        private static final S0 Z0(a l0$a0, boolean z) [...]

        @l
        public final a a0(boolean z) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.K = z;
                return S0.a;
            });
        }

        @l
        public final a a1(@m b b0) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.f = b0;
                return S0.a;
            });
        }

        // 检测为 Lambda 实现
        private static final S0 b0(a l0$a0, boolean z) [...]

        // 检测为 Lambda 实现
        private static final S0 b1(a l0$a0, b b0) [...]

        @l
        public final a c0(boolean z) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.e = z;
                return S0.a;
            });
        }

        @l
        public final a c1(@m A0.b.a b$a0) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.d = b$a0;
                return S0.a;
            });
        }

        // 检测为 Lambda 实现
        private static final S0 d0(a l0$a0, boolean z) [...]

        // 检测为 Lambda 实现
        private static final S0 d1(a l0$a0, A0.b.a b$a0) [...]

        @l
        public final a e0(boolean z) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.y = z;
                return S0.a;
            });
        }

        @l
        public final a e1(boolean z) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.c = z;
                return S0.a;
            });
        }

        // 检测为 Lambda 实现
        private static final S0 f0(a l0$a0, boolean z) [...]

        // 检测为 Lambda 实现
        private static final S0 f1(a l0$a0, boolean z) [...]

        @l
        public final a g0(boolean z) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.z = z;
                return S0.a;
            });
        }

        public final boolean g1() {
            return this.b;
        }

        // 检测为 Lambda 实现
        private static final S0 h0(a l0$a0, boolean z) [...]

        @l
        public final a i0(boolean z) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.A = z;
                return S0.a;
            });
        }

        // 检测为 Lambda 实现
        private static final S0 j0(a l0$a0, boolean z) [...]

        @l
        public final a k0(long v) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.w = v;
                return S0.a;
            });
        }

        // 检测为 Lambda 实现
        private static final S0 l0(a l0$a0, long v) [...]

        @l
        public final a m0(boolean z) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.v = z;
                return S0.a;
            });
        }

        // 检测为 Lambda 实现
        private static final S0 n0(a l0$a0, boolean z) [...]

        @l
        public final a o0(boolean z) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.s = z;
                return S0.a;
            });
        }

        // 检测为 Lambda 实现
        private static final S0 p0(a l0$a0, boolean z) [...]

        @l
        public final a q0(boolean z) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.F = z;
                return S0.a;
            });
        }

        // 检测为 Lambda 实现
        private static final S0 r0(a l0$a0, boolean z) [...]

        @l
        public final a s0(boolean z) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.H = z;
                return S0.a;
            });
        }

        // 检测为 Lambda 实现
        private static final S0 t0(a l0$a0, boolean z) [...]

        @l
        public final a u0(boolean z) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.C = z;
                return S0.a;
            });
        }

        // 检测为 Lambda 实现
        private static final S0 v0(a l0$a0, boolean z) [...]

        @l
        public final a w0(boolean z) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.B = z;
                return S0.a;
            });
        }

        // 检测为 Lambda 实现
        private static final S0 x0(a l0$a0, boolean z) [...]

        @l
        public final a y0(boolean z) {
            return this.K(() -> {
                L.p(this, "this$0");
                this.x = z;
                return S0.a;
            });
        }

        // 检测为 Lambda 实现
        private static final S0 z0(a l0$a0, boolean z) [...]
    }

    public static final class com.facebook.imagepipeline.core.l0.b {
        private com.facebook.imagepipeline.core.l0.b() {
        }

        public com.facebook.imagepipeline.core.l0.b(w w0) {
        }

        @l
        @n
        public final a a(@l com.facebook.imagepipeline.core.y.a y$a0) {
            L.p(y$a0, "configBuilder");
            return new a(y$a0);
        }
    }

    public static final class c implements d {
        @Override  // com.facebook.imagepipeline.core.l0$d
        @l
        public s0 a(@l Context context0, @l com.facebook.common.memory.a a0, @l com.facebook.imagepipeline.decoder.c c0, @l com.facebook.imagepipeline.decoder.f f0, @l com.facebook.imagepipeline.core.n n0, boolean z, boolean z1, @l p p0, @l j j0, @l com.facebook.common.memory.m m0, @l B b0, @l B b1, @l q q0, @l com.facebook.imagepipeline.cache.n n1, @l e e0, int v, int v1, boolean z2, int v2, @l com.facebook.imagepipeline.core.a a1, boolean z3, int v3) {
            L.p(context0, "context");
            L.p(a0, "byteArrayPool");
            L.p(c0, "imageDecoder");
            L.p(f0, "progressiveJpegConfig");
            L.p(n0, "downsampleMode");
            L.p(p0, "executorSupplier");
            L.p(j0, "pooledByteBufferFactory");
            L.p(m0, "pooledByteStreams");
            L.p(b0, "bitmapMemoryCache");
            L.p(b1, "encodedMemoryCache");
            L.p(q0, "diskCachesStoreSupplier");
            L.p(n1, "cacheKeyFactory");
            L.p(e0, "platformBitmapFactory");
            L.p(a1, "closeableReferenceFactory");
            return new s0(context0, a0, c0, f0, n0, z, z1, p0, j0, b0, b1, q0, n1, e0, v, v1, z2, v2, a1, z3, v3);
        }
    }

    public interface d {
        @l
        s0 a(@l Context arg1, @l com.facebook.common.memory.a arg2, @l com.facebook.imagepipeline.decoder.c arg3, @l com.facebook.imagepipeline.decoder.f arg4, @l com.facebook.imagepipeline.core.n arg5, boolean arg6, boolean arg7, @l p arg8, @l j arg9, @l com.facebook.common.memory.m arg10, @l B arg11, @l B arg12, @l q arg13, @l com.facebook.imagepipeline.cache.n arg14, @l e arg15, int arg16, int arg17, boolean arg18, int arg19, @l com.facebook.imagepipeline.core.a arg20, boolean arg21, int arg22);
    }

    private final boolean A;
    private final int B;
    private final boolean C;
    private final boolean D;
    private final boolean E;
    private final boolean F;
    private final boolean G;
    private final boolean H;
    private final boolean I;
    private final int J;
    private final boolean K;
    @l
    private final com.facebook.imagepipeline.platform.f L;
    private final boolean M;
    @l
    public static final com.facebook.imagepipeline.core.l0.b N;
    private final boolean a;
    @m
    private final A0.b.a b;
    private final boolean c;
    @m
    private final b d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final int h;
    private final int i;
    private final int j;
    private final boolean k;
    private final int l;
    private final boolean m;
    private final boolean n;
    @l
    private final d o;
    @l
    private final q p;
    private final boolean q;
    private final boolean r;
    @l
    private final q s;
    private final boolean t;
    private final long u;
    private final boolean v;
    private final boolean w;
    private final boolean x;
    private final boolean y;
    private final boolean z;

    static {
        l0.N = new com.facebook.imagepipeline.core.l0.b(null);
    }

    private l0(a l0$a0) {
        this.a = l0$a0.c;
        this.b = l0$a0.d;
        this.c = l0$a0.e;
        this.d = l0$a0.f;
        this.e = l0$a0.g;
        this.f = l0$a0.h;
        this.g = l0$a0.i;
        this.h = l0$a0.j;
        this.i = l0$a0.k;
        this.j = l0$a0.l;
        this.k = l0$a0.m;
        this.l = l0$a0.n;
        this.m = l0$a0.o;
        this.n = l0$a0.p;
        d l0$d0 = l0$a0.q;
        if(l0$d0 == null) {
            l0$d0 = new c();
        }
        this.o = l0$d0;
        q q0 = l0$a0.r;
        if(q0 == null) {
            q0 = r.b;
            L.o(q0, "BOOLEAN_FALSE");
        }
        this.p = q0;
        this.q = l0$a0.s;
        this.r = l0$a0.t;
        this.s = l0$a0.u;
        this.t = l0$a0.v;
        this.u = l0$a0.w;
        this.v = l0$a0.x;
        this.w = l0$a0.y;
        this.x = l0$a0.z;
        this.y = l0$a0.A;
        this.z = l0$a0.B;
        this.A = l0$a0.C;
        this.B = l0$a0.D;
        this.H = l0$a0.I;
        this.J = l0$a0.J;
        this.C = l0$a0.E;
        this.D = l0$a0.F;
        this.E = l0$a0.G;
        this.F = l0$a0.H;
        this.G = l0$a0.b;
        this.I = l0$a0.K;
        this.K = l0$a0.L;
        this.L = l0$a0.M;
        this.M = l0$a0.N;
    }

    public l0(a l0$a0, w w0) {
        this(l0$a0);
    }

    @m
    public final A0.b.a A() {
        return this.b;
    }

    public final boolean B() {
        return this.M;
    }

    public final boolean C() {
        return this.c;
    }

    public final boolean D() {
        return this.A;
    }

    public final boolean E() {
        return this.x;
    }

    public final boolean F() {
        return this.z;
    }

    public final boolean G() {
        return this.y;
    }

    public final boolean H() {
        return this.t;
    }

    public final boolean I() {
        return this.q;
    }

    @l
    public final q J() {
        return this.p;
    }

    public final boolean K() {
        return this.m;
    }

    public final boolean L() {
        return this.n;
    }

    public final boolean M() {
        return this.a;
    }

    @l
    @n
    public static final a N(@l com.facebook.imagepipeline.core.y.a y$a0) {
        return l0.N.a(y$a0);
    }

    public final boolean a() {
        return this.C;
    }

    public final boolean b() {
        return this.H;
    }

    public final int c() {
        return this.J;
    }

    public final int d() {
        return this.h;
    }

    public final boolean e() {
        return this.k;
    }

    public final int f() {
        return this.j;
    }

    public final int g() {
        return this.i;
    }

    public final boolean h() {
        return this.I;
    }

    public final boolean i() {
        return this.w;
    }

    public final boolean j() {
        return this.r;
    }

    public final boolean k() {
        return this.D;
    }

    public final boolean l() {
        return this.v;
    }

    public final int m() {
        return this.l;
    }

    public final long n() {
        return this.u;
    }

    @l
    public final com.facebook.imagepipeline.platform.f o() {
        return this.L;
    }

    public final boolean p() {
        return this.K;
    }

    @l
    public final d q() {
        return this.o;
    }

    public final boolean r() {
        return this.F;
    }

    public final boolean s() {
        return this.E;
    }

    public final boolean t() {
        return this.G;
    }

    @l
    public final q u() {
        return this.s;
    }

    public final int v() {
        return this.B;
    }

    public final boolean w() {
        return this.g;
    }

    public final boolean x() {
        return this.f;
    }

    public final boolean y() {
        return this.e;
    }

    @m
    public final b z() {
        return this.d;
    }
}

