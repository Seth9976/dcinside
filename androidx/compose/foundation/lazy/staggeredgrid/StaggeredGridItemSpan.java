package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.w;
import y4.l;

@ExperimentalFoundationApi
@StabilityInferred(parameters = 0)
public final class StaggeredGridItemSpan {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final StaggeredGridItemSpan a() {
            return StaggeredGridItemSpan.d;
        }

        @l
        public final StaggeredGridItemSpan b() {
            return StaggeredGridItemSpan.e;
        }
    }

    private final int a;
    @l
    public static final Companion b;
    public static final int c;
    @l
    private static final StaggeredGridItemSpan d;
    @l
    private static final StaggeredGridItemSpan e;

    static {
        StaggeredGridItemSpan.b = new Companion(null);
        StaggeredGridItemSpan.d = new StaggeredGridItemSpan(0);
        StaggeredGridItemSpan.e = new StaggeredGridItemSpan(1);
    }

    private StaggeredGridItemSpan(int v) {
        this.a = v;
    }

    public final int c() {
        return this.a;
    }
}

