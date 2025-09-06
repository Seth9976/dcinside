package androidx.compose.ui.text.android.style;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import s3.a;
import s3.e;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
@s0({"SMAP\nPlaceholderSpan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderSpan.kt\nandroidx/compose/ui/text/android/style/PlaceholderSpan\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1#2:190\n*E\n"})
public final class PlaceholderSpan extends ReplacementSpan {
    public static final class Companion {
        @Retention(RetentionPolicy.SOURCE)
        @e(a.a)
        public @interface Unit {
        }

        @Retention(RetentionPolicy.SOURCE)
        @e(a.a)
        public @interface VerticalAlign {
        }

        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    private final float a;
    private final int b;
    private final float c;
    private final int d;
    private final float e;
    private final int f;
    private Paint.FontMetricsInt g;
    private int h;
    private int i;
    private boolean j;
    @l
    public static final Companion k = null;
    public static final int l = 0;
    public static final int m = 0;
    public static final int n = 1;
    public static final int o = 2;
    public static final int p = 3;
    public static final int q = 4;
    public static final int r = 5;
    public static final int s = 6;
    public static final int t = 0;
    public static final int u = 1;
    public static final int v = 2;

    static {
        PlaceholderSpan.k = new Companion(null);
        PlaceholderSpan.l = 8;
    }

    public PlaceholderSpan(float f, int v, float f1, int v1, float f2, int v2) {
        this.a = f;
        this.b = v;
        this.c = f1;
        this.d = v1;
        this.e = f2;
        this.f = v2;
    }

    @l
    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt paint$FontMetricsInt0 = this.g;
        if(paint$FontMetricsInt0 != null) {
            return paint$FontMetricsInt0;
        }
        L.S("fontMetrics");
        return null;
    }

    public final int b() {
        if(!this.j) {
            throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
        }
        return this.i;
    }

    public final int c() {
        return this.f;
    }

    public final int d() {
        if(!this.j) {
            throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
        }
        return this.h;
    }

    @Override  // android.text.style.ReplacementSpan
    public void draw(@l Canvas canvas0, @m CharSequence charSequence0, int v, int v1, float f, int v2, int v3, int v4, @l Paint paint0) {
        L.p(canvas0, "canvas");
        L.p(paint0, "paint");
    }

    @Override  // android.text.style.ReplacementSpan
    @SuppressLint({"DocumentExceptions"})
    public int getSize(@l Paint paint0, @m CharSequence charSequence0, int v, int v1, @m Paint.FontMetricsInt paint$FontMetricsInt0) {
        int v2;
        float f1;
        L.p(paint0, "paint");
        this.j = true;
        float f = paint0.getTextSize();
        Paint.FontMetricsInt paint$FontMetricsInt1 = paint0.getFontMetricsInt();
        L.o(paint$FontMetricsInt1, "paint.fontMetricsInt");
        this.g = paint$FontMetricsInt1;
        if(this.a().descent <= this.a().ascent) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.");
        }
        switch(this.b) {
            case 0: {
                f1 = this.a * this.e;
                break;
            }
            case 1: {
                f1 = this.a * f;
                break;
            }
            default: {
                throw new IllegalArgumentException("Unsupported unit.");
            }
        }
        this.h = PlaceholderSpanKt.a(f1);
        switch(this.d) {
            case 0: {
                v2 = PlaceholderSpanKt.a(this.c * this.e);
                break;
            }
            case 1: {
                v2 = PlaceholderSpanKt.a(this.c * f);
                break;
            }
            default: {
                throw new IllegalArgumentException("Unsupported unit.");
            }
        }
        this.i = v2;
        if(paint$FontMetricsInt0 != null) {
            paint$FontMetricsInt0.ascent = this.a().ascent;
            paint$FontMetricsInt0.descent = this.a().descent;
            paint$FontMetricsInt0.leading = this.a().leading;
            switch(this.f) {
                case 0: {
                    if(paint$FontMetricsInt0.ascent > -this.b()) {
                        paint$FontMetricsInt0.ascent = -this.b();
                    }
                    break;
                }
                case 1: 
                case 4: {
                    if(paint$FontMetricsInt0.ascent + this.b() > paint$FontMetricsInt0.descent) {
                        paint$FontMetricsInt0.descent = paint$FontMetricsInt0.ascent + this.b();
                    }
                    break;
                }
                case 2: 
                case 5: {
                    if(paint$FontMetricsInt0.ascent > paint$FontMetricsInt0.descent - this.b()) {
                        paint$FontMetricsInt0.ascent = paint$FontMetricsInt0.descent - this.b();
                    }
                    break;
                }
                case 3: 
                case 6: {
                    if(paint$FontMetricsInt0.descent - paint$FontMetricsInt0.ascent < this.b()) {
                        int v3 = paint$FontMetricsInt0.ascent - (this.b() - (paint$FontMetricsInt0.descent - paint$FontMetricsInt0.ascent)) / 2;
                        paint$FontMetricsInt0.ascent = v3;
                        paint$FontMetricsInt0.descent = v3 + this.b();
                    }
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unknown verticalAlign.");
                }
            }
            paint$FontMetricsInt0.top = Math.min(this.a().top, paint$FontMetricsInt0.ascent);
            paint$FontMetricsInt0.bottom = Math.max(this.a().bottom, paint$FontMetricsInt0.descent);
        }
        return this.d();
    }
}

