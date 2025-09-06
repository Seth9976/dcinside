package androidx.compose.ui.input.rotary;

import androidx.compose.ui.Modifier.Node;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class RotaryInputModifierNodeImpl extends Node implements RotaryInputModifierNode {
    @m
    private Function1 l;
    @m
    private Function1 m;

    public RotaryInputModifierNodeImpl(@m Function1 function10, @m Function1 function11) {
        this.l = function10;
        this.m = function11;
    }

    @m
    public final Function1 i0() {
        return this.l;
    }

    @m
    public final Function1 j0() {
        return this.m;
    }

    public final void k0(@m Function1 function10) {
        this.l = function10;
    }

    public final void l0(@m Function1 function10) {
        this.m = function10;
    }

    @Override  // androidx.compose.ui.input.rotary.RotaryInputModifierNode
    public boolean q(@l RotaryScrollEvent rotaryScrollEvent0) {
        L.p(rotaryScrollEvent0, "event");
        return this.m == null ? false : ((Boolean)this.m.invoke(rotaryScrollEvent0)).booleanValue();
    }

    @Override  // androidx.compose.ui.input.rotary.RotaryInputModifierNode
    public boolean x(@l RotaryScrollEvent rotaryScrollEvent0) {
        L.p(rotaryScrollEvent0, "event");
        return this.l == null ? false : ((Boolean)this.l.invoke(rotaryScrollEvent0)).booleanValue();
    }
}

