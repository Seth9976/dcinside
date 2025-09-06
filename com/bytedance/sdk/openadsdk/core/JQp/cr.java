package com.bytedance.sdk.openadsdk.core.JQp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import androidx.annotation.Nullable;

public class cr extends ImageView {
    public cr(Context context0) {
        super(context0);
    }

    public cr(Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    public cr(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // android.widget.ImageView
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
    }

    @Override  // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.setLayoutParams(SM.PjT(this, viewGroup$LayoutParams0));
    }

    @Override  // android.view.View
    public void setPadding(int v, int v1, int v2, int v3) {
        super.setPaddingRelative(v, v1, v2, v3);
    }
}

