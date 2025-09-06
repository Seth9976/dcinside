package androidx.compose.ui.modifier;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
public abstract class ModifierLocalMap {
    public static final int a;

    static {
    }

    private ModifierLocalMap() {
    }

    public ModifierLocalMap(w w0) {
    }

    public abstract boolean a(@l ModifierLocal arg1);

    @m
    public abstract Object b(@l ModifierLocal arg1);

    public abstract void c(@l ModifierLocal arg1, Object arg2);
}

