package androidx.compose.ui.text.font;

import androidx.compose.runtime.Stable;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;

public final class FontFamilyKt {
    @Stable
    @l
    public static final FontFamily a(@l Typeface typeface0) {
        L.p(typeface0, "typeface");
        return new LoadedFontFamily(typeface0);
    }

    @Stable
    @l
    public static final FontFamily b(@l List list0) {
        L.p(list0, "fonts");
        return new FontListFontFamily(list0);
    }

    @Stable
    @l
    public static final FontFamily c(@l Font[] arr_font) {
        L.p(arr_font, "fonts");
        return new FontListFontFamily(kotlin.collections.l.t(arr_font));
    }
}

