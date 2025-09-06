package androidx.compose.ui.node;

import A3.a;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.Modifier.Node;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nObserverNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObserverNode.kt\nandroidx/compose/ui/node/ObserverNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
public final class ObserverNodeKt {
    @ExperimentalComposeUiApi
    public static final void a(@l Node modifier$Node0, @l a a0) {
        L.p(modifier$Node0, "<this>");
        L.p(a0, "block");
        ModifierNodeOwnerScope modifierNodeOwnerScope0 = modifier$Node0.N();
        if(modifierNodeOwnerScope0 == null) {
            modifierNodeOwnerScope0 = new ModifierNodeOwnerScope(((ObserverNode)modifier$Node0));
            modifier$Node0.d0(modifierNodeOwnerScope0);
        }
        DelegatableNodeKt.q(modifier$Node0).getSnapshotObserver().i(modifierNodeOwnerScope0, ModifierNodeOwnerScope.b.a(), a0);
    }
}

