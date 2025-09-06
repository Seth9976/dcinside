package androidx.compose.runtime;

import A3.a;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class StaticProvidableCompositionLocal extends ProvidableCompositionLocal {
    public StaticProvidableCompositionLocal(@l a a0) {
        L.p(a0, "defaultFactory");
        super(a0);
    }

    @Override  // androidx.compose.runtime.CompositionLocal
    @Composable
    @l
    public State e(Object object0, @m Composer composer0, int v) {
        composer0.V(0xBD2282F9);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xBD2282F9, v, -1, "androidx.compose.runtime.StaticProvidableCompositionLocal.provided (CompositionLocal.kt:139)");
        }
        State state0 = new StaticValueHolder(object0);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return state0;
    }
}

