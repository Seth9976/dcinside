package androidx.compose.ui.platform;

import A3.a;
import A3.o;
import android.graphics.Outline;
import android.os.Build.VERSION;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

@RequiresApi(23)
@s0({"SMAP\nRenderNodeLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeLayer.android.kt\nandroidx/compose/ui/platform/RenderNodeLayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,378:1\n1#2:379\n*E\n"})
public final class RenderNodeLayer implements GraphicLayerInfo, OwnedLayer {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @RequiresApi(29)
    static final class UniqueDrawingIdApi29 {
        @l
        public static final UniqueDrawingIdApi29 a;

        static {
            UniqueDrawingIdApi29.a = new UniqueDrawingIdApi29();
        }

        @DoNotInline
        @n
        public static final long a(@l View view0) {
            L.p(view0, "view");
            return view0.getUniqueDrawingId();
        }
    }

    @l
    private final AndroidComposeView a;
    @m
    private Function1 b;
    @m
    private a c;
    private boolean d;
    @l
    private final OutlineResolver e;
    private boolean f;
    private boolean g;
    @m
    private Paint h;
    @l
    private final LayerMatrixCache i;
    @l
    private final CanvasHolder j;
    private long k;
    @l
    private final DeviceRenderNode l;
    @l
    public static final Companion m;
    @l
    private static final o n;

    static {
        RenderNodeLayer.m = new Companion(null);
        RenderNodeLayer.n = RenderNodeLayer.Companion.getMatrix.1.e;
    }

    public RenderNodeLayer(@l AndroidComposeView androidComposeView0, @l Function1 function10, @l a a0) {
        L.p(androidComposeView0, "ownerView");
        L.p(function10, "drawBlock");
        L.p(a0, "invalidateParentLayer");
        super();
        this.a = androidComposeView0;
        this.b = function10;
        this.c = a0;
        this.e = new OutlineResolver(androidComposeView0.getDensity());
        this.i = new LayerMatrixCache(RenderNodeLayer.n);
        this.j = new CanvasHolder();
        this.k = 0x3F0000003F000000L;
        RenderNodeApi29 renderNodeApi290 = Build.VERSION.SDK_INT >= 29 ? new RenderNodeApi29(androidComposeView0) : new RenderNodeApi23(androidComposeView0);
        renderNodeApi290.r(true);
        this.l = renderNodeApi290;
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void a(@l MutableRect mutableRect0, boolean z) {
        L.p(mutableRect0, "rect");
        if(z) {
            float[] arr_f = this.i.a(this.l);
            if(arr_f == null) {
                mutableRect0.k(0.0f, 0.0f, 0.0f, 0.0f);
                return;
            }
            Matrix.l(arr_f, mutableRect0);
            return;
        }
        Matrix.l(this.i.b(this.l), mutableRect0);
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void b(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        android.graphics.Canvas canvas1 = AndroidCanvas_androidKt.d(canvas0);
        boolean z = false;
        if(canvas1.isHardwareAccelerated()) {
            this.k();
            if(this.l.X() > 0.0f) {
                z = true;
            }
            this.g = z;
            if(z) {
                canvas0.w();
            }
            this.l.b(canvas1);
            if(this.g) {
                canvas0.n();
            }
        }
        else {
            float f = (float)this.l.d();
            float f1 = (float)this.l.M();
            float f2 = (float)this.l.c();
            float f3 = (float)this.l.v();
            if(this.l.i() < 1.0f) {
                Paint paint0 = this.h;
                if(paint0 == null) {
                    paint0 = AndroidPaint_androidKt.a();
                    this.h = paint0;
                }
                paint0.j(this.l.i());
                canvas1.saveLayer(f, f1, f2, f3, paint0.l());
            }
            else {
                canvas0.f();
            }
            canvas0.c(f, f1);
            canvas0.C(this.i.b(this.l));
            this.l(canvas0);
            Function1 function10 = this.b;
            if(function10 != null) {
                function10.invoke(canvas0);
            }
            canvas0.v();
            this.n(false);
        }
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void c(@l Function1 function10, @l a a0) {
        L.p(function10, "drawBlock");
        L.p(a0, "invalidateParentLayer");
        this.n(false);
        this.f = false;
        this.g = false;
        this.k = 0x3F0000003F000000L;
        this.b = function10;
        this.c = a0;
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void d(@l float[] arr_f) {
        L.p(arr_f, "matrix");
        Matrix.u(arr_f, this.i.b(this.l));
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        if(this.l.h()) {
            this.l.J();
        }
        this.b = null;
        this.c = null;
        this.f = true;
        this.n(false);
        this.a.o0();
        this.a.m0(this);
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void e(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, @l Shape shape0, boolean z, @m RenderEffect renderEffect0, long v1, long v2, int v3, @l LayoutDirection layoutDirection0, @l Density density0) {
        L.p(shape0, "shape");
        L.p(layoutDirection0, "layoutDirection");
        L.p(density0, "density");
        this.k = v;
        int v4 = 0;
        int v5 = !this.l.p() || this.e.d() ? 0 : 1;
        this.l.R(f);
        this.l.W(f1);
        this.l.j(f2);
        this.l.a0(f3);
        this.l.n(f4);
        this.l.f(f5);
        int v6 = ColorKt.r(v1);
        this.l.Q(v6);
        int v7 = ColorKt.r(v2);
        this.l.U(v7);
        this.l.A(f8);
        this.l.x(f6);
        this.l.y(f7);
        this.l.w(f9);
        float f10 = TransformOrigin.k(v) * ((float)this.l.getWidth());
        this.l.B(f10);
        float f11 = TransformOrigin.l(v) * ((float)this.l.getHeight());
        this.l.C(f11);
        this.l.E(z && shape0 != RectangleShapeKt.a());
        this.l.e(z && shape0 == RectangleShapeKt.a());
        this.l.T(renderEffect0);
        this.l.q(v3);
        float f12 = this.l.i();
        boolean z1 = this.l.p();
        float f13 = this.l.X();
        boolean z2 = this.e.g(shape0, f12, z1, f13, layoutDirection0, density0);
        Outline outline0 = this.e.c();
        this.l.D(outline0);
        if(this.l.p() && !this.e.d()) {
            v4 = 1;
        }
        if(v5 != v4 || v4 != 0 && z2) {
            this.invalidate();
        }
        else {
            this.o();
        }
        if(!this.g && this.l.X() > 0.0f) {
            a a0 = this.c;
            if(a0 != null) {
                a0.invoke();
            }
        }
        this.i.c();
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public long f(long v, boolean z) {
        if(z) {
            float[] arr_f = this.i.a(this.l);
            return arr_f == null ? 0x7F8000007F800000L : Matrix.j(arr_f, v);
        }
        return Matrix.j(this.i.b(this.l), v);
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void g(long v) {
        this.l.B(TransformOrigin.k(this.k) * ((float)(((int)(v >> 0x20)))));
        this.l.C(TransformOrigin.l(this.k) * ((float)(((int)(v & 0xFFFFFFFFL)))));
        int v1 = this.l.d();
        int v2 = this.l.M();
        int v3 = this.l.d();
        int v4 = this.l.M();
        if(this.l.I(v1, v2, v3 + ((int)(v >> 0x20)), v4 + ((int)(v & 0xFFFFFFFFL)))) {
            this.e.h(SizeKt.a(((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL))));
            Outline outline0 = this.e.c();
            this.l.D(outline0);
            this.invalidate();
            this.i.c();
        }
    }

    @Override  // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.l.a();
    }

    @Override  // androidx.compose.ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        return Build.VERSION.SDK_INT < 29 ? -1L : UniqueDrawingIdApi29.a(this.a);
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public boolean h(long v) {
        float f = Offset.p(v);
        float f1 = Offset.r(v);
        if(this.l.L()) {
            return 0.0f <= f && f < ((float)this.l.getWidth()) && 0.0f <= f1 && f1 < ((float)this.l.getHeight());
        }
        return this.l.p() ? this.e.e(v) : true;
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void i(@l float[] arr_f) {
        L.p(arr_f, "matrix");
        float[] arr_f1 = this.i.a(this.l);
        if(arr_f1 != null) {
            Matrix.u(arr_f, arr_f1);
        }
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if(!this.d && !this.f) {
            this.a.invalidate();
            this.n(true);
        }
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void j(long v) {
        int v1 = this.l.d();
        int v2 = this.l.M();
        if(v1 != ((int)(v >> 0x20)) || v2 != ((int)(v & 0xFFFFFFFFL))) {
            this.l.u(((int)(v >> 0x20)) - v1);
            this.l.g(((int)(v & 0xFFFFFFFFL)) - v2);
            this.o();
            this.i.c();
        }
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void k() {
        if(this.d || !this.l.h()) {
            this.n(false);
            Path path0 = !this.l.p() || this.e.d() ? null : this.e.b();
            Function1 function10 = this.b;
            if(function10 != null) {
                this.l.S(this.j, path0, function10);
            }
        }
    }

    private final void l(Canvas canvas0) {
        if(this.l.p() || this.l.L()) {
            this.e.a(canvas0);
        }
    }

    @l
    public final AndroidComposeView m() {
        return this.a;
    }

    private final void n(boolean z) {
        if(z != this.d) {
            this.d = z;
            this.a.i0(this, z);
        }
    }

    private final void o() {
        if(Build.VERSION.SDK_INT >= 26) {
            WrapperRenderNodeLayerHelperMethods.a.a(this.a);
            return;
        }
        this.a.invalidate();
    }
}

