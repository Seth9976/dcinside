package androidx.compose.foundation.pager;

import A3.o;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class PagerState.Companion.Saver.1 extends N implements o {
    public static final PagerState.Companion.Saver.1 e;

    static {
        PagerState.Companion.Saver.1.e = new PagerState.Companion.Saver.1();
    }

    PagerState.Companion.Saver.1() {
        super(2);
    }

    @l
    public final List a(@l SaverScope saverScope0, @l PagerState pagerState0) {
        L.p(saverScope0, "$this$listSaver");
        L.p(pagerState0, "it");
        return u.O(new Object[]{pagerState0.t(), pagerState0.u()});
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((SaverScope)object0), ((PagerState)object1));
    }
}

