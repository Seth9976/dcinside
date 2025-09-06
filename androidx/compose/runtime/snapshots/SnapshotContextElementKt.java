package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.ExperimentalComposeApi;
import kotlin.jvm.internal.L;
import y4.l;

public final class SnapshotContextElementKt {
    @ExperimentalComposeApi
    @l
    public static final SnapshotContextElement a(@l Snapshot snapshot0) {
        L.p(snapshot0, "<this>");
        return new SnapshotContextElementImpl(snapshot0);
    }
}

