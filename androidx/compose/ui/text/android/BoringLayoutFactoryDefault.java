package androidx.compose.ui.text.android;

import android.text.BoringLayout.Metrics;
import android.text.BoringLayout;
import android.text.Layout.Alignment;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import androidx.annotation.DoNotInline;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;
import z3.n;

final class BoringLayoutFactoryDefault {
    @l
    public static final BoringLayoutFactoryDefault a;

    static {
        BoringLayoutFactoryDefault.a = new BoringLayoutFactoryDefault();
    }

    @DoNotInline
    @l
    @n
    public static final BoringLayout a(@l CharSequence charSequence0, @l TextPaint textPaint0, int v, @l Layout.Alignment layout$Alignment0, float f, float f1, @l BoringLayout.Metrics boringLayout$Metrics0, boolean z, @m TextUtils.TruncateAt textUtils$TruncateAt0, int v1) {
        L.p(charSequence0, "text");
        L.p(textPaint0, "paint");
        L.p(layout$Alignment0, "alignment");
        L.p(boringLayout$Metrics0, "metrics");
        return new BoringLayout(charSequence0, textPaint0, v, layout$Alignment0, f, f1, boringLayout$Metrics0, z, textUtils$TruncateAt0, v1);
    }

    public static BoringLayout b(CharSequence charSequence0, TextPaint textPaint0, int v, Layout.Alignment layout$Alignment0, float f, float f1, BoringLayout.Metrics boringLayout$Metrics0, boolean z, TextUtils.TruncateAt textUtils$TruncateAt0, int v1, int v2, Object object0) {
        TextUtils.TruncateAt textUtils$TruncateAt1 = (v2 & 0x100) == 0 ? textUtils$TruncateAt0 : null;
        return (v2 & 0x200) == 0 ? BoringLayoutFactoryDefault.a(charSequence0, textPaint0, v, layout$Alignment0, f, f1, boringLayout$Metrics0, z, textUtils$TruncateAt1, v1) : BoringLayoutFactoryDefault.a(charSequence0, textPaint0, v, layout$Alignment0, f, f1, boringLayout$Metrics0, z, textUtils$TruncateAt1, v);
    }

    @DoNotInline
    @m
    @n
    public static final BoringLayout.Metrics c(@l CharSequence charSequence0, @l TextPaint textPaint0, @l TextDirectionHeuristic textDirectionHeuristic0) {
        L.p(charSequence0, "text");
        L.p(textPaint0, "paint");
        L.p(textDirectionHeuristic0, "textDir");
        return textDirectionHeuristic0.isRtl(charSequence0, 0, charSequence0.length()) ? null : BoringLayout.isBoring(charSequence0, textPaint0, null);
    }
}

