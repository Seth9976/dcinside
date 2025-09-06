package androidx.compose.runtime;

import A3.a;
import kotlin.jvm.internal.L;
import y4.l;

@Stable
public abstract class ProvidableCompositionLocal extends CompositionLocal {
    public static final int c;

    static {
    }

    public ProvidableCompositionLocal(@l a a0) {
        L.p(a0, "defaultFactory");
        super(a0, null);
    }

    @l
    public final ProvidedValue f(Object object0) {
        return new ProvidedValue(this, object0, true);
    }

    @l
    public final ProvidedValue g(Object object0) {
        return new ProvidedValue(this, object0, false);
    }
}

