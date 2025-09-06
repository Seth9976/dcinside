package androidx.compose.foundation.gestures;

import A3.o;
import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.d;

public final class c {
    public static boolean a(ScrollableState scrollableState0) [...] // Inlined contents

    public static boolean b(ScrollableState scrollableState0) [...] // Inlined contents

    public static boolean c(ScrollableState scrollableState0) {
        return true;
    }

    public static boolean d(ScrollableState scrollableState0) {
        return true;
    }

    public static Object e(ScrollableState scrollableState0, MutatePriority mutatePriority0, o o0, d d0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
        }
        if((v & 1) != 0) {
            mutatePriority0 = MutatePriority.a;
        }
        return scrollableState0.d(mutatePriority0, o0, d0);
    }
}

