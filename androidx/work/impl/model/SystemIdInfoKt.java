package androidx.work.impl.model;

import kotlin.jvm.internal.L;
import y4.l;

public final class SystemIdInfoKt {
    @l
    public static final SystemIdInfo a(@l WorkGenerationalId workGenerationalId0, int v) {
        L.p(workGenerationalId0, "generationalId");
        return new SystemIdInfo(workGenerationalId0.f(), workGenerationalId0.e(), v);
    }
}

