package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.VisibleForTesting;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@VisibleForTesting
final class PlatformTypefacesApi implements PlatformTypefaces {
    @Override  // androidx.compose.ui.text.font.PlatformTypefaces
    @l
    public Typeface a(@l GenericFontFamily genericFontFamily0, @l FontWeight fontWeight0, int v) {
        L.p(genericFontFamily0, "name");
        L.p(fontWeight0, "fontWeight");
        Typeface typeface0 = this.f(PlatformTypefacesKt.b(genericFontFamily0.j(), fontWeight0), fontWeight0, v);
        return typeface0 == null ? this.d(genericFontFamily0.j(), fontWeight0, v) : typeface0;
    }

    @Override  // androidx.compose.ui.text.font.PlatformTypefaces
    @l
    public Typeface b(@l FontWeight fontWeight0, int v) {
        L.p(fontWeight0, "fontWeight");
        return this.d(null, fontWeight0, v);
    }

    @Override  // androidx.compose.ui.text.font.PlatformTypefaces
    @m
    public Typeface c(@l String s, @l FontWeight fontWeight0, int v, @l Settings fontVariation$Settings0, @l Context context0) {
        L.p(s, "familyName");
        L.p(fontWeight0, "weight");
        L.p(fontVariation$Settings0, "variationSettings");
        L.p(context0, "context");
        Companion fontFamily$Companion0 = FontFamily.b;
        if(L.g(s, "sans-serif")) {
            return PlatformTypefacesKt.c(this.a(fontFamily$Companion0.d(), fontWeight0, v), fontVariation$Settings0, context0);
        }
        if(L.g(s, fontFamily$Companion0.e().j())) {
            return PlatformTypefacesKt.c(this.a(fontFamily$Companion0.e(), fontWeight0, v), fontVariation$Settings0, context0);
        }
        if(L.g(s, fontFamily$Companion0.c().j())) {
            return PlatformTypefacesKt.c(this.a(fontFamily$Companion0.c(), fontWeight0, v), fontVariation$Settings0, context0);
        }
        return L.g(s, fontFamily$Companion0.a().j()) ? PlatformTypefacesKt.c(this.a(fontFamily$Companion0.a(), fontWeight0, v), fontVariation$Settings0, context0) : PlatformTypefacesKt.c(this.f(s, fontWeight0, v), fontVariation$Settings0, context0);
    }

    private final Typeface d(String s, FontWeight fontWeight0, int v) {
        Typeface typeface1;
        if(FontStyle.f(v, 0) && L.g(fontWeight0, FontWeight.b.m()) && (s == null || s.length() == 0)) {
            Typeface typeface0 = Typeface.DEFAULT;
            L.o(typeface0, "DEFAULT");
            return typeface0;
        }
        int v1 = AndroidFontUtils_androidKt.c(fontWeight0, v);
        if(s != null && s.length() != 0) {
            typeface1 = Typeface.create(s, v1);
            L.o(typeface1, "{\n            Typeface.c…y, targetStyle)\n        }");
            return typeface1;
        }
        typeface1 = Typeface.defaultFromStyle(v1);
        L.o(typeface1, "{\n            Typeface.d…le(targetStyle)\n        }");
        return typeface1;
    }

    static Typeface e(PlatformTypefacesApi platformTypefacesApi0, String s, FontWeight fontWeight0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = null;
        }
        if((v1 & 2) != 0) {
            fontWeight0 = FontWeight.b.m();
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        return platformTypefacesApi0.d(s, fontWeight0, v);
    }

    private final Typeface f(String s, FontWeight fontWeight0, int v) {
        if(s.length() == 0) {
            return null;
        }
        Typeface typeface0 = this.d(s, fontWeight0, v);
        return L.g(typeface0, Typeface.create(Typeface.DEFAULT, AndroidFontUtils_androidKt.c(fontWeight0, v))) || L.g(typeface0, this.d(null, fontWeight0, v)) ? null : typeface0;
    }
}

