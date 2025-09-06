package androidx.compose.ui.platform;

import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class DeviceRenderNodeData {
    private final long a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private int m;
    private int n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private boolean u;
    private boolean v;
    private float w;
    @m
    private RenderEffect x;
    private int y;

    private DeviceRenderNodeData(long v, int v1, int v2, int v3, int v4, int v5, int v6, float f, float f1, float f2, float f3, float f4, int v7, int v8, float f5, float f6, float f7, float f8, float f9, float f10, boolean z, boolean z1, float f11, RenderEffect renderEffect0, int v9) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
        this.g = v6;
        this.h = f;
        this.i = f1;
        this.j = f2;
        this.k = f3;
        this.l = f4;
        this.m = v7;
        this.n = v8;
        this.o = f5;
        this.p = f6;
        this.q = f7;
        this.r = f8;
        this.s = f9;
        this.t = f10;
        this.u = z;
        this.v = z1;
        this.w = f11;
        this.x = renderEffect0;
        this.y = v9;
    }

    public DeviceRenderNodeData(long v, int v1, int v2, int v3, int v4, int v5, int v6, float f, float f1, float f2, float f3, float f4, int v7, int v8, float f5, float f6, float f7, float f8, float f9, float f10, boolean z, boolean z1, float f11, RenderEffect renderEffect0, int v9, w w0) {
        this(v, v1, v2, v3, v4, v5, v6, f, f1, f2, f3, f4, v7, v8, f5, f6, f7, f8, f9, f10, z, z1, f11, renderEffect0, v9);
    }

    public static DeviceRenderNodeData A(DeviceRenderNodeData deviceRenderNodeData0, long v, int v1, int v2, int v3, int v4, int v5, int v6, float f, float f1, float f2, float f3, float f4, int v7, int v8, float f5, float f6, float f7, float f8, float f9, float f10, boolean z, boolean z1, float f11, RenderEffect renderEffect0, int v9, int v10, Object object0) {
        long v11 = (v10 & 1) == 0 ? v : deviceRenderNodeData0.a;
        int v12 = (v10 & 2) == 0 ? v1 : deviceRenderNodeData0.b;
        int v13 = (v10 & 4) == 0 ? v2 : deviceRenderNodeData0.c;
        int v14 = (v10 & 8) == 0 ? v3 : deviceRenderNodeData0.d;
        int v15 = (v10 & 16) == 0 ? v4 : deviceRenderNodeData0.e;
        int v16 = (v10 & 0x20) == 0 ? v5 : deviceRenderNodeData0.f;
        int v17 = (v10 & 0x40) == 0 ? v6 : deviceRenderNodeData0.g;
        float f12 = (v10 & 0x80) == 0 ? f : deviceRenderNodeData0.h;
        float f13 = (v10 & 0x100) == 0 ? f1 : deviceRenderNodeData0.i;
        float f14 = (v10 & 0x200) == 0 ? f2 : deviceRenderNodeData0.j;
        float f15 = (v10 & 0x400) == 0 ? f3 : deviceRenderNodeData0.k;
        float f16 = (v10 & 0x800) == 0 ? f4 : deviceRenderNodeData0.l;
        int v18 = (v10 & 0x1000) == 0 ? v7 : deviceRenderNodeData0.m;
        int v19 = (v10 & 0x2000) == 0 ? v8 : deviceRenderNodeData0.n;
        float f17 = (v10 & 0x4000) == 0 ? f5 : deviceRenderNodeData0.o;
        float f18 = (v10 & 0x8000) == 0 ? f6 : deviceRenderNodeData0.p;
        float f19 = (v10 & 0x10000) == 0 ? f7 : deviceRenderNodeData0.q;
        float f20 = (v10 & 0x20000) == 0 ? f8 : deviceRenderNodeData0.r;
        float f21 = (v10 & 0x40000) == 0 ? f9 : deviceRenderNodeData0.s;
        float f22 = (v10 & 0x80000) == 0 ? f10 : deviceRenderNodeData0.t;
        boolean z2 = (v10 & 0x100000) == 0 ? z : deviceRenderNodeData0.u;
        boolean z3 = (v10 & 0x200000) == 0 ? z1 : deviceRenderNodeData0.v;
        float f23 = (v10 & 0x400000) == 0 ? f11 : deviceRenderNodeData0.w;
        RenderEffect renderEffect1 = (v10 & 0x800000) == 0 ? renderEffect0 : deviceRenderNodeData0.x;
        return (v10 & 0x1000000) == 0 ? deviceRenderNodeData0.z(v11, v12, v13, v14, v15, v16, v17, f12, f13, f14, f15, f16, v18, v19, f17, f18, f19, f20, f21, f22, z2, z3, f23, renderEffect1, v9) : deviceRenderNodeData0.z(v11, v12, v13, v14, v15, v16, v17, f12, f13, f14, f15, f16, v18, v19, f17, f18, f19, f20, f21, f22, z2, z3, f23, renderEffect1, deviceRenderNodeData0.y);
    }

    public final float B() {
        return this.w;
    }

    public final int C() {
        return this.m;
    }

    public final int D() {
        return this.e;
    }

    public final float E() {
        return this.r;
    }

    public final boolean F() {
        return this.v;
    }

    public final boolean G() {
        return this.u;
    }

    public final int H() {
        return this.y;
    }

    public final float I() {
        return this.l;
    }

    public final int J() {
        return this.g;
    }

    public final int K() {
        return this.b;
    }

    public final float L() {
        return this.s;
    }

    public final float M() {
        return this.t;
    }

    @m
    public final RenderEffect N() {
        return this.x;
    }

    public final int O() {
        return this.d;
    }

    public final float P() {
        return this.p;
    }

    public final float Q() {
        return this.q;
    }

    public final float R() {
        return this.o;
    }

    public final float S() {
        return this.h;
    }

    public final float T() {
        return this.i;
    }

    public final int U() {
        return this.n;
    }

    public final int V() {
        return this.c;
    }

    public final float W() {
        return this.j;
    }

    public final float X() {
        return this.k;
    }

    public final long Y() {
        return this.a;
    }

    public final int Z() {
        return this.f;
    }

    public final long a() {
        return this.a;
    }

    public final void a0(float f) {
        this.w = f;
    }

    public final float b() {
        return this.j;
    }

    public final void b0(int v) {
        this.m = v;
    }

    public final float c() {
        return this.k;
    }

    public final void c0(float f) {
        this.r = f;
    }

    public final float d() {
        return this.l;
    }

    public final void d0(boolean z) {
        this.v = z;
    }

    public final int e() {
        return this.m;
    }

    public final void e0(boolean z) {
        this.u = z;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DeviceRenderNodeData)) {
            return false;
        }
        DeviceRenderNodeData deviceRenderNodeData0 = (DeviceRenderNodeData)object0;
        if(this.a != deviceRenderNodeData0.a) {
            return false;
        }
        if(this.b != deviceRenderNodeData0.b) {
            return false;
        }
        if(this.c != deviceRenderNodeData0.c) {
            return false;
        }
        if(this.d != deviceRenderNodeData0.d) {
            return false;
        }
        if(this.e != deviceRenderNodeData0.e) {
            return false;
        }
        if(this.f != deviceRenderNodeData0.f) {
            return false;
        }
        if(this.g != deviceRenderNodeData0.g) {
            return false;
        }
        if(Float.compare(this.h, deviceRenderNodeData0.h) != 0) {
            return false;
        }
        if(Float.compare(this.i, deviceRenderNodeData0.i) != 0) {
            return false;
        }
        if(Float.compare(this.j, deviceRenderNodeData0.j) != 0) {
            return false;
        }
        if(Float.compare(this.k, deviceRenderNodeData0.k) != 0) {
            return false;
        }
        if(Float.compare(this.l, deviceRenderNodeData0.l) != 0) {
            return false;
        }
        if(this.m != deviceRenderNodeData0.m) {
            return false;
        }
        if(this.n != deviceRenderNodeData0.n) {
            return false;
        }
        if(Float.compare(this.o, deviceRenderNodeData0.o) != 0) {
            return false;
        }
        if(Float.compare(this.p, deviceRenderNodeData0.p) != 0) {
            return false;
        }
        if(Float.compare(this.q, deviceRenderNodeData0.q) != 0) {
            return false;
        }
        if(Float.compare(this.r, deviceRenderNodeData0.r) != 0) {
            return false;
        }
        if(Float.compare(this.s, deviceRenderNodeData0.s) != 0) {
            return false;
        }
        if(Float.compare(this.t, deviceRenderNodeData0.t) != 0) {
            return false;
        }
        if(this.u != deviceRenderNodeData0.u) {
            return false;
        }
        if(this.v != deviceRenderNodeData0.v) {
            return false;
        }
        if(Float.compare(this.w, deviceRenderNodeData0.w) != 0) {
            return false;
        }
        return L.g(this.x, deviceRenderNodeData0.x) ? CompositingStrategy.g(this.y, deviceRenderNodeData0.y) : false;
    }

    public final int f() {
        return this.n;
    }

    public final void f0(int v) {
        this.y = v;
    }

    public final float g() {
        return this.o;
    }

    public final void g0(float f) {
        this.l = f;
    }

    public final float h() {
        return this.p;
    }

    public final void h0(float f) {
        this.s = f;
    }

    @Override
    public int hashCode() {
        int v = (((((((((((((((((((((int)(this.a ^ this.a >>> 0x20)) * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d) * 0x1F + this.e) * 0x1F + this.f) * 0x1F + this.g) * 0x1F + Float.floatToIntBits(this.h)) * 0x1F + Float.floatToIntBits(this.i)) * 0x1F + Float.floatToIntBits(this.j)) * 0x1F + Float.floatToIntBits(this.k)) * 0x1F + Float.floatToIntBits(this.l)) * 0x1F + this.m) * 0x1F + this.n) * 0x1F + Float.floatToIntBits(this.o)) * 0x1F + Float.floatToIntBits(this.p)) * 0x1F + Float.floatToIntBits(this.q)) * 0x1F + Float.floatToIntBits(this.r)) * 0x1F + Float.floatToIntBits(this.s)) * 0x1F + Float.floatToIntBits(this.t)) * 0x1F;
        int v1 = this.u;
        int v2 = 1;
        if(v1) {
            v1 = 1;
        }
        if(!this.v) {
            v2 = false;
        }
        int v3 = Float.floatToIntBits(this.w);
        return this.x == null ? (((v + v1) * 0x1F + v2) * 0x1F + v3) * 961 + this.y : ((((v + v1) * 0x1F + v2) * 0x1F + v3) * 0x1F + this.x.hashCode()) * 0x1F + this.y;
    }

    public final float i() {
        return this.q;
    }

    public final void i0(float f) {
        this.t = f;
    }

    public final float j() {
        return this.r;
    }

    public final void j0(@m RenderEffect renderEffect0) {
        this.x = renderEffect0;
    }

    public final float k() {
        return this.s;
    }

    public final void k0(float f) {
        this.p = f;
    }

    public final int l() {
        return this.b;
    }

    public final void l0(float f) {
        this.q = f;
    }

    public final float m() {
        return this.t;
    }

    public final void m0(float f) {
        this.o = f;
    }

    public final boolean n() {
        return this.u;
    }

    public final void n0(float f) {
        this.h = f;
    }

    public final boolean o() {
        return this.v;
    }

    public final void o0(float f) {
        this.i = f;
    }

    public final float p() {
        return this.w;
    }

    public final void p0(int v) {
        this.n = v;
    }

    @m
    public final RenderEffect q() {
        return this.x;
    }

    public final void q0(float f) {
        this.j = f;
    }

    public final int r() {
        return this.y;
    }

    public final void r0(float f) {
        this.k = f;
    }

    public final int s() {
        return this.c;
    }

    public final int t() {
        return this.d;
    }

    @Override
    @l
    public String toString() {
        return "DeviceRenderNodeData(uniqueId=" + this.a + ", left=" + this.b + ", top=" + this.c + ", right=" + this.d + ", bottom=" + this.e + ", width=" + this.f + ", height=" + this.g + ", scaleX=" + this.h + ", scaleY=" + this.i + ", translationX=" + this.j + ", translationY=" + this.k + ", elevation=" + this.l + ", ambientShadowColor=" + this.m + ", spotShadowColor=" + this.n + ", rotationZ=" + this.o + ", rotationX=" + this.p + ", rotationY=" + this.q + ", cameraDistance=" + this.r + ", pivotX=" + this.s + ", pivotY=" + this.t + ", clipToOutline=" + this.u + ", clipToBounds=" + this.v + ", alpha=" + this.w + ", renderEffect=" + this.x + ", compositingStrategy=" + ("CompositingStrategy(value=" + this.y + ')') + ')';
    }

    public final int u() {
        return this.e;
    }

    public final int v() {
        return this.f;
    }

    public final int w() {
        return this.g;
    }

    public final float x() {
        return this.h;
    }

    public final float y() {
        return this.i;
    }

    @l
    public final DeviceRenderNodeData z(long v, int v1, int v2, int v3, int v4, int v5, int v6, float f, float f1, float f2, float f3, float f4, int v7, int v8, float f5, float f6, float f7, float f8, float f9, float f10, boolean z, boolean z1, float f11, @m RenderEffect renderEffect0, int v9) {
        return new DeviceRenderNodeData(v, v1, v2, v3, v4, v5, v6, f, f1, f2, f3, f4, v7, v8, f5, f6, f7, f8, f9, f10, z, z1, f11, renderEffect0, v9, null);
    }
}

