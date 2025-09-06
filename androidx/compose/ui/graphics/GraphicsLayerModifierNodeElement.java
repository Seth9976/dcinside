package androidx.compose.ui.graphics;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@ExperimentalComposeUiApi
final class GraphicsLayerModifierNodeElement extends ModifierNodeElement {
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;
    private final float j;
    private final float k;
    private final float l;
    private final long m;
    @l
    private final Shape n;
    private final boolean o;
    @m
    private final RenderEffect p;
    private final long q;
    private final long r;
    private final int s;

    private GraphicsLayerModifierNodeElement(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, Shape shape0, boolean z, RenderEffect renderEffect0, long v1, long v2, int v3) {
        this.c = f;
        this.d = f1;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = f5;
        this.i = f6;
        this.j = f7;
        this.k = f8;
        this.l = f9;
        this.m = v;
        this.n = shape0;
        this.o = z;
        this.p = renderEffect0;
        this.q = v1;
        this.r = v2;
        this.s = v3;
    }

    public GraphicsLayerModifierNodeElement(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, Shape shape0, boolean z, RenderEffect renderEffect0, long v1, long v2, int v3, w w0) {
        this(f, f1, f2, f3, f4, f5, f6, f7, f8, f9, v, shape0, z, renderEffect0, v1, v2, v3);
    }

    public final float A() {
        return this.d;
    }

    public final float C() {
        return this.e;
    }

    public final float D() {
        return this.f;
    }

    public final float F() {
        return this.g;
    }

    public final float G() {
        return this.h;
    }

    public final float I() {
        return this.i;
    }

    public final float J() {
        return this.j;
    }

    public final float M() {
        return this.k;
    }

    @l
    public final GraphicsLayerModifierNodeElement N(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, @l Shape shape0, boolean z, @m RenderEffect renderEffect0, long v1, long v2, int v3) {
        L.p(shape0, "shape");
        return new GraphicsLayerModifierNodeElement(f, f1, f2, f3, f4, f5, f6, f7, f8, f9, v, shape0, z, renderEffect0, v1, v2, v3, null);
    }

    public static GraphicsLayerModifierNodeElement O(GraphicsLayerModifierNodeElement graphicsLayerModifierNodeElement0, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, Shape shape0, boolean z, RenderEffect renderEffect0, long v1, long v2, int v3, int v4, Object object0) {
        float f10 = (v4 & 1) == 0 ? f : graphicsLayerModifierNodeElement0.c;
        float f11 = (v4 & 2) == 0 ? f1 : graphicsLayerModifierNodeElement0.d;
        float f12 = (v4 & 4) == 0 ? f2 : graphicsLayerModifierNodeElement0.e;
        float f13 = (v4 & 8) == 0 ? f3 : graphicsLayerModifierNodeElement0.f;
        float f14 = (v4 & 16) == 0 ? f4 : graphicsLayerModifierNodeElement0.g;
        float f15 = (v4 & 0x20) == 0 ? f5 : graphicsLayerModifierNodeElement0.h;
        float f16 = (v4 & 0x40) == 0 ? f6 : graphicsLayerModifierNodeElement0.i;
        float f17 = (v4 & 0x80) == 0 ? f7 : graphicsLayerModifierNodeElement0.j;
        float f18 = (v4 & 0x100) == 0 ? f8 : graphicsLayerModifierNodeElement0.k;
        float f19 = (v4 & 0x200) == 0 ? f9 : graphicsLayerModifierNodeElement0.l;
        long v5 = (v4 & 0x400) == 0 ? v : graphicsLayerModifierNodeElement0.m;
        Shape shape1 = (v4 & 0x800) == 0 ? shape0 : graphicsLayerModifierNodeElement0.n;
        boolean z1 = (v4 & 0x1000) == 0 ? z : graphicsLayerModifierNodeElement0.o;
        RenderEffect renderEffect1 = (v4 & 0x2000) == 0 ? renderEffect0 : graphicsLayerModifierNodeElement0.p;
        long v6 = (v4 & 0x4000) == 0 ? v1 : graphicsLayerModifierNodeElement0.q;
        long v7 = (v4 & 0x8000) == 0 ? v2 : graphicsLayerModifierNodeElement0.r;
        return (v4 & 0x10000) == 0 ? graphicsLayerModifierNodeElement0.N(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, v5, shape1, z1, renderEffect1, v6, v7, v3) : graphicsLayerModifierNodeElement0.N(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, v5, shape1, z1, renderEffect1, v6, v7, graphicsLayerModifierNodeElement0.s);
    }

    @l
    public SimpleGraphicsLayerModifier Q() {
        return new SimpleGraphicsLayerModifier(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, null);
    }

    public final float R() {
        return this.e;
    }

    public final long S() {
        return this.q;
    }

    public final float T() {
        return this.l;
    }

    public final boolean V() {
        return this.o;
    }

    public final int W() {
        return this.s;
    }

    @m
    public final RenderEffect Y() {
        return this.p;
    }

    public final float Z() {
        return this.i;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node a() {
        return this.Q();
    }

    public final float a0() {
        return this.j;
    }

    public final float b0() {
        return this.k;
    }

    public final float d0() {
        return this.c;
    }

    public final float e0() {
        return this.d;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof GraphicsLayerModifierNodeElement)) {
            return false;
        }
        if(Float.compare(this.c, ((GraphicsLayerModifierNodeElement)object0).c) != 0) {
            return false;
        }
        if(Float.compare(this.d, ((GraphicsLayerModifierNodeElement)object0).d) != 0) {
            return false;
        }
        if(Float.compare(this.e, ((GraphicsLayerModifierNodeElement)object0).e) != 0) {
            return false;
        }
        if(Float.compare(this.f, ((GraphicsLayerModifierNodeElement)object0).f) != 0) {
            return false;
        }
        if(Float.compare(this.g, ((GraphicsLayerModifierNodeElement)object0).g) != 0) {
            return false;
        }
        if(Float.compare(this.h, ((GraphicsLayerModifierNodeElement)object0).h) != 0) {
            return false;
        }
        if(Float.compare(this.i, ((GraphicsLayerModifierNodeElement)object0).i) != 0) {
            return false;
        }
        if(Float.compare(this.j, ((GraphicsLayerModifierNodeElement)object0).j) != 0) {
            return false;
        }
        if(Float.compare(this.k, ((GraphicsLayerModifierNodeElement)object0).k) != 0) {
            return false;
        }
        if(Float.compare(this.l, ((GraphicsLayerModifierNodeElement)object0).l) != 0) {
            return false;
        }
        if(!TransformOrigin.i(this.m, ((GraphicsLayerModifierNodeElement)object0).m)) {
            return false;
        }
        if(!L.g(this.n, ((GraphicsLayerModifierNodeElement)object0).n)) {
            return false;
        }
        if(this.o != ((GraphicsLayerModifierNodeElement)object0).o) {
            return false;
        }
        if(!L.g(this.p, ((GraphicsLayerModifierNodeElement)object0).p)) {
            return false;
        }
        if(!Color.y(this.q, ((GraphicsLayerModifierNodeElement)object0).q)) {
            return false;
        }
        return Color.y(this.r, ((GraphicsLayerModifierNodeElement)object0).r) ? CompositingStrategy.g(this.s, ((GraphicsLayerModifierNodeElement)object0).s) : false;
    }

    public final float f0() {
        return this.h;
    }

    @l
    public final Shape h0() {
        return this.n;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int v = Float.floatToIntBits(this.c);
        int v1 = Float.floatToIntBits(this.d);
        int v2 = Float.floatToIntBits(this.e);
        int v3 = Float.floatToIntBits(this.f);
        int v4 = Float.floatToIntBits(this.g);
        int v5 = Float.floatToIntBits(this.h);
        int v6 = Float.floatToIntBits(this.i);
        int v7 = Float.floatToIntBits(this.j);
        int v8 = Float.floatToIntBits(this.k);
        int v9 = Float.floatToIntBits(this.l);
        int v10 = TransformOrigin.m(this.m);
        int v11 = this.n.hashCode();
        int v12 = this.o;
        if(v12) {
            v12 = 1;
        }
        return this.p == null ? ((((((((((((((v * 0x1F + v1) * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v11) * 0x1F + v12) * 961 + Color.K(this.q)) * 0x1F + Color.K(this.r)) * 0x1F + this.s : (((((((((((((((v * 0x1F + v1) * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v11) * 0x1F + v12) * 0x1F + this.p.hashCode()) * 0x1F + Color.K(this.q)) * 0x1F + Color.K(this.r)) * 0x1F + this.s;
    }

    public final long i0() {
        return this.r;
    }

    public final long j0() {
        return this.m;
    }

    public final float k0() {
        return this.f;
    }

    public final float l0() {
        return this.g;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void m(@l InspectorInfo inspectorInfo0) {
        L.p(inspectorInfo0, "<this>");
        inspectorInfo0.d("graphicsLayer");
        inspectorInfo0.b().c("scaleX", this.c);
        inspectorInfo0.b().c("scaleY", this.d);
        inspectorInfo0.b().c("alpha", this.e);
        inspectorInfo0.b().c("translationX", this.f);
        inspectorInfo0.b().c("translationY", this.g);
        inspectorInfo0.b().c("shadowElevation", this.h);
        inspectorInfo0.b().c("rotationX", this.i);
        inspectorInfo0.b().c("rotationY", this.j);
        inspectorInfo0.b().c("rotationZ", this.k);
        inspectorInfo0.b().c("cameraDistance", this.l);
        inspectorInfo0.b().c("transformOrigin", TransformOrigin.b(this.m));
        inspectorInfo0.b().c("shape", this.n);
        inspectorInfo0.b().c("clip", Boolean.valueOf(this.o));
        inspectorInfo0.b().c("renderEffect", this.p);
        inspectorInfo0.b().c("ambientShadowColor", Color.n(this.q));
        inspectorInfo0.b().c("spotShadowColor", Color.n(this.r));
        inspectorInfo0.b().c("compositingStrategy", CompositingStrategy.d(this.s));
    }

    @l
    public SimpleGraphicsLayerModifier m0(@l SimpleGraphicsLayerModifier simpleGraphicsLayerModifier0) {
        L.p(simpleGraphicsLayerModifier0, "node");
        simpleGraphicsLayerModifier0.K0(this.c);
        simpleGraphicsLayerModifier0.L0(this.d);
        simpleGraphicsLayerModifier0.B0(this.e);
        simpleGraphicsLayerModifier0.Q0(this.f);
        simpleGraphicsLayerModifier0.R0(this.g);
        simpleGraphicsLayerModifier0.M0(this.h);
        simpleGraphicsLayerModifier0.H0(this.i);
        simpleGraphicsLayerModifier0.I0(this.j);
        simpleGraphicsLayerModifier0.J0(this.k);
        simpleGraphicsLayerModifier0.D0(this.l);
        simpleGraphicsLayerModifier0.P0(this.m);
        simpleGraphicsLayerModifier0.N0(this.n);
        simpleGraphicsLayerModifier0.E0(this.o);
        simpleGraphicsLayerModifier0.G0(this.p);
        simpleGraphicsLayerModifier0.C0(this.q);
        simpleGraphicsLayerModifier0.O0(this.r);
        simpleGraphicsLayerModifier0.F0(this.s);
        simpleGraphicsLayerModifier0.A0();
        return simpleGraphicsLayerModifier0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node n(Node modifier$Node0) {
        return this.m0(((SimpleGraphicsLayerModifier)modifier$Node0));
    }

    public final float p() {
        return this.c;
    }

    public final float q() {
        return this.l;
    }

    public final long r() {
        return this.m;
    }

    @l
    public final Shape s() {
        return this.n;
    }

    public final boolean t() {
        return this.o;
    }

    @Override
    @l
    public String toString() {
        return "GraphicsLayerModifierNodeElement(scaleX=" + this.c + ", scaleY=" + this.d + ", alpha=" + this.e + ", translationX=" + this.f + ", translationY=" + this.g + ", shadowElevation=" + this.h + ", rotationX=" + this.i + ", rotationY=" + this.j + ", rotationZ=" + this.k + ", cameraDistance=" + this.l + ", transformOrigin=" + TransformOrigin.n(this.m) + ", shape=" + this.n + ", clip=" + this.o + ", renderEffect=" + this.p + ", ambientShadowColor=" + Color.L(this.q) + ", spotShadowColor=" + Color.L(this.r) + ", compositingStrategy=" + ("CompositingStrategy(value=" + this.s + ')') + ')';
    }

    @m
    public final RenderEffect w() {
        return this.p;
    }

    public final long x() {
        return this.q;
    }

    public final long y() {
        return this.r;
    }

    public final int z() {
        return this.s;
    }
}

