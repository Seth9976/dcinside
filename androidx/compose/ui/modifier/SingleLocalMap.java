package androidx.compose.ui.modifier;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nModifierLocalNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalNode.kt\nandroidx/compose/ui/modifier/SingleLocalMap\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,220:1\n76#2:221\n102#2,2:222\n*S KotlinDebug\n*F\n+ 1 ModifierLocalNode.kt\nandroidx/compose/ui/modifier/SingleLocalMap\n*L\n44#1:221\n44#1:222,2\n*E\n"})
public final class SingleLocalMap extends ModifierLocalMap {
    @l
    private final ModifierLocal b;
    @l
    private final MutableState c;

    public SingleLocalMap(@l ModifierLocal modifierLocal0) {
        L.p(modifierLocal0, "key");
        super(null);
        this.b = modifierLocal0;
        this.c = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean a(@l ModifierLocal modifierLocal0) {
        L.p(modifierLocal0, "key");
        return modifierLocal0 == this.b;
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalMap
    @m
    public Object b(@l ModifierLocal modifierLocal0) {
        L.p(modifierLocal0, "key");
        if(modifierLocal0 != this.b) {
            throw new IllegalStateException("Check failed.");
        }
        Object object0 = this.e();
        return object0 == null ? null : object0;
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalMap
    public void c(@l ModifierLocal modifierLocal0, Object object0) {
        L.p(modifierLocal0, "key");
        if(modifierLocal0 != this.b) {
            throw new IllegalStateException("Check failed.");
        }
        this.f(object0);
    }

    public final void d(@m Object object0) {
        this.f(object0);
    }

    private final Object e() {
        return this.c.getValue();
    }

    private final void f(Object object0) {
        this.c.setValue(object0);
    }
}

