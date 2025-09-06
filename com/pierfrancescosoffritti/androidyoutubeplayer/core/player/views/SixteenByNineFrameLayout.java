package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@RestrictTo({Scope.a})
public class SixteenByNineFrameLayout extends FrameLayout {
    public SixteenByNineFrameLayout(@l Context context0) {
        L.p(context0, "context");
        this(context0, null);
    }

    public SixteenByNineFrameLayout(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0);
    }

    public SixteenByNineFrameLayout(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
    }

    public SixteenByNineFrameLayout(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @Override  // android.widget.FrameLayout
    protected void onMeasure(int v, int v1) {
        if(this.getLayoutParams().height == -2) {
            super.onMeasure(v, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(v) * 9 / 16, 0x40000000));
            return;
        }
        super.onMeasure(v, v1);
    }
}

