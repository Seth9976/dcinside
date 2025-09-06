package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.a;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class ReusableGraphicsLayerScope implements GraphicsLayerScope {
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private long g;
    private long h;
    private float i;
    private float j;
    private float k;
    private float l;
    private long m;
    @l
    private Shape n;
    private boolean o;
    private int p;
    private long q;
    @l
    private Density r;
    @m
    private RenderEffect s;

    public ReusableGraphicsLayerScope() {
        this.a = 1.0f;
        this.b = 1.0f;
        this.c = 1.0f;
        this.g = 0xFF00000000000000L;
        this.h = 0xFF00000000000000L;
        this.l = 8.0f;
        this.m = 0x3F0000003F000000L;
        this.n = RectangleShapeKt.a();
        this.p = 0;
        this.q = 0x7FC000007FC00000L;
        this.r = DensityKt.b(1.0f, 0.0f, 2, null);
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void A(float f) {
        this.k = f;
    }

    @Override  // androidx.compose.ui.unit.Density
    public float C(int v) {
        return a.e(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float D(float f) {
        return a.d(this, f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public int E1(long v) {
        return a.a(this, v);
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public float F() {
        return this.e;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    @l
    public Shape F0() {
        return this.n;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public float G() {
        return this.d;
    }

    @Override  // androidx.compose.ui.unit.Density
    public Rect H0(DpRect dpRect0) {
        return a.i(this, dpRect0);
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void I0(@l Shape shape0) {
        L.p(shape0, "<set-?>");
        this.n = shape0;
    }

    @Override  // androidx.compose.ui.unit.Density
    public long J(long v) {
        return a.j(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long M(float f) {
        return a.k(this, f);
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public float N() {
        return this.j;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public float O() {
        return this.k;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public float P0() {
        return this.f;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void R(float f) {
        this.a = f;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void T(@m RenderEffect renderEffect0) {
        this.s = renderEffect0;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public float V() {
        return this.a;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public long V0() {
        return this.g;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void W(float f) {
        this.b = f;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public float Y() {
        return this.i;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void Z0(long v) {
        this.g = v;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void a0(float f) {
        this.d = f;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public long a1() {
        return this.m;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public long b() {
        return this.q;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public float b0() {
        return this.b;
    }

    @Override  // androidx.compose.ui.unit.Density
    public int b1(float f) {
        return a.b(this, f);
    }

    @l
    public final Density c() {
        return this.r;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void c1(long v) {
        this.h = v;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public boolean d() {
        return this.o;
    }

    public final void e() {
        this.R(1.0f);
        this.W(1.0f);
        this.j(1.0f);
        this.a0(0.0f);
        this.n(0.0f);
        this.q0(0.0f);
        this.Z0(0xFF00000000000000L);
        this.c1(0xFF00000000000000L);
        this.x(0.0f);
        this.y(0.0f);
        this.A(0.0f);
        this.w(8.0f);
        this.p0(0x3F0000003F000000L);
        this.I0(RectangleShapeKt.a());
        this.o0(false);
        this.T(null);
        this.q(0);
        this.g(0x7FC000007FC00000L);
    }

    public final void f(@l Density density0) {
        L.p(density0, "<set-?>");
        this.r = density0;
    }

    public void g(long v) {
        this.q = v;
    }

    @Override  // androidx.compose.ui.unit.Density
    public float g1(long v) {
        return a.g(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.r.getDensity();
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public float i() {
        return this.c;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void j(float f) {
        this.c = f;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    @m
    public RenderEffect l() {
        return this.s;
    }

    @Override  // androidx.compose.ui.unit.Density
    public long m(long v) {
        return a.f(this, v);
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void n(float f) {
        this.e = f;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public long n0() {
        return this.h;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void o0(boolean z) {
        this.o = z;
    }

    @Override  // androidx.compose.ui.unit.Density
    public float p(long v) {
        return a.c(this, v);
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void p0(long v) {
        this.m = v;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void q(int v) {
        this.p = v;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void q0(float f) {
        this.f = f;
    }

    @Override  // androidx.compose.ui.unit.Density
    public long r(int v) {
        return a.m(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long s(float f) {
        return a.l(this, f);
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public float t() {
        return this.l;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void w(float f) {
        this.l = f;
    }

    @Override  // androidx.compose.ui.unit.Density
    public float w1() {
        return this.r.w1();
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void x(float f) {
        this.i = f;
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public void y(float f) {
        this.j = f;
    }

    @Override  // androidx.compose.ui.unit.Density
    public float y1(float f) {
        return a.h(this, f);
    }

    @Override  // androidx.compose.ui.graphics.GraphicsLayerScope
    public int z() {
        return this.p;
    }
}

