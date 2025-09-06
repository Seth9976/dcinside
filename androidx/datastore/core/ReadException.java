package androidx.datastore.core;

import kotlin.jvm.internal.L;
import y4.l;

final class ReadException extends State {
    @l
    private final Throwable a;

    public ReadException(@l Throwable throwable0) {
        L.p(throwable0, "readException");
        super(null);
        this.a = throwable0;
    }

    @l
    public final Throwable a() {
        return this.a;
    }
}

