package androidx.compose.ui.graphics;

import android.graphics.Matrix;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.Path.Op;
import android.graphics.RectF;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

@s0({"SMAP\nAndroidPath.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,235:1\n35#2,5:236\n35#2,5:241\n*S KotlinDebug\n*F\n+ 1 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath\n*L\n172#1:236,5\n211#1:241,5\n*E\n"})
public final class AndroidPath implements Path {
    @l
    private final android.graphics.Path b;
    @l
    private final RectF c;
    @l
    private final float[] d;
    @l
    private final Matrix e;

    public AndroidPath() {
        this(null, 1, null);
    }

    public AndroidPath(@l android.graphics.Path path0) {
        L.p(path0, "internalPath");
        super();
        this.b = path0;
        this.c = new RectF();
        this.d = new float[8];
        this.e = new Matrix();
    }

    public AndroidPath(android.graphics.Path path0, int v, w w0) {
        if((v & 1) != 0) {
            path0 = new android.graphics.Path();
        }
        this(path0);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void a(Rect rect0, float f, float f1, boolean z) {
        h0.a(this, rect0, f, f1, z);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void b(float f, float f1) {
        this.b.rMoveTo(f, f1);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void c(float f, float f1, float f2, float f3, float f4, float f5) {
        this.b.rCubicTo(f, f1, f2, f3, f4, f5);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void close() {
        this.b.close();
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void d(float f, float f1, float f2, float f3) {
        this.b.rQuadTo(f, f1, f2, f3);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void e(@l Rect rect0) {
        L.p(rect0, "oval");
        this.c.set(rect0.t(), rect0.B(), rect0.x(), rect0.j());
        this.b.addOval(this.c, Path.Direction.CCW);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void f(long v) {
        this.e.reset();
        float f = Offset.p(v);
        float f1 = Offset.r(v);
        this.e.setTranslate(f, f1);
        this.b.transform(this.e);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void g(@l Rect rect0, float f, float f1) {
        L.p(rect0, "oval");
        this.q(rect0, f * 57.29578f, f1 * 57.29578f);
    }

    @Override  // androidx.compose.ui.graphics.Path
    @l
    public Rect getBounds() {
        this.b.computeBounds(this.c, true);
        return new Rect(this.c.left, this.c.top, this.c.right, this.c.bottom);
    }

    // 去混淆评级： 中等(50)
    @Override  // androidx.compose.ui.graphics.Path
    public int h() {
        return this.b.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void i(float f, float f1) {
        this.b.moveTo(f, f1);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public boolean isEmpty() {
        return this.b.isEmpty();
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void j(@l RoundRect roundRect0) {
        L.p(roundRect0, "roundRect");
        this.c.set(roundRect0.q(), roundRect0.s(), roundRect0.r(), roundRect0.m());
        this.d[0] = CornerRadius.m(roundRect0.t());
        this.d[1] = CornerRadius.o(roundRect0.t());
        this.d[2] = CornerRadius.m(roundRect0.u());
        this.d[3] = CornerRadius.o(roundRect0.u());
        this.d[4] = CornerRadius.m(roundRect0.o());
        this.d[5] = CornerRadius.o(roundRect0.o());
        this.d[6] = CornerRadius.m(roundRect0.n());
        this.d[7] = CornerRadius.o(roundRect0.n());
        this.b.addRoundRect(this.c, this.d, Path.Direction.CCW);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void k(@l Rect rect0, float f, float f1, boolean z) {
        L.p(rect0, "rect");
        this.c.set(rect0.t(), rect0.B(), rect0.x(), rect0.j());
        this.b.arcTo(this.c, f, f1, z);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void l(@l Path path0, long v) {
        L.p(path0, "path");
        android.graphics.Path path1 = this.b;
        if(!(path0 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path1.addPath(((AndroidPath)path0).w(), Offset.p(v), Offset.r(v));
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void m(float f, float f1) {
        this.b.lineTo(f, f1);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public boolean n() {
        return this.b.isConvex();
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void o(float f, float f1, float f2, float f3) {
        this.b.quadTo(f, f1, f2, f3);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.graphics.Path
    public void p(int v) {
        this.b.setFillType((PathFillType.f(v, 1) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING));
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void q(@l Rect rect0, float f, float f1) {
        L.p(rect0, "oval");
        if(!this.v(rect0)) {
            throw new IllegalStateException("Check failed.");
        }
        this.c.set(rect0.t(), rect0.B(), rect0.x(), rect0.j());
        this.b.addArc(this.c, f, f1);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void r(@l Rect rect0) {
        L.p(rect0, "rect");
        if(!this.v(rect0)) {
            throw new IllegalStateException("Check failed.");
        }
        this.c.set(rect0.t(), rect0.B(), rect0.x(), rect0.j());
        this.b.addRect(this.c, Path.Direction.CCW);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void reset() {
        this.b.reset();
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void s(float f, float f1, float f2, float f3, float f4, float f5) {
        this.b.cubicTo(f, f1, f2, f3, f4, f5);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public boolean t(@l Path path0, @l Path path1, int v) {
        Path.Op path$Op0;
        L.p(path0, "path1");
        L.p(path1, "path2");
        if(PathOperation.i(v, 0)) {
            path$Op0 = Path.Op.DIFFERENCE;
        }
        else if(PathOperation.i(v, 1)) {
            path$Op0 = Path.Op.INTERSECT;
        }
        else if(PathOperation.i(v, 4)) {
            path$Op0 = Path.Op.REVERSE_DIFFERENCE;
        }
        else {
            path$Op0 = PathOperation.i(v, 2) ? Path.Op.UNION : Path.Op.XOR;
        }
        android.graphics.Path path2 = this.b;
        if(!(path0 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path path3 = ((AndroidPath)path0).w();
        if(!(path1 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return path2.op(path3, ((AndroidPath)path1).w(), path$Op0);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void u(float f, float f1) {
        this.b.rLineTo(f, f1);
    }

    private final boolean v(Rect rect0) {
        if(Float.isNaN(rect0.t())) {
            throw new IllegalStateException("Rect.left is NaN");
        }
        if(Float.isNaN(rect0.B())) {
            throw new IllegalStateException("Rect.top is NaN");
        }
        if(Float.isNaN(rect0.x())) {
            throw new IllegalStateException("Rect.right is NaN");
        }
        if(Float.isNaN(rect0.j())) {
            throw new IllegalStateException("Rect.bottom is NaN");
        }
        return true;
    }

    @l
    public final android.graphics.Path w() {
        return this.b;
    }

    public static void x() {
    }
}

