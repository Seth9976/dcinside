package com.dcinside.app.span;

import android.graphics.Paint.FontMetrics;
import android.text.TextPaint;
import android.text.style.SuperscriptSpan;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class AlignSuperscriptSpan extends SuperscriptSpan {
    private final float a;
    private final float b;

    public AlignSuperscriptSpan() {
        this(0.0f, 0.0f, 3, null);
    }

    public AlignSuperscriptSpan(float f, float f1) {
        this.a = f;
        this.b = f1;
    }

    public AlignSuperscriptSpan(float f, float f1, int v, w w0) {
        if((v & 1) != 0) {
            f = 1.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        this(f, f1);
    }

    @Override  // android.text.style.SuperscriptSpan
    public void updateDrawState(@l TextPaint textPaint0) {
        L.p(textPaint0, "tp");
        float f = textPaint0.ascent();
        textPaint0.setTextSize(textPaint0.getTextSize() * this.a);
        Paint.FontMetrics paint$FontMetrics0 = textPaint0.getFontMetrics();
        textPaint0.baselineShift += (int)(f - f * this.b - (paint$FontMetrics0.ascent - this.b * paint$FontMetrics0.ascent));
    }

    @Override  // android.text.style.SuperscriptSpan
    public void updateMeasureState(@l TextPaint textPaint0) {
        L.p(textPaint0, "tp");
        this.updateDrawState(textPaint0);
    }
}

