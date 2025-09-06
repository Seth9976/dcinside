package com.bytedance.sdk.openadsdk.core.JQp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.RD;

public class Au extends TextView {
    public Au(Context context0) {
        super(context0);
        this.PjT();
    }

    public Au(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.PjT();
    }

    private void PjT() {
        this.setTextDirection(5);
    }

    @Override  // android.widget.TextView
    protected void onMeasure(int v, int v1) {
        try {
            super.onMeasure(v, v1);
        }
        catch(Throwable throwable0) {
            RD.Zh("PAGTextView", throwable0.toString());
        }
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Drawable drawable2, @Nullable Drawable drawable3) {
        super.setCompoundDrawablesRelative(drawable0, drawable1, drawable2, drawable3);
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int v, int v1, int v2, int v3) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(v, v1, v2, v3);
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Drawable drawable2, @Nullable Drawable drawable3) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable0, drawable1, drawable2, drawable3);
    }

    @Override  // android.widget.TextView
    public void setGravity(int v) {
        super.setGravity(SM.PjT(v));
    }

    @Override  // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.setLayoutParams(SM.PjT(this, viewGroup$LayoutParams0));
    }

    @Override  // android.widget.TextView
    public void setPadding(int v, int v1, int v2, int v3) {
        super.setPaddingRelative(v, v1, v2, v3);
    }
}

