package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.PointF;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nPoint.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Point.kt\nandroidx/core/graphics/PointKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1#2:152\n*E\n"})
public final class PointKt {
    public static final float a(@l PointF pointF0) {
        return pointF0.x;
    }

    public static final int b(@l Point point0) {
        return point0.x;
    }

    public static final float c(@l PointF pointF0) {
        return pointF0.y;
    }

    public static final int d(@l Point point0) {
        return point0.y;
    }

    @l
    public static final Point e(@l Point point0, float f) {
        return new Point(Math.round(((float)point0.x) / f), Math.round(((float)point0.y) / f));
    }

    @l
    public static final PointF f(@l PointF pointF0, float f) {
        return new PointF(pointF0.x / f, pointF0.y / f);
    }

    @l
    public static final Point g(@l Point point0, int v) {
        Point point1 = new Point(point0.x, point0.y);
        point1.offset(-v, -v);
        return point1;
    }

    @l
    public static final Point h(@l Point point0, @l Point point1) {
        Point point2 = new Point(point0.x, point0.y);
        point2.offset(-point1.x, -point1.y);
        return point2;
    }

    @l
    public static final PointF i(@l PointF pointF0, float f) {
        PointF pointF1 = new PointF(pointF0.x, pointF0.y);
        pointF1.offset(-f, -f);
        return pointF1;
    }

    @l
    public static final PointF j(@l PointF pointF0, @l PointF pointF1) {
        PointF pointF2 = new PointF(pointF0.x, pointF0.y);
        pointF2.offset(-pointF1.x, -pointF1.y);
        return pointF2;
    }

    @l
    public static final Point k(@l Point point0, int v) {
        Point point1 = new Point(point0.x, point0.y);
        point1.offset(v, v);
        return point1;
    }

    @l
    public static final Point l(@l Point point0, @l Point point1) {
        Point point2 = new Point(point0.x, point0.y);
        point2.offset(point1.x, point1.y);
        return point2;
    }

    @l
    public static final PointF m(@l PointF pointF0, float f) {
        PointF pointF1 = new PointF(pointF0.x, pointF0.y);
        pointF1.offset(f, f);
        return pointF1;
    }

    @l
    public static final PointF n(@l PointF pointF0, @l PointF pointF1) {
        PointF pointF2 = new PointF(pointF0.x, pointF0.y);
        pointF2.offset(pointF1.x, pointF1.y);
        return pointF2;
    }

    @l
    public static final Point o(@l Point point0, float f) {
        return new Point(Math.round(((float)point0.x) * f), Math.round(((float)point0.y) * f));
    }

    @l
    public static final PointF p(@l PointF pointF0, float f) {
        return new PointF(pointF0.x * f, pointF0.y * f);
    }

    @l
    public static final Point q(@l PointF pointF0) {
        return new Point(((int)pointF0.x), ((int)pointF0.y));
    }

    @l
    public static final PointF r(@l Point point0) {
        return new PointF(point0);
    }

    @l
    public static final Point s(@l Point point0) {
        return new Point(-point0.x, -point0.y);
    }

    @l
    public static final PointF t(@l PointF pointF0) {
        return new PointF(-pointF0.x, -pointF0.y);
    }
}

