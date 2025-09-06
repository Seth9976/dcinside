package com.dcinside.rich.spans;

import android.text.style.AbsoluteSizeSpan;
import p0.b;

public class RichFontSizeSpan extends AbsoluteSizeSpan implements b {
    public RichFontSizeSpan(int v) {
        super(v, true);
    }

    @Override  // p0.b
    public int a() {
        return this.getSize();
    }
}

