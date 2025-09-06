package androidx.lifecycle;

import kotlin.jvm.internal.L;
import y4.l;

public final class LifecycleOwnerKt {
    @l
    public static final LifecycleCoroutineScope a(@l LifecycleOwner lifecycleOwner0) {
        L.p(lifecycleOwner0, "<this>");
        return LifecycleKt.a(lifecycleOwner0.getLifecycle());
    }
}

