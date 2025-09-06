package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build.VERSION;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Outline.Generic;
import androidx.compose.ui.graphics.Outline.Rectangle;
import androidx.compose.ui.graphics.Outline.Rounded;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.c0;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.math.b;
import y4.l;
import y4.m;

@s0({"SMAP\nOutlineResolver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,356:1\n1#2:357\n35#3,5:358\n*S KotlinDebug\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n*L\n330#1:358,5\n*E\n"})
public final class OutlineResolver {
    @l
    private Density a;
    private boolean b;
    @l
    private final Outline c;
    private long d;
    @l
    private Shape e;
    @m
    private Path f;
    @m
    private Path g;
    private boolean h;
    private boolean i;
    @m
    private Path j;
    @m
    private RoundRect k;
    private float l;
    private long m;
    private long n;
    private boolean o;
    @l
    private LayoutDirection p;
    @m
    private Path q;
    @m
    private Path r;
    @m
    private androidx.compose.ui.graphics.Outline s;

    public OutlineResolver(@l Density density0) {
        L.p(density0, "density");
        super();
        this.a = density0;
        this.b = true;
        Outline outline0 = new Outline();
        outline0.setAlpha(1.0f);
        this.c = outline0;
        this.d = 0L;
        this.e = RectangleShapeKt.a();
        this.m = 0L;
        this.n = 0L;
        this.p = LayoutDirection.a;
    }

    public final void a(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        Path path0 = this.b();
        if(path0 != null) {
            c0.m(canvas0, path0, 0, 2, null);
            return;
        }
        float f = this.l;
        if(f > 0.0f) {
            Path path1 = this.j;
            if(path1 == null || !this.f(this.k, this.m, this.n, f)) {
                RoundRect roundRect0 = RoundRectKt.e(Offset.p(this.m), Offset.r(this.m), Offset.p(this.m) + Size.t(this.n), Offset.r(this.m) + Size.m(this.n), CornerRadiusKt.b(this.l, 0.0f, 2, null));
                if(path1 == null) {
                    path1 = AndroidPath_androidKt.a();
                }
                else {
                    path1.reset();
                }
                path1.j(roundRect0);
                this.k = roundRect0;
                this.j = path1;
            }
            c0.m(canvas0, path1, 0, 2, null);
            return;
        }
        c0.n(canvas0, Offset.p(this.m), Offset.r(this.m), Offset.p(this.m) + Size.t(this.n), Offset.r(this.m) + Size.m(this.n), 0, 16, null);
    }

    @m
    public final Path b() {
        this.i();
        return this.g;
    }

    @m
    public final Outline c() {
        this.i();
        return !this.o || !this.b ? null : this.c;
    }

    public final boolean d() {
        return !this.i;
    }

    public final boolean e(long v) {
        if(!this.o) {
            return true;
        }
        return this.s == null ? true : ShapeContainingUtilKt.b(this.s, Offset.p(v), Offset.r(v), this.q, this.r);
    }

    private final boolean f(RoundRect roundRect0, long v, long v1, float f) {
        return roundRect0 != null && RoundRectKt.q(roundRect0) && roundRect0.q() == Offset.p(v) && roundRect0.s() == Offset.r(v) && roundRect0.r() == Offset.p(v) + Size.t(v1) && roundRect0.m() == Offset.r(v) + Size.m(v1) && CornerRadius.m(roundRect0.t()) == f;
    }

    public final boolean g(@l Shape shape0, float f, boolean z, float f1, @l LayoutDirection layoutDirection0, @l Density density0) {
        L.p(shape0, "shape");
        L.p(layoutDirection0, "layoutDirection");
        L.p(density0, "density");
        this.c.setAlpha(f);
        boolean z1 = L.g(this.e, shape0);
        if(!z1) {
            this.e = shape0;
            this.h = true;
        }
        boolean z2 = z || f1 > 0.0f;
        if(this.o != z2) {
            this.o = z2;
            this.h = true;
        }
        if(this.p != layoutDirection0) {
            this.p = layoutDirection0;
            this.h = true;
        }
        if(!L.g(this.a, density0)) {
            this.a = density0;
            this.h = true;
        }
        return !z1;
    }

    public final void h(long v) {
        if(!Size.k(this.d, v)) {
            this.d = v;
            this.h = true;
        }
    }

    private final void i() {
        if(this.h) {
            this.m = 0L;
            this.n = this.d;
            this.l = 0.0f;
            this.g = null;
            this.h = false;
            this.i = false;
            if(!this.o || Size.t(this.d) <= 0.0f || Size.m(this.d) <= 0.0f) {
                this.c.setEmpty();
            }
            else {
                this.b = true;
                androidx.compose.ui.graphics.Outline outline0 = this.e.a(this.d, this.p, this.a);
                this.s = outline0;
                if(outline0 instanceof Rectangle) {
                    this.k(((Rectangle)outline0).b());
                    return;
                }
                if(outline0 instanceof Rounded) {
                    this.l(((Rounded)outline0).b());
                    return;
                }
                if(outline0 instanceof Generic) {
                    this.j(((Generic)outline0).b());
                }
            }
        }
    }

    private final void j(Path path0) {
        if(Build.VERSION.SDK_INT <= 28 && !path0.n()) {
            this.b = false;
            this.c.setEmpty();
            this.i = true;
        }
        else {
            Outline outline0 = this.c;
            if(!(path0 instanceof AndroidPath)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline0.setConvexPath(((AndroidPath)path0).w());
            this.i = !this.c.canClip();
        }
        this.g = path0;
    }

    private final void k(Rect rect0) {
        this.m = OffsetKt.a(rect0.t(), rect0.B());
        this.n = SizeKt.a(rect0.G(), rect0.r());
        int v = b.L0(rect0.t());
        int v1 = b.L0(rect0.B());
        int v2 = b.L0(rect0.x());
        int v3 = b.L0(rect0.j());
        this.c.setRect(v, v1, v2, v3);
    }

    private final void l(RoundRect roundRect0) {
        float f = CornerRadius.m(roundRect0.t());
        this.m = OffsetKt.a(roundRect0.q(), roundRect0.s());
        this.n = SizeKt.a(roundRect0.v(), roundRect0.p());
        if(RoundRectKt.q(roundRect0)) {
            int v = b.L0(roundRect0.q());
            int v1 = b.L0(roundRect0.s());
            int v2 = b.L0(roundRect0.r());
            int v3 = b.L0(roundRect0.m());
            this.c.setRoundRect(v, v1, v2, v3, f);
            this.l = f;
            return;
        }
        Path path0 = this.f;
        if(path0 == null) {
            path0 = AndroidPath_androidKt.a();
            this.f = path0;
        }
        path0.reset();
        path0.j(roundRect0);
        this.j(path0);
    }
}

