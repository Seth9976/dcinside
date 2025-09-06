package com.facebook.fbui.textlayoutbuilder;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.StyleRes;

public class c {
    private static final int a = 15;

    public static void a(e e0, Context context0, @StyleRes int v) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(v, styleable.TextAppearance);
        ColorStateList colorStateList0 = typedArray0.getColorStateList(styleable.TextAppearance_android_textColor);
        int v1 = typedArray0.getDimensionPixelSize(styleable.TextAppearance_android_textSize, 0);
        int v2 = typedArray0.getInt(styleable.TextAppearance_android_shadowColor, 0);
        if(v2 != 0) {
            float f = typedArray0.getFloat(styleable.TextAppearance_android_shadowDx, 0.0f);
            float f1 = typedArray0.getFloat(styleable.TextAppearance_android_shadowDy, 0.0f);
            e0.a0(typedArray0.getFloat(styleable.TextAppearance_android_shadowRadius, 0.0f), f, f1, v2);
        }
        int v3 = typedArray0.getInt(styleable.TextAppearance_android_textStyle, -1);
        typedArray0.recycle();
        if(colorStateList0 != null) {
            e0.h0(colorStateList0);
        }
        if(v1 != 0) {
            e0.j0(v1);
        }
        if(v3 != -1) {
            e0.n0(Typeface.defaultFromStyle(v3));
        }
    }

    public static void b(e e0, Context context0, @StyleRes int v) {
        c.c(e0, context0, 0, v);
    }

    public static void c(e e0, Context context0, @AttrRes int v, @StyleRes int v1) {
        c.d(e0, context0, null, v, v1);
    }

    public static void d(e e0, Context context0, AttributeSet attributeSet0, @AttrRes int v, @StyleRes int v1) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.TextStyle, v, v1);
        int v2 = typedArray0.getResourceId(styleable.TextStyle_android_textAppearance, -1);
        if(v2 > 0) {
            c.a(e0, context0, v2);
        }
        ColorStateList colorStateList0 = typedArray0.getColorStateList(styleable.TextStyle_android_textColor);
        int v3 = typedArray0.getDimensionPixelSize(styleable.TextStyle_android_textSize, 15);
        int v4 = typedArray0.getInt(styleable.TextStyle_android_shadowColor, 0);
        float f = typedArray0.getFloat(styleable.TextStyle_android_shadowDx, 0.0f);
        float f1 = typedArray0.getFloat(styleable.TextStyle_android_shadowDy, 0.0f);
        float f2 = typedArray0.getFloat(styleable.TextStyle_android_shadowRadius, 0.0f);
        int v5 = typedArray0.getInt(styleable.TextStyle_android_textStyle, -1);
        int v6 = typedArray0.getInt(styleable.TextStyle_android_ellipsize, 0);
        boolean z = typedArray0.getBoolean(styleable.TextStyle_android_singleLine, false);
        int v7 = typedArray0.getInt(styleable.TextStyle_android_maxLines, 0x7FFFFFFF);
        int v8 = typedArray0.getInt(styleable.TextStyle_android_breakStrategy, -1);
        int v9 = typedArray0.getInt(styleable.TextStyle_android_hyphenationFrequency, -1);
        typedArray0.recycle();
        e0.h0(colorStateList0);
        e0.j0(v3);
        e0.a0(f2, f, f1, v4);
        if(v5 == -1) {
            e0.n0(null);
        }
        else {
            e0.n0(Typeface.defaultFromStyle(v5));
        }
        if(v6 <= 0 || v6 >= 4) {
            e0.M(null);
        }
        else {
            e0.M(TextUtils.TruncateAt.values()[v6 - 1]);
        }
        e0.e0(z);
        e0.W(v7);
        if(v8 > -1) {
            e0.J(v8);
        }
        if(v9 > -1) {
            e0.O(v9);
        }
    }
}

