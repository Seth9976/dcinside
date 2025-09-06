package androidx.compose.runtime;

import kotlin.jvm.internal.L;
import y4.l;

public final class ComposeRuntimeError extends IllegalStateException {
    @l
    private final String a;

    public ComposeRuntimeError(@l String s) {
        L.p(s, "message");
        super();
        this.a = s;
    }

    @Override
    @l
    public String getMessage() {
        return this.a;
    }
}

