package androidx.compose.ui.graphics;

import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build.VERSION;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class AndroidPaint_androidKt {
    public final class WhenMappings {
        public static final int[] a;
        public static final int[] b;
        public static final int[] c;

        static {
            int[] arr_v = new int[Paint.Style.values().length];
            try {
                arr_v[Paint.Style.STROKE.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.a = arr_v;
            int[] arr_v1 = new int[Paint.Cap.values().length];
            try {
                arr_v1[Paint.Cap.BUTT.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[Paint.Cap.ROUND.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[Paint.Cap.SQUARE.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.b = arr_v1;
            int[] arr_v2 = new int[Paint.Join.values().length];
            try {
                arr_v2[Paint.Join.MITER.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v2[Paint.Join.BEVEL.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v2[Paint.Join.ROUND.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.c = arr_v2;
        }
    }

    @l
    public static final Paint a() {
        return new AndroidPaint();
    }

    public static final float b(@l android.graphics.Paint paint0) {
        L.p(paint0, "<this>");
        return ((float)paint0.getAlpha()) / 255.0f;
    }

    public static final boolean c(@l android.graphics.Paint paint0) {
        L.p(paint0, "<this>");
        return paint0.isAntiAlias();
    }

    public static final long d(@l android.graphics.Paint paint0) {
        L.p(paint0, "<this>");
        return ColorKt.b(paint0.getColor());
    }

    // 去混淆评级： 低(25)
    public static final int e(@l android.graphics.Paint paint0) {
        L.p(paint0, "<this>");
        return paint0.isFilterBitmap() ? 1 : 0;
    }

    public static final int f(@l android.graphics.Paint paint0) {
        L.p(paint0, "<this>");
        Paint.Cap paint$Cap0 = paint0.getStrokeCap();
        switch((paint$Cap0 == null ? -1 : WhenMappings.b[paint$Cap0.ordinal()])) {
            case 1: {
                return 0;
            }
            case 2: {
                return 1;
            }
            case 3: {
                return 2;
            }
            default: {
                return 0;
            }
        }
    }

    public static final int g(@l android.graphics.Paint paint0) {
        L.p(paint0, "<this>");
        Paint.Join paint$Join0 = paint0.getStrokeJoin();
        switch((paint$Join0 == null ? -1 : WhenMappings.c[paint$Join0.ordinal()])) {
            case 1: {
                return 0;
            }
            case 2: {
                return 2;
            }
            case 3: {
                return 1;
            }
            default: {
                return 0;
            }
        }
    }

    public static final float h(@l android.graphics.Paint paint0) {
        L.p(paint0, "<this>");
        return paint0.getStrokeMiter();
    }

    public static final float i(@l android.graphics.Paint paint0) {
        L.p(paint0, "<this>");
        return paint0.getStrokeWidth();
    }

    // 去混淆评级： 低(20)
    public static final int j(@l android.graphics.Paint paint0) {
        L.p(paint0, "<this>");
        Paint.Style paint$Style0 = paint0.getStyle();
        return (paint$Style0 == null ? -1 : WhenMappings.a[paint$Style0.ordinal()]) == 1 ? 1 : 0;
    }

    @l
    public static final android.graphics.Paint k() {
        return new android.graphics.Paint(7);
    }

    public static final void l(@l android.graphics.Paint paint0, float f) {
        L.p(paint0, "<this>");
        paint0.setAlpha(((int)(((float)Math.rint(f * 255.0f)))));
    }

    public static final void m(@l android.graphics.Paint paint0, boolean z) {
        L.p(paint0, "<this>");
        paint0.setAntiAlias(z);
    }

    public static final void n(@l android.graphics.Paint paint0, int v) {
        L.p(paint0, "$this$setNativeBlendMode");
        if(Build.VERSION.SDK_INT >= 29) {
            WrapperVerificationHelperMethods.a.a(paint0, v);
            return;
        }
        paint0.setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.c(v)));
    }

    public static final void o(@l android.graphics.Paint paint0, long v) {
        L.p(paint0, "$this$setNativeColor");
        paint0.setColor(ColorKt.r(v));
    }

    public static final void p(@l android.graphics.Paint paint0, @m ColorFilter colorFilter0) {
        L.p(paint0, "<this>");
        paint0.setColorFilter((colorFilter0 == null ? null : AndroidColorFilter_androidKt.d(colorFilter0)));
    }

    public static final void q(@l android.graphics.Paint paint0, int v) {
        L.p(paint0, "$this$setNativeFilterQuality");
        paint0.setFilterBitmap(!FilterQuality.h(v, 0));
    }

    public static final void r(@l android.graphics.Paint paint0, @m PathEffect pathEffect0) {
        L.p(paint0, "<this>");
        paint0.setPathEffect((((AndroidPathEffect)pathEffect0) == null ? null : ((AndroidPathEffect)pathEffect0).a()));
    }

    public static final void s(@l android.graphics.Paint paint0, @m Shader shader0) {
        L.p(paint0, "<this>");
        paint0.setShader(shader0);
    }

    public static final void t(@l android.graphics.Paint paint0, int v) {
        Paint.Cap paint$Cap0;
        L.p(paint0, "$this$setNativeStrokeCap");
        if(StrokeCap.g(v, 2)) {
            paint$Cap0 = Paint.Cap.SQUARE;
        }
        else {
            paint$Cap0 = StrokeCap.g(v, 1) ? Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
        paint0.setStrokeCap(paint$Cap0);
    }

    public static final void u(@l android.graphics.Paint paint0, int v) {
        Paint.Join paint$Join0;
        L.p(paint0, "$this$setNativeStrokeJoin");
        if(StrokeJoin.g(v, 0)) {
            paint$Join0 = Paint.Join.MITER;
        }
        else if(StrokeJoin.g(v, 2)) {
            paint$Join0 = Paint.Join.BEVEL;
        }
        else {
            paint$Join0 = StrokeJoin.g(v, 1) ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint0.setStrokeJoin(paint$Join0);
    }

    public static final void v(@l android.graphics.Paint paint0, float f) {
        L.p(paint0, "<this>");
        paint0.setStrokeMiter(f);
    }

    public static final void w(@l android.graphics.Paint paint0, float f) {
        L.p(paint0, "<this>");
        paint0.setStrokeWidth(f);
    }

    public static final void x(@l android.graphics.Paint paint0, int v) {
        L.p(paint0, "$this$setNativeStyle");
        paint0.setStyle((PaintingStyle.f(v, 1) ? Paint.Style.STROKE : Paint.Style.FILL));
    }

    @l
    public static final Paint y(@l android.graphics.Paint paint0) {
        L.p(paint0, "<this>");
        return new AndroidPaint(paint0);
    }
}

