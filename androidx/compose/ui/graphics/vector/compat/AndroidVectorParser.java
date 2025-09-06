package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.StyleableRes;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import org.xmlpull.v1.XmlPullParser;
import y4.l;
import y4.m;

public final class AndroidVectorParser {
    @l
    private final XmlPullParser a;
    private int b;

    public AndroidVectorParser(@l XmlPullParser xmlPullParser0, int v) {
        L.p(xmlPullParser0, "xmlParser");
        super();
        this.a = xmlPullParser0;
        this.b = v;
    }

    public AndroidVectorParser(XmlPullParser xmlPullParser0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        this(xmlPullParser0, v);
    }

    @l
    public final XmlPullParser a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    @l
    public final AndroidVectorParser c(@l XmlPullParser xmlPullParser0, int v) {
        L.p(xmlPullParser0, "xmlParser");
        return new AndroidVectorParser(xmlPullParser0, v);
    }

    public static AndroidVectorParser d(AndroidVectorParser androidVectorParser0, XmlPullParser xmlPullParser0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            xmlPullParser0 = androidVectorParser0.a;
        }
        if((v1 & 2) != 0) {
            v = androidVectorParser0.b;
        }
        return androidVectorParser0.c(xmlPullParser0, v);
    }

    public final int e() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AndroidVectorParser)) {
            return false;
        }
        return L.g(this.a, ((AndroidVectorParser)object0).a) ? this.b == ((AndroidVectorParser)object0).b : false;
    }

    public final float f(@l TypedArray typedArray0, int v, float f) {
        L.p(typedArray0, "typedArray");
        float f1 = typedArray0.getDimension(v, f);
        this.r(typedArray0.getChangingConfigurations());
        return f1;
    }

    public final float g(@l TypedArray typedArray0, int v, float f) {
        L.p(typedArray0, "typedArray");
        float f1 = typedArray0.getFloat(v, f);
        this.r(typedArray0.getChangingConfigurations());
        return f1;
    }

    public final int h(@l TypedArray typedArray0, int v, int v1) {
        L.p(typedArray0, "typedArray");
        int v2 = typedArray0.getInt(v, v1);
        this.r(typedArray0.getChangingConfigurations());
        return v2;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() * 0x1F + this.b;
    }

    public final boolean i(@l TypedArray typedArray0, @l String s, @StyleableRes int v, boolean z) {
        L.p(typedArray0, "typedArray");
        L.p(s, "attrName");
        boolean z1 = TypedArrayUtils.e(typedArray0, this.a, s, v, z);
        this.r(typedArray0.getChangingConfigurations());
        return z1;
    }

    @m
    public final ColorStateList j(@l TypedArray typedArray0, @m Resources.Theme resources$Theme0, @l String s, @StyleableRes int v) {
        L.p(typedArray0, "typedArray");
        L.p(s, "attrName");
        ColorStateList colorStateList0 = TypedArrayUtils.g(typedArray0, this.a, resources$Theme0, s, v);
        this.r(typedArray0.getChangingConfigurations());
        return colorStateList0;
    }

    @l
    public final ComplexColorCompat k(@l TypedArray typedArray0, @m Resources.Theme resources$Theme0, @l String s, @StyleableRes int v, @ColorInt int v1) {
        L.p(typedArray0, "typedArray");
        L.p(s, "attrName");
        ComplexColorCompat complexColorCompat0 = TypedArrayUtils.i(typedArray0, this.a, resources$Theme0, s, v, v1);
        this.r(typedArray0.getChangingConfigurations());
        L.o(complexColorCompat0, "result");
        return complexColorCompat0;
    }

    public final float l(@l TypedArray typedArray0, @l String s, @StyleableRes int v, float f) {
        L.p(typedArray0, "typedArray");
        L.p(s, "attrName");
        float f1 = TypedArrayUtils.j(typedArray0, this.a, s, v, f);
        this.r(typedArray0.getChangingConfigurations());
        return f1;
    }

    public final int m(@l TypedArray typedArray0, @l String s, @StyleableRes int v, int v1) {
        L.p(typedArray0, "typedArray");
        L.p(s, "attrName");
        int v2 = TypedArrayUtils.k(typedArray0, this.a, s, v, v1);
        this.r(typedArray0.getChangingConfigurations());
        return v2;
    }

    @m
    public final String n(@l TypedArray typedArray0, int v) {
        L.p(typedArray0, "typedArray");
        String s = typedArray0.getString(v);
        this.r(typedArray0.getChangingConfigurations());
        return s;
    }

    @l
    public final XmlPullParser o() {
        return this.a;
    }

    @l
    public final TypedArray p(@l Resources resources0, @m Resources.Theme resources$Theme0, @l AttributeSet attributeSet0, @l int[] arr_v) {
        L.p(resources0, "res");
        L.p(attributeSet0, "set");
        L.p(arr_v, "attrs");
        TypedArray typedArray0 = TypedArrayUtils.s(resources0, resources$Theme0, attributeSet0, arr_v);
        L.o(typedArray0, "obtainAttributes(\n      …          attrs\n        )");
        this.r(typedArray0.getChangingConfigurations());
        return typedArray0;
    }

    public final void q(int v) {
        this.b = v;
    }

    private final void r(int v) {
        this.b |= v;
    }

    @Override
    @l
    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.a + ", config=" + this.b + ')';
    }
}

