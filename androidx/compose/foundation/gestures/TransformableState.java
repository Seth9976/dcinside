package androidx.compose.foundation.gestures;

import A3.o;
import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.d;
import y4.l;
import y4.m;

public interface TransformableState {
    public static final class DefaultImpls {
        public static Object a(TransformableState transformableState0, MutatePriority mutatePriority0, o o0, d d0, int v, Object object0) {
            return e.a(transformableState0, mutatePriority0, o0, d0, v, object0);
        }
    }

    @m
    Object a(@l MutatePriority arg1, @l o arg2, @l d arg3);

    boolean b();
}

