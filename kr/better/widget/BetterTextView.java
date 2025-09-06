package kr.better.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.dcinside.app.R.styleable;
import com.dcinside.app.util.vk;
import com.dcinside.app.view.ResizeTextView;
import java.util.Arrays;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nBetterTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BetterTextView.kt\nkr/better/widget/BetterTextView\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,132:1\n177#2,9:133\n177#2,9:142\n177#2,9:151\n177#2,9:160\n*S KotlinDebug\n*F\n+ 1 BetterTextView.kt\nkr/better/widget/BetterTextView\n*L\n72#1:133,9\n73#1:142,9\n74#1:151,9\n75#1:160,9\n*E\n"})
public final class BetterTextView extends ResizeTextView {
    @m
    private ColorStateList j;
    private int k;
    private int l;
    private boolean m;

    public BetterTextView(@l Context context0) {
        L.p(context0, "context");
        super(context0, null, 0, 6, null);
        this.w(context0, null, 0);
    }

    public BetterTextView(@l Context context0, @l AttributeSet attributeSet0) {
        L.p(context0, "context");
        L.p(attributeSet0, "attrs");
        super(context0, attributeSet0, 0, 4, null);
        this.w(context0, attributeSet0, 0);
    }

    public BetterTextView(@l Context context0, @l AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        L.p(attributeSet0, "attrs");
        super(context0, attributeSet0, v);
        this.w(context0, attributeSet0, v);
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if(this.m) {
            return;
        }
        ColorStateList colorStateList0 = this.j;
        if(colorStateList0 != null) {
            this.m = true;
            Drawable[] arr_drawable = this.getCompoundDrawables();
            L.o(arr_drawable, "getCompoundDrawables(...)");
            vk.m(colorStateList0, ((Drawable[])Arrays.copyOf(arr_drawable, arr_drawable.length)));
        }
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@m Drawable drawable0, @m Drawable drawable1, @m Drawable drawable2, @m Drawable drawable3) {
        if(this.k > 0 || this.l > 0) {
            if(drawable0 != null) {
                this.setMaxBounds(drawable0);
            }
            if(drawable2 != null) {
                this.setMaxBounds(drawable2);
            }
            if(drawable1 != null) {
                this.setMaxBounds(drawable1);
            }
            if(drawable3 != null) {
                this.setMaxBounds(drawable3);
            }
            this.setCompoundDrawablesRelative(drawable0, drawable1, drawable2, drawable3);
        }
        else {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable0, drawable1, drawable2, drawable3);
        }
        this.m = false;
    }

    @Override  // androidx.appcompat.widget.AppCompatTextView
    public void setCompoundDrawablesWithIntrinsicBounds(@m Drawable drawable0, @m Drawable drawable1, @m Drawable drawable2, @m Drawable drawable3) {
        if(this.k > 0 || this.l > 0) {
            if(drawable0 != null) {
                this.setMaxBounds(drawable0);
            }
            if(drawable2 != null) {
                this.setMaxBounds(drawable2);
            }
            if(drawable1 != null) {
                this.setMaxBounds(drawable1);
            }
            if(drawable3 != null) {
                this.setMaxBounds(drawable3);
            }
            this.setCompoundDrawables(drawable0, drawable1, drawable2, drawable3);
        }
        else {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable0, drawable1, drawable2, drawable3);
        }
        this.m = false;
    }

    private final void setMaxBounds(Drawable drawable0) {
        drawable0.setBounds(0, 0, Math.min(drawable0.getIntrinsicWidth(), this.k), Math.min(drawable0.getIntrinsicHeight(), this.l));
    }

    private final void w(Context context0, AttributeSet attributeSet0, int v) {
        Drawable drawable3;
        Drawable drawable2;
        Drawable drawable1;
        ColorStateList colorStateList0;
        if(attributeSet0 != null) {
            TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet0, styleable.BetterTextView, v, 0);
            L.o(typedArray0, "obtainStyledAttributes(...)");
            Drawable drawable0 = null;
            try {
                colorStateList0 = null;
                colorStateList0 = typedArray0.getColorStateList(5);
            }
            catch(Exception unused_ex) {
            }
            this.j = colorStateList0;
            this.k = typedArray0.getDimensionPixelSize(3, 0);
            this.l = typedArray0.getDimensionPixelSize(2, 0);
            try {
                drawable1 = null;
                drawable1 = typedArray0.getDrawable(1);
                drawable2 = null;
            }
            catch(Exception unused_ex) {
            }
            try {
                drawable2 = typedArray0.getDrawable(6);
                drawable3 = null;
            }
            catch(Exception unused_ex) {
            }
            try {
                drawable3 = typedArray0.getDrawable(4);
            }
            catch(Exception unused_ex) {
            }
            try {
                drawable0 = typedArray0.getDrawable(0);
            }
            catch(Exception unused_ex) {
            }
            if(drawable1 != null || drawable2 != null || drawable3 != null || drawable0 != null) {
                this.setCompoundDrawablesWithIntrinsicBounds(drawable1, drawable2, drawable3, drawable0);
            }
            typedArray0.recycle();
        }
    }
}

