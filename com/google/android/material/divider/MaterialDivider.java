package com.google.android.material.divider;

import I1.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.D;
import com.google.android.material.resources.d;
import com.google.android.material.shape.k;

public class MaterialDivider extends View {
    @NonNull
    private final k a;
    private int b;
    @ColorInt
    private int c;
    private int d;
    private int e;
    private static final int f;

    static {
        MaterialDivider.f = style.Widget_MaterialComponents_MaterialDivider;
    }

    public MaterialDivider(@NonNull Context context0) {
        this(context0, null);
    }

    public MaterialDivider(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.materialDividerStyle);
    }

    public MaterialDivider(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(a.c(context0, attributeSet0, v, MaterialDivider.f), attributeSet0, v);
        Context context1 = this.getContext();
        this.a = new k();
        TypedArray typedArray0 = D.k(context1, attributeSet0, styleable.MaterialDivider, v, MaterialDivider.f, new int[0]);
        int v1 = this.getResources().getDimensionPixelSize(dimen.material_divider_thickness);
        this.b = typedArray0.getDimensionPixelSize(styleable.MaterialDivider_dividerThickness, v1);
        this.d = typedArray0.getDimensionPixelOffset(styleable.MaterialDivider_dividerInsetStart, 0);
        this.e = typedArray0.getDimensionPixelOffset(styleable.MaterialDivider_dividerInsetEnd, 0);
        this.setDividerColor(d.a(context1, typedArray0, styleable.MaterialDivider_dividerColor).getDefaultColor());
        typedArray0.recycle();
    }

    public int getDividerColor() {
        return this.c;
    }

    @Px
    public int getDividerInsetEnd() {
        return this.e;
    }

    @Px
    public int getDividerInsetStart() {
        return this.d;
    }

    public int getDividerThickness() {
        return this.b;
    }

    @Override  // android.view.View
    protected void onDraw(@NonNull Canvas canvas0) {
        super.onDraw(canvas0);
        int v = ViewCompat.e0(this) == 1 ? this.e : this.d;
        int v1 = this.getWidth();
        int v2 = this.d;
        int v3 = this.getBottom();
        int v4 = this.getTop();
        this.a.setBounds(v, 0, v1 - v2, v3 - v4);
        this.a.draw(canvas0);
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        int v2 = View.MeasureSpec.getMode(v1);
        int v3 = this.getMeasuredHeight();
        if(v2 == 0x80000000 || v2 == 0) {
            int v4 = this.b;
            if(v4 > 0 && v3 != v4) {
                v3 = v4;
            }
            this.setMeasuredDimension(this.getMeasuredWidth(), v3);
        }
    }

    public void setDividerColor(@ColorInt int v) {
        if(this.c != v) {
            this.c = v;
            ColorStateList colorStateList0 = ColorStateList.valueOf(v);
            this.a.p0(colorStateList0);
            this.invalidate();
        }
    }

    public void setDividerColorResource(@ColorRes int v) {
        this.setDividerColor(ContextCompat.getColor(this.getContext(), v));
    }

    public void setDividerInsetEnd(@Px int v) {
        this.e = v;
    }

    public void setDividerInsetEndResource(@DimenRes int v) {
        this.setDividerInsetEnd(this.getContext().getResources().getDimensionPixelOffset(v));
    }

    public void setDividerInsetStart(@Px int v) {
        this.d = v;
    }

    public void setDividerInsetStartResource(@DimenRes int v) {
        this.setDividerInsetStart(this.getContext().getResources().getDimensionPixelOffset(v));
    }

    public void setDividerThickness(@Px int v) {
        if(this.b != v) {
            this.b = v;
            this.requestLayout();
        }
    }

    public void setDividerThicknessResource(@DimenRes int v) {
        this.setDividerThickness(this.getContext().getResources().getDimensionPixelSize(v));
    }
}

