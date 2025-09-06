package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier.Node;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

final class FocusEventModifierNodeImpl extends Node implements FocusEventModifierNode {
    @l
    private Function1 l;

    public FocusEventModifierNodeImpl(@l Function1 function10) {
        L.p(function10, "onFocusEvent");
        super();
        this.l = function10;
    }

    @Override  // androidx.compose.ui.focus.FocusEventModifierNode
    public void K(@l FocusState focusState0) {
        L.p(focusState0, "focusState");
        this.l.invoke(focusState0);
    }

    @l
    public final Function1 i0() {
        return this.l;
    }

    public final void j0(@l Function1 function10) {
        L.p(function10, "<set-?>");
        this.l = function10;
    }
}

