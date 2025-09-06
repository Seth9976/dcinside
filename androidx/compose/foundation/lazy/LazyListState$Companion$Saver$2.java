package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class LazyListState.Companion.Saver.2 extends N implements Function1 {
    public static final LazyListState.Companion.Saver.2 e;

    static {
        LazyListState.Companion.Saver.2.e = new LazyListState.Companion.Saver.2();
    }

    LazyListState.Companion.Saver.2() {
        super(1);
    }

    @m
    public final LazyListState a(@l List list0) {
        L.p(list0, "it");
        return new LazyListState(((Number)list0.get(0)).intValue(), ((Number)list0.get(1)).intValue());
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(((List)object0));
    }
}

