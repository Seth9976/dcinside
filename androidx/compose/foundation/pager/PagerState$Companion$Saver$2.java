package androidx.compose.foundation.pager;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class PagerState.Companion.Saver.2 extends N implements Function1 {
    public static final PagerState.Companion.Saver.2 e;

    static {
        PagerState.Companion.Saver.2.e = new PagerState.Companion.Saver.2();
    }

    PagerState.Companion.Saver.2() {
        super(1);
    }

    @m
    public final PagerState a(@l List list0) {
        L.p(list0, "it");
        Object object0 = list0.get(0);
        L.n(object0, "null cannot be cast to non-null type kotlin.Int");
        Object object1 = list0.get(1);
        L.n(object1, "null cannot be cast to non-null type kotlin.Float");
        return new PagerState(((int)(((Integer)object0))), ((float)(((Float)object1))));
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.a(((List)object0));
    }
}

