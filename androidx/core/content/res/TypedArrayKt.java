package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import androidx.annotation.AnyRes;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleableRes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nTypedArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n1#2:239\n*E\n"})
public final class TypedArrayKt {
    private static final void a(TypedArray typedArray0, @StyleableRes int v) {
        if(!typedArray0.hasValue(v)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    public static final boolean b(@l TypedArray typedArray0, @StyleableRes int v) {
        TypedArrayKt.a(typedArray0, v);
        return typedArray0.getBoolean(v, false);
    }

    @ColorInt
    public static final int c(@l TypedArray typedArray0, @StyleableRes int v) {
        TypedArrayKt.a(typedArray0, v);
        return typedArray0.getColor(v, 0);
    }

    @l
    public static final ColorStateList d(@l TypedArray typedArray0, @StyleableRes int v) {
        TypedArrayKt.a(typedArray0, v);
        ColorStateList colorStateList0 = typedArray0.getColorStateList(v);
        if(colorStateList0 == null) {
            throw new IllegalStateException("Attribute value was not a color or color state list.");
        }
        return colorStateList0;
    }

    public static final float e(@l TypedArray typedArray0, @StyleableRes int v) {
        TypedArrayKt.a(typedArray0, v);
        return typedArray0.getDimension(v, 0.0f);
    }

    @Dimension
    public static final int f(@l TypedArray typedArray0, @StyleableRes int v) {
        TypedArrayKt.a(typedArray0, v);
        return typedArray0.getDimensionPixelOffset(v, 0);
    }

    @Dimension
    public static final int g(@l TypedArray typedArray0, @StyleableRes int v) {
        TypedArrayKt.a(typedArray0, v);
        return typedArray0.getDimensionPixelSize(v, 0);
    }

    @l
    public static final Drawable h(@l TypedArray typedArray0, @StyleableRes int v) {
        TypedArrayKt.a(typedArray0, v);
        Drawable drawable0 = typedArray0.getDrawable(v);
        L.m(drawable0);
        return drawable0;
    }

    public static final float i(@l TypedArray typedArray0, @StyleableRes int v) {
        TypedArrayKt.a(typedArray0, v);
        return typedArray0.getFloat(v, 0.0f);
    }

    @RequiresApi(26)
    @l
    public static final Typeface j(@l TypedArray typedArray0, @StyleableRes int v) {
        TypedArrayKt.a(typedArray0, v);
        return TypedArrayApi26ImplKt.a(typedArray0, v);
    }

    public static final int k(@l TypedArray typedArray0, @StyleableRes int v) {
        TypedArrayKt.a(typedArray0, v);
        return typedArray0.getInt(v, 0);
    }

    public static final int l(@l TypedArray typedArray0, @StyleableRes int v) {
        TypedArrayKt.a(typedArray0, v);
        return typedArray0.getInteger(v, 0);
    }

    @AnyRes
    public static final int m(@l TypedArray typedArray0, @StyleableRes int v) {
        TypedArrayKt.a(typedArray0, v);
        return typedArray0.getResourceId(v, 0);
    }

    @l
    public static final String n(@l TypedArray typedArray0, @StyleableRes int v) {
        TypedArrayKt.a(typedArray0, v);
        String s = typedArray0.getString(v);
        if(s == null) {
            throw new IllegalStateException("Attribute value could not be coerced to String.");
        }
        return s;
    }

    @l
    public static final CharSequence[] o(@l TypedArray typedArray0, @StyleableRes int v) {
        TypedArrayKt.a(typedArray0, v);
        return typedArray0.getTextArray(v);
    }

    @l
    public static final CharSequence p(@l TypedArray typedArray0, @StyleableRes int v) {
        TypedArrayKt.a(typedArray0, v);
        CharSequence charSequence0 = typedArray0.getText(v);
        if(charSequence0 == null) {
            throw new IllegalStateException("Attribute value could not be coerced to CharSequence.");
        }
        return charSequence0;
    }

    public static final Object q(@l TypedArray typedArray0, @l Function1 function10) {
        Object object0 = function10.invoke(typedArray0);
        typedArray0.recycle();
        return object0;
    }
}

