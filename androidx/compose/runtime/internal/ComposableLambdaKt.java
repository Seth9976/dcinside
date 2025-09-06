package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImpl;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nComposableLambda.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableLambda.kt\nandroidx/compose/runtime/internal/ComposableLambdaKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,353:1\n1#2:354\n*E\n"})
public final class ComposableLambdaKt {
    public static final int a = 10;
    private static final int b = 3;

    public static final int a(int v, int v1) [...] // Inlined contents

    @ComposeCompilerApi
    @l
    public static final ComposableLambda b(@l Composer composer0, int v, boolean z, @l Object object0) {
        ComposableLambda composableLambda0;
        L.p(composer0, "composer");
        L.p(object0, "block");
        composer0.V(v);
        Object object1 = composer0.W();
        if(object1 == Composer.a.a()) {
            composableLambda0 = new ComposableLambdaImpl(v, z);
            composer0.O(composableLambda0);
        }
        else {
            L.n(object1, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            composableLambda0 = (ComposableLambdaImpl)object1;
        }
        ((ComposableLambdaImpl)composableLambda0).w(object0);
        composer0.g0();
        return composableLambda0;
    }

    @ComposeCompilerApi
    @l
    public static final ComposableLambda c(int v, boolean z, @l Object object0) {
        L.p(object0, "block");
        ComposableLambda composableLambda0 = new ComposableLambdaImpl(v, z);
        ((ComposableLambdaImpl)composableLambda0).w(object0);
        return composableLambda0;
    }

    public static final int d(int v) {
        return 2 << v % 10 * 3 + 1;
    }

    // 去混淆评级： 低(25)
    public static final boolean e(@m RecomposeScope recomposeScope0, @l RecomposeScope recomposeScope1) {
        L.p(recomposeScope1, "other");
        return recomposeScope0 == null || recomposeScope0 instanceof RecomposeScopeImpl && recomposeScope1 instanceof RecomposeScopeImpl && (!((RecomposeScopeImpl)recomposeScope0).s() || L.g(recomposeScope0, recomposeScope1) || L.g(((RecomposeScopeImpl)recomposeScope0).j(), ((RecomposeScopeImpl)recomposeScope1).j()));
    }

    public static final int f(int v) {
        return 1 << v % 10 * 3 + 1;
    }
}

