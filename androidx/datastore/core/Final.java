package androidx.datastore.core;

import kotlin.jvm.internal.L;
import y4.l;

final class Final extends State {
    @l
    private final Throwable a;

    public Final(@l Throwable throwable0) {
        L.p(throwable0, "finalException");
        super(null);
        this.a = throwable0;
    }

    @l
    public final Throwable a() {
        return this.a;
    }
}

