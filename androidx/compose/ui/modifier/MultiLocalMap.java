package androidx.compose.ui.modifier;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class MultiLocalMap extends ModifierLocalMap {
    @l
    private final SnapshotStateMap b;

    public MultiLocalMap(@l V[] arr_v) {
        L.p(arr_v, "entries");
        super(null);
        SnapshotStateMap snapshotStateMap0 = SnapshotStateKt.h();
        this.b = snapshotStateMap0;
        snapshotStateMap0.putAll(Y.H0(arr_v));
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean a(@l ModifierLocal modifierLocal0) {
        L.p(modifierLocal0, "key");
        return this.b.containsKey(modifierLocal0);
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalMap
    @m
    public Object b(@l ModifierLocal modifierLocal0) {
        L.p(modifierLocal0, "key");
        Object object0 = this.b.get(modifierLocal0);
        return object0 == null ? null : object0;
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalMap
    public void c(@l ModifierLocal modifierLocal0, Object object0) {
        L.p(modifierLocal0, "key");
        this.b.put(modifierLocal0, object0);
    }
}

