package androidx.compose.runtime;

import A3.a;
import A3.o;
import A3.p;
import kotlin.K;
import kotlin.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,484:1\n1114#2,6:485\n1114#2,6:491\n1114#2,6:497\n1114#2,6:503\n1114#2,6:509\n*S KotlinDebug\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n25#1:485,6\n36#1:491,6\n49#1:497,6\n66#1:503,6\n85#1:509,6\n*E\n"})
public final class ComposablesKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void a(a a0, Function1 function10, o o0, Composer composer0, int v) {
        L.p(a0, "factory");
        L.p(function10, "update");
        L.p(o0, "content");
        composer0.V(0xDF52C09C);
        Applier applier0 = composer0.H();
        L.y(3, "E");
        if(!(applier0 instanceof Applier)) {
            ComposablesKt.n();
        }
        composer0.K();
        if(composer0.E()) {
            composer0.k(a0);
        }
        else {
            composer0.f();
        }
        function10.invoke(Updater.a(Updater.b(composer0)));
        o0.invoke(composer0, ((int)(v >> 6 & 14)));
        composer0.g();
        composer0.g0();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final void b(a a0, Function1 function10, p p0, o o0, Composer composer0, int v) {
        L.p(a0, "factory");
        L.p(function10, "update");
        L.p(p0, "skippableUpdate");
        L.p(o0, "content");
        Applier applier0 = composer0.H();
        L.y(3, "E");
        if(!(applier0 instanceof Applier)) {
            ComposablesKt.n();
        }
        composer0.K();
        if(composer0.E()) {
            composer0.k(a0);
        }
        else {
            composer0.f();
        }
        function10.invoke(Updater.a(Updater.b(composer0)));
        p0.invoke(SkippableUpdater.a(SkippableUpdater.b(composer0)), composer0, ((int)(v >> 3 & 0x70)));
        composer0.V(2058660585);
        o0.invoke(composer0, ((int)(v >> 9 & 14)));
        composer0.g0();
        composer0.g();
    }

    @Composable
    public static final void c(a a0, Function1 function10, Composer composer0, int v) {
        L.p(a0, "factory");
        L.p(function10, "update");
        composer0.V(0x7076B8D0);
        Applier applier0 = composer0.H();
        L.y(3, "E");
        if(!(applier0 instanceof Applier)) {
            ComposablesKt.n();
        }
        composer0.K();
        if(composer0.E()) {
            composer0.k(new a(a0) {
                final a e;

                {
                    this.e = a0;
                    super(0);
                }

                @Override  // A3.a
                @l
                public final Object invoke() {
                    return this.e.invoke();
                }
            });
        }
        else {
            composer0.f();
        }
        function10.invoke(Updater.a(Updater.b(composer0)));
        composer0.g();
        composer0.g0();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void d(a a0, Function1 function10, o o0, Composer composer0, int v) {
        L.p(a0, "factory");
        L.p(function10, "update");
        L.p(o0, "content");
        composer0.V(0xD6BD0031);
        Applier applier0 = composer0.H();
        L.y(3, "E");
        if(!(applier0 instanceof Applier)) {
            ComposablesKt.n();
        }
        composer0.h();
        if(composer0.E()) {
            composer0.k(a0);
        }
        else {
            composer0.f();
        }
        function10.invoke(Updater.a(Updater.b(composer0)));
        o0.invoke(composer0, ((int)(v >> 6 & 14)));
        composer0.g();
        composer0.g0();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0][0]]")
    public static final void e(a a0, Function1 function10, p p0, o o0, Composer composer0, int v) {
        L.p(a0, "factory");
        L.p(function10, "update");
        L.p(p0, "skippableUpdate");
        L.p(o0, "content");
        Applier applier0 = composer0.H();
        L.y(3, "E");
        if(!(applier0 instanceof Applier)) {
            ComposablesKt.n();
        }
        composer0.h();
        if(composer0.E()) {
            composer0.k(a0);
        }
        else {
            composer0.f();
        }
        function10.invoke(Updater.a(Updater.b(composer0)));
        p0.invoke(SkippableUpdater.a(SkippableUpdater.b(composer0)), composer0, ((int)(v >> 3 & 0x70)));
        composer0.V(2058660585);
        o0.invoke(composer0, ((int)(v >> 9 & 14)));
        composer0.g0();
        composer0.g();
    }

    @Composable
    public static final void f(a a0, Function1 function10, Composer composer0, int v) {
        L.p(a0, "factory");
        L.p(function10, "update");
        composer0.V(1405779621);
        Applier applier0 = composer0.H();
        L.y(3, "E");
        if(!(applier0 instanceof Applier)) {
            ComposablesKt.n();
        }
        composer0.h();
        if(composer0.E()) {
            composer0.k(new a(a0) {
                final a e;

                {
                    this.e = a0;
                    super(0);
                }

                @Override  // A3.a
                @l
                public final Object invoke() {
                    return this.e.invoke();
                }
            });
        }
        else {
            composer0.f();
        }
        function10.invoke(Updater.a(Updater.b(composer0)));
        composer0.g();
        composer0.g0();
    }

    @Composable
    public static final void g(@m Object object0, @l o o0, @m Composer composer0, int v) {
        L.p(o0, "content");
        composer0.V(0x1A7D48FD);
        composer0.i(0xCF, object0);
        o0.invoke(composer0, ((int)(v >> 3 & 14)));
        composer0.U();
        composer0.g0();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void h(boolean z, @l o o0, @m Composer composer0, int v) {
        L.p(o0, "content");
        composer0.i(0xCF, Boolean.valueOf(z));
        boolean z1 = composer0.v(z);
        if(z) {
            o0.invoke(composer0, ((int)(v >> 3 & 14)));
        }
        else {
            composer0.b(z1);
        }
        composer0.U();
    }

    @Composable
    @ReadOnlyComposable
    @l
    @i(name = "getCurrentComposer")
    public static final Composer i(@m Composer composer0, int v) {
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xDEF6D01C, v, -1, "androidx.compose.runtime.<get-currentComposer> (Composables.kt:183)");
        }
        throw new K("Implemented as an intrinsic");
    }

    @Composable
    @i(name = "getCurrentCompositeKeyHash")
    public static final int j(@m Composer composer0, int v) {
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x1F4264F3, v, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:224)");
        }
        int v1 = composer0.e0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return v1;
    }

    @Composable
    @l
    @i(name = "getCurrentCompositionLocalContext")
    public static final CompositionLocalContext k(@m Composer composer0, int v) {
        composer0.V(0xFD6A7EDC);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xFD6A7EDC, v, -1, "androidx.compose.runtime.<get-currentCompositionLocalContext> (Composables.kt:207)");
        }
        CompositionLocalContext compositionLocalContext0 = new CompositionLocalContext(composer0.r().e());
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return compositionLocalContext0;
    }

    public static void l() {
    }

    @Composable
    @ReadOnlyComposable
    @l
    @i(name = "getCurrentRecomposeScope")
    public static final RecomposeScope m(@m Composer composer0, int v) {
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x178A93E7, v, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:192)");
        }
        RecomposeScope recomposeScope0 = composer0.T();
        if(recomposeScope0 == null) {
            throw new IllegalStateException("no recompose scope found");
        }
        composer0.q(recomposeScope0);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return recomposeScope0;
    }

    @b0
    public static final void n() {
        throw new IllegalStateException("Invalid applier");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final Object o(@l Object[] arr_object, @l o o0, @m Composer composer0, int v) {
        L.p(arr_object, "keys");
        L.p(o0, "block");
        composer0.V(0xFF49C7C1);
        Object object0 = o0.invoke(composer0, ((int)(v >> 3 & 14)));
        composer0.g0();
        return object0;
    }

    @Composable
    public static final Object p(@l a a0, @m Composer composer0, int v) {
        L.p(a0, "calculation");
        composer0.V(0xE2A708A4);
        Object object0 = composer0.W();
        if(object0 == Composer.a.a()) {
            object0 = a0.invoke();
            composer0.O(object0);
        }
        composer0.g0();
        return object0;
    }

    @Composable
    public static final Object q(@m Object object0, @l a a0, @m Composer composer0, int v) {
        L.p(a0, "calculation");
        composer0.V(0x44FAF204);
        boolean z = composer0.t(object0);
        Object object1 = composer0.W();
        if(z || object1 == Composer.a.a()) {
            object1 = a0.invoke();
            composer0.O(object1);
        }
        composer0.g0();
        return object1;
    }

    @Composable
    public static final Object r(@m Object object0, @m Object object1, @l a a0, @m Composer composer0, int v) {
        L.p(a0, "calculation");
        composer0.V(0x1E7B2B64);
        boolean z = composer0.t(object0);
        boolean z1 = composer0.t(object1);
        Object object2 = composer0.W();
        if(z || z1 || object2 == Composer.a.a()) {
            object2 = a0.invoke();
            composer0.O(object2);
        }
        composer0.g0();
        return object2;
    }

    @Composable
    public static final Object s(@m Object object0, @m Object object1, @m Object object2, @l a a0, @m Composer composer0, int v) {
        L.p(a0, "calculation");
        composer0.V(0x607FB4C4);
        boolean z = composer0.t(object0);
        boolean z1 = composer0.t(object1);
        boolean z2 = composer0.t(object2);
        Object object3 = composer0.W();
        if((z | z1 | z2) != 0 || object3 == Composer.a.a()) {
            object3 = a0.invoke();
            composer0.O(object3);
        }
        composer0.g0();
        return object3;
    }

    @Composable
    public static final Object t(@l Object[] arr_object, @l a a0, @m Composer composer0, int v) {
        L.p(arr_object, "keys");
        L.p(a0, "calculation");
        composer0.V(0xDE219177);
        boolean z = false;
        for(int v1 = 0; v1 < arr_object.length; ++v1) {
            z |= composer0.t(arr_object[v1]);
        }
        Object object0 = composer0.W();
        if(z || object0 == Composer.a.a()) {
            object0 = a0.invoke();
            composer0.O(object0);
        }
        composer0.g0();
        return object0;
    }

    @Composable
    @l
    public static final CompositionContext u(@m Composer composer0, int v) {
        composer0.V(0xBA8383F4);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xBA8383F4, v, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:480)");
        }
        CompositionContext compositionContext0 = composer0.r();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return compositionContext0;
    }
}

