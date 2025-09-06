package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.d;
import kotlin.coroutines.g;
import y4.l;

public final class c implements d {
    @l
    public static final c a;

    static {
        c.a = new c();
    }

    @Override  // kotlin.coroutines.d
    @l
    public g getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override  // kotlin.coroutines.d
    public void resumeWith(@l Object object0) {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override
    @l
    public String toString() {
        return "This continuation is already complete";
    }
}

