package com.hjq.toast.style;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import y2.f;

public class a implements f {
    @Override  // y2.f
    public View a(Context context0) {
        View view0 = new TextView(context0);
        view0.setId(0x102000B);
        ((TextView)view0).setGravity(17);
        ((TextView)view0).setTextColor(this.d(context0));
        ((TextView)view0).setTextSize(0, this.f(context0));
        int v = this.c(context0);
        int v1 = this.h(context0);
        ((TextView)view0).setPaddingRelative(v, v1, v, v1);
        view0.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        view0.setBackground(this.b(context0));
        view0.setZ(this.g(context0));
        return view0;
    }

    protected Drawable b(Context context0) {
        Drawable drawable0 = new GradientDrawable();
        ((GradientDrawable)drawable0).setColor(0xB3000000);
        ((GradientDrawable)drawable0).setCornerRadius(TypedValue.applyDimension(1, 10.0f, context0.getResources().getDisplayMetrics()));
        return drawable0;
    }

    protected int c(Context context0) {
        return (int)TypedValue.applyDimension(1, 24.0f, context0.getResources().getDisplayMetrics());
    }

    protected int d(Context context0) {
        return 0xEEFFFFFF;
    }

    protected int e(Context context0) [...] // Inlined contents

    protected float f(Context context0) {
        return TypedValue.applyDimension(2, 14.0f, context0.getResources().getDisplayMetrics());
    }

    protected float g(Context context0) {
        return TypedValue.applyDimension(1, 3.0f, context0.getResources().getDisplayMetrics());
    }

    @Override  // y2.f
    public int getGravity() {
        return 17;
    }

    @Override  // y2.f
    public float getHorizontalMargin() {
        return 0.0f;
    }

    @Override  // y2.f
    public float getVerticalMargin() {
        return 0.0f;
    }

    @Override  // y2.f
    public int getXOffset() {
        return 0;
    }

    @Override  // y2.f
    public int getYOffset() {
        return 0;
    }

    protected int h(Context context0) {
        return (int)TypedValue.applyDimension(1, 16.0f, context0.getResources().getDisplayMetrics());
    }
}

