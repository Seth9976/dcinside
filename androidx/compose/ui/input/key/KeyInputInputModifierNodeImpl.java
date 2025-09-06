package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier.Node;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@ExperimentalComposeUiApi
public final class KeyInputInputModifierNodeImpl extends Node implements KeyInputModifierNode {
    @m
    private Function1 l;
    @m
    private Function1 m;

    public KeyInputInputModifierNodeImpl(@m Function1 function10, @m Function1 function11) {
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

    @Override  // androidx.compose.ui.input.key.KeyInputModifierNode
    public boolean m(@l KeyEvent keyEvent0) {
        L.p(keyEvent0, "event");
        return this.m == null ? false : ((Boolean)this.m.invoke(androidx.compose.ui.input.key.KeyEvent.a(keyEvent0))).booleanValue();
    }

    @Override  // androidx.compose.ui.input.key.KeyInputModifierNode
    public boolean w(@l KeyEvent keyEvent0) {
        L.p(keyEvent0, "event");
        return this.l == null ? false : ((Boolean)this.l.invoke(androidx.compose.ui.input.key.KeyEvent.a(keyEvent0))).booleanValue();
    }
}

