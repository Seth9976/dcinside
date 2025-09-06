package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build.VERSION;
import androidx.compose.ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.font.TypefaceHelperMethodsApi28;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;

@k(message = "This path for preloading loading fonts is not supported.")
public final class AndroidGenericFontFamilyTypeface implements AndroidTypeface {
    @l
    private final FontFamily a;
    @l
    private final Typeface b;

    public AndroidGenericFontFamilyTypeface(@l GenericFontFamily genericFontFamily0) {
        L.p(genericFontFamily0, "fontFamily");
        super();
        this.a = genericFontFamily0;
        Typeface typeface0 = Typeface.create(genericFontFamily0.j(), 0);
        L.m(typeface0);
        this.b = typeface0;
    }

    @Override  // androidx.compose.ui.text.font.Typeface
    @l
    public FontFamily a() {
        return this.a;
    }

    @Override  // androidx.compose.ui.text.platform.AndroidTypeface
    @l
    public Typeface b(@l FontWeight fontWeight0, int v, int v1) {
        L.p(fontWeight0, "fontWeight");
        Typeface typeface0 = this.c(fontWeight0, v);
        L.o(typeface0, "buildStyledTypeface(fontWeight, fontStyle)");
        return typeface0;
    }

    private final Typeface c(FontWeight fontWeight0, int v) {
        if(Build.VERSION.SDK_INT < 28) {
            int v1 = AndroidFontUtils_androidKt.c(fontWeight0, v);
            return Typeface.create(this.b, v1);
        }
        return TypefaceHelperMethodsApi28.a.a(this.b, fontWeight0.w(), FontStyle.f(v, 1));
    }
}

