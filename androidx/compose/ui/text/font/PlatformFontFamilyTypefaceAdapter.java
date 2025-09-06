package androidx.compose.ui.text.font;

import androidx.compose.ui.text.platform.AndroidTypeface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class PlatformFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {
    @l
    private final PlatformTypefaces a;

    public PlatformFontFamilyTypefaceAdapter() {
        this.a = PlatformTypefacesKt.a();
    }

    @Override  // androidx.compose.ui.text.font.FontFamilyTypefaceAdapter
    @m
    public TypefaceResult a(@l TypefaceRequest typefaceRequest0, @l PlatformFontLoader platformFontLoader0, @l Function1 function10, @l Function1 function11) {
        L.p(typefaceRequest0, "typefaceRequest");
        L.p(platformFontLoader0, "platformFontLoader");
        L.p(function10, "onAsyncCompletion");
        L.p(function11, "createDefaultTypeface");
        FontFamily fontFamily0 = typefaceRequest0.h();
        if((fontFamily0 == null ? true : fontFamily0 instanceof DefaultFontFamily)) {
            return new Immutable(this.a.b(typefaceRequest0.k(), typefaceRequest0.i()), false, 2, null);
        }
        if(fontFamily0 instanceof GenericFontFamily) {
            return new Immutable(this.a.a(((GenericFontFamily)typefaceRequest0.h()), typefaceRequest0.k(), typefaceRequest0.i()), false, 2, null);
        }
        if(fontFamily0 instanceof LoadedFontFamily) {
            Typeface typeface0 = ((LoadedFontFamily)typefaceRequest0.h()).j();
            L.n(typeface0, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
            return new Immutable(((AndroidTypeface)typeface0).b(typefaceRequest0.k(), typefaceRequest0.i(), typefaceRequest0.j()), false, 2, null);
        }
        return null;
    }
}

