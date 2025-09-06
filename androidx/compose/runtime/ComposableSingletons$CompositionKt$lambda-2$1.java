package androidx.compose.runtime;

import A3.o;
import kotlin.S0;
import kotlin.jvm.internal.N;
import y4.m;

final class ComposableSingletons.CompositionKt.lambda-2.1 extends N implements o {
    public static final ComposableSingletons.CompositionKt.lambda-2.1 e;

    static {
        ComposableSingletons.CompositionKt.lambda-2.1.e = new ComposableSingletons.CompositionKt.lambda-2.1();
    }

    ComposableSingletons.CompositionKt.lambda-2.1() {
        super(2);
    }

    @Composable
    public final void a(@m Composer composer0, int v) {
        if((v & 11) == 2 && composer0.c()) {
            composer0.m();
            return;
        }
        if(ComposerKt.g0()) {
            ComposerKt.w0(1918065384, v, -1, "androidx.compose.runtime.ComposableSingletons$CompositionKt.lambda-2.<anonymous> (Composition.kt:596)");
        }
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        this.a(((Composer)object0), ((Number)object1).intValue());
        return S0.a;
    }
}

