package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import A3.o;
import kotlin.jvm.internal.L;
import y4.l;

public final class ForEachOneBitKt {
    public static final void a(int v, @l o o0) {
        L.p(o0, "body");
        int v1 = 0;
        while(v != 0) {
            int v2 = Integer.lowestOneBit(v);
            o0.invoke(v2, v1);
            ++v1;
            v ^= v2;
        }
    }
}

