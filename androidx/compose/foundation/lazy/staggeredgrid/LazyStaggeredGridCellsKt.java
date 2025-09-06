package androidx.compose.foundation.lazy.staggeredgrid;

import java.util.ArrayList;
import java.util.List;

public final class LazyStaggeredGridCellsKt {
    private static final List b(int v, int v1, int v2) {
        int v3 = v - v2 * (v1 - 1);
        List list0 = new ArrayList(v1);
        for(int v4 = 0; v4 < v1; ++v4) {
            ((ArrayList)list0).add(((int)((v4 >= v3 % v1 ? 0 : 1) + v3 / v1)));
        }
        return list0;
    }
}

