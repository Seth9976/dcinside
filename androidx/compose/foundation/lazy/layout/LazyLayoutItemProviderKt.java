package androidx.compose.foundation.lazy.layout;

import A3.q;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class LazyLayoutItemProviderKt {
    @ExperimentalFoundationApi
    @l
    public static final LazyLayoutItemProvider a(@l State state0) {
        L.p(state0, "delegate");
        return new DefaultDelegatingLazyLayoutItemProvider(state0);
    }

    @ExperimentalFoundationApi
    @l
    public static final LazyLayoutItemProvider b(@l IntervalList intervalList0, @l kotlin.ranges.l l0, @l q q0) {
        L.p(intervalList0, "intervals");
        L.p(l0, "nearestItemsRange");
        L.p(q0, "itemContent");
        return new DefaultLazyLayoutItemsProvider(q0, intervalList0, l0);
    }

    @ExperimentalFoundationApi
    public static final int c(@l LazyLayoutItemProvider lazyLayoutItemProvider0, @m Object object0, int v) {
        L.p(lazyLayoutItemProvider0, "<this>");
        if(object0 == null) {
            return v;
        }
        if(v < lazyLayoutItemProvider0.getItemCount() && L.g(object0, lazyLayoutItemProvider0.D(v))) {
            return v;
        }
        Integer integer0 = (Integer)lazyLayoutItemProvider0.G().get(object0);
        return integer0 == null ? v : ((int)integer0);
    }
}

