package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(29)
final class MotionEventHelper {
    @l
    public static final MotionEventHelper a;

    static {
        MotionEventHelper.a = new MotionEventHelper();
    }

    @DoNotInline
    public final long a(@l MotionEvent motionEvent0, int v) {
        L.p(motionEvent0, "motionEvent");
        return OffsetKt.a(motionEvent0.getRawX(v), motionEvent0.getRawY(v));
    }
}

