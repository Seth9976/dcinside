package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import y4.l;

public interface LazyListLayoutInfo {
    public static final class DefaultImpls {
        @Deprecated
        public static int a(@l LazyListLayoutInfo lazyListLayoutInfo0) {
            return b.g(lazyListLayoutInfo0);
        }

        @Deprecated
        public static int b(@l LazyListLayoutInfo lazyListLayoutInfo0) {
            return b.h(lazyListLayoutInfo0);
        }

        @Deprecated
        public static int c(@l LazyListLayoutInfo lazyListLayoutInfo0) {
            return b.i(lazyListLayoutInfo0);
        }

        @Deprecated
        @l
        public static Orientation d(@l LazyListLayoutInfo lazyListLayoutInfo0) {
            return b.d(lazyListLayoutInfo0);
        }

        @Deprecated
        public static boolean e(@l LazyListLayoutInfo lazyListLayoutInfo0) {
            return b.k(lazyListLayoutInfo0);
        }

        @Deprecated
        public static long f(@l LazyListLayoutInfo lazyListLayoutInfo0) {
            return b.f(lazyListLayoutInfo0);
        }
    }

    long a();

    int b();

    int c();

    int d();

    int e();

    @l
    List f();

    int g();

    @l
    Orientation getOrientation();

    int h();

    boolean i();
}

