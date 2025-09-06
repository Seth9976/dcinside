package androidx.compose.foundation.text.selection;

import A3.a;
import A3.o;
import A3.p;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nSelectionMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,111:1\n25#2:112\n25#2:119\n1114#3,6:113\n1114#3,6:120\n76#4:126\n*S KotlinDebug\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt\n*L\n80#1:112\n81#1:119\n80#1:113,6\n81#1:120,6\n80#1:126\n*E\n"})
public final class SelectionMagnifierKt {
    @l
    private static final AnimationVector2D a;
    @l
    private static final TwoWayConverter b;
    private static final long c;
    @l
    private static final SpringSpec d;

    static {
        SelectionMagnifierKt.a = new AnimationVector2D(NaNf, NaNf);
        SelectionMagnifierKt.b = VectorConvertersKt.a(SelectionMagnifierKt.UnspecifiedSafeOffsetVectorConverter.1.e, SelectionMagnifierKt.UnspecifiedSafeOffsetVectorConverter.2.e);
        SelectionMagnifierKt.c = 0x3C23D70A3C23D70AL;
        SelectionMagnifierKt.d = new SpringSpec(0.0f, 0.0f, Offset.d(0x3C23D70A3C23D70AL), 3, null);
    }

    public static final long b() [...] // 潜在的解密器

    @l
    public static final Modifier g(@l Modifier modifier0, @l a a0, @l Function1 function10) {
        L.p(modifier0, "<this>");
        L.p(a0, "magnifierCenter");
        L.p(function10, "platformMagnifier");
        return ComposedModifierKt.j(modifier0, null, new p(a0, function10) {
            final a e;
            final Function1 f;

            {
                this.e = a0;
                this.f = function10;
                super(3);
            }

            @Composable
            @l
            public final Modifier b(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0x2D4ACC1B);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x2D4ACC1B, v, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:66)");
                }
                State state0 = SelectionMagnifierKt.h(this.e, composer0, 0);
                Function1 function10 = this.f;
                composer0.V(0x44FAF204);
                boolean z = composer0.t(state0);
                androidx.compose.foundation.text.selection.SelectionMagnifierKt.animatedSelectionMagnifier.1.1.1 selectionMagnifierKt$animatedSelectionMagnifier$1$1$10 = composer0.W();
                if(z || selectionMagnifierKt$animatedSelectionMagnifier$1$1$10 == Composer.a.a()) {
                    selectionMagnifierKt$animatedSelectionMagnifier$1$1$10 = new a() {
                        final State e;

                        {
                            this.e = state0;
                            super(0);
                        }

                        public final long b() {
                            return androidx.compose.foundation.text.selection.SelectionMagnifierKt.animatedSelectionMagnifier.1.c(this.e);
                        }

                        @Override  // A3.a
                        public Object invoke() {
                            return Offset.d(this.b());
                        }
                    };
                    composer0.O(selectionMagnifierKt$animatedSelectionMagnifier$1$1$10);
                }
                composer0.g0();
                Modifier modifier1 = (Modifier)function10.invoke(selectionMagnifierKt$animatedSelectionMagnifier$1$1$10);
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return modifier1;
            }

            private static final long c(State state0) {
                return ((Offset)state0.getValue()).A();
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.b(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        }, 1, null);
    }

    @Composable
    private static final State h(a a0, Composer composer0, int v) {
        composer0.V(0xA13DA64F);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xA13DA64F, v, -1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:76)");
        }
        composer0.V(0xE2A708A4);
        State state0 = composer0.W();
        Companion composer$Companion0 = Composer.a;
        if(state0 == composer$Companion0.a()) {
            state0 = SnapshotStateKt.c(a0);
            composer0.O(state0);
        }
        composer0.g0();
        composer0.V(0xE2A708A4);
        Animatable animatable0 = composer0.W();
        if(animatable0 == composer$Companion0.a()) {
            animatable0 = new Animatable(Offset.d(SelectionMagnifierKt.i(state0)), SelectionMagnifierKt.b, Offset.d(0x3C23D70A3C23D70AL));
            composer0.O(animatable0);
        }
        composer0.g0();
        androidx.compose.foundation.text.selection.SelectionMagnifierKt.rememberAnimatedMagnifierPosition.1 selectionMagnifierKt$rememberAnimatedMagnifierPosition$10 = new o(state0, animatable0, null) {
            int k;
            private Object l;
            final State m;
            final Animatable n;

            {
                this.m = state0;
                this.n = animatable0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.text.selection.SelectionMagnifierKt.rememberAnimatedMagnifierPosition.1(this.m, this.n, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.foundation.text.selection.SelectionMagnifierKt.rememberAnimatedMagnifierPosition.1)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        O o0 = (O)this.l;
                        i i0 = SnapshotStateKt.v(new a() {
                            final State e;

                            {
                                this.e = state0;
                                super(0);
                            }

                            public final long b() {
                                return SelectionMagnifierKt.i(this.e);
                            }

                            @Override  // A3.a
                            public Object invoke() {
                                return Offset.d(this.b());
                            }
                        });
                        androidx.compose.foundation.text.selection.SelectionMagnifierKt.rememberAnimatedMagnifierPosition.1.2 selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$20 = new j() {
                            @m
                            public final Object a(long v, @l d d0) {
                                if(OffsetKt.d(((Offset)o0.u()).A()) && OffsetKt.d(v) && Offset.r(((Offset)o0.u()).A()) != Offset.r(v)) {
                                    androidx.compose.foundation.text.selection.SelectionMagnifierKt.rememberAnimatedMagnifierPosition.1.2.emit.2 selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$20 = new o(v, null) {
                                        int k;
                                        final Animatable l;
                                        final long m;

                                        {
                                            this.l = animatable0;
                                            this.m = v;
                                            super(2, d0);
                                        }

                                        @Override  // kotlin.coroutines.jvm.internal.a
                                        @l
                                        public final d create(@m Object object0, @l d d0) {
                                            return new androidx.compose.foundation.text.selection.SelectionMagnifierKt.rememberAnimatedMagnifierPosition.1.2.emit.2(this.l, this.m, d0);
                                        }

                                        @Override  // A3.o
                                        public Object invoke(Object object0, Object object1) {
                                            return this.invoke(((O)object0), ((d)object1));
                                        }

                                        @m
                                        public final Object invoke(@l O o0, @m d d0) {
                                            return ((androidx.compose.foundation.text.selection.SelectionMagnifierKt.rememberAnimatedMagnifierPosition.1.2.emit.2)this.create(o0, d0)).invokeSuspend(S0.a);
                                        }

                                        @Override  // kotlin.coroutines.jvm.internal.a
                                        @m
                                        public final Object invokeSuspend(@l Object object0) {
                                            Object object1 = b.l();
                                            switch(this.k) {
                                                case 0: {
                                                    f0.n(object0);
                                                    Offset offset0 = Offset.d(this.m);
                                                    this.k = 1;
                                                    return Animatable.i(this.l, offset0, SelectionMagnifierKt.d, null, null, this, 12, null) == object1 ? object1 : S0.a;
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
                                    k.f(this.b, null, null, selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$2$emit$20, 3, null);
                                    return S0.a;
                                }
                                Offset offset0 = Offset.d(v);
                                Object object0 = o0.B(offset0, d0);
                                return object0 == b.l() ? object0 : S0.a;
                            }

                            @Override  // kotlinx.coroutines.flow.j
                            public Object emit(Object object0, d d0) {
                                return this.a(((Offset)object0).A(), d0);
                            }
                        };
                        this.k = 1;
                        return i0.collect(selectionMagnifierKt$rememberAnimatedMagnifierPosition$1$20, this) == object1 ? object1 : S0.a;
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
        EffectsKt.g(S0.a, selectionMagnifierKt$rememberAnimatedMagnifierPosition$10, composer0, 70);
        State state1 = animatable0.j();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return state1;
    }

    private static final long i(State state0) {
        return ((Offset)state0.getValue()).A();
    }
}

