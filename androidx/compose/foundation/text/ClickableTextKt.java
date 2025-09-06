package androidx.compose.foundation.text;

import A3.o;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nClickableText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClickableText.kt\nandroidx/compose/foundation/text/ClickableTextKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,192:1\n25#2:193\n50#2:200\n49#2:201\n50#2:208\n49#2:209\n25#2:216\n25#2:227\n50#2:238\n49#2:239\n1114#3,6:194\n1114#3,6:202\n1114#3,6:210\n1114#3,6:217\n1114#3,3:228\n1117#3,3:234\n1114#3,6:240\n474#4,4:223\n478#4,2:231\n482#4:237\n474#5:233\n1#6:246\n*S KotlinDebug\n*F\n+ 1 ClickableText.kt\nandroidx/compose/foundation/text/ClickableTextKt\n*L\n80#1:193\n81#1:200\n81#1:201\n96#1:208\n96#1:209\n154#1:216\n155#1:227\n184#1:238\n184#1:239\n80#1:194,6\n81#1:202,6\n96#1:210,6\n154#1:217,6\n155#1:228,3\n155#1:234,3\n184#1:240,6\n155#1:223,4\n155#1:231,2\n155#1:237\n155#1:233\n*E\n"})
public final class ClickableTextKt {
    @ExperimentalFoundationApi
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void a(@l AnnotatedString annotatedString0, @l Function1 function10, @m Modifier modifier0, @m TextStyle textStyle0, boolean z, int v, int v1, @m Function1 function11, @l Function1 function12, @m Composer composer0, int v2, int v3) {
        Function1 function13;
        boolean z1;
        int v6;
        TextStyle textStyle1;
        int v5;
        Modifier modifier1;
        int v4;
        L.p(annotatedString0, "text");
        L.p(function10, "onHover");
        L.p(function12, "onClick");
        Composer composer1 = composer0.G(1020774372);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.t(annotatedString0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v2 & 0x70) == 0) {
            v4 |= (composer1.Y(function10) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.t(modifier0) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v4 |= (composer1.t(textStyle0) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((v2 & 0xE000) == 0) {
            v4 |= (composer1.v(z) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v2 & 0x70000) == 0) {
            v4 |= (composer1.z(v) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x380000) == 0) {
            v4 |= (composer1.z(v1) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v2 & 0x1C00000) == 0) {
            v4 |= (composer1.Y(function11) ? 0x800000 : 0x400000);
        }
        if((v3 & 0x100) != 0) {
            v4 |= 0x6000000;
        }
        else if((0xE000000 & v2) == 0) {
            v4 |= (composer1.Y(function12) ? 0x4000000 : 0x2000000);
        }
        if((0xB6DB6DB & v4) != 0x2492492 || !composer1.c()) {
            Modifier modifier2 = (v3 & 4) == 0 ? modifier0 : Modifier.m0;
            TextStyle textStyle2 = (v3 & 8) == 0 ? textStyle0 : TextStyle.d.a();
            boolean z2 = (v3 & 16) == 0 ? z : true;
            int v7 = (v3 & 0x20) == 0 ? v : 1;
            int v8 = (v3 & 0x40) == 0 ? v1 : 0x7FFFFFFF;
            Function1 function14 = (v3 & 0x80) == 0 ? function11 : androidx.compose.foundation.text.ClickableTextKt.ClickableText.4.e;
            if(ComposerKt.g0()) {
                ComposerKt.w0(1020774372, v4, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:142)");
            }
            composer1.V(0xE2A708A4);
            MutableState mutableState0 = composer1.W();
            Companion composer$Companion0 = Composer.a;
            if(mutableState0 == composer$Companion0.a()) {
                mutableState0 = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
                composer1.O(mutableState0);
            }
            composer1.g0();
            composer1.V(0x2E20B340);
            composer1.V(0xE2A708A4);
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.W();
            if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.a()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.m(i.a, composer1));
                composer1.O(compositionScopedCoroutineScopeCanceller1);
                compositionScopedCoroutineScopeCanceller0 = compositionScopedCoroutineScopeCanceller1;
            }
            composer1.g0();
            composer1.g0();
            androidx.compose.foundation.text.ClickableTextKt.ClickableText.pointerInputModifier.1 clickableTextKt$ClickableText$pointerInputModifier$10 = new o(compositionScopedCoroutineScopeCanceller0.b(), function10, mutableState0, function12, null) {
                int k;
                private Object l;
                final O m;
                final Function1 n;
                final MutableState o;
                final Function1 p;

                {
                    this.m = o0;
                    this.n = function10;
                    this.o = mutableState0;
                    this.p = function11;
                    super(2, d0);
                }

                @m
                public final Object a(@l PointerInputScope pointerInputScope0, @m d d0) {
                    return ((androidx.compose.foundation.text.ClickableTextKt.ClickableText.pointerInputModifier.1)this.create(pointerInputScope0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    d d1 = new androidx.compose.foundation.text.ClickableTextKt.ClickableText.pointerInputModifier.1(this.m, this.n, this.o, this.p, d0);
                    d1.l = object0;
                    return d1;
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.a(((PointerInputScope)object0), ((d)object1));
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object1 = b.l();
                    switch(this.k) {
                        case 0: {
                            f0.n(object0);
                            PointerInputScope pointerInputScope0 = (PointerInputScope)this.l;
                            androidx.compose.foundation.text.ClickableTextKt.ClickableText.pointerInputModifier.1.1 clickableTextKt$ClickableText$pointerInputModifier$1$10 = new o(this.n, this.o, null) {
                                int k;
                                final PointerInputScope l;
                                final Function1 m;
                                final MutableState n;

                                {
                                    this.l = pointerInputScope0;
                                    this.m = function10;
                                    this.n = mutableState0;
                                    super(2, d0);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @l
                                public final d create(@m Object object0, @l d d0) {
                                    return new androidx.compose.foundation.text.ClickableTextKt.ClickableText.pointerInputModifier.1.1(this.l, this.m, this.n, d0);
                                }

                                @Override  // A3.o
                                public Object invoke(Object object0, Object object1) {
                                    return this.invoke(((O)object0), ((d)object1));
                                }

                                @m
                                public final Object invoke(@l O o0, @m d d0) {
                                    return ((androidx.compose.foundation.text.ClickableTextKt.ClickableText.pointerInputModifier.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @m
                                public final Object invokeSuspend(@l Object object0) {
                                    Object object1 = b.l();
                                    switch(this.k) {
                                        case 0: {
                                            f0.n(object0);
                                            androidx.compose.foundation.text.ClickableTextKt.ClickableText.pointerInputModifier.1.1.1 clickableTextKt$ClickableText$pointerInputModifier$1$1$10 = new Function1(this.m, this.n) {
                                                final h e;
                                                final Function1 f;
                                                final MutableState g;

                                                {
                                                    this.e = l0$h0;
                                                    this.f = function10;
                                                    this.g = mutableState0;
                                                    super(1);
                                                }

                                                public final void a(long v) {
                                                    Integer integer0 = ClickableTextKt.c(this.g, v);
                                                    if(!L.g(this.e.a, integer0)) {
                                                        this.e.a = integer0;
                                                        this.f.invoke(integer0);
                                                    }
                                                }

                                                @Override  // kotlin.jvm.functions.Function1
                                                public Object invoke(Object object0) {
                                                    this.a(((Offset)object0).A());
                                                    return S0.a;
                                                }
                                            };
                                            this.k = 1;
                                            return PointerMoveDetectorKt.a(this.l, PointerEventPass.b, clickableTextKt$ClickableText$pointerInputModifier$1$1$10, this) == object1 ? object1 : S0.a;
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
                            };
                            k.f(this.m, null, null, clickableTextKt$ClickableText$pointerInputModifier$1$10, 3, null);
                            androidx.compose.foundation.text.ClickableTextKt.ClickableText.pointerInputModifier.1.2 clickableTextKt$ClickableText$pointerInputModifier$1$20 = new Function1(this.o) {
                                final Function1 e;
                                final MutableState f;

                                {
                                    this.e = function10;
                                    this.f = mutableState0;
                                    super(1);
                                }

                                public final void a(long v) {
                                    Integer integer0 = ClickableTextKt.c(this.f, v);
                                    if(integer0 != null) {
                                        this.e.invoke(integer0);
                                    }
                                }

                                @Override  // kotlin.jvm.functions.Function1
                                public Object invoke(Object object0) {
                                    this.a(((Offset)object0).A());
                                    return S0.a;
                                }
                            };
                            this.k = 1;
                            return TapGestureDetectorKt.m(pointerInputScope0, null, null, null, clickableTextKt$ClickableText$pointerInputModifier$1$20, this, 7, null) == object1 ? object1 : S0.a;
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
            };
            Modifier modifier3 = modifier2.r0(SuspendingPointerInputFilterKt.d(Modifier.m0, function12, function10, clickableTextKt$ClickableText$pointerInputModifier$10));
            composer1.V(0x1E7B2B64);
            boolean z3 = composer1.t(mutableState0);
            boolean z4 = composer1.t(function14);
            androidx.compose.foundation.text.ClickableTextKt.ClickableText.5.1 clickableTextKt$ClickableText$5$10 = composer1.W();
            if(z3 || z4 || clickableTextKt$ClickableText$5$10 == composer$Companion0.a()) {
                clickableTextKt$ClickableText$5$10 = new Function1(mutableState0, function14) {
                    final MutableState e;
                    final Function1 f;

                    {
                        this.e = mutableState0;
                        this.f = function10;
                        super(1);
                    }

                    public final void a(@l TextLayoutResult textLayoutResult0) {
                        L.p(textLayoutResult0, "it");
                        this.e.setValue(textLayoutResult0);
                        this.f.invoke(textLayoutResult0);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((TextLayoutResult)object0));
                        return S0.a;
                    }
                };
                composer1.O(clickableTextKt$ClickableText$5$10);
            }
            composer1.g0();
            BasicTextKt.d(annotatedString0, modifier3, textStyle2, clickableTextKt$ClickableText$5$10, v7, z2, v8, 0, null, composer1, v4 & 14 | v4 >> 3 & 0x380 | v4 >> 3 & 0xE000 | v4 << 3 & 0x70000 | v4 & 0x380000, 0x180);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            v6 = v7;
            v5 = v8;
            modifier1 = modifier2;
            function13 = function14;
            textStyle1 = textStyle2;
            z1 = z2;
        }
        else {
            composer1.m();
            modifier1 = modifier0;
            v5 = v1;
            textStyle1 = textStyle0;
            v6 = v;
            z1 = z;
            function13 = function11;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(annotatedString0, function10, modifier1, textStyle1, z1, v6, v5, function13, function12, v2, v3) {
                final AnnotatedString e;
                final Function1 f;
                final Modifier g;
                final TextStyle h;
                final boolean i;
                final int j;
                final int k;
                final Function1 l;
                final Function1 m;
                final int n;
                final int o;

                {
                    this.e = annotatedString0;
                    this.f = function10;
                    this.g = modifier0;
                    this.h = textStyle0;
                    this.i = z;
                    this.j = v;
                    this.k = v1;
                    this.l = function11;
                    this.m = function12;
                    this.n = v2;
                    this.o = v3;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    ClickableTextKt.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, composer0, (this.n | 1) & -920350135 | ((0x24924924 & (this.n | 1)) >> 1 | 306783378 & (this.n | 1)) | (306783378 & (this.n | 1)) << 1 & (0x24924924 & (this.n | 1)), this.o);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.foundation.text.ClickableTextKt.ClickableText.4 extends N implements Function1 {
            public static final androidx.compose.foundation.text.ClickableTextKt.ClickableText.4 e;

            static {
                androidx.compose.foundation.text.ClickableTextKt.ClickableText.4.e = new androidx.compose.foundation.text.ClickableTextKt.ClickableText.4();
            }

            androidx.compose.foundation.text.ClickableTextKt.ClickableText.4() {
                super(1);
            }

            public final void a(@l TextLayoutResult textLayoutResult0) {
                L.p(textLayoutResult0, "it");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((TextLayoutResult)object0));
                return S0.a;
            }
        }

    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void b(@l AnnotatedString annotatedString0, @m Modifier modifier0, @m TextStyle textStyle0, boolean z, int v, int v1, @m Function1 function10, @l Function1 function11, @m Composer composer0, int v2, int v3) {
        int v6;
        int v5;
        boolean z1;
        TextStyle textStyle1;
        Modifier modifier2;
        Function1 function12;
        Modifier modifier1;
        int v4;
        L.p(annotatedString0, "text");
        L.p(function11, "onClick");
        Composer composer1 = composer0.G(0xF14D09D7);
        if((v3 & 1) == 0) {
            v4 = (v2 & 14) == 0 ? (composer1.t(annotatedString0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
            modifier1 = modifier0;
        }
        else if((v2 & 0x70) == 0) {
            modifier1 = modifier0;
            v4 |= (composer1.t(modifier1) ? 0x20 : 16);
        }
        else {
            modifier1 = modifier0;
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v2 & 0x380) == 0) {
            v4 |= (composer1.t(textStyle0) ? 0x100 : 0x80);
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
        }
        else if((v2 & 0x1C00) == 0) {
            v4 |= (composer1.v(z) ? 0x800 : 0x400);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
        }
        else if((0xE000 & v2) == 0) {
            v4 |= (composer1.z(v) ? 0x4000 : 0x2000);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v2 & 0x70000) == 0) {
            v4 |= (composer1.z(v1) ? 0x20000 : 0x10000);
        }
        if((v3 & 0x40) != 0) {
            v4 |= 0x180000;
        }
        else if((v2 & 0x380000) == 0) {
            v4 |= (composer1.Y(function10) ? 0x100000 : 0x80000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((0x1C00000 & v2) == 0) {
            v4 |= (composer1.Y(function11) ? 0x800000 : 0x400000);
        }
        if((0x16DB6DB & v4) != 4793490 || !composer1.c()) {
            if((v3 & 2) != 0) {
                modifier1 = Modifier.m0;
            }
            TextStyle textStyle2 = (v3 & 4) == 0 ? textStyle0 : TextStyle.d.a();
            boolean z2 = (v3 & 8) == 0 ? z : true;
            int v7 = (v3 & 16) == 0 ? v : 1;
            int v8 = (v3 & 0x20) == 0 ? v1 : 0x7FFFFFFF;
            Function1 function13 = (v3 & 0x40) == 0 ? function10 : androidx.compose.foundation.text.ClickableTextKt.ClickableText.1.e;
            if(ComposerKt.g0()) {
                ComposerKt.w0(0xF14D09D7, v4, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:69)");
            }
            composer1.V(0xE2A708A4);
            MutableState mutableState0 = composer1.W();
            Companion composer$Companion0 = Composer.a;
            if(mutableState0 == composer$Companion0.a()) {
                mutableState0 = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
                composer1.O(mutableState0);
            }
            composer1.g0();
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.m0;
            composer1.V(0x1E7B2B64);
            boolean z3 = composer1.t(mutableState0);
            boolean z4 = composer1.t(function11);
            androidx.compose.foundation.text.ClickableTextKt.ClickableText.pressIndicator.1.1 clickableTextKt$ClickableText$pressIndicator$1$10 = composer1.W();
            if(z3 || z4 || clickableTextKt$ClickableText$pressIndicator$1$10 == composer$Companion0.a()) {
                clickableTextKt$ClickableText$pressIndicator$1$10 = new o(mutableState0, function11, null) {
                    int k;
                    private Object l;
                    final MutableState m;
                    final Function1 n;

                    {
                        this.m = mutableState0;
                        this.n = function10;
                        super(2, d0);
                    }

                    @m
                    public final Object a(@l PointerInputScope pointerInputScope0, @m d d0) {
                        return ((androidx.compose.foundation.text.ClickableTextKt.ClickableText.pressIndicator.1.1)this.create(pointerInputScope0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new androidx.compose.foundation.text.ClickableTextKt.ClickableText.pressIndicator.1.1(this.m, this.n, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.a(((PointerInputScope)object0), ((d)object1));
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        Object object1 = b.l();
                        switch(this.k) {
                            case 0: {
                                f0.n(object0);
                                PointerInputScope pointerInputScope0 = (PointerInputScope)this.l;
                                androidx.compose.foundation.text.ClickableTextKt.ClickableText.pressIndicator.1.1.1 clickableTextKt$ClickableText$pressIndicator$1$1$10 = new Function1(this.n) {
                                    final MutableState e;
                                    final Function1 f;

                                    {
                                        this.e = mutableState0;
                                        this.f = function10;
                                        super(1);
                                    }

                                    public final void a(long v) {
                                        TextLayoutResult textLayoutResult0 = (TextLayoutResult)this.e.getValue();
                                        if(textLayoutResult0 != null) {
                                            Integer integer0 = textLayoutResult0.x(v);
                                            this.f.invoke(integer0);
                                        }
                                    }

                                    @Override  // kotlin.jvm.functions.Function1
                                    public Object invoke(Object object0) {
                                        this.a(((Offset)object0).A());
                                        return S0.a;
                                    }
                                };
                                this.k = 1;
                                return TapGestureDetectorKt.m(pointerInputScope0, null, null, null, clickableTextKt$ClickableText$pressIndicator$1$1$10, this, 7, null) == object1 ? object1 : S0.a;
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
                };
                composer1.O(clickableTextKt$ClickableText$pressIndicator$1$10);
            }
            composer1.g0();
            Modifier modifier3 = modifier1.r0(SuspendingPointerInputFilterKt.c(modifier$Companion0, function11, clickableTextKt$ClickableText$pressIndicator$1$10));
            composer1.V(0x1E7B2B64);
            boolean z5 = composer1.t(mutableState0);
            boolean z6 = composer1.t(function13);
            androidx.compose.foundation.text.ClickableTextKt.ClickableText.2.1 clickableTextKt$ClickableText$2$10 = composer1.W();
            if(z5 || z6 || clickableTextKt$ClickableText$2$10 == composer$Companion0.a()) {
                clickableTextKt$ClickableText$2$10 = new Function1(mutableState0, function13) {
                    final MutableState e;
                    final Function1 f;

                    {
                        this.e = mutableState0;
                        this.f = function10;
                        super(1);
                    }

                    public final void a(@l TextLayoutResult textLayoutResult0) {
                        L.p(textLayoutResult0, "it");
                        this.e.setValue(textLayoutResult0);
                        this.f.invoke(textLayoutResult0);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((TextLayoutResult)object0));
                        return S0.a;
                    }
                };
                composer1.O(clickableTextKt$ClickableText$2$10);
            }
            composer1.g0();
            BasicTextKt.d(annotatedString0, modifier3, textStyle2, clickableTextKt$ClickableText$2$10, v7, z2, v8, 0, null, composer1, 0xE38E & v4 | v4 << 6 & 0x70000 | v4 << 3 & 0x380000, 0x180);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            v6 = v8;
            modifier2 = modifier1;
            function12 = function13;
            textStyle1 = textStyle2;
            z1 = z2;
            v5 = v7;
        }
        else {
            composer1.m();
            function12 = function10;
            modifier2 = modifier1;
            textStyle1 = textStyle0;
            z1 = z;
            v5 = v;
            v6 = v1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(annotatedString0, modifier2, textStyle1, z1, v5, v6, function12, function11, v2, v3) {
                final AnnotatedString e;
                final Modifier f;
                final TextStyle g;
                final boolean h;
                final int i;
                final int j;
                final Function1 k;
                final Function1 l;
                final int m;
                final int n;

                {
                    this.e = annotatedString0;
                    this.f = modifier0;
                    this.g = textStyle0;
                    this.h = z;
                    this.i = v;
                    this.j = v1;
                    this.k = function10;
                    this.l = function11;
                    this.m = v2;
                    this.n = v3;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    ClickableTextKt.b(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, composer0, (this.m | 1) & -920350135 | ((0x24924924 & (this.m | 1)) >> 1 | 306783378 & (this.m | 1)) | (306783378 & (this.m | 1)) << 1 & (0x24924924 & (this.m | 1)), this.n);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.foundation.text.ClickableTextKt.ClickableText.1 extends N implements Function1 {
            public static final androidx.compose.foundation.text.ClickableTextKt.ClickableText.1 e;

            static {
                androidx.compose.foundation.text.ClickableTextKt.ClickableText.1.e = new androidx.compose.foundation.text.ClickableTextKt.ClickableText.1();
            }

            androidx.compose.foundation.text.ClickableTextKt.ClickableText.1() {
                super(1);
            }

            public final void a(@l TextLayoutResult textLayoutResult0) {
                L.p(textLayoutResult0, "it");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((TextLayoutResult)object0));
                return S0.a;
            }
        }

    }

    private static final Integer c(MutableState mutableState0, long v) {
        TextLayoutResult textLayoutResult0 = (TextLayoutResult)mutableState0.getValue();
        if(textLayoutResult0 != null) {
            MultiParagraph multiParagraph0 = textLayoutResult0.w();
            if(multiParagraph0 != null) {
                if(!ClickableTextKt.e(multiParagraph0, v)) {
                    multiParagraph0 = null;
                }
                return multiParagraph0 == null ? null : multiParagraph0.z(v);
            }
        }
        return null;
    }

    private static final boolean e(MultiParagraph multiParagraph0, long v) {
        float f = Offset.e(v);
        float f1 = Offset.f(v);
        return f > 0.0f && f1 >= 0.0f && f <= multiParagraph0.E() && f1 <= multiParagraph0.g();
    }
}

