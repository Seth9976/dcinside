package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier.Node;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nFocusRequesterModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterElement\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,84:1\n735#2,2:85\n728#2,2:87\n*S KotlinDebug\n*F\n+ 1 FocusRequesterModifier.kt\nandroidx/compose/ui/focus/FocusRequesterElement\n*L\n59#1:85,2\n61#1:87,2\n*E\n"})
final class FocusRequesterElement extends ModifierNodeElement {
    @l
    private final FocusRequester c;

    public FocusRequesterElement(@l FocusRequester focusRequester0) {
        L.p(focusRequester0, "focusRequester");
        super();
        this.c = focusRequester0;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node a() {
        return this.s();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof FocusRequesterElement ? L.g(this.c, ((FocusRequesterElement)object0).c) : false;
    }

    @l
    public final FocusRequester g0() {
        return this.c;
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.c.hashCode();
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public void m(@l InspectorInfo inspectorInfo0) {
        L.p(inspectorInfo0, "<this>");
        inspectorInfo0.d("focusRequester");
        inspectorInfo0.b().c("focusRequester", this.c);
    }

    @Override  // androidx.compose.ui.node.ModifierNodeElement
    public Node n(Node modifier$Node0) {
        return this.t(((FocusRequesterModifierNodeImpl)modifier$Node0));
    }

    @l
    public final FocusRequester p() {
        return this.c;
    }

    @l
    public final FocusRequesterElement q(@l FocusRequester focusRequester0) {
        L.p(focusRequester0, "focusRequester");
        return new FocusRequesterElement(focusRequester0);
    }

    public static FocusRequesterElement r(FocusRequesterElement focusRequesterElement0, FocusRequester focusRequester0, int v, Object object0) {
        if((v & 1) != 0) {
            focusRequester0 = focusRequesterElement0.c;
        }
        return focusRequesterElement0.q(focusRequester0);
    }

    @l
    public FocusRequesterModifierNodeImpl s() {
        return new FocusRequesterModifierNodeImpl(this.c);
    }

    @l
    public FocusRequesterModifierNodeImpl t(@l FocusRequesterModifierNodeImpl focusRequesterModifierNodeImpl0) {
        L.p(focusRequesterModifierNodeImpl0, "node");
        focusRequesterModifierNodeImpl0.i0().f().a0(focusRequesterModifierNodeImpl0);
        focusRequesterModifierNodeImpl0.j0(this.c);
        focusRequesterModifierNodeImpl0.i0().f().b(focusRequesterModifierNodeImpl0);
        return focusRequesterModifierNodeImpl0;
    }

    @Override
    @l
    public String toString() {
        return "FocusRequesterElement(focusRequester=" + this.c + ')';
    }
}

