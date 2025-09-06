package com.dcinside.app.span;

import android.graphics.Paint.FontMetricsInt;
import android.text.style.LineHeightSpan;
import y4.m;

public final class d implements LineHeightSpan {
    private final int a;

    public d(int v) {
        this.a = v;
    }

    @Override  // android.text.style.LineHeightSpan
    public void chooseHeight(@m CharSequence charSequence0, int v, int v1, int v2, int v3, @m Paint.FontMetricsInt paint$FontMetricsInt0) {
        if(paint$FontMetricsInt0 != null) {
            paint$FontMetricsInt0.ascent += this.a;
            paint$FontMetricsInt0.descent += this.a;
        }
    }
}

