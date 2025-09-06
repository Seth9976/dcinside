package androidx.compose.ui.res;

import android.content.Context;
import androidx.annotation.ColorRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(23)
final class ColorResourceHelper {
    @l
    public static final ColorResourceHelper a;

    static {
        ColorResourceHelper.a = new ColorResourceHelper();
    }

    @DoNotInline
    public final long a(@l Context context0, @ColorRes int v) {
        L.p(context0, "context");
        return ColorKt.b(context0.getResources().getColor(v, context0.getTheme()));
    }
}

