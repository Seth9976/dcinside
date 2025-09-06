package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.semantics.CollectionInfo;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class LazyLayoutSemanticStateKt {
    @l
    public static final LazyLayoutSemanticState a(@l LazyListState lazyListState0, boolean z) {
        L.p(lazyListState0, "state");
        return new LazyLayoutSemanticState() {
            @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public boolean a() {
                return lazyListState0.a();
            }

            @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            @m
            public Object b(int v, @l d d0) {
                Object object0 = LazyListState.E(lazyListState0, v, 0, d0, 2, null);
                return object0 == b.l() ? object0 : S0.a;
            }

            @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            @m
            public Object c(float f, @l d d0) {
                Object object0 = ScrollExtensionsKt.b(lazyListState0, f, null, d0, 2, null);
                return object0 == b.l() ? object0 : S0.a;
            }

            // 去混淆评级： 低(20)
            @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            @l
            public CollectionInfo d() {
                return z ? new CollectionInfo(-1, 1) : new CollectionInfo(1, -1);
            }

            @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState
            public float getCurrentPosition() {
                return ((float)lazyListState0.n()) + ((float)lazyListState0.o()) / 100000.0f;
            }
        };
    }
}

