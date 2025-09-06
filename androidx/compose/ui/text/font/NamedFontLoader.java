package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.coroutines.d;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class NamedFontLoader implements TypefaceLoader {
    @l
    public static final NamedFontLoader a;

    static {
        NamedFontLoader.a = new NamedFontLoader();
    }

    @Override  // androidx.compose.ui.text.font.AndroidFont$TypefaceLoader
    @m
    public Typeface a(@l Context context0, @l AndroidFont androidFont0) {
        L.p(context0, "context");
        L.p(androidFont0, "font");
        DeviceFontFamilyNameFont deviceFontFamilyNameFont0 = androidFont0 instanceof DeviceFontFamilyNameFont ? ((DeviceFontFamilyNameFont)androidFont0) : null;
        return deviceFontFamilyNameFont0 == null ? null : deviceFontFamilyNameFont0.f(context0);
    }

    @Override  // androidx.compose.ui.text.font.AndroidFont$TypefaceLoader
    @m
    public Object b(@l Context context0, @l AndroidFont androidFont0, @l d d0) {
        throw new UnsupportedOperationException("All preloaded fonts are optional local.");
    }
}

