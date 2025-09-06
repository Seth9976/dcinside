package androidx.compose.foundation.lazy.staggeredgrid;

import A3.o;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class LazyStaggeredGridState.Companion.Saver.1 extends N implements o {
    public static final LazyStaggeredGridState.Companion.Saver.1 e;

    static {
        LazyStaggeredGridState.Companion.Saver.1.e = new LazyStaggeredGridState.Companion.Saver.1();
    }

    LazyStaggeredGridState.Companion.Saver.1() {
        super(2);
    }

    @l
    public final List a(@l SaverScope saverScope0, @l LazyStaggeredGridState lazyStaggeredGridState0) {
        L.p(saverScope0, "$this$listSaver");
        L.p(lazyStaggeredGridState0, "state");
        return u.O(new int[][]{lazyStaggeredGridState0.D().a(), lazyStaggeredGridState0.D().b()});
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        return this.a(((SaverScope)object0), ((LazyStaggeredGridState)object1));
    }
}

