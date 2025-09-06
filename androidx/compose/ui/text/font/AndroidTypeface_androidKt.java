package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.platform.AndroidDefaultTypeface;
import androidx.compose.ui.text.platform.AndroidFontListTypeface;
import androidx.compose.ui.text.platform.AndroidGenericFontFamilyTypeface;
import androidx.compose.ui.text.platform.AndroidTypefaceWrapper;
import java.util.List;
import kotlin.J;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlin.m;
import y4.l;

public final class AndroidTypeface_androidKt {
    @l
    public static final FontFamily a(@l Typeface typeface0) {
        L.p(typeface0, "typeface");
        return FontFamilyKt.a(AndroidTypeface_androidKt.c(typeface0));
    }

    @k(level = m.a, message = "This API is deprecated with the introduction of async fonts which cannot resolve in this context. To preload fonts, use FontFamily.Resolver.", replaceWith = @c0(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    @l
    public static final androidx.compose.ui.text.font.Typeface b(@l Context context0, @l FontFamily fontFamily0, @y4.m List list0) {
        L.p(context0, "context");
        L.p(fontFamily0, "fontFamily");
        if(fontFamily0 instanceof FontListFontFamily) {
            return new AndroidFontListTypeface(((FontListFontFamily)fontFamily0), context0, list0, null, 8, null);
        }
        if(fontFamily0 instanceof GenericFontFamily) {
            return new AndroidGenericFontFamilyTypeface(((GenericFontFamily)fontFamily0));
        }
        if(fontFamily0 instanceof DefaultFontFamily) {
            return new AndroidDefaultTypeface();
        }
        if(!(fontFamily0 instanceof LoadedFontFamily)) {
            throw new J();
        }
        return ((LoadedFontFamily)fontFamily0).j();
    }

    @l
    public static final androidx.compose.ui.text.font.Typeface c(@l Typeface typeface0) {
        L.p(typeface0, "typeface");
        return new AndroidTypefaceWrapper(typeface0);
    }

    public static androidx.compose.ui.text.font.Typeface d(Context context0, FontFamily fontFamily0, List list0, int v, Object object0) {
        if((v & 4) != 0) {
            list0 = null;
        }
        return AndroidTypeface_androidKt.b(context0, fontFamily0, list0);
    }
}

