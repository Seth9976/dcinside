package androidx.compose.ui.text.android;

import A3.a;
import android.graphics.Canvas;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Trace;
import android.text.BoringLayout.Metrics;
import android.text.BoringLayout;
import android.text.Layout.Alignment;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import androidx.annotation.Px;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.IndentationFixSpanKt;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.V;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
@s0({"SMAP\nTextLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.kt\nandroidx/compose/ui/text/android/TextLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1035:1\n1#2:1036\n*E\n"})
public final class TextLayout {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @VisibleForTesting
        @l
        public final StaticLayout a(@l CharSequence charSequence0, int v, @l TextPaint textPaint0, int v1, int v2, int v3, int v4) {
            L.p(charSequence0, "charSequence");
            L.p(textPaint0, "textPaint");
            return StaticLayoutFactory.b(StaticLayoutFactory.a, charSequence0, 0, 0, textPaint0, v, null, null, 0, null, 0, 0.0f, 0.0f, 0, false, false, v3, v2, v4, v1, null, null, 1605606, null);
        }
    }

    private final boolean a;
    private final boolean b;
    @l
    private final LayoutIntrinsics c;
    private final boolean d;
    @l
    private final Layout e;
    private final int f;
    private final int g;
    private final int h;
    private final float i;
    private final float j;
    private final boolean k;
    @m
    private final Paint.FontMetricsInt l;
    private final int m;
    @l
    private final LineHeightStyleSpan[] n;
    @l
    private final Rect o;
    @l
    private final D p;
    @l
    public static final Companion q;
    public static final int r;

    static {
        TextLayout.q = new Companion(null);
        TextLayout.r = 8;
    }

    public TextLayout(@l CharSequence charSequence0, float f, @l TextPaint textPaint0, int v, @m TextUtils.TruncateAt textUtils$TruncateAt0, int v1, float f1, @Px float f2, boolean z, boolean z1, int v2, int v3, int v4, int v5, int v6, int v7, @m int[] arr_v, @m int[] arr_v1, @l LayoutIntrinsics layoutIntrinsics0) {
        L.p(charSequence0, "charSequence");
        boolean z3;
        StaticLayout staticLayout0;
        L.p(textPaint0, "textPaint");
        L.p(layoutIntrinsics0, "layoutIntrinsics");
        super();
        this.a = z;
        this.b = z1;
        this.c = layoutIntrinsics0;
        this.o = new Rect();
        int v8 = charSequence0.length();
        TextDirectionHeuristic textDirectionHeuristic0 = TextLayoutKt.i(v1);
        Layout.Alignment layout$Alignment0 = TextAlignmentAdapter.a.a(v);
        boolean z2 = charSequence0 instanceof Spanned && ((Spanned)charSequence0).nextSpanTransition(-1, v8, BaselineShiftSpan.class) < v8;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics boringLayout$Metrics0 = layoutIntrinsics0.a();
            int v10 = (int)(((float)Math.ceil(f)));
            if(boringLayout$Metrics0 == null || layoutIntrinsics0.b() > f || z2) {
                this.k = false;
                int v11 = charSequence0.length();
                staticLayout0 = StaticLayoutFactory.a.a(charSequence0, 0, v11, textPaint0, v10, textDirectionHeuristic0, layout$Alignment0, v2, textUtils$TruncateAt0, ((int)(((float)Math.ceil(f)))), f1, f2, v7, z, z1, v3, v4, v5, v6, arr_v, arr_v1);
            }
            else {
                this.k = true;
                staticLayout0 = BoringLayoutFactory.a.a(charSequence0, textPaint0, v10, boringLayout$Metrics0, layout$Alignment0, z, z1, textUtils$TruncateAt0, v10);
            }
            this.e = staticLayout0;
        }
        finally {
            Trace.endSection();
        }
        int v12 = Math.min(staticLayout0.getLineCount(), v2);
        this.f = v12;
        if(v12 < v2) {
            z3 = false;
        }
        else if(staticLayout0.getEllipsisCount(v12 - 1) > 0 || staticLayout0.getLineEnd(v12 - 1) != charSequence0.length()) {
            z3 = true;
        }
        else {
            z3 = false;
        }
        this.d = z3;
        V v13 = TextLayoutKt.j(this);
        LineHeightStyleSpan[] arr_lineHeightStyleSpan = TextLayoutKt.h(this);
        this.n = arr_lineHeightStyleSpan;
        V v14 = TextLayoutKt.g(this, arr_lineHeightStyleSpan);
        this.g = Math.max(((Number)v13.e()).intValue(), ((Number)v14.e()).intValue());
        this.h = Math.max(((Number)v13.f()).intValue(), ((Number)v14.f()).intValue());
        V v15 = TextLayoutKt.f(this, textPaint0, textDirectionHeuristic0, arr_lineHeightStyleSpan);
        this.l = (Paint.FontMetricsInt)v15.e();
        this.m = ((Number)v15.f()).intValue();
        this.i = IndentationFixSpanKt.b(staticLayout0, v12 - 1, null, 2, null);
        this.j = IndentationFixSpanKt.d(staticLayout0, v12 - 1, null, 2, null);
        androidx.compose.ui.text.android.TextLayout.layoutHelper.2 textLayout$layoutHelper$20 = new a() {
            final TextLayout e;

            {
                this.e = textLayout0;
                super(0);
            }

            @l
            public final LayoutHelper b() {
                return new LayoutHelper(this.e.j());
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        };
        this.p = E.c(H.c, textLayout$layoutHelper$20);
    }

    public TextLayout(CharSequence charSequence0, float f, TextPaint textPaint0, int v, TextUtils.TruncateAt textUtils$TruncateAt0, int v1, float f1, float f2, boolean z, boolean z1, int v2, int v3, int v4, int v5, int v6, int v7, int[] arr_v, int[] arr_v1, LayoutIntrinsics layoutIntrinsics0, int v8, w w0) {
        int v9 = (v8 & 0x20) == 0 ? v1 : 2;
        this(charSequence0, ((v8 & 2) == 0 ? f : 0.0f), textPaint0, ((v8 & 8) == 0 ? v : 0), ((v8 & 16) == 0 ? textUtils$TruncateAt0 : null), v9, ((v8 & 0x40) == 0 ? f1 : 1.0f), ((v8 & 0x80) == 0 ? f2 : 0.0f), ((v8 & 0x100) == 0 ? z : false), ((v8 & 0x200) == 0 ? z1 : true), ((v8 & 0x400) == 0 ? v2 : 0x7FFFFFFF), ((v8 & 0x800) == 0 ? v3 : 0), ((v8 & 0x1000) == 0 ? v4 : 0), ((v8 & 0x2000) == 0 ? v5 : 0), ((v8 & 0x4000) == 0 ? v6 : 0), ((0x8000 & v8) == 0 ? v7 : 0), ((0x10000 & v8) == 0 ? arr_v : null), ((0x20000 & v8) == 0 ? arr_v1 : null), ((v8 & 0x40000) == 0 ? layoutIntrinsics0 : new LayoutIntrinsics(charSequence0, textPaint0, v9)));
    }

    public final int A(int v) {
        return this.e.getLineStart(v);
    }

    public final float B(int v) {
        float f = (float)this.e.getLineTop(v);
        return v == 0 ? f + 0.0f : f + ((float)this.g);
    }

    public final int C(int v) {
        if(this.e.getEllipsisStart(v) == 0) {
            return this.e.getLineVisibleEnd(v);
        }
        int v1 = this.e.getLineStart(v);
        return this.e.getEllipsisStart(v) + v1;
    }

    public final float D(int v) {
        return this.e.getLineWidth(v);
    }

    public final float E() {
        return this.c.b();
    }

    public final float F() {
        return this.c.c();
    }

    public final int G(int v, float f) {
        float f1 = this.h(v);
        return this.e.getOffsetForHorizontal(v, f + -1.0f * f1);
    }

    public final int H(int v) {
        return this.e.getParagraphDirection(v);
    }

    public final float I(int v, boolean z) {
        return this.l().c(v, true, z) + this.h(this.v(v));
    }

    public static float J(TextLayout textLayout0, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        return textLayout0.I(v, z);
    }

    public final float K(int v, boolean z) {
        return this.l().c(v, false, z) + this.h(this.v(v));
    }

    public static float L(TextLayout textLayout0, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        return textLayout0.K(v, z);
    }

    public final void M(int v, int v1, @l Path path0) {
        L.p(path0, "dest");
        this.e.getSelectionPath(v, v1, path0);
        if(this.g != 0 && !path0.isEmpty()) {
            path0.offset(0.0f, ((float)this.g));
        }
    }

    @l
    public final CharSequence N() {
        CharSequence charSequence0 = this.e.getText();
        L.o(charSequence0, "layout.text");
        return charSequence0;
    }

    public final int O() {
        return this.g;
    }

    @VisibleForTesting
    public static void P() {
    }

    public final boolean Q() {
        if(this.k) {
            L.n(this.e, "null cannot be cast to non-null type android.text.BoringLayout");
            return BoringLayoutFactory.a.c(((BoringLayout)this.e));
        }
        L.n(this.e, "null cannot be cast to non-null type android.text.StaticLayout");
        return StaticLayoutFactory.a.c(((StaticLayout)this.e), this.b);
    }

    public final boolean R(int v) {
        return TextLayoutKt.k(this.e, v);
    }

    public final boolean S(int v) {
        return this.e.isRtlCharAt(v);
    }

    public final void T(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        if(!canvas0.getClipBounds(this.o)) {
            return;
        }
        int v = this.g;
        if(v != 0) {
            canvas0.translate(0.0f, ((float)v));
        }
        TextAndroidCanvas textAndroidCanvas0 = TextLayoutKt.a;
        textAndroidCanvas0.a(canvas0);
        this.e.draw(textAndroidCanvas0);
        int v1 = this.g;
        if(v1 != 0) {
            canvas0.translate(0.0f, -1.0f * ((float)v1));
        }
    }

    public final void a(int v, int v1, @l float[] arr_f, int v2) {
        float f3;
        float f2;
        L.p(arr_f, "array");
        int v3 = this.N().length();
        if(v < 0) {
            throw new IllegalArgumentException("startOffset must be > 0");
        }
        if(v >= v3) {
            throw new IllegalArgumentException("startOffset must be less than text length");
        }
        if(v1 <= v) {
            throw new IllegalArgumentException("endOffset must be greater than startOffset");
        }
        if(v1 > v3) {
            throw new IllegalArgumentException("endOffset must be smaller or equal to text length");
        }
        if(arr_f.length - v2 < (v1 - v) * 4) {
            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int v4 = this.v(v);
        int v5 = this.v(v1 - 1);
        HorizontalPositionCache horizontalPositionCache0 = new HorizontalPositionCache(this);
        if(v4 <= v5) {
            while(true) {
                int v6 = Math.max(v, this.A(v4));
                int v7 = Math.min(v1, this.u(v4));
                float f = this.B(v4);
                float f1 = this.p(v4);
                boolean z = true;
                if(this.H(v4) != 1) {
                    z = false;
                }
                while(v6 < v7) {
                    boolean z1 = this.S(v6);
                    if(z && !z1) {
                        f2 = horizontalPositionCache0.c(v6);
                        f3 = horizontalPositionCache0.d(v6 + 1);
                    }
                    else if(z && z1) {
                        f3 = horizontalPositionCache0.e(v6);
                        f2 = horizontalPositionCache0.f(v6 + 1);
                    }
                    else if(z || !z1) {
                        f2 = horizontalPositionCache0.e(v6);
                        f3 = horizontalPositionCache0.f(v6 + 1);
                    }
                    else {
                        f3 = horizontalPositionCache0.c(v6);
                        f2 = horizontalPositionCache0.d(v6 + 1);
                    }
                    arr_f[v2] = f2;
                    arr_f[v2 + 1] = f;
                    arr_f[v2 + 2] = f3;
                    arr_f[v2 + 3] = f1;
                    v2 += 4;
                    ++v6;
                }
                if(v4 == v5) {
                    break;
                }
                ++v4;
            }
        }
    }

    public final int b() {
        return this.h;
    }

    @VisibleForTesting
    public static void c() {
    }

    @l
    public final RectF d(int v) {
        float f2;
        int v1 = this.v(v);
        float f = this.B(v1);
        float f1 = this.p(v1);
        boolean z = this.H(v1) == 1;
        boolean z1 = this.e.isRtlCharAt(v);
        if(z && !z1) {
            return new RectF(this.I(v, false), f, this.I(v + 1, true), f1);
        }
        if(z && z1) {
            f2 = this.K(v, false);
            return new RectF(this.K(v + 1, true), f, f2, f1);
        }
        if(z1) {
            f2 = this.I(v, false);
            return new RectF(this.I(v + 1, true), f, f2, f1);
        }
        return new RectF(this.K(v, false), f, this.K(v + 1, true), f1);
    }

    public final boolean e() {
        return this.d;
    }

    public final boolean f() {
        return this.b;
    }

    // 去混淆评级： 低(20)
    public final int g() {
        return this.d ? this.e.getLineBottom(this.f - 1) + this.g + this.h + this.m : this.e.getHeight() + this.g + this.h + this.m;
    }

    private final float h(int v) {
        return v == this.f - 1 ? this.i + this.j : 0.0f;
    }

    public final boolean i() {
        return this.a;
    }

    @l
    public final Layout j() {
        return this.e;
    }

    @VisibleForTesting
    public static void k() {
    }

    private final LayoutHelper l() {
        return (LayoutHelper)this.p.getValue();
    }

    @l
    public final LayoutIntrinsics m() {
        return this.c;
    }

    public final float n(int v) {
        if(v == this.f - 1) {
            return this.l == null ? ((float)this.e.getLineAscent(v)) : ((float)this.l.ascent);
        }
        return (float)this.e.getLineAscent(v);
    }

    public final float o(int v) {
        float f = (float)this.g;
        return v != this.f - 1 || this.l == null ? f + ((float)this.e.getLineBaseline(v)) : f + (this.B(v) - ((float)this.l.ascent));
    }

    public final float p(int v) {
        if(v == this.f - 1 && this.l != null) {
            return ((float)this.e.getLineBottom(v - 1)) + ((float)this.l.bottom);
        }
        float f = (float)this.e.getLineBottom(v);
        float f1 = ((float)this.g) + f;
        return v == this.f - 1 ? f1 + ((float)this.h) : f1 + 0.0f;
    }

    public final int q() {
        return this.f;
    }

    public final float r(int v) {
        if(v == this.f - 1) {
            return this.l == null ? ((float)this.e.getLineDescent(v)) : ((float)this.l.descent);
        }
        return (float)this.e.getLineDescent(v);
    }

    public final int s(int v) {
        return this.e.getEllipsisCount(v);
    }

    public final int t(int v) {
        return this.e.getEllipsisStart(v);
    }

    public final int u(int v) {
        return this.e.getEllipsisStart(v) == 0 ? this.e.getLineEnd(v) : this.e.getText().length();
    }

    public final int v(int v) {
        return this.e.getLineForOffset(v);
    }

    public final int w(int v) {
        return this.e.getLineForVertical(this.g + v);
    }

    public final float x(int v) {
        return this.p(v) - this.B(v);
    }

    public final float y(int v) {
        float f = this.e.getLineLeft(v);
        return v == this.f - 1 ? f + this.i : f + 0.0f;
    }

    public final float z(int v) {
        float f = this.e.getLineRight(v);
        return v == this.f - 1 ? f + this.j : f + 0.0f;
    }
}

