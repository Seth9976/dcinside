package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyListHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListHeaders.kt\nandroidx/compose/foundation/lazy/LazyListHeadersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,94:1\n1#2:95\n69#3,6:96\n*S KotlinDebug\n*F\n+ 1 LazyListHeaders.kt\nandroidx/compose/foundation/lazy/LazyListHeadersKt\n*L\n57#1:96,6\n*E\n"})
public final class LazyListHeadersKt {
    @m
    public static final LazyListPositionedItem a(@l List list0, @l LazyMeasuredItemProvider lazyMeasuredItemProvider0, @l List list1, int v, int v1, int v2) {
        L.p(list0, "composedVisibleItems");
        L.p(lazyMeasuredItemProvider0, "itemProvider");
        L.p(list1, "headerIndexes");
        int v3 = ((LazyListPositionedItem)u.B2(list0)).getIndex();
        int v4 = list1.size();
        int v5 = 0;
        int v6 = -1;
        int v7;
        for(v7 = -1; v5 < v4 && ((Number)list1.get(v5)).intValue() <= v3; v7 = integer0.intValue()) {
            v6 = ((Number)list1.get(v5)).intValue();
            ++v5;
            Integer integer0 = v5 < 0 || v5 > u.J(list1) ? -1 : list1.get(v5);
        }
        int v8 = list0.size();
        int v10 = 0x80000000;
        int v11 = 0x80000000;
        int v12 = -1;
        for(int v9 = 0; v9 < v8; ++v9) {
            LazyListPositionedItem lazyListPositionedItem0 = (LazyListPositionedItem)list0.get(v9);
            if(lazyListPositionedItem0.getIndex() == v6) {
                v10 = lazyListPositionedItem0.getOffset();
                v12 = v9;
            }
            else if(lazyListPositionedItem0.getIndex() == v7) {
                v11 = lazyListPositionedItem0.getOffset();
            }
        }
        if(v6 == -1) {
            return null;
        }
        LazyMeasuredItem lazyMeasuredItem0 = lazyMeasuredItemProvider0.a(v6);
        int v13 = v10 == 0x80000000 ? -v : Math.max(-v, v10);
        if(v11 != 0x80000000) {
            v13 = Math.min(v13, v11 - lazyMeasuredItem0.d());
        }
        LazyListPositionedItem lazyListPositionedItem1 = lazyMeasuredItem0.f(v13, v1, v2);
        if(v12 != -1) {
            list0.set(v12, lazyListPositionedItem1);
            return lazyListPositionedItem1;
        }
        list0.add(0, lazyListPositionedItem1);
        return lazyListPositionedItem1;
    }
}

