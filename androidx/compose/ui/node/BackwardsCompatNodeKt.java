package androidx.compose.ui.node;

import kotlin.jvm.functions.Function1;
import y4.l;

public final class BackwardsCompatNodeKt {
    @l
    private static final BackwardsCompatNodeKt.DetachedModifierLocalReadScope.1 a;
    @l
    private static final Function1 b;
    @l
    private static final Function1 c;

    static {
        BackwardsCompatNodeKt.a = new BackwardsCompatNodeKt.DetachedModifierLocalReadScope.1();
        BackwardsCompatNodeKt.b = BackwardsCompatNodeKt.onDrawCacheReadsChanged.1.e;
        BackwardsCompatNodeKt.c = BackwardsCompatNodeKt.updateModifierLocalConsumer.1.e;
    }
}

