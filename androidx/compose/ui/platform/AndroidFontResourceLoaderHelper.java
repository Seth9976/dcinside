package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(26)
final class AndroidFontResourceLoaderHelper {
    @l
    public static final AndroidFontResourceLoaderHelper a;

    static {
        AndroidFontResourceLoaderHelper.a = new AndroidFontResourceLoaderHelper();
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

