package androidx.compose.ui.modifier;

import A3.a;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.w;
import y4.l;

@Stable
public abstract class ModifierLocal {
    @l
    private final a a;
    public static final int b;

    static {
    }

    private ModifierLocal(a a0) {
        this.a = a0;
    }

    public ModifierLocal(a a0, w w0) {
        this(a0);
    }

    @l
    public final a a() {
        return this.a;
    }
}

