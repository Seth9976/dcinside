package androidx.compose.foundation.pager;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Stable;
import y4.l;

@ExperimentalFoundationApi
@Stable
public interface PagerSnapDistance {
    public static final class Companion {
        static final Companion a;

        static {
            Companion.a = new Companion();
        }

        @l
        public final PagerSnapDistance a(int v) {
            if(v < 0) {
                throw new IllegalArgumentException(("pages should be greater than or equal to 0. You have used " + v + '.').toString());
            }
            return new PagerSnapDistanceMaxPages(v);
        }
    }

    @l
    public static final Companion a;

    static {
        PagerSnapDistance.a = Companion.a;
    }

    int a(int arg1, int arg2, float arg3, int arg4, int arg5);
}

