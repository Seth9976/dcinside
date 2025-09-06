package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import y4.l;

@ExperimentalFoundationApi
final class DummyHandle implements PrefetchHandle {
    @l
    public static final DummyHandle a;

    static {
        DummyHandle.a = new DummyHandle();
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState$PrefetchHandle
    public void cancel() {
    }
}

