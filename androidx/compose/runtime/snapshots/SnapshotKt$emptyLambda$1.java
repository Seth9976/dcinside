package androidx.compose.runtime.snapshots;

import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class SnapshotKt.emptyLambda.1 extends N implements Function1 {
    public static final SnapshotKt.emptyLambda.1 e;

    static {
        SnapshotKt.emptyLambda.1.e = new SnapshotKt.emptyLambda.1();
    }

    SnapshotKt.emptyLambda.1() {
        super(1);
    }

    public final void a(@l SnapshotIdSet snapshotIdSet0) {
        L.p(snapshotIdSet0, "it");
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.a(((SnapshotIdSet)object0));
        return S0.a;
    }
}

