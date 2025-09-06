package androidx.work.impl.model;

import kotlin.jvm.internal.L;
import y4.l;

public final class WorkSpecKt {
    private static final long a = -1L;

    @l
    public static final WorkGenerationalId a(@l WorkSpec workSpec0) {
        L.p(workSpec0, "<this>");
        return new WorkGenerationalId(workSpec0.a, workSpec0.D());
    }
}

