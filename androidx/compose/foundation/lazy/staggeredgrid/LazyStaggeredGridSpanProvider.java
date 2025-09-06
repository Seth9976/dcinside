package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.IntervalList.Interval;
import androidx.compose.foundation.lazy.layout.IntervalList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class LazyStaggeredGridSpanProvider {
    @l
    private final IntervalList a;

    public LazyStaggeredGridSpanProvider(@l IntervalList intervalList0) {
        L.p(intervalList0, "intervals");
        super();
        this.a = intervalList0;
    }

    @l
    public final IntervalList a() {
        return this.a;
    }

    public final boolean b(int v) {
        if(v >= 0 && v < this.a.getSize()) {
            Interval intervalList$Interval0 = this.a.get(v);
            Function1 function10 = ((LazyStaggeredGridIntervalContent)intervalList$Interval0.c()).b();
            return function10 != null && function10.invoke(((int)(v - intervalList$Interval0.b()))) == StaggeredGridItemSpan.b.a();
        }
        return false;
    }
}

