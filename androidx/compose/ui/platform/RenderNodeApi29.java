package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build.VERSION;
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
import y4.l;
import y4.m;

@RequiresApi(29)
@s0({"SMAP\nRenderNodeApi29.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderNodeApi29.android.kt\nandroidx/compose/ui/platform/RenderNodeApi29\n+ 2 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,274:1\n47#2,5:275\n*S KotlinDebug\n*F\n+ 1 RenderNodeApi29.android.kt\nandroidx/compose/ui/platform/RenderNodeApi29\n*L\n204#1:275,5\n*E\n"})
public final class RenderNodeApi29 implements DeviceRenderNode {
    @l
    private final AndroidComposeView a;
    @l
    private final RenderNode b;
    @m
    private RenderEffect c;
    private int d;

    public RenderNodeApi29(@l AndroidComposeView androidComposeView0) {
        L.p(androidComposeView0, "ownerView");
        super();
        this.a = androidComposeView0;
        this.b = v0.a("Compose");
        this.d = 0;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void A(float f) {
        this.b.setRotationZ(f);
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
        return this.b.setPosition(v, v1, v2, v3);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void J() {
        this.b.discardDisplayList();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int K() {
        return this.b.getAmbientShadowColor();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public boolean L() {
        return this.b.getClipToBounds();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int M() {
        return this.b.getTop();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float N() {
        return this.b.getRotationY();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float O() {
        return this.b.getRotationZ();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int P() {
        return this.b.getSpotShadowColor();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void Q(int v) {
        this.b.setAmbientShadowColor(v);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void R(float f) {
        this.b.setScaleX(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void S(@l CanvasHolder canvasHolder0, @m Path path0, @l Function1 function10) {
        L.p(canvasHolder0, "canvasHolder");
        L.p(function10, "drawBlock");
        RecordingCanvas recordingCanvas0 = this.b.beginRecording();
        L.o(recordingCanvas0, "renderNode.beginRecording()");
        Canvas canvas0 = canvasHolder0.b().I();
        canvasHolder0.b().K(recordingCanvas0);
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
        this.b.endRecording();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void T(@m RenderEffect renderEffect0) {
        this.c = renderEffect0;
        if(Build.VERSION.SDK_INT >= 0x1F) {
            RenderNodeApi29VerificationHelper.a.a(this.b, renderEffect0);
        }
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void U(int v) {
        this.b.setSpotShadowColor(v);
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

    @l
    public final AndroidComposeView Z() {
        return this.a;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public long a() {
        return this.b.getUniqueId();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void a0(float f) {
        this.b.setTranslationX(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void b(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        canvas0.drawRenderNode(this.b);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float b0() {
        return this.b.getScaleY();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int c() {
        return this.b.getRight();
    }

    public final boolean c0() {
        return this.b.hasOverlappingRendering();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int d() {
        return this.b.getLeft();
    }

    public final boolean d0() {
        return this.b.getUseCompositingLayer();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void e(boolean z) {
        this.b.setClipToBounds(z);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void f(float f) {
        this.b.setElevation(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void g(int v) {
        this.b.offsetTopAndBottom(v);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getHeight() {
        return this.b.getHeight();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getWidth() {
        return this.b.getWidth();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public boolean h() {
        return this.b.hasDisplayList();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float i() {
        return this.b.getAlpha();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void j(float f) {
        this.b.setAlpha(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float k() {
        return this.b.getPivotX();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    @m
    public RenderEffect l() {
        return this.c;
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
        return new DeviceRenderNodeData(this.b.getUniqueId(), this.b.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom(), this.b.getWidth(), this.b.getHeight(), this.b.getScaleX(), this.b.getScaleY(), this.b.getTranslationX(), this.b.getTranslationY(), this.b.getElevation(), this.b.getAmbientShadowColor(), this.b.getSpotShadowColor(), this.b.getRotationZ(), this.b.getRotationX(), this.b.getRotationY(), this.b.getCameraDistance(), this.b.getPivotX(), this.b.getPivotY(), this.b.getClipToOutline(), this.b.getClipToBounds(), this.b.getAlpha(), this.c, this.d, null);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public boolean p() {
        return this.b.getClipToOutline();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void q(int v) {
        RenderNode renderNode0 = this.b;
        if(CompositingStrategy.g(v, 1)) {
            renderNode0.setUseCompositingLayer(true, null);
            renderNode0.setHasOverlappingRendering(true);
        }
        else if(CompositingStrategy.g(v, 2)) {
            renderNode0.setUseCompositingLayer(false, null);
            renderNode0.setHasOverlappingRendering(false);
        }
        else {
            renderNode0.setUseCompositingLayer(false, null);
            renderNode0.setHasOverlappingRendering(true);
        }
        this.d = v;
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
        return this.b.getCameraDistance();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void u(int v) {
        this.b.offsetLeftAndRight(v);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int v() {
        return this.b.getBottom();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void w(float f) {
        this.b.setCameraDistance(f);
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
        return this.d;
    }
}

