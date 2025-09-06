package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@ExperimentalFoundationApi
@Stable
@s0({"SMAP\nLazyLayoutPrefetchState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,61:1\n76#2:62\n102#2,2:63\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetchState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState\n*L\n32#1:62\n32#1:63,2\n*E\n"})
public final class LazyLayoutPrefetchState {
    public interface PrefetchHandle {
        void cancel();
    }

    public interface Prefetcher {
        @l
        PrefetchHandle b(int arg1, long arg2);
    }

    @l
    private final MutableState a;
    public static final int b;

    static {
    }

    public LazyLayoutPrefetchState() {
        this.a = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
    }

    @m
    public final Prefetcher a() {
        return (Prefetcher)this.a.getValue();
    }

    @l
    public final PrefetchHandle b(int v, long v1) {
        Prefetcher lazyLayoutPrefetchState$Prefetcher0 = this.a();
        if(lazyLayoutPrefetchState$Prefetcher0 != null) {
            PrefetchHandle lazyLayoutPrefetchState$PrefetchHandle0 = lazyLayoutPrefetchState$Prefetcher0.b(v, v1);
            if(lazyLayoutPrefetchState$PrefetchHandle0 != null) {
                return lazyLayoutPrefetchState$PrefetchHandle0;
            }
        }
        return DummyHandle.a;
    }

    public final void c(@m Prefetcher lazyLayoutPrefetchState$Prefetcher0) {
        this.a.setValue(lazyLayoutPrefetchState$Prefetcher0);
    }
}

