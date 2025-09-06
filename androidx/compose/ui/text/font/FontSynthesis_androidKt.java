package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import android.os.Build.VERSION;
import kotlin.jvm.internal.L;
import y4.l;

public final class FontSynthesis_androidKt {
    @l
    public static final Object a(int v, @l Object object0, @l Font font0, @l FontWeight fontWeight0, int v1) {
        Typeface typeface0;
        boolean z = false;
        L.p(object0, "typeface");
        L.p(font0, "font");
        L.p(fontWeight0, "requestedWeight");
        if(!(object0 instanceof Typeface)) {
            return object0;
        }
        boolean z1 = FontSynthesis.k(v) && !L.g(font0.b(), fontWeight0) && (fontWeight0.v(AndroidFontUtils_androidKt.a(FontWeight.b)) >= 0 && font0.b().v(AndroidFontUtils_androidKt.a(FontWeight.b)) < 0);
        boolean z2 = FontSynthesis.j(v) && !FontStyle.f(v1, font0.d());
        if(!z2 && !z1) {
            return object0;
        }
        if(Build.VERSION.SDK_INT < 28) {
            if(z2 && FontStyle.f(v1, 1)) {
                z = true;
            }
            typeface0 = Typeface.create(((Typeface)object0), AndroidFontUtils_androidKt.b(z1, z));
        }
        else {
            int v2 = z1 ? fontWeight0.w() : font0.b().w();
            boolean z3 = z2 ? FontStyle.f(v1, 1) : FontStyle.f(font0.d(), 1);
            typeface0 = TypefaceHelperMethodsApi28.a.a(((Typeface)object0), v2, z3);
        }
        L.o(typeface0, "if (Build.VERSION.SDK_IN…ht, finalFontStyle)\n    }");
        return typeface0;
    }
}

