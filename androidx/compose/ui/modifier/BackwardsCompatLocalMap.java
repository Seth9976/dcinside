package androidx.compose.ui.modifier;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class BackwardsCompatLocalMap extends ModifierLocalMap {
    @l
    private ModifierLocalProvider b;

    public BackwardsCompatLocalMap(@l ModifierLocalProvider modifierLocalProvider0) {
        L.p(modifierLocalProvider0, "element");
        super(null);
        this.b = modifierLocalProvider0;
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean a(@l ModifierLocal modifierLocal0) {
        L.p(modifierLocal0, "key");
        return modifierLocal0 == this.b.getKey();
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalMap
    @m
    public Object b(@l ModifierLocal modifierLocal0) {
        L.p(modifierLocal0, "key");
        if(modifierLocal0 != this.b.getKey()) {
            throw new IllegalStateException("Check failed.");
        }
        return this.b.getValue();
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalMap
    public void c(@l ModifierLocal modifierLocal0, Object object0) {
        L.p(modifierLocal0, "key");
        throw new IllegalStateException("Set is not allowed on a backwards compat provider");
    }

    @l
    public final ModifierLocalProvider d() {
        return this.b;
    }

    public final void e(@l ModifierLocalProvider modifierLocalProvider0) {
        L.p(modifierLocalProvider0, "<set-?>");
        this.b = modifierLocalProvider0;
    }
}

