package androidx.compose.ui;

import kotlin.jvm.internal.L;
import y4.l;

public final class a {
    static {
    }

    @l
    public static Modifier a(Modifier modifier0, @l Modifier modifier1) {
        L.p(modifier1, "other");
        return modifier1 != Modifier.m0 ? new CombinedModifier(modifier0, modifier1) : modifier0;
    }
}

