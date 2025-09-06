package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(26)
final class ResourceFontHelper {
    @l
    public static final ResourceFontHelper a;

    static {
        ResourceFontHelper.a = new ResourceFontHelper();
    }

    @DoNotInline
    @l
    public final Typeface a(@l Context context0, @l ResourceFont resourceFont0) {
        L.p(context0, "context");
        L.p(resourceFont0, "font");
        Typeface typeface0 = context0.getResources().getFont(resourceFont0.i());
        L.o(typeface0, "context.resources.getFont(font.resId)");
        return typeface0;
    }
}

