package androidx.compose.runtime;

import android.util.Log;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;

public final class ActualAndroid_androidKt {
    private static final boolean a = false;
    @l
    private static final D b = null;
    @l
    private static final String c = "ComposeInternal";

    static {
        ActualAndroid_androidKt.b = E.a(ActualAndroid_androidKt.DefaultMonotonicFrameClock.2.e);
    }

    @l
    public static final SnapshotMutableState a(Object object0, @l SnapshotMutationPolicy snapshotMutationPolicy0) {
        L.p(snapshotMutationPolicy0, "policy");
        return new ParcelableSnapshotMutableState(object0, snapshotMutationPolicy0);
    }

    @l
    public static final MonotonicFrameClock b() {
        return (MonotonicFrameClock)ActualAndroid_androidKt.b.getValue();
    }

    @k(message = "MonotonicFrameClocks are not globally applicable across platforms. Use an appropriate local clock.")
    public static void c() {
    }

    public static final void d(@l String s, @l Throwable throwable0) {
        L.p(s, "message");
        L.p(throwable0, "e");
        Log.e("ComposeInternal", s, throwable0);
    }
}

