package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.BrushKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector.Builder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import y4.l;
import y4.m;

@s0({"SMAP\nXmlVectorParser.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlVectorParser.android.kt\nandroidx/compose/ui/graphics/vector/compat/XmlVectorParser_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,726:1\n174#2:727\n174#2:728\n*S KotlinDebug\n*F\n+ 1 XmlVectorParser.android.kt\nandroidx/compose/ui/graphics/vector/compat/XmlVectorParser_androidKt\n*L\n239#1:727\n240#1:728\n*E\n"})
public final class XmlVectorParser_androidKt {
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 0;
    private static final int e = 1;
    private static final int f = 2;
    private static final int g = 0;
    @l
    private static final String h = "clip-path";
    @l
    private static final String i = "group";
    @l
    private static final String j = "path";

    static {
    }

    @l
    public static final Builder a(@l AndroidVectorParser androidVectorParser0, @l Resources resources0, @m Resources.Theme resources$Theme0, @l AttributeSet attributeSet0) {
        int v1;
        long v;
        L.p(androidVectorParser0, "<this>");
        L.p(resources0, "res");
        L.p(attributeSet0, "attrs");
        TypedArray typedArray0 = androidVectorParser0.p(resources0, resources$Theme0, attributeSet0, AndroidVectorResources.a.H());
        boolean z = androidVectorParser0.i(typedArray0, "autoMirrored", 5, false);
        float f = androidVectorParser0.l(typedArray0, "viewportWidth", 7, 0.0f);
        float f1 = androidVectorParser0.l(typedArray0, "viewportHeight", 8, 0.0f);
        if(f <= 0.0f) {
            throw new XmlPullParserException(typedArray0.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if(f1 <= 0.0f) {
            throw new XmlPullParserException(typedArray0.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float f2 = androidVectorParser0.f(typedArray0, 3, 0.0f);
        float f3 = androidVectorParser0.f(typedArray0, 2, 0.0f);
        if(typedArray0.hasValue(1)) {
            TypedValue typedValue0 = new TypedValue();
            typedArray0.getValue(1, typedValue0);
            if(typedValue0.type == 2) {
                v = 16L;
            }
            else {
                ColorStateList colorStateList0 = androidVectorParser0.j(typedArray0, resources$Theme0, "tint", 1);
                v = colorStateList0 == null ? 16L : ColorKt.b(colorStateList0.getDefaultColor());
            }
        }
        else {
            v = 16L;
        }
        switch(androidVectorParser0.h(typedArray0, 6, -1)) {
            case -1: {
                v1 = 5;
                break;
            }
            case 3: {
                v1 = 3;
                break;
            }
            case 5: {
                v1 = 5;
                break;
            }
            case 9: {
                v1 = 9;
                break;
            }
            case 14: {
                v1 = 13;
                break;
            }
            case 15: {
                v1 = 14;
                break;
            }
            case 16: {
                v1 = 12;
                break;
            }
            default: {
                v1 = 5;
            }
        }
        float f4 = Dp.g(f2 / resources0.getDisplayMetrics().density);
        float f5 = Dp.g(f3 / resources0.getDisplayMetrics().density);
        typedArray0.recycle();
        return new Builder(null, f4, f5, f, f1, v, v1, z, 1, null);
    }

    private static final int b(int v, int v1) {
        switch(v) {
            case 0: {
                return 0;
            }
            case 1: {
                return 1;
            }
            case 2: {
                return 2;
            }
            default: {
                return v1;
            }
        }
    }

    static int c(int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        return XmlVectorParser_androidKt.b(v, v1);
    }

    private static final int d(int v, int v1) {
        switch(v) {
            case 0: {
                return 0;
            }
            case 1: {
                return 1;
            }
            case 2: {
                return 2;
            }
            default: {
                return v1;
            }
        }
    }

    static int e(int v, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        return XmlVectorParser_androidKt.d(v, v1);
    }

    public static final boolean f(@l XmlPullParser xmlPullParser0) {
        L.p(xmlPullParser0, "<this>");
        return xmlPullParser0.getEventType() == 1 || xmlPullParser0.getDepth() < 1 && xmlPullParser0.getEventType() == 3;
    }

    private static final Brush g(ComplexColorCompat complexColorCompat0) {
        if(complexColorCompat0.l()) {
            Shader shader0 = complexColorCompat0.f();
            return shader0 != null ? BrushKt.a(shader0) : new SolidColor(ColorKt.b(complexColorCompat0.e()), null);
        }
        return null;
    }

    public static final void h(@l AndroidVectorParser androidVectorParser0, @l Resources resources0, @m Resources.Theme resources$Theme0, @l AttributeSet attributeSet0, @l Builder imageVector$Builder0) {
        L.p(androidVectorParser0, "<this>");
        L.p(resources0, "res");
        L.p(attributeSet0, "attrs");
        L.p(imageVector$Builder0, "builder");
        TypedArray typedArray0 = androidVectorParser0.p(resources0, resources$Theme0, attributeSet0, AndroidVectorResources.a.c());
        String s = androidVectorParser0.n(typedArray0, 0);
        if(s == null) {
            s = "";
        }
        List list0 = VectorKt.b(androidVectorParser0.n(typedArray0, 1));
        typedArray0.recycle();
        Builder.b(imageVector$Builder0, s, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, list0, 0xFE, null);
    }

    public static final int i(@l AndroidVectorParser androidVectorParser0, @l Resources resources0, @l AttributeSet attributeSet0, @m Resources.Theme resources$Theme0, @l Builder imageVector$Builder0, int v) {
        L.p(androidVectorParser0, "<this>");
        L.p(resources0, "res");
        L.p(attributeSet0, "attrs");
        L.p(imageVector$Builder0, "builder");
        switch(androidVectorParser0.o().getEventType()) {
            case 2: {
                String s = androidVectorParser0.o().getName();
                if(s != null) {
                    switch(s) {
                        case "clip-path": {
                            XmlVectorParser_androidKt.h(androidVectorParser0, resources0, resources$Theme0, attributeSet0, imageVector$Builder0);
                            return v + 1;
                        }
                        case "group": {
                            XmlVectorParser_androidKt.k(androidVectorParser0, resources0, resources$Theme0, attributeSet0, imageVector$Builder0);
                            return v;
                        }
                        case "path": {
                            XmlVectorParser_androidKt.l(androidVectorParser0, resources0, resources$Theme0, attributeSet0, imageVector$Builder0);
                            return v;
                        }
                        default: {
                            return v;
                        }
                    }
                }
                break;
            }
            case 3: {
                if(L.g("group", androidVectorParser0.o().getName())) {
                    for(int v1 = 0; v1 < v + 1; ++v1) {
                        imageVector$Builder0.g();
                    }
                    return 0;
                }
                break;
            }
            default: {
                return v;
            }
        }
        return v;
    }

    public static int j(AndroidVectorParser androidVectorParser0, Resources resources0, AttributeSet attributeSet0, Resources.Theme resources$Theme0, Builder imageVector$Builder0, int v, int v1, Object object0) {
        if((v1 & 4) != 0) {
            resources$Theme0 = null;
        }
        return XmlVectorParser_androidKt.i(androidVectorParser0, resources0, attributeSet0, resources$Theme0, imageVector$Builder0, v);
    }

    public static final void k(@l AndroidVectorParser androidVectorParser0, @l Resources resources0, @m Resources.Theme resources$Theme0, @l AttributeSet attributeSet0, @l Builder imageVector$Builder0) {
        L.p(androidVectorParser0, "<this>");
        L.p(resources0, "res");
        L.p(attributeSet0, "attrs");
        L.p(imageVector$Builder0, "builder");
        TypedArray typedArray0 = androidVectorParser0.p(resources0, resources$Theme0, attributeSet0, AndroidVectorResources.a.f());
        float f = androidVectorParser0.l(typedArray0, "rotation", 5, 0.0f);
        float f1 = androidVectorParser0.g(typedArray0, 1, 0.0f);
        float f2 = androidVectorParser0.g(typedArray0, 2, 0.0f);
        float f3 = androidVectorParser0.l(typedArray0, "scaleX", 3, 1.0f);
        float f4 = androidVectorParser0.l(typedArray0, "scaleY", 4, 1.0f);
        float f5 = androidVectorParser0.l(typedArray0, "translateX", 6, 0.0f);
        float f6 = androidVectorParser0.l(typedArray0, "translateY", 7, 0.0f);
        String s = androidVectorParser0.n(typedArray0, 0);
        if(s == null) {
            s = "";
        }
        typedArray0.recycle();
        imageVector$Builder0.a(s, f, f1, f2, f3, f4, f5, f6, VectorKt.h());
    }

    public static final void l(@l AndroidVectorParser androidVectorParser0, @l Resources resources0, @m Resources.Theme resources$Theme0, @l AttributeSet attributeSet0, @l Builder imageVector$Builder0) throws IllegalArgumentException {
        L.p(androidVectorParser0, "<this>");
        L.p(resources0, "res");
        L.p(attributeSet0, "attrs");
        L.p(imageVector$Builder0, "builder");
        TypedArray typedArray0 = androidVectorParser0.p(resources0, resources$Theme0, attributeSet0, AndroidVectorResources.a.q());
        if(!TypedArrayUtils.r(androidVectorParser0.o(), "pathData")) {
            throw new IllegalArgumentException("No path data available");
        }
        String s = androidVectorParser0.n(typedArray0, 0);
        if(s == null) {
            s = "";
        }
        List list0 = VectorKt.b(androidVectorParser0.n(typedArray0, 2));
        ComplexColorCompat complexColorCompat0 = androidVectorParser0.k(typedArray0, resources$Theme0, "fillColor", 1, 0);
        float f = androidVectorParser0.l(typedArray0, "fillAlpha", 12, 1.0f);
        int v = XmlVectorParser_androidKt.b(androidVectorParser0.m(typedArray0, "strokeLineCap", 8, -1), 0);
        int v1 = XmlVectorParser_androidKt.d(androidVectorParser0.m(typedArray0, "strokeLineJoin", 9, -1), 2);
        float f1 = androidVectorParser0.l(typedArray0, "strokeMiterLimit", 10, 1.0f);
        ComplexColorCompat complexColorCompat1 = androidVectorParser0.k(typedArray0, resources$Theme0, "strokeColor", 3, 0);
        float f2 = androidVectorParser0.l(typedArray0, "strokeAlpha", 11, 1.0f);
        float f3 = androidVectorParser0.l(typedArray0, "strokeWidth", 4, 1.0f);
        float f4 = androidVectorParser0.l(typedArray0, "trimPathEnd", 6, 1.0f);
        float f5 = androidVectorParser0.l(typedArray0, "trimPathOffset", 7, 0.0f);
        float f6 = androidVectorParser0.l(typedArray0, "trimPathStart", 5, 0.0f);
        int v2 = androidVectorParser0.m(typedArray0, "fillType", 13, XmlVectorParser_androidKt.g);
        typedArray0.recycle();
        imageVector$Builder0.c(list0, (v2 == 0 ? 0 : 1), s, XmlVectorParser_androidKt.g(complexColorCompat0), f, XmlVectorParser_androidKt.g(complexColorCompat1), f2, f3, v, v1, f1, f6, f4, f5);
    }

    @l
    public static final XmlPullParser m(@l XmlPullParser xmlPullParser0) throws XmlPullParserException {
        L.p(xmlPullParser0, "<this>");
        int v;
        for(v = xmlPullParser0.next(); v != 1 && v != 2; v = xmlPullParser0.next()) {
        }
        if(v != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        return xmlPullParser0;
    }
}

