package androidx.compose.ui.text.android;

import android.text.Layout.Alignment;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

final class StaticLayoutParams {
    @l
    private final CharSequence a;
    private final int b;
    private final int c;
    @l
    private final TextPaint d;
    private final int e;
    @l
    private final TextDirectionHeuristic f;
    @l
    private final Layout.Alignment g;
    private final int h;
    @m
    private final TextUtils.TruncateAt i;
    private final int j;
    private final float k;
    private final float l;
    private final int m;
    private final boolean n;
    private final boolean o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    @m
    private final int[] t;
    @m
    private final int[] u;

    public StaticLayoutParams(@l CharSequence charSequence0, int v, int v1, @l TextPaint textPaint0, int v2, @l TextDirectionHeuristic textDirectionHeuristic0, @l Layout.Alignment layout$Alignment0, int v3, @m TextUtils.TruncateAt textUtils$TruncateAt0, int v4, float f, float f1, int v5, boolean z, boolean z1, int v6, int v7, int v8, int v9, @m int[] arr_v, @m int[] arr_v1) {
        L.p(charSequence0, "text");
        L.p(textPaint0, "paint");
        L.p(textDirectionHeuristic0, "textDir");
        L.p(layout$Alignment0, "alignment");
        super();
        this.a = charSequence0;
        this.b = v;
        this.c = v1;
        this.d = textPaint0;
        this.e = v2;
        this.f = textDirectionHeuristic0;
        this.g = layout$Alignment0;
        this.h = v3;
        this.i = textUtils$TruncateAt0;
        this.j = v4;
        this.k = f;
        this.l = f1;
        this.m = v5;
        this.n = z;
        this.o = z1;
        this.p = v6;
        this.q = v7;
        this.r = v8;
        this.s = v9;
        this.t = arr_v;
        this.u = arr_v1;
        if(v < 0 || v > v1 || (v1 < 0 || v1 > charSequence0.length() || v3 < 0 || v2 < 0 || v4 < 0 || f < 0.0f)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public StaticLayoutParams(CharSequence charSequence0, int v, int v1, TextPaint textPaint0, int v2, TextDirectionHeuristic textDirectionHeuristic0, Layout.Alignment layout$Alignment0, int v3, TextUtils.TruncateAt textUtils$TruncateAt0, int v4, float f, float f1, int v5, boolean z, boolean z1, int v6, int v7, int v8, int v9, int[] arr_v, int[] arr_v1, int v10, w w0) {
        this(charSequence0, ((v10 & 2) == 0 ? v : 0), v1, textPaint0, v2, textDirectionHeuristic0, layout$Alignment0, v3, textUtils$TruncateAt0, v4, f, f1, v5, z, z1, v6, v7, v8, v9, arr_v, arr_v1);
    }

    @l
    public final Layout.Alignment a() {
        return this.g;
    }

    public final int b() {
        return this.p;
    }

    @m
    public final TextUtils.TruncateAt c() {
        return this.i;
    }

    public final int d() {
        return this.j;
    }

    public final int e() {
        return this.c;
    }

    public final int f() {
        return this.s;
    }

    public final boolean g() {
        return this.n;
    }

    public final int h() {
        return this.m;
    }

    @m
    public final int[] i() {
        return this.t;
    }

    public final int j() {
        return this.q;
    }

    public final int k() {
        return this.r;
    }

    public final float l() {
        return this.l;
    }

    public final float m() {
        return this.k;
    }

    public final int n() {
        return this.h;
    }

    @l
    public final TextPaint o() {
        return this.d;
    }

    @m
    public final int[] p() {
        return this.u;
    }

    public final int q() {
        return this.b;
    }

    @l
    public final CharSequence r() {
        return this.a;
    }

    @l
    public final TextDirectionHeuristic s() {
        return this.f;
    }

    public final boolean t() {
        return this.o;
    }

    public final int u() {
        return this.e;
    }
}

