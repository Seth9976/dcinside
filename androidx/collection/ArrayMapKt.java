package androidx.collection;

import kotlin.V;
import kotlin.jvm.internal.L;
import y4.l;

public final class ArrayMapKt {
    @l
    public static final ArrayMap a() {
        return new ArrayMap();
    }

    @l
    public static final ArrayMap b(@l V[] arr_v) {
        L.p(arr_v, "pairs");
        ArrayMap arrayMap0 = new ArrayMap(arr_v.length);
        for(int v = 0; v < arr_v.length; ++v) {
            V v1 = arr_v[v];
            arrayMap0.put(v1.e(), v1.f());
        }
        return arrayMap0;
    }
}

