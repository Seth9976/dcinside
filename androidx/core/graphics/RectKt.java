package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.graphics.Region;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rect.kt\nandroidx/core/graphics/RectKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,294:1\n278#1,3:296\n211#1,6:299\n114#1:305\n122#1:307\n278#1,3:309\n278#1,3:312\n1#2:295\n1#2:306\n1#2:308\n*S KotlinDebug\n*F\n+ 1 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n161#1:296,3\n207#1:299,6\n220#1:305\n223#1:307\n253#1:309,3\n290#1:312,3\n220#1:306\n223#1:308\n*E\n"})
public final class RectKt {
    @l
    public static final Rect A(@l Rect rect0, int v) {
        Rect rect1 = new Rect(rect0);
        rect1.top *= v;
        rect1.left *= v;
        rect1.right *= v;
        rect1.bottom *= v;
        return rect1;
    }

    @l
    public static final RectF B(@l RectF rectF0, float f) {
        RectF rectF1 = new RectF(rectF0);
        rectF1.top *= f;
        rectF1.left *= f;
        rectF1.right *= f;
        rectF1.bottom *= f;
        return rectF1;
    }

    @l
    public static final RectF C(@l RectF rectF0, int v) {
        RectF rectF1 = new RectF(rectF0);
        rectF1.top *= (float)v;
        rectF1.left *= (float)v;
        rectF1.right *= (float)v;
        rectF1.bottom *= (float)v;
        return rectF1;
    }

    @l
    public static final Rect D(@l RectF rectF0) {
        Rect rect0 = new Rect();
        rectF0.roundOut(rect0);
        return rect0;
    }

    @l
    public static final RectF E(@l Rect rect0) {
        return new RectF(rect0);
    }

    @l
    public static final Region F(@l Rect rect0) {
        return new Region(rect0);
    }

    @l
    public static final Region G(@l RectF rectF0) {
        Rect rect0 = new Rect();
        rectF0.roundOut(rect0);
        return new Region(rect0);
    }

    @l
    public static final RectF H(@l RectF rectF0, @l Matrix matrix0) {
        matrix0.mapRect(rectF0);
        return rectF0;
    }

    @l
    public static final Region I(@l Rect rect0, @l Rect rect1) {
        Region region0 = new Region(rect0);
        region0.op(rect1, Region.Op.XOR);
        return region0;
    }

    @l
    public static final Region J(@l RectF rectF0, @l RectF rectF1) {
        Rect rect0 = new Rect();
        rectF0.roundOut(rect0);
        Region region0 = new Region(rect0);
        Rect rect1 = new Rect();
        rectF1.roundOut(rect1);
        region0.op(rect1, Region.Op.XOR);
        return region0;
    }

    @SuppressLint({"CheckResult"})
    @l
    public static final Rect a(@l Rect rect0, @l Rect rect1) {
        Rect rect2 = new Rect(rect0);
        rect2.intersect(rect1);
        return rect2;
    }

    @SuppressLint({"CheckResult"})
    @l
    public static final RectF b(@l RectF rectF0, @l RectF rectF1) {
        RectF rectF2 = new RectF(rectF0);
        rectF2.intersect(rectF1);
        return rectF2;
    }

    public static final float c(@l RectF rectF0) {
        return rectF0.left;
    }

    public static final int d(@l Rect rect0) {
        return rect0.left;
    }

    public static final float e(@l RectF rectF0) {
        return rectF0.top;
    }

    public static final int f(@l Rect rect0) {
        return rect0.top;
    }

    public static final float g(@l RectF rectF0) {
        return rectF0.right;
    }

    public static final int h(@l Rect rect0) {
        return rect0.right;
    }

    public static final float i(@l RectF rectF0) {
        return rectF0.bottom;
    }

    public static final int j(@l Rect rect0) {
        return rect0.bottom;
    }

    public static final boolean k(@l Rect rect0, @l Point point0) {
        return rect0.contains(point0.x, point0.y);
    }

    public static final boolean l(@l RectF rectF0, @l PointF pointF0) {
        return rectF0.contains(pointF0.x, pointF0.y);
    }

    @l
    public static final Rect m(@l Rect rect0, int v) {
        Rect rect1 = new Rect(rect0);
        rect1.offset(-v, -v);
        return rect1;
    }

    @l
    public static final Rect n(@l Rect rect0, @l Point point0) {
        Rect rect1 = new Rect(rect0);
        rect1.offset(-point0.x, -point0.y);
        return rect1;
    }

    @l
    public static final RectF o(@l RectF rectF0, float f) {
        RectF rectF1 = new RectF(rectF0);
        rectF1.offset(-f, -f);
        return rectF1;
    }

    @l
    public static final RectF p(@l RectF rectF0, @l PointF pointF0) {
        RectF rectF1 = new RectF(rectF0);
        rectF1.offset(-pointF0.x, -pointF0.y);
        return rectF1;
    }

    @l
    public static final Region q(@l Rect rect0, @l Rect rect1) {
        Region region0 = new Region(rect0);
        region0.op(rect1, Region.Op.DIFFERENCE);
        return region0;
    }

    @l
    public static final Region r(@l RectF rectF0, @l RectF rectF1) {
        Rect rect0 = new Rect();
        rectF0.roundOut(rect0);
        Region region0 = new Region(rect0);
        Rect rect1 = new Rect();
        rectF1.roundOut(rect1);
        region0.op(rect1, Region.Op.DIFFERENCE);
        return region0;
    }

    @l
    public static final Rect s(@l Rect rect0, @l Rect rect1) {
        Rect rect2 = new Rect(rect0);
        rect2.union(rect1);
        return rect2;
    }

    @l
    public static final RectF t(@l RectF rectF0, @l RectF rectF1) {
        RectF rectF2 = new RectF(rectF0);
        rectF2.union(rectF1);
        return rectF2;
    }

    @l
    public static final Rect u(@l Rect rect0, int v) {
        Rect rect1 = new Rect(rect0);
        rect1.offset(v, v);
        return rect1;
    }

    @l
    public static final Rect v(@l Rect rect0, @l Point point0) {
        Rect rect1 = new Rect(rect0);
        rect1.offset(point0.x, point0.y);
        return rect1;
    }

    @l
    public static final Rect w(@l Rect rect0, @l Rect rect1) {
        Rect rect2 = new Rect(rect0);
        rect2.union(rect1);
        return rect2;
    }

    @l
    public static final RectF x(@l RectF rectF0, float f) {
        RectF rectF1 = new RectF(rectF0);
        rectF1.offset(f, f);
        return rectF1;
    }

    @l
    public static final RectF y(@l RectF rectF0, @l PointF pointF0) {
        RectF rectF1 = new RectF(rectF0);
        rectF1.offset(pointF0.x, pointF0.y);
        return rectF1;
    }

    @l
    public static final RectF z(@l RectF rectF0, @l RectF rectF1) {
        RectF rectF2 = new RectF(rectF0);
        rectF2.union(rectF1);
        return rectF2;
    }
}

