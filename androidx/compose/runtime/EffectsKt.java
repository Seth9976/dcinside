package androidx.compose.runtime;

import A3.a;
import A3.o;
import java.util.Arrays;
import kotlin.S0;
import kotlin.b0;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlinx.coroutines.A;
import kotlinx.coroutines.I0.b;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.M0;
import kotlinx.coroutines.O0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import y4.l;
import y4.m;

@s0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,484:1\n36#2:485\n50#2:492\n49#2:493\n67#2,3:500\n66#2:503\n83#2,3:510\n36#2:519\n50#2:526\n49#2:527\n67#2,3:534\n66#2:537\n83#2,3:544\n25#2:553\n1114#3,6:486\n1114#3,6:494\n1114#3,6:504\n1114#3,6:513\n1114#3,6:520\n1114#3,6:528\n1114#3,6:538\n1114#3,6:547\n1114#3,6:554\n*S KotlinDebug\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt\n*L\n155#1:485\n195#1:492\n195#1:493\n236#1:500,3\n236#1:503\n276#1:510,3\n337#1:519\n360#1:526\n360#1:527\n384#1:534,3\n384#1:537\n407#1:544,3\n477#1:553\n155#1:486,6\n195#1:494,6\n236#1:504,6\n276#1:513,6\n337#1:520,6\n360#1:528,6\n384#1:538,6\n407#1:547,6\n477#1:554,6\n*E\n"})
public final class EffectsKt {
    @l
    private static final DisposableEffectScope a = null;
    @l
    private static final String b = "DisposableEffect must provide one or more \'key\' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.";
    @l
    private static final String c = "LaunchedEffect must provide one or more \'key\' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    static {
        EffectsKt.a = new DisposableEffectScope();
    }

    @Composable
    public static final void a(@m Object object0, @m Object object1, @m Object object2, @l Function1 function10, @m Composer composer0, int v) {
        L.p(function10, "effect");
        composer0.V(0xB61E25A1);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xB61E25A1, v, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:229)");
        }
        composer0.V(0x607FB4C4);
        if((composer0.t(object0) | composer0.t(object1) | composer0.t(object2)) != 0 || composer0.W() == Composer.a.a()) {
            composer0.O(new DisposableEffectImpl(function10));
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
    }

    @Composable
    public static final void b(@m Object object0, @m Object object1, @l Function1 function10, @m Composer composer0, int v) {
        L.p(function10, "effect");
        composer0.V(0x552E4D01);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x552E4D01, v, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:189)");
        }
        composer0.V(0x1E7B2B64);
        if((composer0.t(object0) | composer0.t(object1)) != 0 || composer0.W() == Composer.a.a()) {
            composer0.O(new DisposableEffectImpl(function10));
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
    }

    @Composable
    public static final void c(@m Object object0, @l Function1 function10, @m Composer composer0, int v) {
        L.p(function10, "effect");
        composer0.V(0xAE392461);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xAE392461, v, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:150)");
        }
        composer0.V(0x44FAF204);
        if(composer0.t(object0) || composer0.W() == Composer.a.a()) {
            composer0.O(new DisposableEffectImpl(function10));
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
    }

    @Composable
    @k(level = kotlin.m.b, message = "DisposableEffect must provide one or more \'key\' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.")
    public static final void d(@l Function1 function10, @m Composer composer0, int v) {
        L.p(function10, "effect");
        composer0.V(-904483903);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-904483903, v, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:115)");
        }
        throw new IllegalStateException("DisposableEffect must provide one or more \'key\' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.");
    }

    @Composable
    public static final void e(@l Object[] arr_object, @l Function1 function10, @m Composer composer0, int v) {
        L.p(arr_object, "keys");
        L.p(function10, "effect");
        composer0.V(0xB20F318E);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xB20F318E, v, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:271)");
        }
        Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
        composer0.V(0xDE219177);
        boolean z = false;
        for(int v1 = 0; v1 < arr_object1.length; ++v1) {
            z |= composer0.t(arr_object1[v1]);
        }
        if(z || composer0.W() == Composer.a.a()) {
            composer0.O(new DisposableEffectImpl(function10));
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
    }

    @Composable
    @k(level = kotlin.m.b, message = "LaunchedEffect must provide one or more \'key\' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.")
    public static final void f(@l o o0, @m Composer composer0, int v) {
        L.p(o0, "block");
        Composer composer1 = composer0.G(0xCFFE54A5);
        if((v & 1) == 0 && composer1.c()) {
            composer1.m();
            ScopeUpdateScope scopeUpdateScope0 = composer1.I();
            if(scopeUpdateScope0 != null) {
                scopeUpdateScope0.a(new o(o0, v) {
                    final o e;
                    final int f;

                    {
                        this.e = o0;
                        this.f = v;
                        super(2);
                    }

                    public final void a(@m Composer composer0, int v) {
                        EffectsKt.f(this.e, composer0, (this.f | 1) & -920350135 | ((0x24924924 & (this.f | 1)) >> 1 | 306783378 & (this.f | 1)) | (306783378 & (this.f | 1)) << 1 & (0x24924924 & (this.f | 1)));
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        this.a(((Composer)object0), ((Number)object1).intValue());
                        return S0.a;
                    }
                });
            }
            return;
        }
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xCFFE54A5, v, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:313)");
        }
        throw new IllegalStateException("LaunchedEffect must provide one or more \'key\' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.");
    }

    @Composable
    public static final void g(@m Object object0, @l o o0, @m Composer composer0, int v) {
        L.p(o0, "block");
        composer0.V(0x4648F105);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x4648F105, v, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:331)");
        }
        g g0 = composer0.M();
        composer0.V(0x44FAF204);
        if(composer0.t(object0) || composer0.W() == Composer.a.a()) {
            composer0.O(new LaunchedEffectImpl(g0, o0));
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
    }

    @Composable
    public static final void h(@m Object object0, @m Object object1, @l o o0, @m Composer composer0, int v) {
        L.p(o0, "block");
        composer0.V(590241125);
        if(ComposerKt.g0()) {
            ComposerKt.w0(590241125, v, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:353)");
        }
        g g0 = composer0.M();
        composer0.V(0x1E7B2B64);
        if((composer0.t(object0) | composer0.t(object1)) != 0 || composer0.W() == Composer.a.a()) {
            composer0.O(new LaunchedEffectImpl(g0, o0));
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
    }

    @Composable
    public static final void i(@m Object object0, @m Object object1, @m Object object2, @l o o0, @m Composer composer0, int v) {
        L.p(o0, "block");
        composer0.V(-54093371);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-54093371, v, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:376)");
        }
        g g0 = composer0.M();
        composer0.V(0x607FB4C4);
        if((composer0.t(object0) | composer0.t(object1) | composer0.t(object2)) != 0 || composer0.W() == Composer.a.a()) {
            composer0.O(new LaunchedEffectImpl(g0, o0));
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
    }

    @Composable
    public static final void j(@l Object[] arr_object, @l o o0, @m Composer composer0, int v) {
        L.p(arr_object, "keys");
        L.p(o0, "block");
        composer0.V(-139560008);
        if(ComposerKt.g0()) {
            ComposerKt.w0(-139560008, v, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:401)");
        }
        g g0 = composer0.M();
        Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length);
        composer0.V(0xDE219177);
        boolean z = false;
        for(int v1 = 0; v1 < arr_object1.length; ++v1) {
            z |= composer0.t(arr_object1[v1]);
        }
        if(z || composer0.W() == Composer.a.a()) {
            composer0.O(new LaunchedEffectImpl(g0, o0));
        }
        composer0.g0();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
    }

    @Composable
    public static final void k(@l a a0, @m Composer composer0, int v) {
        L.p(a0, "effect");
        composer0.V(0xB3338EB7);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xB3338EB7, v, -1, "androidx.compose.runtime.SideEffect (Effects.kt:44)");
        }
        composer0.c0(a0);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
    }

    @b0
    @l
    public static final O m(@l g g0, @l Composer composer0) {
        L.p(g0, "coroutineContext");
        L.p(composer0, "composer");
        b i0$b0 = I0.B8;
        if(g0.get(i0$b0) != null) {
            A a0 = O0.c(null, 1, null);
            a0.f(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
            return P.a(a0);
        }
        g g1 = composer0.M();
        return P.a(g1.plus(M0.a(((I0)g1.get(i0$b0)))).plus(g0));
    }

    @Composable
    @l
    public static final O n(@m a a0, @m Composer composer0, int v, int v1) {
        composer0.V(0x2E20B340);
        if((v1 & 1) != 0) {
            a0 = androidx.compose.runtime.EffectsKt.rememberCoroutineScope.1.e;
        }
        composer0.V(0xE2A708A4);
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer0.W();
        if(compositionScopedCoroutineScopeCanceller0 == Composer.a.a()) {
            compositionScopedCoroutineScopeCanceller0 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.m(((g)a0.invoke()), composer0));
            composer0.O(compositionScopedCoroutineScopeCanceller0);
        }
        composer0.g0();
        composer0.g0();
        return compositionScopedCoroutineScopeCanceller0.b();

        @s0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,484:1\n*E\n"})
        public final class androidx.compose.runtime.EffectsKt.rememberCoroutineScope.1 extends N implements a {
            public static final androidx.compose.runtime.EffectsKt.rememberCoroutineScope.1 e;

            static {
                androidx.compose.runtime.EffectsKt.rememberCoroutineScope.1.e = new androidx.compose.runtime.EffectsKt.rememberCoroutineScope.1();
            }

            public androidx.compose.runtime.EffectsKt.rememberCoroutineScope.1() {
                super(0);
            }

            @l
            public final i b() {
                return i.a;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

    }
}

