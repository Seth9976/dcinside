package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(28)
public final class TypefaceHelperMethodsApi28 {
    @l
    public static final TypefaceHelperMethodsApi28 a;

    static {
        TypefaceHelperMethodsApi28.a = new TypefaceHelperMethodsApi28();
    }

    @DoNotInline
    @RequiresApi(28)
    @l
    public final Typeface a(@l Typeface typeface0, int v, boolean z) {
        L.p(typeface0, "typeface");
        Typeface typeface1 = Typeface.create(typeface0, v, z);
        L.o(typeface1, "create(typeface, finalFontWeight, finalFontStyle)");
        return typeface1;
    }
}

