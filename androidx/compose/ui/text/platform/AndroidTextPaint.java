package androidx.compose.ui.text.platform;

import android.text.TextPaint;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.W;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidTextPaint.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextPaint.android.kt\nandroidx/compose/ui/text/platform/AndroidTextPaint\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,143:1\n646#2:144\n646#2:145\n152#3:146\n*S KotlinDebug\n*F\n+ 1 AndroidTextPaint.android.kt\nandroidx/compose/ui/text/platform/AndroidTextPaint\n*L\n83#1:144\n92#1:145\n93#1:146\n*E\n"})
public final class AndroidTextPaint extends TextPaint {
    @l
    private final Paint a;
    @l
    private TextDecoration b;
    @l
    private Shadow c;
    @m
    private DrawStyle d;

    public AndroidTextPaint(int v, float f) {
        super(v);
        this.density = f;
        this.a = AndroidPaint_androidKt.y(this);
        this.b = TextDecoration.b.d();
        this.c = Shadow.d.a();
    }

    public final int a() {
        return this.a.x();
    }

    private static Object b(AndroidTextPaint androidTextPaint0) {
        return m0.j(new W(androidTextPaint0.a, Paint.class, "blendMode", "getBlendMode-0nO6VwU()I", 0));
    }

    @l
    public final Shadow c() {
        return this.c;
    }

    @VisibleForTesting(otherwise = 2)
    public static void d() {
    }

    public final void e(int v) {
        this.a.t(v);
    }

    public final void f(@m Brush brush0, long v, float f) {
        if(brush0 instanceof SolidColor && ((SolidColor)brush0).c() != 16L || brush0 instanceof ShaderBrush && v != 0x7FC000007FC00000L) {
            float f1 = Float.isNaN(f) ? this.a.i() : s.H(f, 0.0f, 1.0f);
            brush0.a(v, this.a, f1);
            return;
        }
        if(brush0 == null) {
            this.a.y(null);
        }
    }

    public static void g(AndroidTextPaint androidTextPaint0, Brush brush0, long v, float f, int v1, Object object0) {
        if((v1 & 4) != 0) {
            f = NaNf;
        }
        androidTextPaint0.f(brush0, v, f);
    }

    public final void h(long v) {
        if(v != 16L) {
            this.a.g(v);
            this.a.y(null);
        }
    }

    public final void i(@m DrawStyle drawStyle0) {
        if(drawStyle0 == null) {
            return;
        }
        if(!L.g(this.d, drawStyle0)) {
            this.d = drawStyle0;
            if(L.g(drawStyle0, Fill.a)) {
                this.a.p(0);
                return;
            }
            if(drawStyle0 instanceof Stroke) {
                this.a.p(1);
                float f = ((Stroke)drawStyle0).g();
                this.a.q(f);
                float f1 = ((Stroke)drawStyle0).e();
                this.a.n(f1);
                int v = ((Stroke)drawStyle0).d();
                this.a.f(v);
                int v1 = ((Stroke)drawStyle0).c();
                this.a.c(v1);
                PathEffect pathEffect0 = ((Stroke)drawStyle0).f();
                this.a.v(pathEffect0);
            }
        }
    }

    public final void j(@m Shadow shadow0) {
        if(shadow0 == null) {
            return;
        }
        if(!L.g(this.c, shadow0)) {
            this.c = shadow0;
            if(L.g(shadow0, Shadow.d.a())) {
                this.clearShadowLayer();
                return;
            }
            this.setShadowLayer(TextPaintExtensions_androidKt.c(this.c.d()), Offset.p(this.c.h()), Offset.r(this.c.h()), ColorKt.r(this.c.f()));
        }
    }

    public final void k(@l Shadow shadow0) {
        L.p(shadow0, "<set-?>");
        this.c = shadow0;
    }

    public final void l(@m TextDecoration textDecoration0) {
        if(textDecoration0 == null) {
            return;
        }
        if(!L.g(this.b, textDecoration0)) {
            this.b = textDecoration0;
            this.setUnderlineText(textDecoration0.d(TextDecoration.b.f()));
            this.setStrikeThruText(this.b.d(TextDecoration.b.b()));
        }
    }
}

