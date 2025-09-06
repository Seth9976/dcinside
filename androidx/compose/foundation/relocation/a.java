package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import kotlin.coroutines.d;

public final class a {
    public static Object a(BringIntoViewRequester bringIntoViewRequester0, Rect rect0, d d0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
        }
        if((v & 1) != 0) {
            rect0 = null;
        }
        return bringIntoViewRequester0.a(rect0, d0);
    }
}

