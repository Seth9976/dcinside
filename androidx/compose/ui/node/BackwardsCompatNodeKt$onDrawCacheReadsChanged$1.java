package androidx.compose.ui.node;

import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class BackwardsCompatNodeKt.onDrawCacheReadsChanged.1 extends N implements Function1 {
    public static final BackwardsCompatNodeKt.onDrawCacheReadsChanged.1 e;

    static {
        BackwardsCompatNodeKt.onDrawCacheReadsChanged.1.e = new BackwardsCompatNodeKt.onDrawCacheReadsChanged.1();
    }

    BackwardsCompatNodeKt.onDrawCacheReadsChanged.1() {
        super(1);
    }

    public final void a(@l BackwardsCompatNode backwardsCompatNode0) {
        L.p(backwardsCompatNode0, "it");
        backwardsCompatNode0.m0();
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.a(((BackwardsCompatNode)object0));
        return S0.a;
    }
}

