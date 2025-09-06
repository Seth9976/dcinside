package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier.Node;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nFocusRequesterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterModifierNodeImpl\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,84:1\n728#2,2:85\n735#2,2:87\n*S KotlinDebug\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterModifierNodeImpl\n*L\n76#1:85,2\n80#1:87,2\n*E\n"})
final class FocusRequesterModifierNodeImpl extends Node implements FocusRequesterModifierNode {
    @l
    private FocusRequester l;

    public FocusRequesterModifierNodeImpl(@l FocusRequester focusRequester0) {
        L.p(focusRequester0, "focusRequester");
        super();
        this.l = focusRequester0;
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void S() {
        super.S();
        this.l.f().b(this);
    }

    @Override  // androidx.compose.ui.Modifier$Node
    public void T() {
        this.l.f().a0(this);
        super.T();
    }

    @l
    public final FocusRequester i0() {
        return this.l;
    }

    public final void j0(@l FocusRequester focusRequester0) {
        L.p(focusRequester0, "<set-?>");
        this.l = focusRequester0;
    }
}

