package com.dcinside.app.span;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import kotlin.jvm.internal.L;

public final class l extends CharacterStyle {
    private float a;

    public l(float f) {
        this.a = f;
    }

    public final float a() {
        return this.a;
    }

    public final void b(float f) {
        this.a = f;
    }

    @Override  // android.text.style.CharacterStyle
    public void updateDrawState(@y4.l TextPaint textPaint0) {
        L.p(textPaint0, "tp");
        textPaint0.setAlpha(((int)(255.0f * this.a)));
    }
}

