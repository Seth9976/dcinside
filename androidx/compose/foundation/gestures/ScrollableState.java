package androidx.compose.foundation.gestures;

import A3.o;
import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.d;
import y4.l;
import y4.m;

public interface ScrollableState {
    public static final class DefaultImpls {
        @Deprecated
        public static boolean a(@l ScrollableState scrollableState0) {
            return c.c(scrollableState0);
        }

        @Deprecated
        public static boolean b(@l ScrollableState scrollableState0) {
            return c.d(scrollableState0);
        }

        public static Object c(ScrollableState scrollableState0, MutatePriority mutatePriority0, o o0, d d0, int v, Object object0) {
            return c.e(scrollableState0, mutatePriority0, o0, d0, v, object0);
        }
    }

    boolean a();

    float b(float arg1);

    boolean c();

    @m
    Object d(@l MutatePriority arg1, @l o arg2, @l d arg3);

    boolean e();
}

