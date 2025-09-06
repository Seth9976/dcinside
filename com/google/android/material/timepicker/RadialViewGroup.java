package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.id;
import com.google.android.material.R.layout;
import com.google.android.material.R.styleable;
import com.google.android.material.shape.k;
import com.google.android.material.shape.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

class RadialViewGroup extends ConstraintLayout {
    private final Runnable a;
    private int b;
    private k c;
    private static final String d = "skip";
    static final int e = 1;
    static final int f = 2;
    static final float g = 0.66f;

    public RadialViewGroup(@NonNull Context context0) {
        this(context0, null);
    }

    public RadialViewGroup(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public RadialViewGroup(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        LayoutInflater.from(context0).inflate(layout.material_radial_view_group, this);
        ViewCompat.R1(this, this.B());
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.RadialViewGroup, v, 0);
        this.b = typedArray0.getDimensionPixelSize(styleable.RadialViewGroup_materialCircleRadius, 0);
        this.a = () -> {
            ConstraintSet constraintSet0 = new ConstraintSet();
            constraintSet0.H(this);
            HashMap hashMap0 = new HashMap();
            for(int v = 0; v < this.getChildCount(); ++v) {
                View view0 = this.getChildAt(v);
                if(view0.getId() != id.circle_center && !RadialViewGroup.F(view0)) {
                    Integer integer0 = (Integer)view0.getTag(id.material_clock_level);
                    if(integer0 == null) {
                        integer0 = 1;
                    }
                    if(!hashMap0.containsKey(integer0)) {
                        hashMap0.put(integer0, new ArrayList());
                    }
                    ((List)hashMap0.get(integer0)).add(view0);
                }
            }
            for(Object object0: hashMap0.entrySet()) {
                this.A(((List)((Map.Entry)object0).getValue()), constraintSet0, this.C(((int)(((Integer)((Map.Entry)object0).getKey())))));
            }
            constraintSet0.r(this);
        };
        typedArray0.recycle();
    }

    private void A(List list0, ConstraintSet constraintSet0, int v) {
        float f = 0.0f;
        for(Object object0: list0) {
            constraintSet0.M(((View)object0).getId(), id.circle_center, v, f);
            f += 360.0f / ((float)list0.size());
        }
    }

    private Drawable B() {
        k k0 = new k();
        this.c = k0;
        k0.m0(new n(0.5f));
        this.c.p0(ColorStateList.valueOf(-1));
        return this.c;
    }

    @Dimension
    int C(int v) {
        return v == 2 ? Math.round(((float)this.b) * 0.66f) : this.b;
    }

    @Dimension
    public int D() {
        return this.b;
    }

    public void E(@Dimension int v) {
        this.b = v;
        this.G();
    }

    private static boolean F(View view0) {
        return "skip".equals(view0.getTag());
    }

    // 检测为 Lambda 实现
    protected void G() [...]

    private void H() {
        Handler handler0 = this.getHandler();
        if(handler0 != null) {
            handler0.removeCallbacks(this.a);
            handler0.post(this.a);
        }
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super.addView(view0, v, viewGroup$LayoutParams0);
        if(view0.getId() == -1) {
            view0.setId(ViewCompat.F());
        }
        this.H();
    }

    @Override  // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.G();
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    public void onViewRemoved(View view0) {
        super.onViewRemoved(view0);
        this.H();
    }

    @Override  // android.view.View
    public void setBackgroundColor(@ColorInt int v) {
        this.c.p0(ColorStateList.valueOf(v));
    }
}

