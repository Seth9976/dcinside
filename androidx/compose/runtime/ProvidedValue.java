package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import y4.l;

@StabilityInferred(parameters = 1)
public final class ProvidedValue {
    @l
    private final CompositionLocal a;
    private final Object b;
    private final boolean c;
    public static final int d;

    static {
    }

    public ProvidedValue(@l CompositionLocal compositionLocal0, Object object0, boolean z) {
        L.p(compositionLocal0, "compositionLocal");
        super();
        this.a = compositionLocal0;
        this.b = object0;
        this.c = z;
    }

    public final boolean a() {
        return this.c;
    }

    @l
    public final CompositionLocal b() {
        return this.a;
    }

    public final Object c() {
        return this.b;
    }
}

