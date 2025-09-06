package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build.VERSION;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@RequiresApi(23)
@s0({"SMAP\nRenderNodeApi23.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeApi23.android.kt\nandroidx/compose/ui/platform/RenderNodeApi23\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,417:1\n47#2,5:418\n*S KotlinDebug\n*F\n+ 1 RenderNodeApi23.android.kt\nandroidx/compose/ui/platform/RenderNodeApi23\n*L\n275#1:418,5\n*E\n"})
public final class RenderNodeApi23 implements DeviceRenderNode {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        // 去混淆评级： 低(20)
        public final boolean a() {
            return false;
        }

        public final void b(boolean z) {
            RenderNodeApi23.k = z;
        }
    }

    @l
    private final AndroidComposeView a;
    @l
    private final RenderNode b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    @m
    private RenderEffect h;
    private boolean i;
    @l
    public static final Companion j;
    private static boolean k;
    private static boolean l;

    static {
        RenderNodeApi23.j = new Companion(null);
        RenderNodeApi23.l = true;
    }

    public RenderNodeApi23(@l AndroidComposeView androidComposeView0) {
        L.p(androidComposeView0, "ownerView");
        super();
        this.a = androidComposeView0;
        RenderNode renderNode0 = RenderNode.create("Compose", androidComposeView0);
        L.o(renderNode0, "create(\"Compose\", ownerView)");
        this.b = renderNode0;
        this.c = 0;
        if(RenderNodeApi23.l) {
            renderNode0.setScaleX(renderNode0.getScaleX());
            renderNode0.setScaleY(renderNode0.getScaleY());
            renderNode0.setTranslationX(renderNode0.getTranslationX());
            renderNode0.setTranslationY(renderNode0.getTranslationY());
            renderNode0.setElevation(renderNode0.getElevation());
            renderNode0.setRotation(renderNode0.getRotation());
            renderNode0.setRotationX(renderNode0.getRotationX());
            renderNode0.setRotationY(renderNode0.getRotationY());
            renderNode0.setCameraDistance(renderNode0.getCameraDistance());
            renderNode0.setPivotX(renderNode0.getPivotX());
            renderNode0.setPivotY(renderNode0.getPivotY());
            renderNode0.setClipToOutline(renderNode0.getClipToOutline());
            renderNode0.setClipToBounds(false);
            renderNode0.setAlpha(renderNode0.getAlpha());
            renderNode0.isValid();
            renderNode0.setLeftTopRightBottom(0, 0, 0, 0);
            renderNode0.offsetLeftAndRight(0);
            renderNode0.offsetTopAndBottom(0);
            this.l0(renderNode0);
            this.d0();
            renderNode0.setLayerType(0);
            renderNode0.setHasOverlappingRendering(renderNode0.hasOverlappingRendering());
            RenderNodeApi23.l = false;
        }
        if(RenderNodeApi23.k) {
            throw new NoClassDefFoundError();
        }
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void A(float f) {
        this.b.setRotation(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void B(float f) {
        this.b.setPivotX(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void C(float f) {
        this.b.setPivotY(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void D(@m Outline outline0) {
        this.b.setOutline(outline0);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void E(boolean z) {
        this.b.setClipToOutline(z);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float F() {
        return this.b.getTranslationY();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float G() {
        return this.b.getTranslationX();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void H(@l Matrix matrix0) {
        L.p(matrix0, "matrix");
        this.b.getInverseMatrix(matrix0);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public boolean I(int v, int v1, int v2, int v3) {
        this.i0(v);
        this.k0(v1);
        this.j0(v2);
        this.h0(v3);
        return this.b.setLeftTopRightBottom(v, v1, v2, v3);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void J() {
        this.d0();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int K() {
        return Build.VERSION.SDK_INT < 28 ? 0xFF000000 : RenderNodeVerificationHelper28.a.a(this.b);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public boolean L() {
        return this.i;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int M() {
        return this.e;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float N() {
        return this.b.getRotationY();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float O() {
        return this.b.getRotation();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int P() {
        return Build.VERSION.SDK_INT < 28 ? 0xFF000000 : RenderNodeVerificationHelper28.a.b(this.b);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void Q(int v) {
        if(Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28.a.c(this.b, v);
        }
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void R(float f) {
        this.b.setScaleX(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void S(@l CanvasHolder canvasHolder0, @m Path path0, @l Function1 function10) {
        L.p(canvasHolder0, "canvasHolder");
        L.p(function10, "drawBlock");
        int v = this.getWidth();
        int v1 = this.getHeight();
        DisplayListCanvas displayListCanvas0 = this.b.start(v, v1);
        L.o(displayListCanvas0, "renderNode.start(width, height)");
        Canvas canvas0 = canvasHolder0.b().I();
        canvasHolder0.b().K(((Canvas)displayListCanvas0));
        AndroidCanvas androidCanvas0 = canvasHolder0.b();
        if(path0 != null) {
            androidCanvas0.f();
            c0.m(androidCanvas0, path0, 0, 2, null);
        }
        function10.invoke(androidCanvas0);
        if(path0 != null) {
            androidCanvas0.v();
        }
        canvasHolder0.b().K(canvas0);
        this.b.end(displayListCanvas0);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void T(@m RenderEffect renderEffect0) {
        this.h = renderEffect0;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void U(int v) {
        if(Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28.a.d(this.b, v);
        }
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float V() {
        return this.b.getScaleX();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void W(float f) {
        this.b.setScaleY(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float X() {
        return this.b.getElevation();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float Y() {
        return this.b.getRotationX();
    }

    public static final boolean Z() [...] // 潜在的解密器

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public long a() {
        return 0L;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void a0(float f) {
        this.b.setTranslationX(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void b(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        ((DisplayListCanvas)canvas0).drawRenderNode(this.b);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float b0() {
        return this.b.getScaleY();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int c() {
        return this.f;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int d() {
        return this.d;
    }

    private final void d0() {
        if(Build.VERSION.SDK_INT >= 24) {
            RenderNodeVerificationHelper24.a.a(this.b);
            return;
        }
        RenderNodeVerificationHelper23.a.a(this.b);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void e(boolean z) {
        this.i = z;
        this.b.setClipToBounds(z);
    }

    // 去混淆评级： 低(40)
    public final int e0() {
        return CompositingStrategy.g(this.c, 1) ? 2 : 0;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void f(float f) {
        this.b.setElevation(f);
    }

    @l
    public final AndroidComposeView f0() {
        return this.a;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void g(int v) {
        this.k0(this.M() + v);
        this.h0(this.v() + v);
        this.b.offsetTopAndBottom(v);
    }

    public final boolean g0() {
        return this.b.hasOverlappingRendering();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getHeight() {
        return this.v() - this.M();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getWidth() {
        return this.c() - this.d();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public boolean h() {
        return this.b.isValid();
    }

    public void h0(int v) {
        this.g = v;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float i() {
        return this.b.getAlpha();
    }

    public void i0(int v) {
        this.d = v;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void j(float f) {
        this.b.setAlpha(f);
    }

    public void j0(int v) {
        this.f = v;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float k() {
        return this.b.getPivotX();
    }

    public void k0(int v) {
        this.e = v;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    @m
    public RenderEffect l() {
        return this.h;
    }

    private final void l0(RenderNode renderNode0) {
        if(Build.VERSION.SDK_INT >= 28) {
            int v = RenderNodeVerificationHelper28.a.a(renderNode0);
            RenderNodeVerificationHelper28.a.c(renderNode0, v);
            int v1 = RenderNodeVerificationHelper28.a.b(renderNode0);
            RenderNodeVerificationHelper28.a.d(renderNode0, v1);
        }
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float m() {
        return this.b.getPivotY();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void n(float f) {
        this.b.setTranslationY(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    @l
    public DeviceRenderNodeData o() {
        return new DeviceRenderNodeData(0L, 0, 0, 0, 0, 0, 0, this.b.getScaleX(), this.b.getScaleY(), this.b.getTranslationX(), this.b.getTranslationY(), this.b.getElevation(), this.K(), this.P(), this.b.getRotation(), this.b.getRotationX(), this.b.getRotationY(), this.b.getCameraDistance(), this.b.getPivotX(), this.b.getPivotY(), this.b.getClipToOutline(), this.L(), this.b.getAlpha(), this.l(), this.c, null);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public boolean p() {
        return this.b.getClipToOutline();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void q(int v) {
        if(CompositingStrategy.g(v, 1)) {
            this.b.setLayerType(2);
            this.b.setHasOverlappingRendering(true);
        }
        else if(CompositingStrategy.g(v, 2)) {
            this.b.setLayerType(0);
            this.b.setHasOverlappingRendering(false);
        }
        else {
            this.b.setLayerType(0);
            this.b.setHasOverlappingRendering(true);
        }
        this.c = v;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public boolean r(boolean z) {
        return this.b.setHasOverlappingRendering(z);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void s(@l Matrix matrix0) {
        L.p(matrix0, "matrix");
        this.b.getMatrix(matrix0);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float t() {
        return -this.b.getCameraDistance();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void u(int v) {
        this.i0(this.d() + v);
        this.j0(this.c() + v);
        this.b.offsetLeftAndRight(v);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int v() {
        return this.g;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void w(float f) {
        this.b.setCameraDistance(-f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void x(float f) {
        this.b.setRotationX(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void y(float f) {
        this.b.setRotationY(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int z() {
        return this.c;
    }
}

