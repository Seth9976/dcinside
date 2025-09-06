package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.styleable;
import com.google.android.material.resources.d;
import com.google.android.material.shape.k;
import com.google.android.material.shape.p;

final class a {
    @NonNull
    private final Rect a;
    private final ColorStateList b;
    private final ColorStateList c;
    private final ColorStateList d;
    private final int e;
    private final p f;

    private a(ColorStateList colorStateList0, ColorStateList colorStateList1, ColorStateList colorStateList2, int v, p p0, @NonNull Rect rect0) {
        Preconditions.i(rect0.left);
        Preconditions.i(rect0.top);
        Preconditions.i(rect0.right);
        Preconditions.i(rect0.bottom);
        this.a = rect0;
        this.b = colorStateList1;
        this.c = colorStateList0;
        this.d = colorStateList2;
        this.e = v;
        this.f = p0;
    }

    @NonNull
    static a a(@NonNull Context context0, @StyleRes int v) {
        Preconditions.b(v != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArray0 = context0.obtainStyledAttributes(v, styleable.MaterialCalendarItem);
        Rect rect0 = new Rect(typedArray0.getDimensionPixelOffset(styleable.MaterialCalendarItem_android_insetLeft, 0), typedArray0.getDimensionPixelOffset(styleable.MaterialCalendarItem_android_insetTop, 0), typedArray0.getDimensionPixelOffset(styleable.MaterialCalendarItem_android_insetRight, 0), typedArray0.getDimensionPixelOffset(styleable.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList colorStateList0 = d.a(context0, typedArray0, styleable.MaterialCalendarItem_itemFillColor);
        ColorStateList colorStateList1 = d.a(context0, typedArray0, styleable.MaterialCalendarItem_itemTextColor);
        ColorStateList colorStateList2 = d.a(context0, typedArray0, styleable.MaterialCalendarItem_itemStrokeColor);
        int v1 = typedArray0.getDimensionPixelSize(styleable.MaterialCalendarItem_itemStrokeWidth, 0);
        p p0 = p.b(context0, typedArray0.getResourceId(styleable.MaterialCalendarItem_itemShapeAppearance, 0), typedArray0.getResourceId(styleable.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).m();
        typedArray0.recycle();
        return new a(colorStateList0, colorStateList1, colorStateList2, v1, p0, rect0);
    }

    int b() {
        return this.a.bottom;
    }

    int c() {
        return this.a.left;
    }

    int d() {
        return this.a.right;
    }

    int e() {
        return this.a.top;
    }

    void f(@NonNull TextView textView0) {
        this.g(textView0, null, null);
    }

    void g(@NonNull TextView textView0, @Nullable ColorStateList colorStateList0, @Nullable ColorStateList colorStateList1) {
        k k0 = new k();
        k k1 = new k();
        k0.setShapeAppearanceModel(this.f);
        k1.setShapeAppearanceModel(this.f);
        if(colorStateList0 == null) {
            colorStateList0 = this.c;
        }
        k0.p0(colorStateList0);
        k0.F0(((float)this.e), this.d);
        if(colorStateList1 == null) {
            colorStateList1 = this.b;
        }
        textView0.setTextColor(colorStateList1);
        ViewCompat.R1(textView0, new InsetDrawable(new RippleDrawable(this.b.withAlpha(30), k0, k1), this.a.left, this.a.top, this.a.right, this.a.bottom));
    }
}

