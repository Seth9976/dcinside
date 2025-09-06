package androidx.compose.ui.text.android;

import android.text.BoringLayout.Metrics;
import android.text.BoringLayout;
import android.text.Layout.Alignment;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import androidx.annotation.OptIn;
import androidx.core.os.BuildCompat.PrereleaseSdkCheck;
import androidx.core.os.BuildCompat;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class BoringLayoutFactory {
    @l
    public static final BoringLayoutFactory a;

    static {
        BoringLayoutFactory.a = new BoringLayoutFactory();
    }

    @OptIn(markerClass = {PrereleaseSdkCheck.class})
    @l
    public final BoringLayout a(@l CharSequence charSequence0, @l TextPaint textPaint0, int v, @l BoringLayout.Metrics boringLayout$Metrics0, @l Layout.Alignment layout$Alignment0, boolean z, boolean z1, @m TextUtils.TruncateAt textUtils$TruncateAt0, int v1) {
        L.p(charSequence0, "text");
        L.p(textPaint0, "paint");
        L.p(boringLayout$Metrics0, "metrics");
        L.p(layout$Alignment0, "alignment");
        if(v < 0 || v1 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return BuildCompat.m() ? BoringLayoutFactory33.a(charSequence0, textPaint0, v, layout$Alignment0, 1.0f, 0.0f, boringLayout$Metrics0, z, z1, textUtils$TruncateAt0, v1) : BoringLayoutFactoryDefault.a(charSequence0, textPaint0, v, layout$Alignment0, 1.0f, 0.0f, boringLayout$Metrics0, z, textUtils$TruncateAt0, v1);
    }

    public static BoringLayout b(BoringLayoutFactory boringLayoutFactory0, CharSequence charSequence0, TextPaint textPaint0, int v, BoringLayout.Metrics boringLayout$Metrics0, Layout.Alignment layout$Alignment0, boolean z, boolean z1, TextUtils.TruncateAt textUtils$TruncateAt0, int v1, int v2, Object object0) {
        Layout.Alignment layout$Alignment1 = (v2 & 16) == 0 ? layout$Alignment0 : Layout.Alignment.ALIGN_NORMAL;
        boolean z2 = (v2 & 0x20) == 0 ? z : false;
        boolean z3 = (v2 & 0x40) == 0 ? z1 : true;
        TextUtils.TruncateAt textUtils$TruncateAt1 = (v2 & 0x80) == 0 ? textUtils$TruncateAt0 : null;
        return (v2 & 0x100) == 0 ? boringLayoutFactory0.a(charSequence0, textPaint0, v, boringLayout$Metrics0, layout$Alignment1, z2, z3, textUtils$TruncateAt1, v1) : boringLayoutFactory0.a(charSequence0, textPaint0, v, boringLayout$Metrics0, layout$Alignment1, z2, z3, textUtils$TruncateAt1, v);
    }

    @OptIn(markerClass = {PrereleaseSdkCheck.class})
    public final boolean c(@l BoringLayout boringLayout0) {
        L.p(boringLayout0, "layout");
        return BuildCompat.m() ? BoringLayoutFactory33.a.d(boringLayout0) : false;
    }

    @OptIn(markerClass = {PrereleaseSdkCheck.class})
    @m
    public final BoringLayout.Metrics d(@l CharSequence charSequence0, @l TextPaint textPaint0, @l TextDirectionHeuristic textDirectionHeuristic0) {
        L.p(charSequence0, "text");
        L.p(textPaint0, "paint");
        L.p(textDirectionHeuristic0, "textDir");
        return BuildCompat.m() ? BoringLayoutFactory33.c(charSequence0, textPaint0, textDirectionHeuristic0) : BoringLayoutFactoryDefault.c(charSequence0, textPaint0, textDirectionHeuristic0);
    }
}

