package com.tbuonomo.viewpagerdotsindicator.compose;

import A3.a;
import A3.o;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.tooling.preview.Preview;
import kotlin.S0;
import kotlin.coroutines.i;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nDotsIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DotsIndicator.kt\ncom/tbuonomo/viewpagerdotsindicator/compose/DotsIndicatorKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,81:1\n154#2:82\n154#2:105\n154#2:123\n474#3,4:83\n478#3,2:91\n482#3:97\n25#4:87\n36#4:98\n67#4,3:106\n66#4:109\n36#4:116\n1114#5,3:88\n1117#5,3:94\n1114#5,6:99\n1114#5,6:110\n1114#5,6:117\n474#6:93\n76#7:124\n*S KotlinDebug\n*F\n+ 1 DotsIndicator.kt\ncom/tbuonomo/viewpagerdotsindicator/compose/DotsIndicatorKt\n*L\n20#1:82\n41#1:105\n76#1:123\n24#1:83,4\n24#1:91,2\n24#1:97\n24#1:87\n31#1:98\n47#1:106,3\n47#1:109\n53#1:116\n24#1:88,3\n24#1:94,3\n31#1:99,6\n47#1:110,6\n53#1:117,6\n24#1:93\n47#1:124\n*E\n"})
public final class b {
    @Composable
    public static final void a(int v, @m Modifier modifier0, float f, @l com.tbuonomo.viewpagerdotsindicator.compose.type.b b0, int v1, @l a a0, @m Function1 function10, @m Composer composer0, int v2, int v3) {
        static final class d extends N implements a {
            final State e;

            d(State state0) {
                this.e = state0;
                super(0);
            }

            @l
            public final Float b() {
                return b.d(this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class e extends N implements o {
            final int e;
            final Modifier f;
            final float g;
            final com.tbuonomo.viewpagerdotsindicator.compose.type.b h;
            final int i;
            final a j;
            final Function1 k;
            final int l;
            final int m;

            e(int v, Modifier modifier0, float f, com.tbuonomo.viewpagerdotsindicator.compose.type.b b0, int v1, a a0, Function1 function10, int v2, int v3) {
                this.e = v;
                this.f = modifier0;
                this.g = f;
                this.h = b0;
                this.i = v1;
                this.j = a0;
                this.k = function10;
                this.l = v2;
                this.m = v3;
                super(2);
            }

            public final void a(@m Composer composer0, int v) {
                b.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, composer0, (this.l | 1) & -920350135 | ((0x24924924 & (this.l | 1)) >> 1 | 306783378 & (this.l | 1)) | (306783378 & (this.l | 1)) << 1 & (0x24924924 & (this.l | 1)), this.m);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((Composer)object0), ((Number)object1).intValue());
                return S0.a;
            }
        }


        static final class f extends N implements a {
            final int e;
            final a f;
            final int g;

            f(int v, a a0, int v1) {
                this.e = v;
                this.f = a0;
                this.g = v1;
                super(0);
            }

            @l
            public final Float b() {
                float f = ((Number)this.f.invoke()).floatValue();
                return b.h(this.e, f, this.g);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

        Function1 function12;
        float f1;
        Modifier modifier1;
        Function1 function11;
        int v4;
        L.p(b0, "type");
        L.p(a0, "currentPageOffsetFraction");
        Composer composer1 = composer0.G(-1298032090);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.z(v) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.t(modifier0) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.x(f) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v4 |= (composer1.t(b0) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v2 & 0xE000) == 0) {
            v4 |= (composer1.z(v1) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v2 & 0x70000) == 0) {
            v4 |= (composer1.Y(a0) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
            function11 = function10;
        }
        else if((0x380000 & v2) == 0) {
            function11 = function10;
            v4 |= (composer1.Y(function11) ? 0x100000 : 0x80000);
        }
        else {
            function11 = function10;
        }
        if((v4 & 0x2DB6DB) != 0x92492 || !composer1.c()) {
            Modifier modifier2 = (v3 & 2) == 0 ? modifier0 : Modifier.m0;
            float f2 = (v3 & 4) == 0 ? f : 12.0f;
            if((v3 & 0x40) != 0) {
                function11 = null;
            }
            if(ComposerKt.g0()) {
                ComposerKt.w0(-1298032090, v4, -1, "com.tbuonomo.viewpagerdotsindicator.compose.DotsIndicator (DotsIndicator.kt:37)");
            }
            Object object0 = a0.invoke();
            composer1.V(0x607FB4C4);
            boolean z = composer1.t(v);
            boolean z1 = composer1.t(v1);
            boolean z2 = composer1.t(object0);
            State state0 = composer1.W();
            if((z | z1 | z2) != 0 || state0 == Composer.a.a()) {
                state0 = SnapshotStateKt.c(new f(v1, a0, v));
                composer1.O(state0);
            }
            composer1.g0();
            composer1.V(0x44FAF204);
            boolean z3 = composer1.t(state0);
            d b$d0 = composer1.W();
            if(z3 || b$d0 == Composer.a.a()) {
                b$d0 = new d(state0);
                composer1.O(b$d0);
            }
            composer1.g0();
            b0.a(b$d0, modifier2, v, f2, function11, composer1, v4 & 0x70 | v4 << 6 & 0x380 | v4 << 3 & 0x1C00 | v4 >> 6 & 0xE000 | 0x70000 & v4 << 6);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            modifier1 = modifier2;
            function12 = function11;
            f1 = f2;
        }
        else {
            composer1.m();
            modifier1 = modifier0;
            f1 = f;
            function12 = function11;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new e(v, modifier1, f1, b0, v1, a0, function12, v2, v3));
        }
    }

    @Composable
    public static final void b(int v, @m Modifier modifier0, float f, @l com.tbuonomo.viewpagerdotsindicator.compose.type.b b0, @l PagerState pagerState0, @m Composer composer0, int v1, int v2) {
        static final class com.tbuonomo.viewpagerdotsindicator.compose.b.a extends N implements a {
            final PagerState e;

            com.tbuonomo.viewpagerdotsindicator.compose.b.a(PagerState pagerState0) {
                this.e = pagerState0;
                super(0);
            }

            @l
            public final Float b() {
                return this.e.u();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class com.tbuonomo.viewpagerdotsindicator.compose.b.b extends N implements Function1 {
            final O e;
            final PagerState f;

            com.tbuonomo.viewpagerdotsindicator.compose.b.b(O o0, PagerState pagerState0) {
                this.e = o0;
                this.f = pagerState0;
                super(1);
            }

            public final void a(int v) {
                @kotlin.coroutines.jvm.internal.f(c = "com.tbuonomo.viewpagerdotsindicator.compose.DotsIndicatorKt$DotsIndicator$2$1", f = "DotsIndicator.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
                static final class com.tbuonomo.viewpagerdotsindicator.compose.b.b.a extends kotlin.coroutines.jvm.internal.o implements o {
                    int k;
                    final PagerState l;
                    final int m;

                    com.tbuonomo.viewpagerdotsindicator.compose.b.b.a(PagerState pagerState0, int v, kotlin.coroutines.d d0) {
                        this.l = pagerState0;
                        this.m = v;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.tbuonomo.viewpagerdotsindicator.compose.b.b.a(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.tbuonomo.viewpagerdotsindicator.compose.b.b.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = kotlin.coroutines.intrinsics.b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                this.k = 1;
                                return PagerState.o(this.l, this.m, 0.0f, null, this, 6, null) == object1 ? object1 : S0.a;
                            }
                            case 1: {
                                f0.n(object0);
                                return S0.a;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                }

                com.tbuonomo.viewpagerdotsindicator.compose.b.b.a b$b$a0 = new com.tbuonomo.viewpagerdotsindicator.compose.b.b.a(this.f, v, null);
                k.f(this.e, null, null, b$b$a0, 3, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Number)object0).intValue());
                return S0.a;
            }
        }


        static final class c extends N implements o {
            final int e;
            final Modifier f;
            final float g;
            final com.tbuonomo.viewpagerdotsindicator.compose.type.b h;
            final PagerState i;
            final int j;
            final int k;

            c(int v, Modifier modifier0, float f, com.tbuonomo.viewpagerdotsindicator.compose.type.b b0, PagerState pagerState0, int v1, int v2) {
                this.e = v;
                this.f = modifier0;
                this.g = f;
                this.h = b0;
                this.i = pagerState0;
                this.j = v1;
                this.k = v2;
                super(2);
            }

            public final void a(@m Composer composer0, int v) {
                b.b(this.e, this.f, this.g, this.h, this.i, composer0, (this.j | 1) & -920350135 | ((0x24924924 & (this.j | 1)) >> 1 | 306783378 & (this.j | 1)) | (306783378 & (this.j | 1)) << 1 & (0x24924924 & (this.j | 1)), this.k);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((Composer)object0), ((Number)object1).intValue());
                return S0.a;
            }
        }

        float f1;
        Modifier modifier1;
        int v3;
        L.p(b0, "type");
        L.p(pagerState0, "pagerState");
        Composer composer1 = composer0.G(2032190952);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.z(v) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v3 |= (composer1.t(modifier0) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v3 |= (composer1.x(f) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v3 |= (composer1.t(b0) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((0xE000 & v1) == 0) {
            v3 |= (composer1.t(pagerState0) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v3) != 9362 || !composer1.c()) {
            Modifier modifier2 = (v2 & 2) == 0 ? modifier0 : Modifier.m0;
            float f2 = (v2 & 4) == 0 ? f : 12.0f;
            if(ComposerKt.g0()) {
                ComposerKt.w0(2032190952, v3, -1, "com.tbuonomo.viewpagerdotsindicator.compose.DotsIndicator (DotsIndicator.kt:16)");
            }
            composer1.V(0x2E20B340);
            composer1.V(0xE2A708A4);
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.W();
            Companion composer$Companion0 = Composer.a;
            if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.a()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.m(i.a, composer1));
                composer1.O(compositionScopedCoroutineScopeCanceller1);
                compositionScopedCoroutineScopeCanceller0 = compositionScopedCoroutineScopeCanceller1;
            }
            composer1.g0();
            O o0 = compositionScopedCoroutineScopeCanceller0.b();
            composer1.g0();
            int v4 = pagerState0.t();
            composer1.V(0x44FAF204);
            boolean z = composer1.t(pagerState0);
            com.tbuonomo.viewpagerdotsindicator.compose.b.a b$a0 = composer1.W();
            if(z || b$a0 == composer$Companion0.a()) {
                b$a0 = new com.tbuonomo.viewpagerdotsindicator.compose.b.a(pagerState0);
                composer1.O(b$a0);
            }
            composer1.g0();
            b.a(v, modifier2, f2, b0, v4, b$a0, new com.tbuonomo.viewpagerdotsindicator.compose.b.b(o0, pagerState0), composer1, v3 & 0x1FFE, 0);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            modifier1 = modifier2;
            f1 = f2;
        }
        else {
            composer1.m();
            modifier1 = modifier0;
            f1 = f;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new c(v, modifier1, f1, b0, pagerState0, v1, v2));
        }
    }

    @Composable
    @Preview
    private static final void c(Composer composer0, int v) {
        static final class g extends N implements a {
            public static final g e;

            static {
                g.e = new g();
            }

            g() {
                super(0);
            }

            @l
            public final Float b() {
                return 2.0f;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }


        static final class h extends N implements o {
            final int e;

            h(int v) {
                this.e = v;
                super(2);
            }

            public final void a(@m Composer composer0, int v) {
                b.c(composer0, (this.e | 1) & -920350135 | ((0x24924924 & (this.e | 1)) >> 1 | 306783378 & (this.e | 1)) | (306783378 & (this.e | 1)) << 1 & (0x24924924 & (this.e | 1)));
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((Composer)object0), ((Number)object1).intValue());
                return S0.a;
            }
        }

        Composer composer1 = composer0.G(0x7EDF0F5B);
        if(v != 0 || !composer1.c()) {
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x7EDF0F5B, v, -1, "com.tbuonomo.viewpagerdotsindicator.compose.DotsIndicatorPreview (DotsIndicator.kt:72)");
            }
            b.a(10, null, 8.0f, new com.tbuonomo.viewpagerdotsindicator.compose.type.a(null, 0.0f, 3, null), 0, g.e, null, composer1, 0x36186, 66);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        else {
            composer1.m();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new h(v));
        }
    }

    private static final float d(State state0) {
        return ((Number)state0.getValue()).floatValue();
    }

    private static final float h(int v, float f, int v1) {
        float f1 = ((float)v) + f == ((float)(v1 - 1)) ? ((float)(v1 - 1)) - 0.0001f : ((float)v) + f;
        return ((float)(((int)f1) + 1)) > ((float)(v1 - 1)) || ((int)f1) < 0 ? 0.0f : ((float)(((int)f1))) + f1 % 1.0f;
    }
}

