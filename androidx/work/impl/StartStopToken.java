package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import kotlin.jvm.internal.L;
import y4.l;

public final class StartStopToken {
    @l
    private final WorkGenerationalId a;

    public StartStopToken(@l WorkGenerationalId workGenerationalId0) {
        L.p(workGenerationalId0, "id");
        super();
        this.a = workGenerationalId0;
    }

    @l
    public final WorkGenerationalId a() {
        return this.a;
    }
}

