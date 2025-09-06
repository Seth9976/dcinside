package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.ResourcesCompat.FontCallback;
import androidx.core.content.res.ResourcesCompat;

@RestrictTo({Scope.c})
public class TintTypedArray {
    @RequiresApi(21)
    static class Api21Impl {
        @DoNotInline
        static int a(TypedArray typedArray0) {
            return typedArray0.getChangingConfigurations();
        }

        @DoNotInline
        static int b(TypedArray typedArray0, int v) {
            return typedArray0.getType(v);
        }
    }

    private final Context a;
    private final TypedArray b;
    private TypedValue c;

    private TintTypedArray(Context context0, TypedArray typedArray0) {
        this.a = context0;
        this.b = typedArray0;
    }

    public boolean A(int v, TypedValue typedValue0) {
        return this.b.getValue(v, typedValue0);
    }

    public TypedArray B() {
        return this.b;
    }

    public boolean C(int v) {
        return this.b.hasValue(v);
    }

    public int D() {
        return this.b.length();
    }

    public static TintTypedArray E(Context context0, int v, int[] arr_v) {
        return new TintTypedArray(context0, context0.obtainStyledAttributes(v, arr_v));
    }

    public static TintTypedArray F(Context context0, AttributeSet attributeSet0, int[] arr_v) {
        return new TintTypedArray(context0, context0.obtainStyledAttributes(attributeSet0, arr_v));
    }

    public static TintTypedArray G(Context context0, AttributeSet attributeSet0, int[] arr_v, int v, int v1) {
        return new TintTypedArray(context0, context0.obtainStyledAttributes(attributeSet0, arr_v, v, v1));
    }

    public TypedValue H(int v) {
        return this.b.peekValue(v);
    }

    public void I() {
        this.b.recycle();
    }

    public boolean a(int v, boolean z) {
        return this.b.getBoolean(v, z);
    }

    @RequiresApi(21)
    public int b() {
        return Api21Impl.a(this.b);
    }

    public int c(int v, int v1) {
        return this.b.getColor(v, v1);
    }

    public ColorStateList d(int v) {
        if(this.b.hasValue(v)) {
            int v1 = this.b.getResourceId(v, 0);
            if(v1 != 0) {
                ColorStateList colorStateList0 = AppCompatResources.a(this.a, v1);
                return colorStateList0 == null ? this.b.getColorStateList(v) : colorStateList0;
            }
        }
        return this.b.getColorStateList(v);
    }

    public float e(int v, float f) {
        return this.b.getDimension(v, f);
    }

    public int f(int v, int v1) {
        return this.b.getDimensionPixelOffset(v, v1);
    }

    public int g(int v, int v1) {
        return this.b.getDimensionPixelSize(v, v1);
    }

    public Drawable h(int v) {
        if(this.b.hasValue(v)) {
            int v1 = this.b.getResourceId(v, 0);
            return v1 == 0 ? this.b.getDrawable(v) : AppCompatResources.b(this.a, v1);
        }
        return this.b.getDrawable(v);
    }

    public Drawable i(int v) {
        if(this.b.hasValue(v)) {
            int v1 = this.b.getResourceId(v, 0);
            return v1 == 0 ? null : AppCompatDrawableManager.b().d(this.a, v1, true);
        }
        return null;
    }

    public float j(int v, float f) {
        return this.b.getFloat(v, f);
    }

    @Nullable
    public Typeface k(@StyleableRes int v, int v1, @Nullable FontCallback resourcesCompat$FontCallback0) {
        int v2 = this.b.getResourceId(v, 0);
        if(v2 == 0) {
            return null;
        }
        if(this.c == null) {
            this.c = new TypedValue();
        }
        return ResourcesCompat.k(this.a, v2, this.c, v1, resourcesCompat$FontCallback0);
    }

    public float l(int v, int v1, int v2, float f) {
        return this.b.getFraction(v, v1, v2, f);
    }

    public int m(int v) {
        return this.b.getIndex(v);
    }

    public int n() {
        return this.b.getIndexCount();
    }

    public int o(int v, int v1) {
        return this.b.getInt(v, v1);
    }

    public int p(int v, int v1) {
        return this.b.getInteger(v, v1);
    }

    public int q(int v, int v1) {
        return this.b.getLayoutDimension(v, v1);
    }

    public int r(int v, String s) {
        return this.b.getLayoutDimension(v, s);
    }

    public String s(int v) {
        return this.b.getNonResourceString(v);
    }

    public String t() {
        return this.b.getPositionDescription();
    }

    public int u(int v, int v1) {
        return this.b.getResourceId(v, v1);
    }

    public Resources v() {
        return this.b.getResources();
    }

    public String w(int v) {
        return this.b.getString(v);
    }

    public CharSequence x(int v) {
        return this.b.getText(v);
    }

    public CharSequence[] y(int v) {
        return this.b.getTextArray(v);
    }

    public int z(int v) {
        return Api21Impl.b(this.b, v);
    }
}

