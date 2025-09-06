package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.functions.Function1;

public final class a {
    public static void a(IntervalList intervalList0, int v, int v1, Function1 function10, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forEach");
        }
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = intervalList0.getSize() - 1;
        }
        intervalList0.a(v, v1, function10);
    }
}

