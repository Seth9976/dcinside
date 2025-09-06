package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas.VertexMode;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region.Op;
import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.j;
import kotlin.ranges.s;
import y4.l;

@b0
@s0({"SMAP\nAndroidCanvas.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,428:1\n35#2,5:429\n35#2,5:434\n33#3,6:439\n*S KotlinDebug\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas\n*L\n154#1:429,5\n242#1:434,5\n315#1:439,6\n*E\n"})
public final class AndroidCanvas implements Canvas {
    @l
    private android.graphics.Canvas a;
    @l
    private final Rect b;
    @l
    private final Rect c;

    public AndroidCanvas() {
        this.a = AndroidCanvas_androidKt.a;
        this.b = new Rect();
        this.c = new Rect();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void A(float f) {
        this.a.rotate(f);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void B(float f, float f1) {
        this.a.skew(f, f1);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void C(@l float[] arr_f) {
        L.p(arr_f, "matrix");
        if(!MatrixKt.c(arr_f)) {
            Matrix matrix0 = new Matrix();
            AndroidMatrixConversions_androidKt.a(matrix0, arr_f);
            this.a.concat(matrix0);
        }
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void D(@l Path path0, @l Paint paint0) {
        L.p(path0, "path");
        L.p(paint0, "paint");
        android.graphics.Canvas canvas0 = this.a;
        if(!(path0 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas0.drawPath(((AndroidPath)path0).w(), paint0.l());
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void E(long v, float f, @l Paint paint0) {
        L.p(paint0, "paint");
        this.a.drawCircle(Offset.p(v), Offset.r(v), f, paint0.l());
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void F(float f, float f1, float f2, float f3, float f4, float f5, @l Paint paint0) {
        L.p(paint0, "paint");
        this.a.drawRoundRect(f, f1, f2, f3, f4, f5, paint0.l());
    }

    private final void G(float[] arr_f, Paint paint0, int v) {
        if(arr_f.length >= 4 && arr_f.length % 2 == 0) {
            j j0 = s.B1(s.W1(0, arr_f.length - 3), v * 2);
            int v1 = j0.g();
            int v2 = j0.h();
            int v3 = j0.i();
            if(v3 > 0 && v1 <= v2 || v3 < 0 && v2 <= v1) {
                while(true) {
                    this.a.drawLine(arr_f[v1], arr_f[v1 + 1], arr_f[v1 + 2], arr_f[v1 + 3], paint0.l());
                    if(v1 == v2) {
                        break;
                    }
                    v1 += v3;
                }
            }
        }
    }

    private final void H(float[] arr_f, Paint paint0, int v) {
        if(arr_f.length % 2 == 0) {
            j j0 = s.B1(s.W1(0, arr_f.length - 1), v);
            int v1 = j0.g();
            int v2 = j0.h();
            int v3 = j0.i();
            if(v3 > 0 && v1 <= v2 || v3 < 0 && v2 <= v1) {
                while(true) {
                    this.a.drawPoint(arr_f[v1], arr_f[v1 + 1], paint0.l());
                    if(v1 == v2) {
                        break;
                    }
                    v1 += v3;
                }
            }
        }
    }

    @l
    public final android.graphics.Canvas I() {
        return this.a;
    }

    @b0
    public static void J() {
    }

    public final void K(@l android.graphics.Canvas canvas0) {
        L.p(canvas0, "<set-?>");
        this.a = canvas0;
    }

    // 去混淆评级： 低(40)
    @l
    public final Region.Op L(int v) {
        return ClipOp.f(v, 0) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void a(float f, float f1, float f2, float f3, int v) {
        this.a.clipRect(f, f1, f2, f3, this.L(v));
    }

    private final void b(List list0, Paint paint0, int v) {
        if(list0.size() >= 2) {
            j j0 = s.B1(s.W1(0, list0.size() - 1), v);
            int v1 = j0.g();
            int v2 = j0.h();
            int v3 = j0.i();
            if(v3 > 0 && v1 <= v2 || v3 < 0 && v2 <= v1) {
                while(true) {
                    long v4 = ((Offset)list0.get(v1)).A();
                    long v5 = ((Offset)list0.get(v1 + 1)).A();
                    this.a.drawLine(Offset.p(v4), Offset.r(v4), Offset.p(v5), Offset.r(v5), paint0.l());
                    if(v1 == v2) {
                        break;
                    }
                    v1 += v3;
                }
            }
        }
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void c(float f, float f1) {
        this.a.translate(f, f1);
    }

    private final void d(List list0, Paint paint0) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            long v2 = ((Offset)list0.get(v1)).A();
            this.a.drawPoint(Offset.p(v2), Offset.r(v2), paint0.l());
        }
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void e(@l Path path0, int v) {
        L.p(path0, "path");
        android.graphics.Canvas canvas0 = this.a;
        if(!(path0 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas0.clipPath(((AndroidPath)path0).w(), this.L(v));
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void f() {
        this.a.save();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void g(int v, @l List list0, @l Paint paint0) {
        L.p(list0, "points");
        L.p(paint0, "paint");
        if(PointMode.g(v, 1)) {
            this.b(list0, paint0, 2);
            return;
        }
        if(PointMode.g(v, 2)) {
            this.b(list0, paint0, 1);
            return;
        }
        if(PointMode.g(v, 0)) {
            this.d(list0, paint0);
        }
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void h(@l ImageBitmap imageBitmap0, long v, long v1, long v2, long v3, @l Paint paint0) {
        L.p(imageBitmap0, "image");
        L.p(paint0, "paint");
        android.graphics.Canvas canvas0 = this.a;
        Bitmap bitmap0 = AndroidImageBitmap_androidKt.b(imageBitmap0);
        this.b.left = (int)(v >> 0x20);
        this.b.top = (int)(v & 0xFFFFFFFFL);
        this.b.right = ((int)(v >> 0x20)) + ((int)(v1 >> 0x20));
        this.b.bottom = ((int)(v & 0xFFFFFFFFL)) + ((int)(v1 & 0xFFFFFFFFL));
        this.c.left = (int)(v2 >> 0x20);
        this.c.top = (int)(v2 & 0xFFFFFFFFL);
        this.c.right = ((int)(v2 >> 0x20)) + ((int)(v3 >> 0x20));
        this.c.bottom = ((int)(v2 & 0xFFFFFFFFL)) + ((int)(v3 & 0xFFFFFFFFL));
        android.graphics.Paint paint1 = paint0.l();
        canvas0.drawBitmap(bitmap0, this.b, this.c, paint1);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void i(int v, @l float[] arr_f, @l Paint paint0) {
        L.p(arr_f, "points");
        L.p(paint0, "paint");
        if(arr_f.length % 2 != 0) {
            throw new IllegalArgumentException("points must have an even number of values");
        }
        if(PointMode.g(v, 1)) {
            this.G(arr_f, paint0, 2);
            return;
        }
        if(PointMode.g(v, 2)) {
            this.G(arr_f, paint0, 1);
            return;
        }
        if(PointMode.g(v, 0)) {
            this.H(arr_f, paint0, 2);
        }
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void j(@l Vertices vertices0, int v, @l Paint paint0) {
        L.p(vertices0, "vertices");
        L.p(paint0, "paint");
        android.graphics.Canvas canvas0 = this.a;
        Canvas.VertexMode canvas$VertexMode0 = AndroidVertexMode_androidKt.a(vertices0.g());
        android.graphics.Paint paint1 = paint0.l();
        canvas0.drawVertices(canvas$VertexMode0, vertices0.e().length, vertices0.e(), 0, vertices0.f(), 0, vertices0.c(), 0, vertices0.d(), 0, vertices0.d().length, paint1);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void k(androidx.compose.ui.geometry.Rect rect0, float f, float f1, boolean z, Paint paint0) {
        c0.b(this, rect0, f, f1, z, paint0);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void l(float f, float f1, float f2, float f3, float f4, float f5, boolean z, @l Paint paint0) {
        L.p(paint0, "paint");
        this.a.drawArc(f, f1, f2, f3, f4, f5, z, paint0.l());
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void m(@l androidx.compose.ui.geometry.Rect rect0, @l Paint paint0) {
        L.p(rect0, "bounds");
        L.p(paint0, "paint");
        this.a.saveLayer(rect0.t(), rect0.B(), rect0.x(), rect0.j(), paint0.l(), 0x1F);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void n() {
        CanvasUtils.a.a(this.a, false);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void o(androidx.compose.ui.geometry.Rect rect0, Paint paint0) {
        c0.d(this, rect0, paint0);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void p(androidx.compose.ui.geometry.Rect rect0, int v) {
        c0.a(this, rect0, v);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void q(androidx.compose.ui.geometry.Rect rect0, Paint paint0) {
        c0.e(this, rect0, paint0);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void r(float f, float f1) {
        this.a.scale(f, f1);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void s(float f, float f1, float f2, float f3, @l Paint paint0) {
        L.p(paint0, "paint");
        this.a.drawRect(f, f1, f2, f3, paint0.l());
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void t(float f, float f1, float f2, float f3, @l Paint paint0) {
        L.p(paint0, "paint");
        this.a.drawOval(f, f1, f2, f3, paint0.l());
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void u(@l ImageBitmap imageBitmap0, long v, @l Paint paint0) {
        L.p(imageBitmap0, "image");
        L.p(paint0, "paint");
        this.a.drawBitmap(AndroidImageBitmap_androidKt.b(imageBitmap0), Offset.p(v), Offset.r(v), paint0.l());
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void v() {
        this.a.restore();
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void w() {
        CanvasUtils.a.a(this.a, true);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void x(androidx.compose.ui.geometry.Rect rect0, float f, float f1, boolean z, Paint paint0) {
        c0.c(this, rect0, f, f1, z, paint0);
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void y(long v, long v1, @l Paint paint0) {
        L.p(paint0, "paint");
        this.a.drawLine(Offset.p(v), Offset.r(v), Offset.p(v1), Offset.r(v1), paint0.l());
    }

    @Override  // androidx.compose.ui.graphics.Canvas
    public void z(float f, float f1) {
        c0.f(this, f, f1);
    }
}

