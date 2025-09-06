package androidx.compose.foundation.lazy.staggeredgrid;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class LazyStaggeredGridState.Companion.Saver.2 extends N implements Function1 {
    public static final LazyStaggeredGridState.Companion.Saver.2 e;

    static {
        LazyStaggeredGridState.Companion.Saver.2.e = new LazyStaggeredGridState.Companion.Saver.2();
    }

    LazyStaggeredGridState.Companion.Saver.2() {
        super(1);
    }

    @m
    public final LazyStaggeredGridState a(@l List list0) {
        L.p(list0, "it");
        return new LazyStaggeredGridState(((int[])list0.get(0)), ((int[])list0.get(1)), null);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(((List)object0));
    }
}

