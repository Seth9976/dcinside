package androidx.compose.ui.focus;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier.Node;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@ExperimentalComposeUiApi
final class FocusChangedModifierNode extends Node implements FocusEventModifierNode {
    @l
    private Function1 l;
    @m
    private FocusState m;

    public FocusChangedModifierNode(@l Function1 function10) {
        L.p(function10, "onFocusChanged");
        super();
        this.l = function10;
    }

    @Override  // androidx.compose.ui.focus.FocusEventModifierNode
    public void K(@l FocusState focusState0) {
        L.p(focusState0, "focusState");
        if(!L.g(this.m, focusState0)) {
            this.m = focusState0;
            this.l.invoke(focusState0);
        }
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

