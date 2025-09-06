package androidx.compose.foundation.gestures;

import A3.o;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.a;
import androidx.compose.ui.b;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import kotlin.jvm.functions.Function1;
import y4.l;

final class ModifierLocalScrollableContainerProvider implements ModifierLocalProvider {
    @l
    public static final ModifierLocalScrollableContainerProvider a;
    @l
    private static final ProvidableModifierLocal b;
    private static final boolean c;

    static {
        ModifierLocalScrollableContainerProvider.a = new ModifierLocalScrollableContainerProvider();
        ModifierLocalScrollableContainerProvider.b = ScrollableKt.g();
        ModifierLocalScrollableContainerProvider.c = true;
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean H(Function1 function10) {
        return b.b(this, function10);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object P(Object object0, o o0) {
        return b.c(this, object0, o0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object U(Object object0, o o0) {
        return b.d(this, object0, o0);
    }

    @l
    public Boolean a() {
        return Boolean.valueOf(ModifierLocalScrollableContainerProvider.c);
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalProvider
    @l
    public ProvidableModifierLocal getKey() {
        return ModifierLocalScrollableContainerProvider.b;
    }

    @Override  // androidx.compose.ui.modifier.ModifierLocalProvider
    public Object getValue() {
        return this.a();
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier r0(Modifier modifier0) {
        return a.a(this, modifier0);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean u(Function1 function10) {
        return b.a(this, function10);
    }
}

