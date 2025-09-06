package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build.VERSION;
import androidx.compose.ui.text.font.AndroidFontUtils_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.TypefaceHelperMethodsApi28;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;

@k(message = "This path for preloading fonts is not supported")
public final class AndroidDefaultTypeface implements AndroidTypeface {
    @l
    private final FontFamily a;

    public AndroidDefaultTypeface() {
        this.a = FontFamily.b.b();
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
        if(Build.VERSION.SDK_INT < 28) {
            Typeface typeface0 = Typeface.defaultFromStyle(AndroidFontUtils_androidKt.c(fontWeight0, v));
            L.o(typeface0, "{\n            Typeface.d…)\n            )\n        }");
            return typeface0;
        }
        Typeface typeface1 = Typeface.DEFAULT;
        L.o(typeface1, "DEFAULT");
        return TypefaceHelperMethodsApi28.a.a(typeface1, fontWeight0.w(), FontStyle.f(v, 1));
    }
}

