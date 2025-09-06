package androidx.compose.foundation.text;

import A3.o;
import A3.p;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;
import y4.m;

final class ComposableSingletons.CoreTextFieldKt.lambda-1.1 extends N implements p {
    public static final ComposableSingletons.CoreTextFieldKt.lambda-1.1 e;

    static {
        ComposableSingletons.CoreTextFieldKt.lambda-1.1.e = new ComposableSingletons.CoreTextFieldKt.lambda-1.1();
    }

    ComposableSingletons.CoreTextFieldKt.lambda-1.1() {
        super(3);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public final void a(@l o o0, @m Composer composer0, int v) {
        L.p(o0, "innerTextField");
        if((v & 14) == 0) {
            v |= (composer0.Y(o0) ? 4 : 2);
        }
        if((v & 91) == 18 && composer0.c()) {
            composer0.m();
            return;
        }
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x2803267D, v, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda-1.<anonymous> (CoreTextField.kt:197)");
        }
        o0.invoke(composer0, ((int)(v & 14)));
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
    }

    @Override  // A3.p
    public Object invoke(Object object0, Object object1, Object object2) {
        this.a(((o)object0), ((Composer)object1), ((Number)object2).intValue());
        return S0.a;
    }
}

