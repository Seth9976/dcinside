package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.jvm.internal.s0;

@s0({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalListKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,216:1\n48#2:217\n523#2:218\n523#2:219\n*S KotlinDebug\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalListKt\n*L\n192#1:217\n197#1:218\n206#1:219\n*E\n"})
public final class IntervalListKt {
    @ExperimentalFoundationApi
    private static final int b(MutableVector mutableVector0, int v) {
        int v1 = mutableVector0.J() - 1;
        int v2 = 0;
        while(v2 < v1) {
            int v3 = (v1 - v2) / 2 + v2;
            int v4 = ((Interval)mutableVector0.F()[v3]).b();
            if(v4 == v) {
                return v3;
            }
            if(v4 < v) {
                v2 = v3 + 1;
                if(v >= ((Interval)mutableVector0.F()[v2]).b()) {
                    continue;
                }
                return v3;
            }
            v1 = v3 - 1;
        }
        return v2;
    }
}

