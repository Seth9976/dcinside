package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy.SlotIdsSet;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@ExperimentalFoundationApi
final class LazyLayoutItemReusePolicy implements SubcomposeSlotReusePolicy {
    @l
    private final LazyLayoutItemContentFactory a;
    @l
    private final Map b;

    public LazyLayoutItemReusePolicy(@l LazyLayoutItemContentFactory lazyLayoutItemContentFactory0) {
        L.p(lazyLayoutItemContentFactory0, "factory");
        super();
        this.a = lazyLayoutItemContentFactory0;
        this.b = new LinkedHashMap();
    }

    @Override  // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public void a(@l SlotIdsSet subcomposeSlotReusePolicy$SlotIdsSet0) {
        L.p(subcomposeSlotReusePolicy$SlotIdsSet0, "slotIds");
        this.b.clear();
        Iterator iterator0 = subcomposeSlotReusePolicy$SlotIdsSet0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            Object object1 = this.a.c(object0);
            Integer integer0 = (Integer)this.b.get(object1);
            int v = integer0 == null ? 0 : ((int)integer0);
            if(v == 7) {
                iterator0.remove();
            }
            else {
                this.b.put(object1, ((int)(v + 1)));
            }
        }
    }

    @Override  // androidx.compose.ui.layout.SubcomposeSlotReusePolicy
    public boolean b(@m Object object0, @m Object object1) {
        return L.g(this.a.c(object0), this.a.c(object1));
    }
}

