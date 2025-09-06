package com.dcinside.rich.spans;

import android.text.style.ForegroundColorSpan;
import androidx.annotation.ColorInt;
import p0.b;

public class RichColorSpan extends ForegroundColorSpan implements b {
    public RichColorSpan(@ColorInt int v) {
        super(v);
    }

    @Override  // p0.b
    public int a() {
        return this.getForegroundColor();
    }
}

