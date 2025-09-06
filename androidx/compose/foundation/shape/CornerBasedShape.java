package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.L;
import y4.l;

@StabilityInferred(parameters = 0)
public abstract class CornerBasedShape implements Shape {
    @l
    private final CornerSize a;
    @l
    private final CornerSize b;
    @l
    private final CornerSize c;
    @l
    private final CornerSize d;
    public static final int e;

    static {
    }

    public CornerBasedShape(@l CornerSize cornerSize0, @l CornerSize cornerSize1, @l CornerSize cornerSize2, @l CornerSize cornerSize3) {
        L.p(cornerSize0, "topStart");
        L.p(cornerSize1, "topEnd");
        L.p(cornerSize2, "bottomEnd");
        L.p(cornerSize3, "bottomStart");
        super();
        this.a = cornerSize0;
        this.b = cornerSize1;
        this.c = cornerSize2;
        this.d = cornerSize3;
    }

    @Override  // androidx.compose.ui.graphics.Shape
    @l
    public final Outline a(long v, @l LayoutDirection layoutDirection0, @l Density density0) {
        L.p(layoutDirection0, "layoutDirection");
        L.p(density0, "density");
        float f = this.a.a(v, density0);
        float f1 = this.b.a(v, density0);
        float f2 = this.c.a(v, density0);
        float f3 = this.d.a(v, density0);
        float f4 = Size.q(v);
        float f5 = f + f3;
        if(f5 > f4) {
            float f6 = f4 / f5;
            f *= f6;
            f3 *= f6;
        }
        float f7 = f1 + f2;
        if(f7 > f4) {
            float f8 = f4 / f7;
            f1 *= f8;
            f2 *= f8;
        }
        if(f < 0.0f || f1 < 0.0f || f2 < 0.0f || f3 < 0.0f) {
            throw new IllegalArgumentException(("Corner size in Px can\'t be negative(topStart = " + f + ", topEnd = " + f1 + ", bottomEnd = " + f2 + ", bottomStart = " + f3 + ")!").toString());
        }
        return this.e(v, f, f1, f2, f3, layoutDirection0);
    }

    @l
    public final CornerBasedShape b(@l CornerSize cornerSize0) {
        L.p(cornerSize0, "all");
        return this.c(cornerSize0, cornerSize0, cornerSize0, cornerSize0);
    }

    @l
    public abstract CornerBasedShape c(@l CornerSize arg1, @l CornerSize arg2, @l CornerSize arg3, @l CornerSize arg4);

    public static CornerBasedShape d(CornerBasedShape cornerBasedShape0, CornerSize cornerSize0, CornerSize cornerSize1, CornerSize cornerSize2, CornerSize cornerSize3, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if((v & 1) != 0) {
            cornerSize0 = cornerBasedShape0.a;
        }
        if((v & 2) != 0) {
            cornerSize1 = cornerBasedShape0.b;
        }
        if((v & 4) != 0) {
            cornerSize2 = cornerBasedShape0.c;
        }
        if((v & 8) != 0) {
            cornerSize3 = cornerBasedShape0.d;
        }
        return cornerBasedShape0.c(cornerSize0, cornerSize1, cornerSize2, cornerSize3);
    }

    @l
    public abstract Outline e(long arg1, float arg2, float arg3, float arg4, float arg5, @l LayoutDirection arg6);

    @l
    public final CornerSize f() {
        return this.c;
    }

    @l
    public final CornerSize g() {
        return this.d;
    }

    @l
    public final CornerSize h() {
        return this.b;
    }

    @l
    public final CornerSize i() {
        return this.a;
    }
}

