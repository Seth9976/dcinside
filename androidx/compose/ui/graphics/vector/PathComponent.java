package androidx.compose.ui.graphics.vector;

import A3.a;
import androidx.compose.ui.graphics.AndroidPathMeasure_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathMeasure;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.drawscope.b;
import androidx.compose.ui.graphics.h0;
import java.util.List;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/PathComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,555:1\n1#2:556\n*E\n"})
public final class PathComponent extends VNode {
    @l
    private String c;
    @m
    private Brush d;
    private float e;
    @l
    private List f;
    private int g;
    private float h;
    private float i;
    @m
    private Brush j;
    private int k;
    private int l;
    private float m;
    private float n;
    private float o;
    private float p;
    private boolean q;
    private boolean r;
    private boolean s;
    @m
    private Stroke t;
    @l
    private final Path u;
    @l
    private final Path v;
    @l
    private final D w;
    @l
    private final PathParser x;

    public PathComponent() {
        super(null);
        this.c = "";
        this.e = 1.0f;
        this.f = VectorKt.h();
        this.g = 0;
        this.h = 1.0f;
        this.k = 0;
        this.l = 0;
        this.m = 4.0f;
        this.o = 1.0f;
        this.q = true;
        this.r = true;
        this.s = true;
        this.u = AndroidPath_androidKt.a();
        this.v = AndroidPath_androidKt.a();
        this.w = E.c(H.c, androidx.compose.ui.graphics.vector.PathComponent.pathMeasure.2.e);
        this.x = new PathParser();

        final class androidx.compose.ui.graphics.vector.PathComponent.pathMeasure.2 extends N implements a {
            public static final androidx.compose.ui.graphics.vector.PathComponent.pathMeasure.2 e;

            static {
                androidx.compose.ui.graphics.vector.PathComponent.pathMeasure.2.e = new androidx.compose.ui.graphics.vector.PathComponent.pathMeasure.2();
            }

            androidx.compose.ui.graphics.vector.PathComponent.pathMeasure.2() {
                super(0);
            }

            @l
            public final PathMeasure b() {
                return AndroidPathMeasure_androidKt.a();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

    }

    public final void A(int v) {
        this.k = v;
        this.r = true;
        this.c();
    }

    public final void B(int v) {
        this.l = v;
        this.r = true;
        this.c();
    }

    public final void C(float f) {
        this.m = f;
        this.r = true;
        this.c();
    }

    public final void D(float f) {
        this.i = f;
        this.c();
    }

    public final void E(float f) {
        if(this.o != f) {
            this.o = f;
            this.s = true;
            this.c();
        }
    }

    public final void F(float f) {
        if(this.p != f) {
            this.p = f;
            this.s = true;
            this.c();
        }
    }

    public final void G(float f) {
        if(this.n != f) {
            this.n = f;
            this.s = true;
            this.c();
        }
    }

    private final void H() {
        this.x.e();
        this.u.reset();
        this.x.b(this.f).D(this.u);
        this.I();
    }

    private final void I() {
        this.v.reset();
        if(this.n == 0.0f && this.o == 1.0f) {
            h0.c(this.v, this.u, 0L, 2, null);
            return;
        }
        this.j().c(this.u, false);
        float f = this.j().getLength();
        float f1 = (this.n + this.p) % 1.0f * f;
        float f2 = (this.o + this.p) % 1.0f * f;
        if(f1 > f2) {
            this.j().b(f1, f, this.v, true);
            this.j().b(0.0f, f2, this.v, true);
            return;
        }
        this.j().b(f1, f2, this.v, true);
    }

    @Override  // androidx.compose.ui.graphics.vector.VNode
    public void a(@l DrawScope drawScope0) {
        L.p(drawScope0, "<this>");
        if(this.q) {
            this.H();
        }
        else if(this.s) {
            this.I();
        }
        this.q = false;
        this.s = false;
        Brush brush0 = this.d;
        if(brush0 != null) {
            b.F(drawScope0, this.v, brush0, this.e, null, null, 0, 56, null);
        }
        Brush brush1 = this.j;
        if(brush1 != null) {
            Stroke stroke0 = this.t;
            if(this.r || stroke0 == null) {
                stroke0 = new Stroke(this.i, this.m, this.k, this.l, null, 16, null);
                this.t = stroke0;
                this.r = false;
            }
            b.F(drawScope0, this.v, brush1, this.h, stroke0, null, 0, 0x30, null);
        }
    }

    @m
    public final Brush e() {
        return this.d;
    }

    public final float f() {
        return this.e;
    }

    @l
    public final String g() {
        return this.c;
    }

    @l
    public final List h() {
        return this.f;
    }

    public final int i() {
        return this.g;
    }

    private final PathMeasure j() {
        return (PathMeasure)this.w.getValue();
    }

    @m
    public final Brush k() {
        return this.j;
    }

    public final float l() {
        return this.h;
    }

    public final int m() {
        return this.k;
    }

    public final int n() {
        return this.l;
    }

    public final float o() {
        return this.m;
    }

    public final float p() {
        return this.i;
    }

    public final float q() {
        return this.o;
    }

    public final float r() {
        return this.p;
    }

    public final float s() {
        return this.n;
    }

    public final void t(@m Brush brush0) {
        this.d = brush0;
        this.c();
    }

    @Override
    @l
    public String toString() {
        return this.u.toString();
    }

    public final void u(float f) {
        this.e = f;
        this.c();
    }

    public final void v(@l String s) {
        L.p(s, "value");
        this.c = s;
        this.c();
    }

    public final void w(@l List list0) {
        L.p(list0, "value");
        this.f = list0;
        this.q = true;
        this.c();
    }

    public final void x(int v) {
        this.g = v;
        this.v.p(v);
        this.c();
    }

    public final void y(@m Brush brush0) {
        this.j = brush0;
        this.c();
    }

    public final void z(float f) {
        this.h = f;
        this.c();
    }
}

