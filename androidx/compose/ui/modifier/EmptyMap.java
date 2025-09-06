package androidx.compose.ui.modifier;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class EmptyMap extends ModifierLocalMap {
    @l
    public static final EmptyMap b;

    static {
        EmptyMap.b = new EmptyMap();
    }

    private EmptyMap() {
        super(null);
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean a(@l ModifierLocal modifierLocal0) {
        L.p(modifierLocal0, "key");
        return false;
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalMap
    @m
    public Object b(@l ModifierLocal modifierLocal0) {
        L.p(modifierLocal0, "key");
        throw new IllegalStateException("");
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalMap
    public void c(ModifierLocal modifierLocal0, Object object0) {
        this.d(modifierLocal0, object0);
    }

    @l
    public Void d(@l ModifierLocal modifierLocal0, Object object0) {
        L.p(modifierLocal0, "key");
        throw new IllegalStateException("");
    }
}

