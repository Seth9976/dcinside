package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.bytedance.sdk.openadsdk.core.JQp.ReZ;

public class qj extends ReZ {
    public float PjT;

    public qj(Context context0) {
        this(context0, null);
    }

    public qj(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public qj(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.PjT = 0.0f;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.JQp.ReZ
    protected void onMeasure(int v, int v1) {
        int v2 = View.MeasureSpec.getMode(v);
        int v3 = View.MeasureSpec.getSize(v);
        int v4 = View.MeasureSpec.getMode(v1);
        int v5 = View.MeasureSpec.getSize(v1);
        int v6 = this.getLayoutParams().width;
        int v7 = this.getLayoutParams().height;
        float f = this.PjT;
        if(f > 0.0f) {
            if(v6 == -2) {
                v3 = (int)(((float)v5) * f);
                v2 = 0x40000000;
            }
            else if(v7 == -2) {
                v5 = (int)(((float)v3) / f);
                v4 = 0x40000000;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(v3, v2), View.MeasureSpec.makeMeasureSpec(v5, v4));
    }

    public void setRatio(float f) {
        this.PjT = f;
    }
}

