package androidx.compose.ui.layout;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class NoOpSubcomposeSlotReusePolicy implements SubcomposeSlotReusePolicy {
    @l
    public static final NoOpSubcomposeSlotReusePolicy a;

    static {
        NoOpSubcomposeSlotReusePolicy.a = new NoOpSubcomposeSlotReusePolicy();
    }

    @Override  // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public void a(@l SlotIdsSet subcomposeSlotReusePolicy$SlotIdsSet0) {
        L.p(subcomposeSlotReusePolicy$SlotIdsSet0, "slotIds");
        subcomposeSlotReusePolicy$SlotIdsSet0.clear();
    }

    @Override  // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public boolean b(@m Object object0, @m Object object1) {
        return false;
    }
}

