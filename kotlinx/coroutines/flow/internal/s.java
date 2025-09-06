package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import y4.l;

final class s implements d {
    @l
    public static final s a;
    @l
    private static final g b;

    static {
        s.a = new s();
        s.b = i.a;
    }

    @Override  // kotlin.coroutines.d
    @l
    public g getContext() {
        return s.b;
    }

    @Override  // kotlin.coroutines.d
    public void resumeWith(@l Object object0) {
    }
}

