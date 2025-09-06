package com.google.android.material.appbar;

import I1.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View.MeasureSpec;
import android.view.View;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.drawable.f;
import com.google.android.material.internal.D;
import com.google.android.material.internal.E;
import com.google.android.material.shape.k;
import com.google.android.material.shape.l;

public class MaterialToolbar extends Toolbar {
    @Nullable
    private Integer Q8;
    private boolean R8;
    private boolean S8;
    @Nullable
    private ImageView.ScaleType T8;
    @Nullable
    private Boolean U8;
    private static final int V8;
    private static final ImageView.ScaleType[] W8;

    static {
        MaterialToolbar.V8 = style.Widget_MaterialComponents_Toolbar;
        MaterialToolbar.W8 = new ImageView.ScaleType[]{ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    }

    public MaterialToolbar(@NonNull Context context0) {
        this(context0, null);
    }

    public MaterialToolbar(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.toolbarStyle);
    }

    public MaterialToolbar(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(a.c(context0, attributeSet0, v, MaterialToolbar.V8), attributeSet0, v);
        Context context1 = this.getContext();
        TypedArray typedArray0 = D.k(context1, attributeSet0, styleable.MaterialToolbar, v, MaterialToolbar.V8, new int[0]);
        if(typedArray0.hasValue(styleable.MaterialToolbar_navigationIconTint)) {
            this.setNavigationIconTint(typedArray0.getColor(2, -1));
        }
        this.R8 = typedArray0.getBoolean(styleable.MaterialToolbar_titleCentered, false);
        this.S8 = typedArray0.getBoolean(styleable.MaterialToolbar_subtitleCentered, false);
        int v1 = typedArray0.getInt(styleable.MaterialToolbar_logoScaleType, -1);
        if(v1 >= 0) {
            ImageView.ScaleType[] arr_imageView$ScaleType = MaterialToolbar.W8;
            if(v1 < arr_imageView$ScaleType.length) {
                this.T8 = arr_imageView$ScaleType[v1];
            }
        }
        if(typedArray0.hasValue(styleable.MaterialToolbar_logoAdjustViewBounds)) {
            this.U8 = Boolean.valueOf(typedArray0.getBoolean(0, false));
        }
        typedArray0.recycle();
        this.X(context1);
    }

    private Pair V(@Nullable TextView textView0, @Nullable TextView textView1) {
        int v = this.getMeasuredWidth();
        int v1 = this.getPaddingLeft();
        int v2 = v - this.getPaddingRight();
        for(int v3 = 0; v3 < this.getChildCount(); ++v3) {
            View view0 = this.getChildAt(v3);
            if(view0.getVisibility() != 8 && view0 != textView0 && view0 != textView1) {
                if(view0.getRight() < v / 2 && view0.getRight() > v1) {
                    v1 = view0.getRight();
                }
                if(view0.getLeft() > v / 2 && view0.getLeft() < v2) {
                    v2 = view0.getLeft();
                }
            }
        }
        return new Pair(v1, v2);
    }

    public void W() {
        this.Q8 = null;
        Drawable drawable0 = this.getNavigationIcon();
        if(drawable0 != null) {
            DrawableCompat.o(DrawableCompat.r(drawable0.mutate()), null);
            this.setNavigationIcon(drawable0);
        }
    }

    private void X(Context context0) {
        Drawable drawable0 = this.getBackground();
        ColorStateList colorStateList0 = drawable0 == null ? ColorStateList.valueOf(0) : f.g(drawable0);
        if(colorStateList0 != null) {
            k k0 = new k();
            k0.p0(colorStateList0);
            k0.a0(context0);
            k0.o0(ViewCompat.V(this));
            ViewCompat.R1(this, k0);
        }
    }

    public boolean Y() {
        return this.U8 != null && this.U8.booleanValue();
    }

    public boolean Z() {
        return this.S8;
    }

    public boolean a0() {
        return this.R8;
    }

    private void b0(View view0, Pair pair0) {
        int v = this.getMeasuredWidth();
        int v1 = view0.getMeasuredWidth();
        int v2 = v / 2 - v1 / 2;
        int v3 = v1 + v2;
        int v4 = Math.max(Math.max(((int)(((Integer)pair0.first))) - v2, 0), Math.max(v3 - ((int)(((Integer)pair0.second))), 0));
        if(v4 > 0) {
            v2 += v4;
            v3 -= v4;
            view0.measure(View.MeasureSpec.makeMeasureSpec(v3 - v2, 0x40000000), view0.getMeasuredHeightAndState());
        }
        view0.layout(v2, view0.getTop(), v3, view0.getBottom());
    }

    private void c0() {
        if(!this.R8 && !this.S8) {
            return;
        }
        TextView textView0 = E.i(this);
        TextView textView1 = E.g(this);
        if(textView0 == null && textView1 == null) {
            return;
        }
        Pair pair0 = this.V(textView0, textView1);
        if(this.R8 && textView0 != null) {
            this.b0(textView0, pair0);
        }
        if(this.S8 && textView1 != null) {
            this.b0(textView1, pair0);
        }
    }

    @Nullable
    private Drawable d0(@Nullable Drawable drawable0) {
        if(drawable0 != null && this.Q8 != null) {
            drawable0 = DrawableCompat.r(drawable0.mutate());
            DrawableCompat.n(drawable0, ((int)this.Q8));
        }
        return drawable0;
    }

    private void e0() {
        ImageView imageView0 = E.d(this);
        if(imageView0 != null) {
            Boolean boolean0 = this.U8;
            if(boolean0 != null) {
                imageView0.setAdjustViewBounds(boolean0.booleanValue());
            }
            ImageView.ScaleType imageView$ScaleType0 = this.T8;
            if(imageView$ScaleType0 != null) {
                imageView0.setScaleType(imageView$ScaleType0);
            }
        }
    }

    @Nullable
    public ImageView.ScaleType getLogoScaleType() {
        return this.T8;
    }

    @ColorInt
    @Nullable
    public Integer getNavigationIconTint() {
        return this.Q8;
    }

    @Override  // androidx.appcompat.widget.Toolbar
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        l.e(this);
    }

    @Override  // androidx.appcompat.widget.Toolbar
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        this.c0();
        this.e0();
    }

    @Override  // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        l.d(this, f);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        if(this.U8 == null || this.U8.booleanValue() != z) {
            this.U8 = Boolean.valueOf(z);
            this.requestLayout();
        }
    }

    public void setLogoScaleType(@NonNull ImageView.ScaleType imageView$ScaleType0) {
        if(this.T8 != imageView$ScaleType0) {
            this.T8 = imageView$ScaleType0;
            this.requestLayout();
        }
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable0) {
        super.setNavigationIcon(this.d0(drawable0));
    }

    public void setNavigationIconTint(@ColorInt int v) {
        this.Q8 = v;
        Drawable drawable0 = this.getNavigationIcon();
        if(drawable0 != null) {
            this.setNavigationIcon(drawable0);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if(this.S8 != z) {
            this.S8 = z;
            this.requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if(this.R8 != z) {
            this.R8 = z;
            this.requestLayout();
        }
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void x(int v) {
        Menu menu0 = this.getMenu();
        if(menu0 instanceof MenuBuilder) {
            ((MenuBuilder)menu0).n0();
        }
        super.x(v);
        if(menu0 instanceof MenuBuilder) {
            ((MenuBuilder)menu0).m0();
        }
    }
}

