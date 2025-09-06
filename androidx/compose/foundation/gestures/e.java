package androidx.compose.foundation.gestures;

import A3.o;
import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.d;

public final class e {
    public static Object a(TransformableState transformableState0, MutatePriority mutatePriority0, o o0, d d0, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transform");
        }
        if((v & 1) != 0) {
            mutatePriority0 = MutatePriority.a;
        }
        return transformableState0.a(mutatePriority0, o0, d0);
    }
}

