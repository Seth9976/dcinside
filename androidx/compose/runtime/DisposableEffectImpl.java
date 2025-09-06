package androidx.compose.runtime;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class DisposableEffectImpl implements RememberObserver {
    @l
    private final Function1 a;
    @m
    private DisposableEffectResult b;

    public DisposableEffectImpl(@l Function1 function10) {
        L.p(function10, "effect");
        super();
        this.a = function10;
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void a() {
        DisposableEffectScope disposableEffectScope0 = EffectsKt.a;
        this.b = (DisposableEffectResult)this.a.invoke(disposableEffectScope0);
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void c() {
    }

    @Override  // androidx.compose.runtime.RememberObserver
    public void d() {
        DisposableEffectResult disposableEffectResult0 = this.b;
        if(disposableEffectResult0 != null) {
            disposableEffectResult0.dispose();
        }
        this.b = null;
    }
}

