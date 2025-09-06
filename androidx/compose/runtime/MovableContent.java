package androidx.compose.runtime;

import A3.p;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import y4.l;

@InternalComposeApi
@StabilityInferred(parameters = 0)
public final class MovableContent {
    @l
    private final p a;
    public static final int b;

    static {
    }

    public MovableContent(@l p p0) {
        L.p(p0, "content");
        super();
        this.a = p0;
    }

    @l
    public final p a() {
        return this.a;
    }
}

