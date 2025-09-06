package androidx.compose.ui.text.font;

import y4.l;

public final class FontFamilyResolverKt {
    @l
    private static final TypefaceRequestCache a;
    @l
    private static final AsyncTypefaceCache b;

    static {
        FontFamilyResolverKt.a = new TypefaceRequestCache();
        FontFamilyResolverKt.b = new AsyncTypefaceCache();
    }

    @l
    public static final AsyncTypefaceCache a() {
        return FontFamilyResolverKt.b;
    }

    @l
    public static final TypefaceRequestCache b() {
        return FontFamilyResolverKt.a;
    }
}

