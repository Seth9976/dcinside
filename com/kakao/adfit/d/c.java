package com.kakao.adfit.d;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import com.kakao.adfit.m.G;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;

public final class c extends TextureView {
    private final G a;

    public c(Context context0, AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.a = new G(this, 0.0f, 0, 0, 14, null);
    }

    public c(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public final float getAspectRatio() {
        return this.a.a();
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        this.a.a(v, v1);
        super.onMeasure(this.a.e(), this.a.b());
    }

    public final void setAspectRatio(float f) {
        this.a.a(f);
    }
}

