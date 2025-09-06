package androidx.compose.ui.text.android.style;

import android.graphics.Paint.FontMetricsInt;
import android.text.style.LineHeightSpan;
import androidx.annotation.FloatRange;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import kotlin.jvm.internal.L;
import y4.l;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
public final class LineHeightStyleSpan implements LineHeightSpan {
    private final float a;
    private final int b;
    private final int c;
    private final boolean d;
    private final boolean e;
    private final float f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    public static final int m = 8;

    static {
    }

    public LineHeightStyleSpan(float f, int v, int v1, boolean z, boolean z1, @FloatRange(from = 0.0, to = 1.0) float f1) {
        this.a = f;
        this.b = v;
        this.c = v1;
        this.d = z;
        this.e = z1;
        this.f = f1;
        if((0.0f > f1 || f1 > 1.0f) && f1 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }

    private final void a(Paint.FontMetricsInt paint$FontMetricsInt0) {
        int v = LineHeightStyleSpanKt.a(paint$FontMetricsInt0);
        int v1 = (int)(((float)Math.ceil(this.a)));
        int v2 = v1 - v;
        float f = this.f == -1.0f ? Math.abs(paint$FontMetricsInt0.ascent) / ((float)LineHeightStyleSpanKt.a(paint$FontMetricsInt0)) : this.f;
        int v3 = paint$FontMetricsInt0.descent;
        int v4 = ((int)(((float)(v2 > 0 ? Math.ceil(((float)v2) * (1.0f - f)) : Math.ceil(((float)v2) * f))))) + v3;
        this.i = v4;
        int v5 = v4 - v1;
        this.h = v5;
        if(this.d) {
            v5 = paint$FontMetricsInt0.ascent;
        }
        this.g = v5;
        if(this.e) {
            v4 = v3;
        }
        this.j = v4;
        this.k = paint$FontMetricsInt0.ascent - v5;
        this.l = v4 - v3;
    }

    @l
    public final LineHeightStyleSpan b(int v, int v1, boolean z) {
        return new LineHeightStyleSpan(this.a, v, v1, z, this.e, this.f);
    }

    public static LineHeightStyleSpan c(LineHeightStyleSpan lineHeightStyleSpan0, int v, int v1, boolean z, int v2, Object object0) {
        if((v2 & 4) != 0) {
            z = lineHeightStyleSpan0.d;
        }
        return lineHeightStyleSpan0.b(v, v1, z);
    }

    @Override  // android.text.style.LineHeightSpan
    public void chooseHeight(@l CharSequence charSequence0, int v, int v1, int v2, int v3, @l Paint.FontMetricsInt paint$FontMetricsInt0) {
        boolean z = false;
        L.p(charSequence0, "text");
        L.p(paint$FontMetricsInt0, "fontMetricsInt");
        if(LineHeightStyleSpanKt.a(paint$FontMetricsInt0) <= 0) {
            return;
        }
        boolean z1 = v == this.b;
        if(v1 == this.c) {
            z = true;
        }
        if(z1 && z && this.d && this.e) {
            return;
        }
        if(z1) {
            this.a(paint$FontMetricsInt0);
        }
        paint$FontMetricsInt0.ascent = z1 ? this.g : this.h;
        paint$FontMetricsInt0.descent = z ? this.j : this.i;
    }

    public final int d() {
        return this.k;
    }

    public final int e() {
        return this.l;
    }

    public final float f() {
        return this.a;
    }

    public final boolean g() {
        return this.e;
    }
}

