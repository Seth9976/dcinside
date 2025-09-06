package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;

@RequiresApi(26)
@k(message = "Only used by deprecated APIs in this file, remove with them.")
final class AndroidResourceFontLoaderHelper {
    @l
    public static final AndroidResourceFontLoaderHelper a;

    static {
        AndroidResourceFontLoaderHelper.a = new AndroidResourceFontLoaderHelper();
    }

    @DoNotInline
    @RequiresApi(26)
    @l
    public final Typeface a(@l Context context0, int v) {
        L.p(context0, "context");
        Typeface typeface0 = context0.getResources().getFont(v);
        L.o(typeface0, "context.resources.getFont(resourceId)");
        return typeface0;
    }
}

