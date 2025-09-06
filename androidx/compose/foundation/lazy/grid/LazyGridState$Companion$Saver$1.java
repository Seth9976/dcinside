package androidx.compose.foundation.lazy.grid;

import A3.o;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class LazyGridState.Companion.Saver.1 extends N implements o {
    public static final LazyGridState.Companion.Saver.1 e;

    static {
        LazyGridState.Companion.Saver.1.e = new LazyGridState.Companion.Saver.1();
    }

    LazyGridState.Companion.Saver.1() {
        super(2);
    }

    @l
    public final List a(@l SaverScope saverScope0, @l LazyGridState lazyGridState0) {
        L.p(saverScope0, "$this$listSaver");
        L.p(lazyGridState0, "it");
        return u.O(new Integer[]{lazyGridState0.n(), lazyGridState0.o()});
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((SaverScope)object0), ((LazyGridState)object1));
    }
}

