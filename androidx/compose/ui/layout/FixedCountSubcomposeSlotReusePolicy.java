package androidx.compose.ui.layout;

import java.util.Iterator;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class FixedCountSubcomposeSlotReusePolicy implements SubcomposeSlotReusePolicy {
    private final int a;

    public FixedCountSubcomposeSlotReusePolicy(int v) {
        this.a = v;
    }

    @Override  // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public void a(@l SlotIdsSet subcomposeSlotReusePolicy$SlotIdsSet0) {
        L.p(subcomposeSlotReusePolicy$SlotIdsSet0, "slotIds");
        if(subcomposeSlotReusePolicy$SlotIdsSet0.size() > this.a) {
            int v = 0;
            Iterator iterator0 = subcomposeSlotReusePolicy$SlotIdsSet0.iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
                ++v;
                if(v > this.a) {
                    iterator0.remove();
                }
            }
        }
    }

    @Override  // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public boolean b(@m Object object0, @m Object object1) {
        return true;
    }
}

