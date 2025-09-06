package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.BeyondBoundsState;
import androidx.compose.ui.layout.Remeasurement;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;

public final class LazyListBeyondBoundsState implements BeyondBoundsState {
    @l
    private final LazyListState a;

    public LazyListBeyondBoundsState(@l LazyListState lazyListState0) {
        L.p(lazyListState0, "state");
        super();
        this.a = lazyListState0;
    }

    @Override  // androidx.compose.foundation.lazy.layout.BeyondBoundsState
    public void a() {
        Remeasurement remeasurement0 = this.a.y();
        if(remeasurement0 != null) {
            remeasurement0.d();
        }
    }

    @Override  // androidx.compose.foundation.lazy.layout.BeyondBoundsState
    public boolean b() {
        return !this.a.r().f().isEmpty();
    }

    @Override  // androidx.compose.foundation.lazy.layout.BeyondBoundsState
    public int c() {
        return this.a.n();
    }

    @Override  // androidx.compose.foundation.lazy.layout.BeyondBoundsState
    public int d() {
        return ((LazyListItemInfo)u.p3(this.a.r().f())).getIndex();
    }

    @l
    public final LazyListState e() {
        return this.a;
    }

    @Override  // androidx.compose.foundation.lazy.layout.BeyondBoundsState
    public int getItemCount() {
        return this.a.r().c();
    }
}

