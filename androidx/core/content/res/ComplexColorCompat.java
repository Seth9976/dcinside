package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({Scope.c})
public final class ComplexColorCompat {
    private final Shader a;
    private final ColorStateList b;
    private int c;
    private static final String d = "ComplexColorCompat";

    private ComplexColorCompat(Shader shader0, ColorStateList colorStateList0, @ColorInt int v) {
        this.a = shader0;
        this.b = colorStateList0;
        this.c = v;
    }

    private static ComplexColorCompat a(Resources resources0, @ColorRes int v, Resources.Theme resources$Theme0) throws IOException, XmlPullParserException {
        XmlResourceParser xmlResourceParser0 = resources0.getXml(v);
        AttributeSet attributeSet0 = Xml.asAttributeSet(xmlResourceParser0);
        do {
            int v1 = xmlResourceParser0.next();
        }
        while(v1 != 1 && v1 != 2);
        if(v1 != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String s = xmlResourceParser0.getName();
        s.hashCode();
        if(!s.equals("gradient")) {
            if(!s.equals("selector")) {
                throw new XmlPullParserException(xmlResourceParser0.getPositionDescription() + ": unsupported complex color tag " + s);
            }
            return ComplexColorCompat.c(ColorStateListInflaterCompat.b(resources0, xmlResourceParser0, attributeSet0, resources$Theme0));
        }
        return ComplexColorCompat.d(GradientColorInflaterCompat.c(resources0, xmlResourceParser0, attributeSet0, resources$Theme0));
    }

    static ComplexColorCompat b(@ColorInt int v) {
        return new ComplexColorCompat(null, null, v);
    }

    static ComplexColorCompat c(ColorStateList colorStateList0) {
        return new ComplexColorCompat(null, colorStateList0, colorStateList0.getDefaultColor());
    }

    static ComplexColorCompat d(Shader shader0) {
        return new ComplexColorCompat(shader0, null, 0);
    }

    @ColorInt
    public int e() {
        return this.c;
    }

    public Shader f() {
        return this.a;
    }

    public static ComplexColorCompat g(Resources resources0, @ColorRes int v, Resources.Theme resources$Theme0) {
        try {
            return ComplexColorCompat.a(resources0, v, resources$Theme0);
        }
        catch(Exception exception0) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", exception0);
            return null;
        }
    }

    public boolean h() {
        return this.a != null;
    }

    public boolean i() {
        return this.a == null && (this.b != null && this.b.isStateful());
    }

    public boolean j(int[] arr_v) {
        if(this.i()) {
            int v = this.b.getDefaultColor();
            int v1 = this.b.getColorForState(arr_v, v);
            if(v1 != this.c) {
                this.c = v1;
                return true;
            }
        }
        return false;
    }

    public void k(@ColorInt int v) {
        this.c = v;
    }

    public boolean l() {
        return this.h() || this.c != 0;
    }
}

