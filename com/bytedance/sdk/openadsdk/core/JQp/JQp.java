package com.bytedance.sdk.openadsdk.core.JQp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class JQp extends LinearLayout {
    public JQp(@NonNull Context context0) {
        super(context0);
        this.init();
    }

    public JQp(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.init();
    }

    public JQp(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.init();
    }

    private void init() {
        this.setLayoutDirection(3);
    }

    @Override  // android.widget.LinearLayout
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
    }

    @Override  // android.widget.LinearLayout
    public void setGravity(int v) {
        super.setGravity(SM.PjT(v));
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

