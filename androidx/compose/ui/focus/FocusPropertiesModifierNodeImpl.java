package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier.Node;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

final class FocusPropertiesModifierNodeImpl extends Node implements FocusPropertiesModifierNode {
    @l
    private Function1 l;

    public FocusPropertiesModifierNodeImpl(@l Function1 function10) {
        L.p(function10, "focusPropertiesScope");
        super();
        this.l = function10;
    }

    @l
    public final Function1 i0() {
        return this.l;
    }

    public final void j0(@l Function1 function10) {
        L.p(function10, "<set-?>");
        this.l = function10;
    }

    @Override  // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void l(@l FocusProperties focusProperties0) {
        L.p(focusProperties0, "focusProperties");
        this.l.invoke(focusProperties0);
    }
}

