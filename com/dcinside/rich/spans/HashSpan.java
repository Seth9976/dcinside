package com.dcinside.rich.spans;

import android.text.style.ForegroundColorSpan;
import androidx.annotation.ColorInt;

public final class HashSpan extends ForegroundColorSpan {
    private final int a;

    public HashSpan(@ColorInt int v) {
        super(v);
        this.a = v;
    }

    public final int a() {
        return this.a;
    }

    @Override  // android.text.style.ForegroundColorSpan
    public int getForegroundColor() {
        return this.a;
    }
}

