package androidx.compose.ui.platform;

import A3.a;
import A3.o;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.n;

@s0({"SMAP\nViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,476:1\n47#2,5:477\n*S KotlinDebug\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer\n*L\n290#1:477,5\n*E\n"})
public final class ViewLayer extends View implements GraphicLayerInfo, OwnedLayer {
    @s0({"SMAP\nViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer$Companion\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,476:1\n26#2:477\n*S KotlinDebug\n*F\n+ 1 ViewLayer.android.kt\nandroidx/compose/ui/platform/ViewLayer$Companion\n*L\n431#1:477\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        // 去混淆评级： 低(20)
        public final boolean a() [...] // 潜在的解密器

        @l
        public final ViewOutlineProvider b() {
            return ViewLayer.q;
        }

        // 去混淆评级： 低(20)
        public final boolean c() [...] // 潜在的解密器

        public final void d(boolean z) {
            ViewLayer.u = z;
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final void e(@l View view0) {
            Class class0 = String.class;
            Class class1 = Class.class;
            L.p(view0, "view");
            ViewLayer.t = true;
            Class class2 = View.class;
            ViewLayer.r = Build.VERSION.SDK_INT < 28 ? class2.getDeclaredMethod("updateDisplayListIfDirty", null) : ((Method)class1.getDeclaredMethod("getDeclaredMethod", class0, new Class[0].getClass()).invoke(class2, "updateDisplayListIfDirty"));
            ViewLayer.s = class2.getDeclaredField("mRecreateDisplayList");
            Method method0 = ViewLayer.r;
            if(method0 != null) {
                method0.setAccessible(true);
            }
            Field field0 = ViewLayer.s;
            if(field0 != null) {
                field0.setAccessible(true);
            }
            Field field1 = ViewLayer.s;
            if(field1 != null) {
                field1.setBoolean(view0, true);
            }
            Method method1 = ViewLayer.r;
            if(method1 != null) {
                method1.invoke(view0, null);
            }
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
    @l
    private final DrawChildContainer b;
    @m
    private Function1 c;
    @m
    private a d;
    @l
    private final OutlineResolver e;
    private boolean f;
    @m
    private Rect g;
    private boolean h;
    private boolean i;
    @l
    private final CanvasHolder j;
    @l
    private final LayerMatrixCache k;
    private long l;
    private boolean m;
    private final long n;
    @l
    public static final Companion o;
    @l
    private static final o p;
    @l
    private static final ViewOutlineProvider q;
    @m
    private static Method r;
    @m
    private static Field s;
    private static boolean t;
    private static boolean u;

    static {
        ViewLayer.o = new Companion(null);
        ViewLayer.p = ViewLayer.Companion.getMatrix.1.e;
        ViewLayer.q = new ViewLayer.Companion.OutlineProvider.1();
    }

    public ViewLayer(@l AndroidComposeView androidComposeView0, @l DrawChildContainer drawChildContainer0, @l Function1 function10, @l a a0) {
        L.p(androidComposeView0, "ownerView");
        L.p(drawChildContainer0, "container");
        L.p(function10, "drawBlock");
        L.p(a0, "invalidateParentLayer");
        super(androidComposeView0.getContext());
        this.a = androidComposeView0;
        this.b = drawChildContainer0;
        this.c = function10;
        this.d = a0;
        this.e = new OutlineResolver(androidComposeView0.getDensity());
        this.j = new CanvasHolder();
        this.k = new LayerMatrixCache(ViewLayer.p);
        this.l = 0x3F0000003F000000L;
        this.m = true;
        this.setWillNotDraw(false);
        drawChildContainer0.addView(this);
        this.n = (long)View.generateViewId();
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void a(@l MutableRect mutableRect0, boolean z) {
        L.p(mutableRect0, "rect");
        if(z) {
            float[] arr_f = this.k.a(this);
            if(arr_f != null) {
                Matrix.l(arr_f, mutableRect0);
                return;
            }
            mutableRect0.k(0.0f, 0.0f, 0.0f, 0.0f);
            return;
        }
        Matrix.l(this.k.b(this), mutableRect0);
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void b(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        boolean z = this.getElevation() > 0.0f;
        this.i = z;
        if(z) {
            canvas0.w();
        }
        long v = this.getDrawingTime();
        this.b.a(canvas0, this, v);
        if(this.i) {
            canvas0.n();
        }
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void c(@l Function1 function10, @l a a0) {
        L.p(function10, "drawBlock");
        L.p(a0, "invalidateParentLayer");
        if(Build.VERSION.SDK_INT < 23) {
            this.setVisibility(0);
        }
        else {
            this.b.addView(this);
        }
        this.f = false;
        this.i = false;
        this.l = 0x3F0000003F000000L;
        this.c = function10;
        this.d = a0;
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void d(@l float[] arr_f) {
        L.p(arr_f, "matrix");
        Matrix.u(arr_f, this.k.b(this));
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        this.setInvalidated(false);
        this.a.o0();
        this.c = null;
        this.d = null;
        boolean z = this.a.m0(this);
        if(Build.VERSION.SDK_INT < 23 && z) {
            this.setVisibility(8);
            return;
        }
        this.b.removeViewInLayout(this);
    }

    @Override  // android.view.View
    protected void dispatchDraw(@l android.graphics.Canvas canvas0) {
        L.p(canvas0, "canvas");
        boolean z = false;
        this.setInvalidated(false);
        CanvasHolder canvasHolder0 = this.j;
        android.graphics.Canvas canvas1 = canvasHolder0.b().I();
        canvasHolder0.b().K(canvas0);
        AndroidCanvas androidCanvas0 = canvasHolder0.b();
        if(this.getManualClipPath() != null || !canvas0.isHardwareAccelerated()) {
            androidCanvas0.f();
            this.e.a(androidCanvas0);
            z = true;
        }
        Function1 function10 = this.c;
        if(function10 != null) {
            function10.invoke(androidCanvas0);
        }
        if(z) {
            androidCanvas0.v();
        }
        canvasHolder0.b().K(canvas1);
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void e(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, @l Shape shape0, boolean z, @m RenderEffect renderEffect0, long v1, long v2, int v3, @l LayoutDirection layoutDirection0, @l Density density0) {
        L.p(shape0, "shape");
        L.p(layoutDirection0, "layoutDirection");
        L.p(density0, "density");
        this.l = v;
        this.setScaleX(f);
        this.setScaleY(f1);
        this.setAlpha(f2);
        this.setTranslationX(f3);
        this.setTranslationY(f4);
        this.setElevation(f5);
        this.setRotation(f8);
        this.setRotationX(f6);
        this.setRotationY(f7);
        this.setPivotX(TransformOrigin.k(this.l) * ((float)this.getWidth()));
        this.setPivotY(TransformOrigin.l(this.l) * ((float)this.getHeight()));
        this.setCameraDistancePx(f9);
        boolean z1 = true;
        this.f = z && shape0 == RectangleShapeKt.a();
        this.w();
        int v4 = this.getManualClipPath() == null ? 0 : 1;
        this.setClipToOutline(z && shape0 != RectangleShapeKt.a());
        float f10 = this.getAlpha();
        boolean z2 = this.getClipToOutline();
        float f11 = this.getElevation();
        boolean z3 = this.e.g(shape0, f10, z2, f11, layoutDirection0, density0);
        this.x();
        int v5 = this.getManualClipPath() == null ? 0 : 1;
        if(v4 != v5 || v5 != 0 && z3) {
            this.invalidate();
        }
        if(!this.i && this.getElevation() > 0.0f) {
            a a0 = this.d;
            if(a0 != null) {
                a0.invoke();
            }
        }
        this.k.c();
        int v6 = Build.VERSION.SDK_INT;
        if(v6 >= 28) {
            int v7 = ColorKt.r(v1);
            ViewLayerVerificationHelper28.a.a(this, v7);
            int v8 = ColorKt.r(v2);
            ViewLayerVerificationHelper28.a.b(this, v8);
        }
        if(v6 >= 0x1F) {
            ViewLayerVerificationHelper31.a.a(this, renderEffect0);
        }
        if(CompositingStrategy.g(v3, 1)) {
            this.setLayerType(2, null);
        }
        else if(CompositingStrategy.g(v3, 2)) {
            this.setLayerType(0, null);
            z1 = false;
        }
        else {
            this.setLayerType(0, null);
        }
        this.m = z1;
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public long f(long v, boolean z) {
        if(z) {
            float[] arr_f = this.k.a(this);
            return arr_f == null ? 0x7F8000007F800000L : Matrix.j(arr_f, v);
        }
        return Matrix.j(this.k.b(this), v);
    }

    @Override  // android.view.View
    public void forceLayout() {
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void g(long v) {
        if(((int)(v >> 0x20)) != this.getWidth() || ((int)(v & 0xFFFFFFFFL)) != this.getHeight()) {
            this.setPivotX(TransformOrigin.k(this.l) * ((float)(((int)(v >> 0x20)))));
            this.setPivotY(TransformOrigin.l(this.l) * ((float)(((int)(v & 0xFFFFFFFFL)))));
            this.e.h(SizeKt.a(((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL))));
            this.x();
            this.layout(this.getLeft(), this.getTop(), this.getLeft() + ((int)(v >> 0x20)), this.getTop() + ((int)(v & 0xFFFFFFFFL)));
            this.w();
            this.k.c();
        }
    }

    public final float getCameraDistancePx() {
        return this.getCameraDistance() / ((float)this.getResources().getDisplayMetrics().densityDpi);
    }

    @l
    public final DrawChildContainer getContainer() {
        return this.b;
    }

    @Override  // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.n;
    }

    // 去混淆评级： 低(20)
    private final Path getManualClipPath() {
        return !this.getClipToOutline() || this.e.d() ? null : this.e.b();
    }

    @l
    public final AndroidComposeView getOwnerView() {
        return this.a;
    }

    @Override  // androidx.compose.ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        return Build.VERSION.SDK_INT < 29 ? -1L : UniqueDrawingIdApi29.a(this.a);
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public boolean h(long v) {
        float f = Offset.p(v);
        float f1 = Offset.r(v);
        if(this.f) {
            return 0.0f <= f && f < ((float)this.getWidth()) && 0.0f <= f1 && f1 < ((float)this.getHeight());
        }
        return this.getClipToOutline() ? this.e.e(v) : true;
    }

    @Override  // android.view.View
    public boolean hasOverlappingRendering() {
        return this.m;
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void i(@l float[] arr_f) {
        L.p(arr_f, "matrix");
        float[] arr_f1 = this.k.a(this);
        if(arr_f1 != null) {
            Matrix.u(arr_f, arr_f1);
        }
    }

    @Override  // android.view.View, androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if(!this.h) {
            this.setInvalidated(true);
            super.invalidate();
            this.a.invalidate();
        }
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void j(long v) {
        if(((int)(v >> 0x20)) != this.getLeft()) {
            this.offsetLeftAndRight(((int)(v >> 0x20)) - this.getLeft());
            this.k.c();
        }
        if(((int)(v & 0xFFFFFFFFL)) != this.getTop()) {
            this.offsetTopAndBottom(((int)(v & 0xFFFFFFFFL)) - this.getTop());
            this.k.c();
        }
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void k() {
        if(this.h) {
            this.setInvalidated(false);
            ViewLayer.o.e(this);
        }
    }

    public static final boolean l() [...] // 潜在的解密器

    @Override  // android.view.View
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
    }

    public static final boolean p() [...] // 潜在的解密器

    public final void setCameraDistancePx(float f) {
        this.setCameraDistance(f * ((float)this.getResources().getDisplayMetrics().densityDpi));
    }

    private final void setInvalidated(boolean z) {
        if(z != this.h) {
            this.h = z;
            this.a.i0(this, z);
        }
    }

    public final boolean v() {
        return this.h;
    }

    private final void w() {
        Rect rect1;
        if(this.f) {
            Rect rect0 = this.g;
            if(rect0 == null) {
                this.g = new Rect(0, 0, this.getWidth(), this.getHeight());
            }
            else {
                L.m(rect0);
                rect0.set(0, 0, this.getWidth(), this.getHeight());
            }
            rect1 = this.g;
        }
        else {
            rect1 = null;
        }
        this.setClipBounds(rect1);
    }

    private final void x() {
        this.setOutlineProvider((this.e.c() == null ? null : ViewLayer.q));
    }
}

