package androidx.compose.ui.text.font;

import kotlin.jvm.internal.L;
import y4.l;

public final class DeviceFontFamilyNameFontKt {
    @l
    public static final Font a(@l String s, @l FontWeight fontWeight0, int v, @l Settings fontVariation$Settings0) {
        L.p(s, "familyName");
        L.p(fontWeight0, "weight");
        L.p(fontVariation$Settings0, "variationSettings");
        return new DeviceFontFamilyNameFont(s, fontWeight0, v, fontVariation$Settings0, null);
    }

    public static Font b(String s, FontWeight fontWeight0, int v, Settings fontVariation$Settings0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            fontWeight0 = FontWeight.b.m();
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        if((v1 & 8) != 0) {
            fontVariation$Settings0 = new Settings(new Setting[0]);
        }
        return DeviceFontFamilyNameFontKt.a(s, fontWeight0, v, fontVariation$Settings0);
    }
}

