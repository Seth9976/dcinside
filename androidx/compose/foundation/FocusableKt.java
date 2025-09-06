package androidx.compose.foundation;

import A3.a;
import A3.o;
import A3.p;
import androidx.compose.foundation.interaction.FocusInteraction.Focus;
import androidx.compose.foundation.interaction.FocusInteraction.Unfocus;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.layout.PinnableContainer.PinnedHandle;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import androidx.compose.ui.platform.InspectableModifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nFocusable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,227:1\n135#2:228\n135#2:229\n135#2:230\n*S KotlinDebug\n*F\n+ 1 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n*L\n63#1:228\n212#1:229\n225#1:230\n*E\n"})
public final class FocusableKt {
    @l
    private static final InspectableModifier a;

    static {
        FocusableKt.a = new InspectableModifier(InspectableValueKt.b());
    }

    @ExperimentalFoundationApi
    @l
    public static final Modifier a(@l Modifier modifier0) {
        L.p(modifier0, "<this>");
        return FocusModifierKt.b(FocusPropertiesKt.a(modifier0.r0(FocusableKt.a), androidx.compose.foundation.FocusableKt.focusGroup.1.e));

        final class androidx.compose.foundation.FocusableKt.focusGroup.1 extends N implements Function1 {
            public static final androidx.compose.foundation.FocusableKt.focusGroup.1 e;

            static {
                androidx.compose.foundation.FocusableKt.focusGroup.1.e = new androidx.compose.foundation.FocusableKt.focusGroup.1();
            }

            androidx.compose.foundation.FocusableKt.focusGroup.1() {
                super(1);
            }

            public final void a(@l FocusProperties focusProperties0) {
                L.p(focusProperties0, "$this$focusProperties");
                focusProperties0.i(false);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((FocusProperties)object0));
                return S0.a;
            }
        }

    }

    @l
    public static final Modifier b(@l Modifier modifier0, boolean z, @m MutableInteractionSource mutableInteractionSource0) {
        L.p(modifier0, "<this>");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(mutableInteractionSource0, z) {
            final MutableInteractionSource e;
            final boolean f;

            {
                this.e = mutableInteractionSource0;
                this.f = z;
                super(3);
            }

            @Composable
            @l
            public final Modifier e(@l Modifier modifier0, @m Composer composer0, int v) {
                Modifier modifier2;
                Modifier modifier1;
                L.p(modifier0, "$this$composed");
                composer0.V(0x6F8A9229);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x6F8A9229, v, -1, "androidx.compose.foundation.focusable.<anonymous> (Focusable.kt:67)");
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
                composer0.V(0xE2A708A4);
                MutableState mutableState1 = composer0.W();
                if(mutableState1 == composer$Companion0.a()) {
                    mutableState1 = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
                    composer0.O(mutableState1);
                }
                composer0.g0();
                composer0.V(0xE2A708A4);
                FocusRequester focusRequester0 = composer0.W();
                if(focusRequester0 == composer$Companion0.a()) {
                    focusRequester0 = new FocusRequester();
                    composer0.O(focusRequester0);
                }
                composer0.g0();
                composer0.V(0xE2A708A4);
                BringIntoViewRequester bringIntoViewRequester0 = composer0.W();
                if(bringIntoViewRequester0 == composer$Companion0.a()) {
                    bringIntoViewRequester0 = BringIntoViewRequesterKt.a();
                    composer0.O(bringIntoViewRequester0);
                }
                composer0.g0();
                MutableInteractionSource mutableInteractionSource0 = this.e;
                composer0.V(0x1E7B2B64);
                boolean z = composer0.t(mutableState0);
                boolean z1 = composer0.t(mutableInteractionSource0);
                androidx.compose.foundation.FocusableKt.focusable.2.1.1 focusableKt$focusable$2$1$10 = composer0.W();
                if(z || z1 || focusableKt$focusable$2$1$10 == composer$Companion0.a()) {
                    focusableKt$focusable$2$1$10 = new Function1(mutableInteractionSource0) {
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
                                    Focus focusInteraction$Focus0 = (Focus)this.f.getValue();
                                    if(focusInteraction$Focus0 != null) {
                                        Unfocus focusInteraction$Unfocus0 = new Unfocus(focusInteraction$Focus0);
                                        MutableInteractionSource mutableInteractionSource0 = this.b;
                                        if(mutableInteractionSource0 != null) {
                                            mutableInteractionSource0.a(focusInteraction$Unfocus0);
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
                    composer0.O(focusableKt$focusable$2$1$10);
                }
                composer0.g0();
                EffectsKt.c(mutableInteractionSource0, focusableKt$focusable$2$1$10, composer0, 0);
                androidx.compose.foundation.FocusableKt.focusable.2.2 focusableKt$focusable$2$20 = new Function1(o0, mutableState0, this.e) {
                    final boolean e;
                    final O f;
                    final MutableState g;
                    final MutableInteractionSource h;

                    {
                        this.e = z;
                        this.f = o0;
                        this.g = mutableState0;
                        this.h = mutableInteractionSource0;
                        super(1);
                    }

                    @l
                    public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                        L.p(disposableEffectScope0, "$this$DisposableEffect");
                        if(!this.e) {
                            androidx.compose.foundation.FocusableKt.focusable.2.2.1 focusableKt$focusable$2$2$10 = new o(this.h, null) {
                                Object k;
                                int l;
                                final MutableState m;
                                final MutableInteractionSource n;

                                {
                                    this.m = mutableState0;
                                    this.n = mutableInteractionSource0;
                                    super(2, d0);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @l
                                public final d create(@m Object object0, @l d d0) {
                                    return new androidx.compose.foundation.FocusableKt.focusable.2.2.1(this.m, this.n, d0);
                                }

                                @Override  // A3.o
                                public Object invoke(Object object0, Object object1) {
                                    return this.invoke(((O)object0), ((d)object1));
                                }

                                @m
                                public final Object invoke(@l O o0, @m d d0) {
                                    return ((androidx.compose.foundation.FocusableKt.focusable.2.2.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @m
                                public final Object invokeSuspend(@l Object object0) {
                                    Object object1 = b.l();
                                    switch(this.l) {
                                        case 0: {
                                            f0.n(object0);
                                            Focus focusInteraction$Focus0 = (Focus)this.m.getValue();
                                            if(focusInteraction$Focus0 != null) {
                                                MutableInteractionSource mutableInteractionSource0 = this.n;
                                                MutableState mutableState0 = this.m;
                                                Unfocus focusInteraction$Unfocus0 = new Unfocus(focusInteraction$Focus0);
                                                if(mutableInteractionSource0 != null) {
                                                    this.k = mutableState0;
                                                    this.l = 1;
                                                    if(mutableInteractionSource0.b(focusInteraction$Unfocus0, this) == object1) {
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
                            k.f(this.f, null, null, focusableKt$focusable$2$2$10, 3, null);
                        }
                        return new androidx.compose.foundation.FocusableKt.focusable.2.2.invoke..inlined.onDispose.1();

                        @s0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 Focusable.kt\nandroidx/compose/foundation/FocusableKt$focusable$2$2\n*L\n1#1,484:1\n104#2:485\n*E\n"})
                        public final class androidx.compose.foundation.FocusableKt.focusable.2.2.invoke..inlined.onDispose.1 implements DisposableEffectResult {
                            @Override  // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                            }
                        }

                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((DisposableEffectScope)object0));
                    }
                };
                EffectsKt.c(Boolean.valueOf(this.f), focusableKt$focusable$2$20, composer0, 0);
                if(this.f) {
                    composer0.V(1407540673);
                    if(androidx.compose.foundation.FocusableKt.focusable.2.g(mutableState1)) {
                        composer0.V(0xE2A708A4);
                        FocusedBoundsModifier focusedBoundsModifier0 = composer0.W();
                        if(focusedBoundsModifier0 == composer$Companion0.a()) {
                            focusedBoundsModifier0 = new FocusedBoundsModifier();
                            composer0.O(focusedBoundsModifier0);
                        }
                        composer0.g0();
                        modifier1 = focusedBoundsModifier0;
                    }
                    else {
                        modifier1 = Modifier.m0;
                    }
                    composer0.g0();
                    PinnableContainer pinnableContainer0 = (PinnableContainer)composer0.L(PinnableContainerKt.a());
                    composer0.V(0xE2A708A4);
                    MutableState mutableState2 = composer0.W();
                    if(mutableState2 == composer$Companion0.a()) {
                        mutableState2 = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
                        composer0.O(mutableState2);
                    }
                    composer0.g0();
                    composer0.V(0x607FB4C4);
                    boolean z2 = composer0.t(mutableState1);
                    boolean z3 = composer0.t(mutableState2);
                    boolean z4 = composer0.t(pinnableContainer0);
                    androidx.compose.foundation.FocusableKt.focusable.2.3.1 focusableKt$focusable$2$3$10 = composer0.W();
                    if((z2 | z3 | z4) != 0 || focusableKt$focusable$2$3$10 == composer$Companion0.a()) {
                        focusableKt$focusable$2$3$10 = new Function1(mutableState1, mutableState2) {
                            final PinnableContainer e;
                            final MutableState f;
                            final MutableState g;

                            {
                                this.e = pinnableContainer0;
                                this.f = mutableState0;
                                this.g = mutableState1;
                                super(1);
                            }

                            @l
                            public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                                L.p(disposableEffectScope0, "$this$DisposableEffect");
                                if(androidx.compose.foundation.FocusableKt.focusable.2.g(this.f)) {
                                    PinnedHandle pinnableContainer$PinnedHandle0 = this.e == null ? null : this.e.a();
                                    androidx.compose.foundation.FocusableKt.focusable.2.f(this.g, pinnableContainer$PinnedHandle0);
                                }
                                return new DisposableEffectResult() {
                                    @Override  // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        PinnedHandle pinnableContainer$PinnedHandle0 = androidx.compose.foundation.FocusableKt.focusable.2.i(this.a);
                                        if(pinnableContainer$PinnedHandle0 != null) {
                                            pinnableContainer$PinnedHandle0.release();
                                        }
                                        androidx.compose.foundation.FocusableKt.focusable.2.f(this.a, null);
                                    }
                                };
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                return this.a(((DisposableEffectScope)object0));
                            }
                        };
                        composer0.O(focusableKt$focusable$2$3$10);
                    }
                    composer0.g0();
                    EffectsKt.c(pinnableContainer0, focusableKt$focusable$2$3$10, composer0, 0);
                    androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.m0;
                    composer0.V(0x1E7B2B64);
                    boolean z5 = composer0.t(mutableState1);
                    boolean z6 = composer0.t(focusRequester0);
                    androidx.compose.foundation.FocusableKt.focusable.2.4.1 focusableKt$focusable$2$4$10 = composer0.W();
                    if(z5 || z6 || focusableKt$focusable$2$4$10 == composer$Companion0.a()) {
                        focusableKt$focusable$2$4$10 = new Function1(focusRequester0) {
                            final MutableState e;
                            final FocusRequester f;

                            {
                                this.e = mutableState0;
                                this.f = focusRequester0;
                                super(1);
                            }

                            public final void a(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                                L.p(semanticsPropertyReceiver0, "$this$semantics");
                                SemanticsPropertiesKt.J0(semanticsPropertyReceiver0, androidx.compose.foundation.FocusableKt.focusable.2.g(this.e));
                                SemanticsPropertiesKt.x0(semanticsPropertyReceiver0, null, new a(this.e) {
                                    final FocusRequester e;
                                    final MutableState f;

                                    {
                                        this.e = focusRequester0;
                                        this.f = mutableState0;
                                        super(0);
                                    }

                                    @l
                                    public final Boolean b() {
                                        this.e.h();
                                        return Boolean.valueOf(androidx.compose.foundation.FocusableKt.focusable.2.g(this.f));
                                    }

                                    @Override  // A3.a
                                    public Object invoke() {
                                        return this.b();
                                    }
                                }, 1, null);
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.a(((SemanticsPropertyReceiver)object0));
                                return S0.a;
                            }
                        };
                        composer0.O(focusableKt$focusable$2$4$10);
                    }
                    composer0.g0();
                    modifier2 = FocusModifierKt.b(FocusChangedModifierKt.a(FocusRequesterModifierKt.a(BringIntoViewRequesterKt.b(SemanticsModifierKt.c(modifier$Companion0, false, focusableKt$focusable$2$4$10, 1, null), bringIntoViewRequester0), focusRequester0).r0(modifier1), new Function1(o0, mutableState1, mutableState2, mutableState0, this.e, bringIntoViewRequester0) {
                        final PinnableContainer e;
                        final O f;
                        final MutableState g;
                        final MutableState h;
                        final MutableState i;
                        final MutableInteractionSource j;
                        final BringIntoViewRequester k;

                        {
                            this.e = pinnableContainer0;
                            this.f = o0;
                            this.g = mutableState0;
                            this.h = mutableState1;
                            this.i = mutableState2;
                            this.j = mutableInteractionSource0;
                            this.k = bringIntoViewRequester0;
                            super(1);
                        }

                        public final void a(@l FocusState focusState0) {
                            L.p(focusState0, "it");
                            boolean z = focusState0.a();
                            androidx.compose.foundation.FocusableKt.focusable.2.h(this.g, z);
                            if(androidx.compose.foundation.FocusableKt.focusable.2.g(this.g)) {
                                PinnedHandle pinnableContainer$PinnedHandle0 = this.e == null ? null : this.e.a();
                                androidx.compose.foundation.FocusableKt.focusable.2.f(this.h, pinnableContainer$PinnedHandle0);
                                androidx.compose.foundation.FocusableKt.focusable.2.5.1 focusableKt$focusable$2$5$10 = new o(this.j, this.k, null) {
                                    Object k;
                                    int l;
                                    final MutableState m;
                                    final MutableInteractionSource n;
                                    final BringIntoViewRequester o;

                                    {
                                        this.m = mutableState0;
                                        this.n = mutableInteractionSource0;
                                        this.o = bringIntoViewRequester0;
                                        super(2, d0);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @l
                                    public final d create(@m Object object0, @l d d0) {
                                        return new androidx.compose.foundation.FocusableKt.focusable.2.5.1(this.m, this.n, this.o, d0);
                                    }

                                    @Override  // A3.o
                                    public Object invoke(Object object0, Object object1) {
                                        return this.invoke(((O)object0), ((d)object1));
                                    }

                                    @m
                                    public final Object invoke(@l O o0, @m d d0) {
                                        return ((androidx.compose.foundation.FocusableKt.focusable.2.5.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                    }

                                    @Override  // kotlin.coroutines.jvm.internal.a
                                    @m
                                    public final Object invokeSuspend(@l Object object0) {
                                        Focus focusInteraction$Focus1;
                                        Object object1 = b.l();
                                        switch(this.l) {
                                            case 0: {
                                                f0.n(object0);
                                                Focus focusInteraction$Focus0 = (Focus)this.m.getValue();
                                                if(focusInteraction$Focus0 != null) {
                                                    MutableInteractionSource mutableInteractionSource0 = this.n;
                                                    MutableState mutableState0 = this.m;
                                                    Unfocus focusInteraction$Unfocus0 = new Unfocus(focusInteraction$Focus0);
                                                    if(mutableInteractionSource0 != null) {
                                                        this.k = mutableState0;
                                                        this.l = 1;
                                                        if(mutableInteractionSource0.b(focusInteraction$Unfocus0, this) == object1) {
                                                            return object1;
                                                        }
                                                    }
                                                    mutableState0.setValue(null);
                                                }
                                                goto label_21;
                                            }
                                            case 1: {
                                                MutableState mutableState1 = (MutableState)this.k;
                                                f0.n(object0);
                                                mutableState1.setValue(null);
                                            label_21:
                                                focusInteraction$Focus1 = new Focus();
                                                MutableInteractionSource mutableInteractionSource1 = this.n;
                                                if(mutableInteractionSource1 != null) {
                                                    this.k = focusInteraction$Focus1;
                                                    this.l = 2;
                                                    if(mutableInteractionSource1.b(focusInteraction$Focus1, this) == object1) {
                                                        return object1;
                                                    }
                                                }
                                                break;
                                            }
                                            case 2: {
                                                focusInteraction$Focus1 = (Focus)this.k;
                                                f0.n(object0);
                                                break;
                                            }
                                            case 3: {
                                                f0.n(object0);
                                                return S0.a;
                                            }
                                            default: {
                                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                            }
                                        }
                                        this.m.setValue(focusInteraction$Focus1);
                                        this.k = null;
                                        this.l = 3;
                                        return androidx.compose.foundation.relocation.a.a(this.o, null, this, 1, null) == object1 ? object1 : S0.a;
                                    }
                                };
                                k.f(this.f, null, null, focusableKt$focusable$2$5$10, 3, null);
                                return;
                            }
                            PinnedHandle pinnableContainer$PinnedHandle1 = androidx.compose.foundation.FocusableKt.focusable.2.i(this.h);
                            if(pinnableContainer$PinnedHandle1 != null) {
                                pinnableContainer$PinnedHandle1.release();
                            }
                            androidx.compose.foundation.FocusableKt.focusable.2.f(this.h, null);
                            androidx.compose.foundation.FocusableKt.focusable.2.5.2 focusableKt$focusable$2$5$20 = new o(this.j, null) {
                                Object k;
                                int l;
                                final MutableState m;
                                final MutableInteractionSource n;

                                {
                                    this.m = mutableState0;
                                    this.n = mutableInteractionSource0;
                                    super(2, d0);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @l
                                public final d create(@m Object object0, @l d d0) {
                                    return new androidx.compose.foundation.FocusableKt.focusable.2.5.2(this.m, this.n, d0);
                                }

                                @Override  // A3.o
                                public Object invoke(Object object0, Object object1) {
                                    return this.invoke(((O)object0), ((d)object1));
                                }

                                @m
                                public final Object invoke(@l O o0, @m d d0) {
                                    return ((androidx.compose.foundation.FocusableKt.focusable.2.5.2)this.create(o0, d0)).invokeSuspend(S0.a);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @m
                                public final Object invokeSuspend(@l Object object0) {
                                    Object object1 = b.l();
                                    switch(this.l) {
                                        case 0: {
                                            f0.n(object0);
                                            Focus focusInteraction$Focus0 = (Focus)this.m.getValue();
                                            if(focusInteraction$Focus0 != null) {
                                                MutableInteractionSource mutableInteractionSource0 = this.n;
                                                MutableState mutableState0 = this.m;
                                                Unfocus focusInteraction$Unfocus0 = new Unfocus(focusInteraction$Focus0);
                                                if(mutableInteractionSource0 != null) {
                                                    this.k = mutableState0;
                                                    this.l = 1;
                                                    if(mutableInteractionSource0.b(focusInteraction$Unfocus0, this) == object1) {
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
                            k.f(this.f, null, null, focusableKt$focusable$2$5$20, 3, null);
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.a(((FocusState)object0));
                            return S0.a;
                        }
                    }));
                }
                else {
                    modifier2 = Modifier.m0;
                }
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return modifier2;
            }

            private static final void f(MutableState mutableState0, PinnedHandle pinnableContainer$PinnedHandle0) {
                mutableState0.setValue(pinnableContainer$PinnedHandle0);
            }

            private static final boolean g(MutableState mutableState0) {
                return ((Boolean)mutableState0.getValue()).booleanValue();
            }

            private static final void h(MutableState mutableState0, boolean z) {
                mutableState0.setValue(Boolean.valueOf(z));
            }

            private static final PinnedHandle i(MutableState mutableState0) {
                return (PinnedHandle)mutableState0.getValue();
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.e(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n*L\n1#1,170:1\n64#2,4:171\n*E\n"})
        public final class androidx.compose.foundation.FocusableKt.focusable..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final boolean e;
            final MutableInteractionSource f;

            public androidx.compose.foundation.FocusableKt.focusable..inlined.debugInspectorInfo.1(boolean z, MutableInteractionSource mutableInteractionSource0) {
                this.e = z;
                this.f = mutableInteractionSource0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("focusable");
                inspectorInfo0.b().c("enabled", Boolean.valueOf(this.e));
                inspectorInfo0.b().c("interactionSource", this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier c(Modifier modifier0, boolean z, MutableInteractionSource mutableInteractionSource0, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        if((v & 2) != 0) {
            mutableInteractionSource0 = null;
        }
        return FocusableKt.b(modifier0, z, mutableInteractionSource0);
    }

    @l
    public static final Modifier d(@l Modifier modifier0, boolean z, @m MutableInteractionSource mutableInteractionSource0) {
        L.p(modifier0, "<this>");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(z, mutableInteractionSource0) {
            final boolean e;
            final MutableInteractionSource f;

            {
                this.e = z;
                this.f = mutableInteractionSource0;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(-618949501);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(-618949501, v, -1, "androidx.compose.foundation.focusableInNonTouchMode.<anonymous> (Focusable.kt:216)");
                }
                androidx.compose.foundation.FocusableKt.focusableInNonTouchMode.2.1 focusableKt$focusableInNonTouchMode$2$10 = new Function1() {
                    final InputModeManager e;

                    {
                        this.e = inputModeManager0;
                        super(1);
                    }

                    public final void a(@l FocusProperties focusProperties0) {
                        L.p(focusProperties0, "$this$focusProperties");
                        focusProperties0.i(!InputMode.f(this.e.b(), 1));
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((FocusProperties)object0));
                        return S0.a;
                    }
                };
                Modifier modifier1 = FocusableKt.b(FocusPropertiesKt.a(Modifier.m0, focusableKt$focusableInNonTouchMode$2$10), this.e, this.f);
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
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Focusable.kt\nandroidx/compose/foundation/FocusableKt\n*L\n1#1,170:1\n213#2,4:171\n*E\n"})
        public final class androidx.compose.foundation.FocusableKt.focusableInNonTouchMode..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final boolean e;
            final MutableInteractionSource f;

            public androidx.compose.foundation.FocusableKt.focusableInNonTouchMode..inlined.debugInspectorInfo.1(boolean z, MutableInteractionSource mutableInteractionSource0) {
                this.e = z;
                this.f = mutableInteractionSource0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("focusableInNonTouchMode");
                inspectorInfo0.b().c("enabled", Boolean.valueOf(this.e));
                inspectorInfo0.b().c("interactionSource", this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }
}

