package androidx.lifecycle;

import androidx.compose.animation.core.d;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.j1;
import y4.l;

public final class LifecycleKt {
    @l
    public static final LifecycleCoroutineScope a(@l Lifecycle lifecycle0) {
        LifecycleCoroutineScope lifecycleCoroutineScope1;
        L.p(lifecycle0, "<this>");
        do {
            LifecycleCoroutineScope lifecycleCoroutineScope0 = (LifecycleCoroutineScopeImpl)lifecycle0.c().get();
            if(lifecycleCoroutineScope0 != null) {
                return lifecycleCoroutineScope0;
            }
            lifecycleCoroutineScope1 = new LifecycleCoroutineScopeImpl(lifecycle0, j1.c(null, 1, null).plus(h0.e().u1()));
        }
        while(!d.a(lifecycle0.c(), null, lifecycleCoroutineScope1));
        ((LifecycleCoroutineScopeImpl)lifecycleCoroutineScope1).f();
        return lifecycleCoroutineScope1;
    }
}

