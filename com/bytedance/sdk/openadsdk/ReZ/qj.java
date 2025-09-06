package com.bytedance.sdk.openadsdk.ReZ;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.qZS;

public class qj extends View {
    private final int PjT;

    public qj(Context context0) {
        this(context0, Color.parseColor("#25000000"));
    }

    public qj(Context context0, int v) {
        super(context0);
        this.setBackgroundColor(v);
        this.PjT = qZS.Zh(this.getContext(), 0.66f);
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        this.setMeasuredDimension(this.getMeasuredWidth(), this.PjT);
    }
}

