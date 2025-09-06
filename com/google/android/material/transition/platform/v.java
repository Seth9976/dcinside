package com.google.android.material.transition.platform;

import android.graphics.RectF;
import com.google.android.material.shape.e;
import com.google.android.material.shape.n;
import com.google.android.material.shape.p.c;

public final class v implements c {
    public final RectF a;

    public v(RectF rectF0) {
        this.a = rectF0;
    }

    @Override  // com.google.android.material.shape.p$c
    public final e a(e e0) {
        return n.b(this.a, e0);
    }
}

