package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(29)
final class CanvasZHelper {
    @l
    public static final CanvasZHelper a;

    static {
        CanvasZHelper.a = new CanvasZHelper();
    }

    @DoNotInline
    public final void a(@l Canvas canvas0, boolean z) {
        L.p(canvas0, "canvas");
        if(z) {
            canvas0.enableZ();
            return;
        }
        canvas0.disableZ();
    }
}

