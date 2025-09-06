package com.kakao.adfit.ads.na;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class AdFitMediaView extends FrameLayout {
    @j
    public AdFitMediaView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public AdFitMediaView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public AdFitMediaView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        if(!this.isInEditMode() && !(context0 instanceof Activity)) {
            throw new IllegalArgumentException("Context must be Activity context!");
        }
    }

    public AdFitMediaView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }
}

