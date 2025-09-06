package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nComposableLambdaN.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambdaN.jvm.kt\nandroidx/compose/runtime/internal/ComposableLambdaN_jvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n1#2:177\n*E\n"})
public final class ComposableLambdaN_jvmKt {
    @ComposeCompilerApi
    @l
    public static final ComposableLambdaN a(@l Composer composer0, int v, boolean z, int v1, @l Object object0) {
        ComposableLambdaN composableLambdaN0;
        L.p(composer0, "composer");
        L.p(object0, "block");
        composer0.V(v);
        Object object1 = composer0.W();
        if(object1 == Composer.a.a()) {
            composableLambdaN0 = new ComposableLambdaNImpl(v, z, v1);
            composer0.O(composableLambdaN0);
        }
        else {
            L.n(object1, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaNImpl");
            composableLambdaN0 = (ComposableLambdaNImpl)object1;
        }
        ((ComposableLambdaNImpl)composableLambdaN0).e(object0);
        composer0.g0();
        return composableLambdaN0;
    }

    @ComposeCompilerApi
    @l
    public static final ComposableLambdaN b(int v, boolean z, int v1, @l Object object0) {
        L.p(object0, "block");
        ComposableLambdaN composableLambdaN0 = new ComposableLambdaNImpl(v, z, v1);
        ((ComposableLambdaNImpl)composableLambdaN0).e(object0);
        return composableLambdaN0;
    }
}

