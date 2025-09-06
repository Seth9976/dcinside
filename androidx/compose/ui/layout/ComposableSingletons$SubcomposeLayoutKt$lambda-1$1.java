package androidx.compose.ui.layout;

import A3.o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.S0;
import kotlin.jvm.internal.N;
import y4.m;

final class ComposableSingletons.SubcomposeLayoutKt.lambda-1.1 extends N implements o {
    public static final ComposableSingletons.SubcomposeLayoutKt.lambda-1.1 e;

    static {
        ComposableSingletons.SubcomposeLayoutKt.lambda-1.1.e = new ComposableSingletons.SubcomposeLayoutKt.lambda-1.1();
    }

    ComposableSingletons.SubcomposeLayoutKt.lambda-1.1() {
        super(2);
    }

    @Composable
    public final void a(@m Composer composer0, int v) {
        if((v & 11) == 2 && composer0.c()) {
            composer0.m();
            return;
        }
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x983222DA, v, -1, "androidx.compose.ui.layout.ComposableSingletons$SubcomposeLayoutKt.lambda-1.<anonymous> (SubcomposeLayout.kt:424)");
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

