package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.L;
import y4.l;

public final class LazyMeasuredItemProvider {
    @l
    private final LazyGridItemProvider a;
    @l
    private final LazyLayoutMeasureScope b;
    private final int c;
    @l
    private final MeasuredItemFactory d;

    @ExperimentalFoundationApi
    public LazyMeasuredItemProvider(@l LazyGridItemProvider lazyGridItemProvider0, @l LazyLayoutMeasureScope lazyLayoutMeasureScope0, int v, @l MeasuredItemFactory measuredItemFactory0) {
        L.p(lazyGridItemProvider0, "itemProvider");
        L.p(lazyLayoutMeasureScope0, "measureScope");
        L.p(measuredItemFactory0, "measuredItemFactory");
        super();
        this.a = lazyGridItemProvider0;
        this.b = lazyLayoutMeasureScope0;
        this.c = v;
        this.d = measuredItemFactory0;
    }

    @l
    public final LazyGridMeasuredItem a(int v, int v1, long v2) {
        int v3;
        Object object0 = this.a.D(v);
        List list0 = this.b.i0(v, v2);
        if(Constraints.n(v2)) {
            v3 = Constraints.r(v2);
            return this.d.a(v, object0, v3, v1, list0);
        }
        if(!Constraints.l(v2)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        v3 = Constraints.q(v2);
        return this.d.a(v, object0, v3, v1, list0);
    }

    public static LazyGridMeasuredItem b(LazyMeasuredItemProvider lazyMeasuredItemProvider0, int v, int v1, long v2, int v3, Object object0) {
        if((v3 & 2) != 0) {
            v1 = lazyMeasuredItemProvider0.c;
        }
        return lazyMeasuredItemProvider0.a(v, v1, v2);
    }

    @l
    public final Map c() {
        return this.a.G();
    }
}

