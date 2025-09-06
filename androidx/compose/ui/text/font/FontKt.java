package androidx.compose.ui.text.font;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.ExperimentalTextApi;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlin.m;
import y4.l;

public final class FontKt {
    @ExperimentalTextApi
    @l
    public static final Font a(int v, @l FontWeight fontWeight0, int v1, int v2, @l Settings fontVariation$Settings0) {
        L.p(fontWeight0, "weight");
        L.p(fontVariation$Settings0, "variationSettings");
        return new ResourceFont(v, fontWeight0, v1, fontVariation$Settings0, v2, null);
    }

    public static Font b(int v, FontWeight fontWeight0, int v1, int v2, Settings fontVariation$Settings0, int v3, Object object0) {
        if((v3 & 2) != 0) {
            fontWeight0 = FontWeight.b.m();
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = 0;
        }
        if((v3 & 16) != 0) {
            fontVariation$Settings0 = FontVariation.a.b(fontWeight0, v1, new Setting[0]);
        }
        return FontKt.a(v, fontWeight0, v1, v2, fontVariation$Settings0);
    }

    @Stable
    @k(level = m.c, message = "Maintained for binary compatibility until Compose 1.3.", replaceWith = @c0(expression = "Font(resId, weight, style)", imports = {}))
    public static final Font c(int v, FontWeight fontWeight0, int v1) {
        L.p(fontWeight0, "weight");
        return new ResourceFont(v, fontWeight0, v1, null, 0, 8, null);
    }

    public static Font d(int v, FontWeight fontWeight0, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            fontWeight0 = FontWeight.b.m();
        }
        if((v2 & 4) != 0) {
            v1 = 0;
        }
        return FontKt.c(v, fontWeight0, v1);
    }

    @Stable
    @l
    public static final Font e(int v, @l FontWeight fontWeight0, int v1, int v2) {
        L.p(fontWeight0, "weight");
        return new ResourceFont(v, fontWeight0, v1, new Settings(new Setting[0]), v2, null);
    }

    public static Font f(int v, FontWeight fontWeight0, int v1, int v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            fontWeight0 = FontWeight.b.m();
        }
        if((v3 & 4) != 0) {
            v1 = 0;
        }
        if((v3 & 8) != 0) {
            v2 = 0;
        }
        return FontKt.e(v, fontWeight0, v1, v2);
    }

    @Stable
    @l
    public static final FontFamily g(@l Font font0) {
        L.p(font0, "<this>");
        return FontFamilyKt.c(new Font[]{font0});
    }
}

