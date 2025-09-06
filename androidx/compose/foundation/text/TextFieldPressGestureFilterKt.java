package androidx.compose.foundation.text;

import A3.o;
import A3.p;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction.Cancel;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.foundation.interaction.PressInteraction.Release;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

public final class TextFieldPressGestureFilterKt {
    @l
    public static final Modifier a(@l Modifier modifier0, @m MutableInteractionSource mutableInteractionSource0, boolean z, @l Function1 function10) {
        L.p(modifier0, "<this>");
        L.p(function10, "onTap");
        return z ? ComposedModifierKt.j(modifier0, null, new p(function10, mutableInteractionSource0) {
            final Function1 e;
            final MutableInteractionSource f;

            {
                this.e = function10;
                this.f = mutableInteractionSource0;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0xF9DFB8D5);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0xF9DFB8D5, v, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
                }
                composer0.V(0x2E20B340);
                composer0.V(0xE2A708A4);
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer0.W();
                Companion composer$Companion0 = Composer.a;
                if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.a()) {
                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller1 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.m(i.a, composer0));
                    composer0.O(compositionScopedCoroutineScopeCanceller1);
                    compositionScopedCoroutineScopeCanceller0 = compositionScopedCoroutineScopeCanceller1;
                }
                composer0.g0();
                O o0 = compositionScopedCoroutineScopeCanceller0.b();
                composer0.g0();
                composer0.V(0xE2A708A4);
                MutableState mutableState0 = composer0.W();
                if(mutableState0 == composer$Companion0.a()) {
                    mutableState0 = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
                    composer0.O(mutableState0);
                }
                composer0.g0();
                State state0 = SnapshotStateKt.t(this.e, composer0, 0);
                MutableInteractionSource mutableInteractionSource0 = this.f;
                composer0.V(0x1E7B2B64);
                boolean z = composer0.t(mutableState0);
                boolean z1 = composer0.t(mutableInteractionSource0);
                androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1.1.1 textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$10 = composer0.W();
                if(z || z1 || textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$10 == composer$Companion0.a()) {
                    textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$10 = new Function1(mutableInteractionSource0) {
                        final MutableState e;
                        final MutableInteractionSource f;

                        {
                            this.e = mutableState0;
                            this.f = mutableInteractionSource0;
                            super(1);
                        }

                        @l
                        public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                            L.p(disposableEffectScope0, "$this$DisposableEffect");
                            return new DisposableEffectResult() {
                                @Override  // androidx.compose.runtime.DisposableEffectResult
                                public void dispose() {
                                    Press pressInteraction$Press0 = (Press)this.f.getValue();
                                    if(pressInteraction$Press0 != null) {
                                        Cancel pressInteraction$Cancel0 = new Cancel(pressInteraction$Press0);
                                        MutableInteractionSource mutableInteractionSource0 = this.b;
                                        if(mutableInteractionSource0 != null) {
                                            mutableInteractionSource0.a(pressInteraction$Cancel0);
                                        }
                                        this.f.setValue(null);
                                    }
                                }
                            };
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            return this.a(((DisposableEffectScope)object0));
                        }
                    };
                    composer0.O(textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$10);
                }
                composer0.g0();
                EffectsKt.c(mutableInteractionSource0, textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$10, composer0, 0);
                androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1.2 textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$20 = new o(mutableState0, this.f, state0, null) {
                    int k;
                    private Object l;
                    final O m;
                    final MutableState n;
                    final MutableInteractionSource o;
                    final State p;

                    {
                        this.m = o0;
                        this.n = mutableState0;
                        this.o = mutableInteractionSource0;
                        this.p = state0;
                        super(2, d0);
                    }

                    @m
                    public final Object a(@l PointerInputScope pointerInputScope0, @m d d0) {
                        return ((androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1.2)this.create(pointerInputScope0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1.2(this.m, this.n, this.o, this.p, d0);
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
                                androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1.2.1 textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$10 = new p(this.n, this.o, null) {
                                    int k;
                                    private Object l;
                                    long m;
                                    final O n;
                                    final MutableState o;
                                    final MutableInteractionSource p;

                                    {
                                        this.n = o0;
                                        this.o = mutableState0;
                                        this.p = mutableInteractionSource0;
                                        super(3, d0);
                                    }

                                    @m
                                    public final Object a(@l PressGestureScope pressGestureScope0, long v, @m d d0) {
                                        androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1.2.1 textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$10 = new androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1.2.1(this.n, this.o, this.p, d0);
                                        textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$10.l = pressGestureScope0;
                                        textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$10.m = v;
                                        return textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$10.invokeSuspend(S0.a);
                                    }

                                    @Override  // A3.p
                                    public Object invoke(Object object0, Object object1, Object object2) {
                                        return this.a(((PressGestureScope)object0), ((Offset)object1).A(), ((d)object2));
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @m
                                    public final Object invokeSuspend(@l Object object0) {
                                        Object object1 = b.l();
                                        switch(this.k) {
                                            case 0: {
                                                f0.n(object0);
                                                PressGestureScope pressGestureScope0 = (PressGestureScope)this.l;
                                                androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1.2.1.1 textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$10 = new o(this.m, this.p, null) {
                                                    Object k;
                                                    int l;
                                                    final MutableState m;
                                                    final long n;
                                                    final MutableInteractionSource o;

                                                    {
                                                        this.m = mutableState0;
                                                        this.n = v;
                                                        this.o = mutableInteractionSource0;
                                                        super(2, d0);
                                                    }

                                                    @Override  // kotlin.coroutines.jvm.internal.a
                                                    @l
                                                    public final d create(@m Object object0, @l d d0) {
                                                        return new androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1.2.1.1(this.m, this.n, this.o, d0);
                                                    }

                                                    @Override  // A3.o
                                                    public Object invoke(Object object0, Object object1) {
                                                        return this.invoke(((O)object0), ((d)object1));
                                                    }

                                                    @m
                                                    public final Object invoke(@l O o0, @m d d0) {
                                                        return ((androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1.2.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                                    }

                                                    @Override  // kotlin.coroutines.jvm.internal.a
                                                    @m
                                                    public final Object invokeSuspend(@l Object object0) {
                                                        Press pressInteraction$Press1;
                                                        Object object1 = b.l();
                                                        switch(this.l) {
                                                            case 0: {
                                                                f0.n(object0);
                                                                Press pressInteraction$Press0 = (Press)this.m.getValue();
                                                                if(pressInteraction$Press0 != null) {
                                                                    MutableInteractionSource mutableInteractionSource0 = this.o;
                                                                    MutableState mutableState0 = this.m;
                                                                    Cancel pressInteraction$Cancel0 = new Cancel(pressInteraction$Press0);
                                                                    if(mutableInteractionSource0 != null) {
                                                                        this.k = mutableState0;
                                                                        this.l = 1;
                                                                        if(mutableInteractionSource0.b(pressInteraction$Cancel0, this) == object1) {
                                                                            return object1;
                                                                        }
                                                                    }
                                                                    mutableState0.setValue(null);
                                                                }
                                                                goto label_19;
                                                            }
                                                            case 1: {
                                                                MutableState mutableState1 = (MutableState)this.k;
                                                                f0.n(object0);
                                                                mutableState1.setValue(null);
                                                            label_19:
                                                                pressInteraction$Press1 = new Press(this.n, null);
                                                                MutableInteractionSource mutableInteractionSource1 = this.o;
                                                                if(mutableInteractionSource1 != null) {
                                                                    this.k = pressInteraction$Press1;
                                                                    this.l = 2;
                                                                    if(mutableInteractionSource1.b(pressInteraction$Press1, this) == object1) {
                                                                        return object1;
                                                                    }
                                                                }
                                                                break;
                                                            }
                                                            case 2: {
                                                                Press pressInteraction$Press2 = (Press)this.k;
                                                                f0.n(object0);
                                                                pressInteraction$Press1 = pressInteraction$Press2;
                                                                break;
                                                            }
                                                            default: {
                                                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                            }
                                                        }
                                                        this.m.setValue(pressInteraction$Press1);
                                                        return S0.a;
                                                    }
                                                };
                                                k.f(this.n, null, null, textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$10, 3, null);
                                                this.k = 1;
                                                object0 = pressGestureScope0.e1(this);
                                                if(object0 == object1) {
                                                    return object1;
                                                }
                                                break;
                                            }
                                            case 1: {
                                                f0.n(object0);
                                                break;
                                            }
                                            default: {
                                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                            }
                                        }
                                        androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1.2.1.2 textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$20 = new o(((Boolean)object0).booleanValue(), this.p, null) {
                                            Object k;
                                            int l;
                                            final MutableState m;
                                            final boolean n;
                                            final MutableInteractionSource o;

                                            {
                                                this.m = mutableState0;
                                                this.n = z;
                                                this.o = mutableInteractionSource0;
                                                super(2, d0);
                                            }

                                            @Override  // kotlin.coroutines.jvm.internal.a
                                            @l
                                            public final d create(@m Object object0, @l d d0) {
                                                return new androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1.2.1.2(this.m, this.n, this.o, d0);
                                            }

                                            @Override  // A3.o
                                            public Object invoke(Object object0, Object object1) {
                                                return this.invoke(((O)object0), ((d)object1));
                                            }

                                            @m
                                            public final Object invoke(@l O o0, @m d d0) {
                                                return ((androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1.2.1.2)this.create(o0, d0)).invokeSuspend(S0.a);
                                            }

                                            @Override  // kotlin.coroutines.jvm.internal.a
                                            @m
                                            public final Object invokeSuspend(@l Object object0) {
                                                Object object1 = b.l();
                                                switch(this.l) {
                                                    case 0: {
                                                        f0.n(object0);
                                                        Press pressInteraction$Press0 = (Press)this.m.getValue();
                                                        if(pressInteraction$Press0 != null) {
                                                            MutableInteractionSource mutableInteractionSource0 = this.o;
                                                            MutableState mutableState0 = this.m;
                                                            Release pressInteraction$Release0 = this.n ? new Release(pressInteraction$Press0) : new Cancel(pressInteraction$Press0);
                                                            if(mutableInteractionSource0 != null) {
                                                                this.k = mutableState0;
                                                                this.l = 1;
                                                                if(mutableInteractionSource0.b(pressInteraction$Release0, this) == object1) {
                                                                    return object1;
                                                                }
                                                            }
                                                            mutableState0.setValue(null);
                                                            return S0.a;
                                                        }
                                                        break;
                                                    }
                                                    case 1: {
                                                        MutableState mutableState1 = (MutableState)this.k;
                                                        f0.n(object0);
                                                        mutableState1.setValue(null);
                                                        break;
                                                    }
                                                    default: {
                                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                    }
                                                }
                                                return S0.a;
                                            }
                                        };
                                        k.f(this.n, null, null, textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$20, 3, null);
                                        return S0.a;
                                    }
                                };
                                androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1.2.2 textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$20 = new Function1() {
                                    final State e;

                                    {
                                        this.e = state0;
                                        super(1);
                                    }

                                    public final void a(long v) {
                                        ((Function1)this.e.getValue()).invoke(Offset.d(v));
                                    }

                                    @Override  // kotlin.jvm.functions.Function1
                                    public Object invoke(Object object0) {
                                        this.a(((Offset)object0).A());
                                        return S0.a;
                                    }
                                };
                                this.k = 1;
                                return TapGestureDetectorKt.j(pointerInputScope0, textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$10, textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$20, this) == object1 ? object1 : S0.a;
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
                Modifier modifier1 = SuspendingPointerInputFilterKt.c(Modifier.m0, this.f, textFieldPressGestureFilterKt$tapPressTextFieldModifier$1$20);
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return modifier1;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        }, 1, null) : modifier0;
    }

    public static Modifier b(Modifier modifier0, MutableInteractionSource mutableInteractionSource0, boolean z, Function1 function10, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        return TextFieldPressGestureFilterKt.a(modifier0, mutableInteractionSource0, z, function10);
    }
}

