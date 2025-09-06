package androidx.compose.foundation.lazy;

import A3.o;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class LazyListState.Companion.Saver.1 extends N implements o {
    public static final LazyListState.Companion.Saver.1 e;

    static {
        LazyListState.Companion.Saver.1.e = new LazyListState.Companion.Saver.1();
    }

    LazyListState.Companion.Saver.1() {
        super(2);
    }

    @l
    public final List a(@l SaverScope saverScope0, @l LazyListState lazyListState0) {
        L.p(saverScope0, "$this$listSaver");
        L.p(lazyListState0, "it");
        return u.O(new Integer[]{lazyListState0.n(), lazyListState0.o()});
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((SaverScope)object0), ((LazyListState)object1));
    }
}

