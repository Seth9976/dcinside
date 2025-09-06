package androidx.compose.foundation;

import A3.a;
import A3.o;
import A3.p;
import android.view.KeyEvent;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction.Cancel;
import androidx.compose.foundation.interaction.PressInteraction.Press;
import androidx.compose.foundation.interaction.PressInteraction.Release;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.M0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,565:1\n135#2:566\n135#2:567\n135#2:568\n135#2:569\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n86#1:566\n198#1:567\n243#1:568\n395#1:569\n*E\n"})
public final class ClickableKt {
    @Composable
    public static final void a(@l MutableInteractionSource mutableInteractionSource0, @l MutableState mutableState0, @l Map map0, @m Composer composer0, int v) {
        L.p(mutableInteractionSource0, "interactionSource");
        L.p(mutableState0, "pressedInteraction");
        L.p(map0, "currentKeyPressInteractions");
        Composer composer1 = composer0.G(1297229208);
        if(ComposerKt.g0()) {
            ComposerKt.w0(1297229208, v, -1, "androidx.compose.foundation.PressedInteractionSourceDisposableEffect (Clickable.kt:409)");
        }
        EffectsKt.c(mutableInteractionSource0, new Function1(mutableState0, map0, mutableInteractionSource0) {
            final MutableState e;
            final Map f;
            final MutableInteractionSource g;

            {
                this.e = mutableState0;
                this.f = map0;
                this.g = mutableInteractionSource0;
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
                            this.c.a(pressInteraction$Cancel0);
                            this.f.setValue(null);
                        }
                        for(Object object0: this.g.values()) {
                            Cancel pressInteraction$Cancel1 = new Cancel(((Press)object0));
                            this.c.a(pressInteraction$Cancel1);
                        }
                        this.g.clear();
                    }
                };
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((DisposableEffectScope)object0));
            }
        }, composer1, v & 14);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(mutableInteractionSource0, mutableState0, map0, v) {
                final MutableInteractionSource e;
                final MutableState f;
                final Map g;
                final int h;

                {
                    this.e = mutableInteractionSource0;
                    this.f = mutableState0;
                    this.g = map0;
                    this.h = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    ClickableKt.a(this.e, this.f, this.g, composer0, (this.h | 1) & -920350135 | ((0x24924924 & (this.h | 1)) >> 1 | 306783378 & (this.h | 1)) | (306783378 & (this.h | 1)) << 1 & (0x24924924 & (this.h | 1)));
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    @l
    public static final Modifier b(@l Modifier modifier0, @l MutableInteractionSource mutableInteractionSource0, @m Indication indication0, boolean z, @m String s, @m Role role0, @l a a0) {
        L.p(modifier0, "$this$clickable");
        L.p(mutableInteractionSource0, "interactionSource");
        L.p(a0, "onClick");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(a0, z, mutableInteractionSource0, indication0, s, role0) {
            final a e;
            final boolean f;
            final MutableInteractionSource g;
            final Indication h;
            final String i;
            final Role j;

            {
                this.e = a0;
                this.f = z;
                this.g = mutableInteractionSource0;
                this.h = indication0;
                this.i = s;
                this.j = role0;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                MutableState mutableState3;
                Companion modifier$Companion1;
                MutableInteractionSource mutableInteractionSource2;
                Boolean boolean1;
                L.p(modifier0, "$this$composed");
                composer0.V(92076020);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(92076020, v, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:135)");
                }
                State state0 = SnapshotStateKt.t(this.e, composer0, 0);
                composer0.V(0xE2A708A4);
                MutableState mutableState0 = composer0.W();
                androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.a;
                if(mutableState0 == composer$Companion0.a()) {
                    mutableState0 = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
                    composer0.O(mutableState0);
                }
                composer0.g0();
                composer0.V(0xE2A708A4);
                LinkedHashMap linkedHashMap0 = composer0.W();
                if(linkedHashMap0 == composer$Companion0.a()) {
                    linkedHashMap0 = new LinkedHashMap();
                    composer0.O(linkedHashMap0);
                }
                composer0.g0();
                composer0.V(0x6DCA6879);
                if(this.f) {
                    ClickableKt.a(this.g, mutableState0, linkedHashMap0, composer0, 560);
                }
                composer0.g0();
                a a0 = Clickable_androidKt.d(composer0, 0);
                composer0.V(0xE2A708A4);
                MutableState mutableState1 = composer0.W();
                if(mutableState1 == composer$Companion0.a()) {
                    mutableState1 = SnapshotStateKt__SnapshotStateKt.g(Boolean.TRUE, null, 2, null);
                    composer0.O(mutableState1);
                }
                composer0.g0();
                composer0.V(0x1E7B2B64);
                boolean z = composer0.t(mutableState1);
                boolean z1 = composer0.t(a0);
                androidx.compose.foundation.ClickableKt.clickable.4.delayPressInteraction.1.1 clickableKt$clickable$4$delayPressInteraction$1$10 = composer0.W();
                if(z || z1 || clickableKt$clickable$4$delayPressInteraction$1$10 == composer$Companion0.a()) {
                    clickableKt$clickable$4$delayPressInteraction$1$10 = new a(a0) {
                        final MutableState e;
                        final a f;

                        {
                            this.e = mutableState0;
                            this.f = a0;
                            super(0);
                        }

                        // 去混淆评级： 低(20)
                        @l
                        public final Boolean b() {
                            return ((Boolean)this.e.getValue()).booleanValue() || ((Boolean)this.f.invoke()).booleanValue();
                        }

                        @Override  // A3.a
                        public Object invoke() {
                            return this.b();
                        }
                    };
                    composer0.O(clickableKt$clickable$4$delayPressInteraction$1$10);
                }
                composer0.g0();
                State state1 = SnapshotStateKt.t(clickableKt$clickable$4$delayPressInteraction$1$10, composer0, 0);
                composer0.V(0xE2A708A4);
                MutableState mutableState2 = composer0.W();
                if(mutableState2 == composer$Companion0.a()) {
                    mutableState2 = SnapshotStateKt__SnapshotStateKt.g(Offset.d(0L), null, 2, null);
                    composer0.O(mutableState2);
                }
                composer0.g0();
                Companion modifier$Companion0 = Modifier.m0;
                MutableInteractionSource mutableInteractionSource0 = this.g;
                Boolean boolean0 = Boolean.valueOf(this.f);
                MutableInteractionSource mutableInteractionSource1 = this.g;
                Object[] arr_object = {mutableState2, Boolean.valueOf(this.f), mutableInteractionSource1, mutableState0, state1, state0};
                boolean z2 = this.f;
                composer0.V(0xDE219177);
                boolean z3 = false;
                for(int v1 = 0; v1 < 6; ++v1) {
                    z3 |= composer0.t(arr_object[v1]);
                }
                androidx.compose.foundation.ClickableKt.clickable.4.gesture.1.1 clickableKt$clickable$4$gesture$1$10 = composer0.W();
                if(z3 || clickableKt$clickable$4$gesture$1$10 == Composer.a.a()) {
                    boolean1 = boolean0;
                    mutableInteractionSource2 = mutableInteractionSource0;
                    modifier$Companion1 = modifier$Companion0;
                    mutableState3 = mutableState1;
                    clickableKt$clickable$4$gesture$1$10 = new o(z2, mutableInteractionSource1, mutableState0, state1, state0, null) {
                        int k;
                        private Object l;
                        final MutableState m;
                        final boolean n;
                        final MutableInteractionSource o;
                        final MutableState p;
                        final State q;
                        final State r;

                        {
                            this.m = mutableState0;
                            this.n = z;
                            this.o = mutableInteractionSource0;
                            this.p = mutableState1;
                            this.q = state0;
                            this.r = state1;
                            super(2, d0);
                        }

                        @m
                        public final Object a(@l PointerInputScope pointerInputScope0, @m d d0) {
                            return ((androidx.compose.foundation.ClickableKt.clickable.4.gesture.1.1)this.create(pointerInputScope0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@m Object object0, @l d d0) {
                            d d1 = new androidx.compose.foundation.ClickableKt.clickable.4.gesture.1.1(this.m, this.n, this.o, this.p, this.q, this.r, d0);
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
                                    long v = IntSizeKt.b(pointerInputScope0.a());
                                    Offset offset0 = Offset.d(OffsetKt.a(((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL))));
                                    this.m.setValue(offset0);
                                    androidx.compose.foundation.ClickableKt.clickable.4.gesture.1.1.1 clickableKt$clickable$4$gesture$1$1$10 = new p(this.o, this.p, this.q, null) {
                                        int k;
                                        private Object l;
                                        long m;
                                        final boolean n;
                                        final MutableInteractionSource o;
                                        final MutableState p;
                                        final State q;

                                        {
                                            this.n = z;
                                            this.o = mutableInteractionSource0;
                                            this.p = mutableState0;
                                            this.q = state0;
                                            super(3, d0);
                                        }

                                        @m
                                        public final Object a(@l PressGestureScope pressGestureScope0, long v, @m d d0) {
                                            androidx.compose.foundation.ClickableKt.clickable.4.gesture.1.1.1 clickableKt$clickable$4$gesture$1$1$10 = new androidx.compose.foundation.ClickableKt.clickable.4.gesture.1.1.1(this.n, this.o, this.p, this.q, d0);
                                            clickableKt$clickable$4$gesture$1$1$10.l = pressGestureScope0;
                                            clickableKt$clickable$4$gesture$1$1$10.m = v;
                                            return clickableKt$clickable$4$gesture$1$1$10.invokeSuspend(S0.a);
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
                                                    long v = this.m;
                                                    if(this.n) {
                                                        this.k = 1;
                                                        if(ClickableKt.n(pressGestureScope0, v, this.o, this.p, this.q, this) == object1) {
                                                            return object1;
                                                        }
                                                    }
                                                    return S0.a;
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
                                    androidx.compose.foundation.ClickableKt.clickable.4.gesture.1.1.2 clickableKt$clickable$4$gesture$1$1$20 = new Function1(this.r) {
                                        final boolean e;
                                        final State f;

                                        {
                                            this.e = z;
                                            this.f = state0;
                                            super(1);
                                        }

                                        public final void a(long v) {
                                            if(this.e) {
                                                ((a)this.f.getValue()).invoke();
                                            }
                                        }

                                        @Override  // kotlin.jvm.functions.Function1
                                        public Object invoke(Object object0) {
                                            this.a(((Offset)object0).A());
                                            return S0.a;
                                        }
                                    };
                                    this.k = 1;
                                    return TapGestureDetectorKt.j(pointerInputScope0, clickableKt$clickable$4$gesture$1$1$10, clickableKt$clickable$4$gesture$1$1$20, this) == object1 ? object1 : S0.a;
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
                    composer0.O(clickableKt$clickable$4$gesture$1$10);
                }
                else {
                    boolean1 = boolean0;
                    mutableInteractionSource2 = mutableInteractionSource0;
                    modifier$Companion1 = modifier$Companion0;
                    mutableState3 = mutableState1;
                }
                composer0.g0();
                Modifier modifier1 = SuspendingPointerInputFilterKt.d(modifier$Companion1, mutableInteractionSource2, boolean1, clickableKt$clickable$4$gesture$1$10);
                Companion modifier$Companion2 = Modifier.m0;
                composer0.V(0xE2A708A4);
                androidx.compose.foundation.ClickableKt.clickable.4.1.1 clickableKt$clickable$4$1$10 = composer0.W();
                androidx.compose.runtime.Composer.Companion composer$Companion1 = Composer.a;
                if(clickableKt$clickable$4$1$10 == composer$Companion1.a()) {
                    clickableKt$clickable$4$1$10 = new ModifierLocalConsumer() {
                        @Override  // androidx.compose.ui.Modifier$Element
                        public boolean H(Function1 function10) {
                            return androidx.compose.ui.b.b(this, function10);
                        }

                        @Override  // androidx.compose.ui.Modifier$Element
                        public Object P(Object object0, o o0) {
                            return androidx.compose.ui.b.c(this, object0, o0);
                        }

                        @Override  // androidx.compose.ui.Modifier$Element
                        public Object U(Object object0, o o0) {
                            return androidx.compose.ui.b.d(this, object0, o0);
                        }

                        @Override  // androidx.compose.ui.Modifier
                        public Modifier r0(Modifier modifier0) {
                            return androidx.compose.ui.a.a(this, modifier0);
                        }

                        @Override  // androidx.compose.ui.modifier.ModifierLocalConsumer
                        public void r1(@l ModifierLocalReadScope modifierLocalReadScope0) {
                            L.p(modifierLocalReadScope0, "scope");
                            Object object0 = modifierLocalReadScope0.a(ScrollableKt.g());
                            this.a.setValue(object0);
                        }

                        @Override  // androidx.compose.ui.Modifier$Element
                        public boolean u(Function1 function10) {
                            return androidx.compose.ui.b.a(this, function10);
                        }
                    };
                    composer0.O(clickableKt$clickable$4$1$10);
                }
                composer0.g0();
                Modifier modifier2 = modifier$Companion2.r0(clickableKt$clickable$4$1$10);
                MutableInteractionSource mutableInteractionSource3 = this.g;
                Indication indication0 = this.h;
                composer0.V(0x2E20B340);
                composer0.V(0xE2A708A4);
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer0.W();
                if(compositionScopedCoroutineScopeCanceller0 == composer$Companion1.a()) {
                    compositionScopedCoroutineScopeCanceller0 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.m(i.a, composer0));
                    composer0.O(compositionScopedCoroutineScopeCanceller0);
                }
                composer0.g0();
                composer0.g0();
                Modifier modifier3 = ClickableKt.j(modifier2, modifier1, mutableInteractionSource3, indication0, compositionScopedCoroutineScopeCanceller0.b(), linkedHashMap0, mutableState2, this.f, this.i, this.j, null, null, this.e);
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return modifier3;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,170:1\n199#2,8:171\n*E\n"})
        public final class androidx.compose.foundation.ClickableKt.clickable-O2vRcR0..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final boolean e;
            final String f;
            final Role g;
            final a h;
            final Indication i;
            final MutableInteractionSource j;

            public androidx.compose.foundation.ClickableKt.clickable-O2vRcR0..inlined.debugInspectorInfo.1(boolean z, String s, Role role0, a a0, Indication indication0, MutableInteractionSource mutableInteractionSource0) {
                this.e = z;
                this.f = s;
                this.g = role0;
                this.h = a0;
                this.i = indication0;
                this.j = mutableInteractionSource0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("clickable");
                inspectorInfo0.b().c("enabled", Boolean.valueOf(this.e));
                inspectorInfo0.b().c("onClickLabel", this.f);
                inspectorInfo0.b().c("role", this.g);
                inspectorInfo0.b().c("onClick", this.h);
                inspectorInfo0.b().c("indication", this.i);
                inspectorInfo0.b().c("interactionSource", this.j);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier c(Modifier modifier0, MutableInteractionSource mutableInteractionSource0, Indication indication0, boolean z, String s, Role role0, a a0, int v, Object object0) {
        boolean z1 = (v & 4) == 0 ? z : true;
        String s1 = (v & 8) == 0 ? s : null;
        return (v & 16) == 0 ? ClickableKt.b(modifier0, mutableInteractionSource0, indication0, z1, s1, role0, a0) : ClickableKt.b(modifier0, mutableInteractionSource0, indication0, z1, s1, null, a0);
    }

    @l
    public static final Modifier d(@l Modifier modifier0, boolean z, @m String s, @m Role role0, @l a a0) {
        L.p(modifier0, "$this$clickable");
        L.p(a0, "onClick");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(z, s, role0, a0) {
            final boolean e;
            final String f;
            final Role g;
            final a h;

            {
                this.e = z;
                this.f = s;
                this.g = role0;
                this.h = a0;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0xD2EF1E09);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0xD2EF1E09, v, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:92)");
                }
                Companion modifier$Companion0 = Modifier.m0;
                Object object0 = composer0.L(IndicationKt.a());
                composer0.V(0xE2A708A4);
                MutableInteractionSource mutableInteractionSource0 = composer0.W();
                if(mutableInteractionSource0 == Composer.a.a()) {
                    mutableInteractionSource0 = InteractionSourceKt.a();
                    composer0.O(mutableInteractionSource0);
                }
                composer0.g0();
                Modifier modifier1 = ClickableKt.b(modifier$Companion0, mutableInteractionSource0, ((Indication)object0), this.e, this.f, this.g, this.h);
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

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,170:1\n87#2,6:171\n*E\n"})
        public final class androidx.compose.foundation.ClickableKt.clickable-XHw0xAI..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final boolean e;
            final String f;
            final Role g;
            final a h;

            public androidx.compose.foundation.ClickableKt.clickable-XHw0xAI..inlined.debugInspectorInfo.1(boolean z, String s, Role role0, a a0) {
                this.e = z;
                this.f = s;
                this.g = role0;
                this.h = a0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("clickable");
                inspectorInfo0.b().c("enabled", Boolean.valueOf(this.e));
                inspectorInfo0.b().c("onClickLabel", this.f);
                inspectorInfo0.b().c("role", this.g);
                inspectorInfo0.b().c("onClick", this.h);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier e(Modifier modifier0, boolean z, String s, Role role0, a a0, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        if((v & 2) != 0) {
            s = null;
        }
        if((v & 4) != 0) {
            role0 = null;
        }
        return ClickableKt.d(modifier0, z, s, role0, a0);
    }

    @ExperimentalFoundationApi
    @l
    public static final Modifier f(@l Modifier modifier0, @l MutableInteractionSource mutableInteractionSource0, @m Indication indication0, boolean z, @m String s, @m Role role0, @m String s1, @m a a0, @m a a1, @l a a2) {
        L.p(modifier0, "$this$combinedClickable");
        L.p(mutableInteractionSource0, "interactionSource");
        L.p(a2, "onClick");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(a2, a0, a1, z, mutableInteractionSource0, indication0, s, role0, s1) {
            final a e;
            final a f;
            final a g;
            final boolean h;
            final MutableInteractionSource i;
            final Indication j;
            final String k;
            final Role l;
            final String m;

            {
                this.e = a0;
                this.f = a1;
                this.g = a2;
                this.h = z;
                this.i = mutableInteractionSource0;
                this.j = indication0;
                this.k = s;
                this.l = role0;
                this.m = s1;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(1841718000);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(1841718000, v, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:306)");
                }
                State state0 = SnapshotStateKt.t(this.e, composer0, 0);
                State state1 = SnapshotStateKt.t(this.f, composer0, 0);
                State state2 = SnapshotStateKt.t(this.g, composer0, 0);
                boolean z = this.f != null;
                boolean z1 = this.g != null;
                composer0.V(0xE2A708A4);
                MutableState mutableState0 = composer0.W();
                androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.a;
                if(mutableState0 == composer$Companion0.a()) {
                    mutableState0 = SnapshotStateKt__SnapshotStateKt.g(null, null, 2, null);
                    composer0.O(mutableState0);
                }
                composer0.g0();
                composer0.V(0xE2A708A4);
                LinkedHashMap linkedHashMap0 = composer0.W();
                if(linkedHashMap0 == composer$Companion0.a()) {
                    linkedHashMap0 = new LinkedHashMap();
                    composer0.O(linkedHashMap0);
                }
                composer0.g0();
                composer0.V(1321107720);
                if(this.h) {
                    Boolean boolean0 = Boolean.valueOf(z);
                    MutableInteractionSource mutableInteractionSource0 = this.i;
                    composer0.V(0x1E7B2B64);
                    boolean z2 = composer0.t(mutableState0);
                    boolean z3 = composer0.t(mutableInteractionSource0);
                    androidx.compose.foundation.ClickableKt.combinedClickable.4.1.1 clickableKt$combinedClickable$4$1$10 = composer0.W();
                    if(z2 || z3 || clickableKt$combinedClickable$4$1$10 == composer$Companion0.a()) {
                        clickableKt$combinedClickable$4$1$10 = new Function1(mutableInteractionSource0) {
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
                                            this.b.a(pressInteraction$Cancel0);
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
                        composer0.O(clickableKt$combinedClickable$4$1$10);
                    }
                    composer0.g0();
                    EffectsKt.c(boolean0, clickableKt$combinedClickable$4$1$10, composer0, 0);
                    ClickableKt.a(this.i, mutableState0, linkedHashMap0, composer0, 560);
                }
                composer0.g0();
                a a0 = Clickable_androidKt.d(composer0, 0);
                composer0.V(0xE2A708A4);
                MutableState mutableState1 = composer0.W();
                if(mutableState1 == composer$Companion0.a()) {
                    mutableState1 = SnapshotStateKt__SnapshotStateKt.g(Boolean.TRUE, null, 2, null);
                    composer0.O(mutableState1);
                }
                composer0.g0();
                composer0.V(0x1E7B2B64);
                boolean z4 = composer0.t(mutableState1);
                boolean z5 = composer0.t(a0);
                androidx.compose.foundation.ClickableKt.combinedClickable.4.delayPressInteraction.1.1 clickableKt$combinedClickable$4$delayPressInteraction$1$10 = composer0.W();
                if(z4 || z5 || clickableKt$combinedClickable$4$delayPressInteraction$1$10 == composer$Companion0.a()) {
                    clickableKt$combinedClickable$4$delayPressInteraction$1$10 = new a(a0) {
                        final MutableState e;
                        final a f;

                        {
                            this.e = mutableState0;
                            this.f = a0;
                            super(0);
                        }

                        // 去混淆评级： 低(20)
                        @l
                        public final Boolean b() {
                            return ((Boolean)this.e.getValue()).booleanValue() || ((Boolean)this.f.invoke()).booleanValue();
                        }

                        @Override  // A3.a
                        public Object invoke() {
                            return this.b();
                        }
                    };
                    composer0.O(clickableKt$combinedClickable$4$delayPressInteraction$1$10);
                }
                composer0.g0();
                State state3 = SnapshotStateKt.t(clickableKt$combinedClickable$4$delayPressInteraction$1$10, composer0, 0);
                composer0.V(0xE2A708A4);
                MutableState mutableState2 = composer0.W();
                if(mutableState2 == composer$Companion0.a()) {
                    mutableState2 = SnapshotStateKt__SnapshotStateKt.g(Offset.d(0L), null, 2, null);
                    composer0.O(mutableState2);
                }
                composer0.g0();
                Companion modifier$Companion0 = Modifier.m0;
                Object[] arr_object = {this.i, Boolean.valueOf(z), Boolean.valueOf(z1), Boolean.valueOf(this.h)};
                MutableInteractionSource mutableInteractionSource1 = this.i;
                Object[] arr_object1 = {mutableState2, Boolean.valueOf(z1), Boolean.valueOf(this.h), state2, Boolean.valueOf(z), state1, mutableInteractionSource1, mutableState0, state3, state0};
                boolean z6 = this.h;
                composer0.V(0xDE219177);
                boolean z7 = false;
                for(int v1 = 0; v1 < 10; ++v1) {
                    z7 |= composer0.t(arr_object1[v1]);
                }
                androidx.compose.foundation.ClickableKt.combinedClickable.4.gesture.1.1 clickableKt$combinedClickable$4$gesture$1$10 = composer0.W();
                if(z7 || clickableKt$combinedClickable$4$gesture$1$10 == Composer.a.a()) {
                    clickableKt$combinedClickable$4$gesture$1$10 = new o(z1, z6, z, state2, state1, mutableInteractionSource1, mutableState0, state3, state0, null) {
                        int k;
                        private Object l;
                        final MutableState m;
                        final boolean n;
                        final boolean o;
                        final boolean p;
                        final State q;
                        final State r;
                        final MutableInteractionSource s;
                        final MutableState t;
                        final State u;
                        final State v;

                        {
                            this.m = mutableState0;
                            this.n = z;
                            this.o = z1;
                            this.p = z2;
                            this.q = state0;
                            this.r = state1;
                            this.s = mutableInteractionSource0;
                            this.t = mutableState1;
                            this.u = state2;
                            this.v = state3;
                            super(2, d0);
                        }

                        @m
                        public final Object a(@l PointerInputScope pointerInputScope0, @m d d0) {
                            return ((androidx.compose.foundation.ClickableKt.combinedClickable.4.gesture.1.1)this.create(pointerInputScope0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@m Object object0, @l d d0) {
                            d d1 = new androidx.compose.foundation.ClickableKt.combinedClickable.4.gesture.1.1(this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, d0);
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
                                    long v = IntSizeKt.b(pointerInputScope0.a());
                                    Offset offset0 = Offset.d(OffsetKt.a(((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL))));
                                    this.m.setValue(offset0);
                                    androidx.compose.foundation.ClickableKt.combinedClickable.4.gesture.1.1.1 clickableKt$combinedClickable$4$gesture$1$1$10 = !this.n || !this.o ? null : new Function1() {
                                        final State e;

                                        {
                                            this.e = state0;
                                            super(1);
                                        }

                                        public final void a(long v) {
                                            a a0 = (a)this.e.getValue();
                                            if(a0 != null) {
                                                a0.invoke();
                                            }
                                        }

                                        @Override  // kotlin.jvm.functions.Function1
                                        public Object invoke(Object object0) {
                                            this.a(((Offset)object0).A());
                                            return S0.a;
                                        }
                                    };
                                    androidx.compose.foundation.ClickableKt.combinedClickable.4.gesture.1.1.2 clickableKt$combinedClickable$4$gesture$1$1$20 = !this.p || !this.o ? null : new Function1() {
                                        final State e;

                                        {
                                            this.e = state0;
                                            super(1);
                                        }

                                        public final void a(long v) {
                                            a a0 = (a)this.e.getValue();
                                            if(a0 != null) {
                                                a0.invoke();
                                            }
                                        }

                                        @Override  // kotlin.jvm.functions.Function1
                                        public Object invoke(Object object0) {
                                            this.a(((Offset)object0).A());
                                            return S0.a;
                                        }
                                    };
                                    androidx.compose.foundation.ClickableKt.combinedClickable.4.gesture.1.1.3 clickableKt$combinedClickable$4$gesture$1$1$30 = new p(this.s, this.t, this.u, null) {
                                        int k;
                                        private Object l;
                                        long m;
                                        final boolean n;
                                        final MutableInteractionSource o;
                                        final MutableState p;
                                        final State q;

                                        {
                                            this.n = z;
                                            this.o = mutableInteractionSource0;
                                            this.p = mutableState0;
                                            this.q = state0;
                                            super(3, d0);
                                        }

                                        @m
                                        public final Object a(@l PressGestureScope pressGestureScope0, long v, @m d d0) {
                                            androidx.compose.foundation.ClickableKt.combinedClickable.4.gesture.1.1.3 clickableKt$combinedClickable$4$gesture$1$1$30 = new androidx.compose.foundation.ClickableKt.combinedClickable.4.gesture.1.1.3(this.n, this.o, this.p, this.q, d0);
                                            clickableKt$combinedClickable$4$gesture$1$1$30.l = pressGestureScope0;
                                            clickableKt$combinedClickable$4$gesture$1$1$30.m = v;
                                            return clickableKt$combinedClickable$4$gesture$1$1$30.invokeSuspend(S0.a);
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
                                                    long v = this.m;
                                                    if(this.n) {
                                                        this.k = 1;
                                                        if(ClickableKt.n(pressGestureScope0, v, this.o, this.p, this.q, this) == object1) {
                                                            return object1;
                                                        }
                                                    }
                                                    return S0.a;
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
                                    androidx.compose.foundation.ClickableKt.combinedClickable.4.gesture.1.1.4 clickableKt$combinedClickable$4$gesture$1$1$40 = new Function1(this.v) {
                                        final boolean e;
                                        final State f;

                                        {
                                            this.e = z;
                                            this.f = state0;
                                            super(1);
                                        }

                                        public final void a(long v) {
                                            if(this.e) {
                                                ((a)this.f.getValue()).invoke();
                                            }
                                        }

                                        @Override  // kotlin.jvm.functions.Function1
                                        public Object invoke(Object object0) {
                                            this.a(((Offset)object0).A());
                                            return S0.a;
                                        }
                                    };
                                    this.k = 1;
                                    return TapGestureDetectorKt.l(pointerInputScope0, clickableKt$combinedClickable$4$gesture$1$1$10, clickableKt$combinedClickable$4$gesture$1$1$20, clickableKt$combinedClickable$4$gesture$1$1$30, clickableKt$combinedClickable$4$gesture$1$1$40, this) == object1 ? object1 : S0.a;
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
                    composer0.O(clickableKt$combinedClickable$4$gesture$1$10);
                }
                composer0.g0();
                Modifier modifier1 = SuspendingPointerInputFilterKt.e(modifier$Companion0, arr_object, clickableKt$combinedClickable$4$gesture$1$10);
                Companion modifier$Companion1 = Modifier.m0;
                composer0.V(0xE2A708A4);
                androidx.compose.foundation.ClickableKt.combinedClickable.4.2.1 clickableKt$combinedClickable$4$2$10 = composer0.W();
                androidx.compose.runtime.Composer.Companion composer$Companion1 = Composer.a;
                if(clickableKt$combinedClickable$4$2$10 == composer$Companion1.a()) {
                    clickableKt$combinedClickable$4$2$10 = new ModifierLocalConsumer() {
                        @Override  // androidx.compose.ui.Modifier$Element
                        public boolean H(Function1 function10) {
                            return androidx.compose.ui.b.b(this, function10);
                        }

                        @Override  // androidx.compose.ui.Modifier$Element
                        public Object P(Object object0, o o0) {
                            return androidx.compose.ui.b.c(this, object0, o0);
                        }

                        @Override  // androidx.compose.ui.Modifier$Element
                        public Object U(Object object0, o o0) {
                            return androidx.compose.ui.b.d(this, object0, o0);
                        }

                        @Override  // androidx.compose.ui.Modifier
                        public Modifier r0(Modifier modifier0) {
                            return androidx.compose.ui.a.a(this, modifier0);
                        }

                        @Override  // androidx.compose.ui.modifier.ModifierLocalConsumer
                        public void r1(@l ModifierLocalReadScope modifierLocalReadScope0) {
                            L.p(modifierLocalReadScope0, "scope");
                            Object object0 = modifierLocalReadScope0.a(ScrollableKt.g());
                            this.a.setValue(object0);
                        }

                        @Override  // androidx.compose.ui.Modifier$Element
                        public boolean u(Function1 function10) {
                            return androidx.compose.ui.b.a(this, function10);
                        }
                    };
                    composer0.O(clickableKt$combinedClickable$4$2$10);
                }
                composer0.g0();
                Modifier modifier2 = modifier$Companion1.r0(clickableKt$combinedClickable$4$2$10);
                MutableInteractionSource mutableInteractionSource2 = this.i;
                Indication indication0 = this.j;
                composer0.V(0x2E20B340);
                composer0.V(0xE2A708A4);
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer0.W();
                if(compositionScopedCoroutineScopeCanceller0 == composer$Companion1.a()) {
                    compositionScopedCoroutineScopeCanceller0 = new CompositionScopedCoroutineScopeCanceller(EffectsKt.m(i.a, composer0));
                    composer0.O(compositionScopedCoroutineScopeCanceller0);
                }
                composer0.g0();
                composer0.g0();
                Modifier modifier3 = ClickableKt.j(modifier2, modifier1, mutableInteractionSource2, indication0, compositionScopedCoroutineScopeCanceller0.b(), linkedHashMap0, mutableState2, this.h, this.k, this.l, this.m, this.f, this.e);
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return modifier3;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,170:1\n396#2,11:171\n*E\n"})
        public final class androidx.compose.foundation.ClickableKt.combinedClickable-XVZzFYc..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final boolean e;
            final String f;
            final Role g;
            final a h;
            final a i;
            final a j;
            final String k;
            final Indication l;
            final MutableInteractionSource m;

            public androidx.compose.foundation.ClickableKt.combinedClickable-XVZzFYc..inlined.debugInspectorInfo.1(boolean z, String s, Role role0, a a0, a a1, a a2, String s1, Indication indication0, MutableInteractionSource mutableInteractionSource0) {
                this.e = z;
                this.f = s;
                this.g = role0;
                this.h = a0;
                this.i = a1;
                this.j = a2;
                this.k = s1;
                this.l = indication0;
                this.m = mutableInteractionSource0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("combinedClickable");
                inspectorInfo0.b().c("enabled", Boolean.valueOf(this.e));
                inspectorInfo0.b().c("onClickLabel", this.f);
                inspectorInfo0.b().c("role", this.g);
                inspectorInfo0.b().c("onClick", this.h);
                inspectorInfo0.b().c("onDoubleClick", this.i);
                inspectorInfo0.b().c("onLongClick", this.j);
                inspectorInfo0.b().c("onLongClickLabel", this.k);
                inspectorInfo0.b().c("indication", this.l);
                inspectorInfo0.b().c("interactionSource", this.m);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier g(Modifier modifier0, MutableInteractionSource mutableInteractionSource0, Indication indication0, boolean z, String s, Role role0, String s1, a a0, a a1, a a2, int v, Object object0) {
        boolean z1 = (v & 4) == 0 ? z : true;
        String s2 = (v & 8) == 0 ? s : null;
        Role role1 = (v & 16) == 0 ? role0 : null;
        String s3 = (v & 0x20) == 0 ? s1 : null;
        a a3 = (v & 0x40) == 0 ? a0 : null;
        return (v & 0x80) == 0 ? ClickableKt.f(modifier0, mutableInteractionSource0, indication0, z1, s2, role1, s3, a3, a1, a2) : ClickableKt.f(modifier0, mutableInteractionSource0, indication0, z1, s2, role1, s3, a3, null, a2);
    }

    @ExperimentalFoundationApi
    @l
    public static final Modifier h(@l Modifier modifier0, boolean z, @m String s, @m Role role0, @m String s1, @m a a0, @m a a1, @l a a2) {
        L.p(modifier0, "$this$combinedClickable");
        L.p(a2, "onClick");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(z, s, role0, s1, a0, a1, a2) {
            final boolean e;
            final String f;
            final Role g;
            final String h;
            final a i;
            final a j;
            final a k;

            {
                this.e = z;
                this.f = s;
                this.g = role0;
                this.h = s1;
                this.i = a0;
                this.j = a1;
                this.k = a2;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0x755F393B);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x755F393B, v, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:252)");
                }
                Companion modifier$Companion0 = Modifier.m0;
                Object object0 = composer0.L(IndicationKt.a());
                composer0.V(0xE2A708A4);
                MutableInteractionSource mutableInteractionSource0 = composer0.W();
                if(mutableInteractionSource0 == Composer.a.a()) {
                    mutableInteractionSource0 = InteractionSourceKt.a();
                    composer0.O(mutableInteractionSource0);
                }
                composer0.g0();
                Modifier modifier1 = ClickableKt.f(modifier$Companion0, mutableInteractionSource0, ((Indication)object0), this.e, this.f, this.g, this.h, this.i, this.j, this.k);
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

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,170:1\n244#2,9:171\n*E\n"})
        public final class androidx.compose.foundation.ClickableKt.combinedClickable-cJG_KMw..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final boolean e;
            final String f;
            final Role g;
            final a h;
            final a i;
            final a j;
            final String k;

            public androidx.compose.foundation.ClickableKt.combinedClickable-cJG_KMw..inlined.debugInspectorInfo.1(boolean z, String s, Role role0, a a0, a a1, a a2, String s1) {
                this.e = z;
                this.f = s;
                this.g = role0;
                this.h = a0;
                this.i = a1;
                this.j = a2;
                this.k = s1;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("combinedClickable");
                inspectorInfo0.b().c("enabled", Boolean.valueOf(this.e));
                inspectorInfo0.b().c("onClickLabel", this.f);
                inspectorInfo0.b().c("role", this.g);
                inspectorInfo0.b().c("onClick", this.h);
                inspectorInfo0.b().c("onDoubleClick", this.i);
                inspectorInfo0.b().c("onLongClick", this.j);
                inspectorInfo0.b().c("onLongClickLabel", this.k);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier i(Modifier modifier0, boolean z, String s, Role role0, String s1, a a0, a a1, a a2, int v, Object object0) {
        boolean z1 = (v & 1) == 0 ? z : true;
        String s2 = (v & 2) == 0 ? s : null;
        Role role1 = (v & 4) == 0 ? role0 : null;
        String s3 = (v & 8) == 0 ? s1 : null;
        a a3 = (v & 16) == 0 ? a0 : null;
        return (v & 0x20) == 0 ? ClickableKt.h(modifier0, z1, s2, role1, s3, a3, a1, a2) : ClickableKt.h(modifier0, z1, s2, role1, s3, a3, null, a2);
    }

    @l
    public static final Modifier j(@l Modifier modifier0, @l Modifier modifier1, @l MutableInteractionSource mutableInteractionSource0, @m Indication indication0, @l O o0, @l Map map0, @l State state0, boolean z, @m String s, @m Role role0, @m String s1, @m a a0, @l a a1) {
        L.p(modifier0, "$this$genericClickableWithoutGesture");
        L.p(modifier1, "gestureModifiers");
        L.p(mutableInteractionSource0, "interactionSource");
        L.p(o0, "indicationScope");
        L.p(map0, "currentKeyPressInteractions");
        L.p(state0, "keyClickOffset");
        L.p(a1, "onClick");
        return FocusableKt.d(HoverableKt.a(IndicationKt.b(ClickableKt.m(ClickableKt.l(modifier0, role0, s, a0, s1, z, a1), z, map0, state0, o0, a1, mutableInteractionSource0), mutableInteractionSource0, indication0), mutableInteractionSource0, z), z, mutableInteractionSource0).r0(modifier1);
    }

    public static Modifier k(Modifier modifier0, Modifier modifier1, MutableInteractionSource mutableInteractionSource0, Indication indication0, O o0, Map map0, State state0, boolean z, String s, Role role0, String s1, a a0, a a1, int v, Object object0) {
        boolean z1 = (v & 0x40) == 0 ? z : true;
        String s2 = (v & 0x80) == 0 ? s : null;
        Role role1 = (v & 0x100) == 0 ? role0 : null;
        String s3 = (v & 0x200) == 0 ? s1 : null;
        return (v & 0x400) == 0 ? ClickableKt.j(modifier0, modifier1, mutableInteractionSource0, indication0, o0, map0, state0, z1, s2, role1, s3, a0, a1) : ClickableKt.j(modifier0, modifier1, mutableInteractionSource0, indication0, o0, map0, state0, z1, s2, role1, s3, null, a1);
    }

    private static final Modifier l(Modifier modifier0, Role role0, String s, a a0, String s1, boolean z, a a1) {
        return SemanticsModifierKt.b(modifier0, true, new Function1(role0, s, a0, s1, z, a1) {
            final Role e;
            final String f;
            final a g;
            final String h;
            final boolean i;
            final a j;

            {
                this.e = role0;
                this.f = s;
                this.g = a0;
                this.h = s1;
                this.i = z;
                this.j = a1;
                super(1);
            }

            public final void a(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                L.p(semanticsPropertyReceiver0, "$this$semantics");
                Role role0 = this.e;
                if(role0 != null) {
                    SemanticsPropertiesKt.R0(semanticsPropertyReceiver0, role0.n());
                }
                androidx.compose.foundation.ClickableKt.genericClickableWithoutGesture.clickSemantics.1.1 clickableKt$genericClickableWithoutGesture$clickSemantics$1$10 = new a() {
                    final a e;

                    {
                        this.e = a0;
                        super(0);
                    }

                    @l
                    public final Boolean b() {
                        this.e.invoke();
                        return true;
                    }

                    @Override  // A3.a
                    public Object invoke() {
                        return this.b();
                    }
                };
                SemanticsPropertiesKt.g0(semanticsPropertyReceiver0, this.f, clickableKt$genericClickableWithoutGesture$clickSemantics$1$10);
                a a0 = this.g;
                if(a0 != null) {
                    androidx.compose.foundation.ClickableKt.genericClickableWithoutGesture.clickSemantics.1.2 clickableKt$genericClickableWithoutGesture$clickSemantics$1$20 = new a() {
                        final a e;

                        {
                            this.e = a0;
                            super(0);
                        }

                        @l
                        public final Boolean b() {
                            this.e.invoke();
                            return true;
                        }

                        @Override  // A3.a
                        public Object invoke() {
                            return this.b();
                        }
                    };
                    SemanticsPropertiesKt.i0(semanticsPropertyReceiver0, this.h, clickableKt$genericClickableWithoutGesture$clickSemantics$1$20);
                }
                if(!this.i) {
                    SemanticsPropertiesKt.j(semanticsPropertyReceiver0);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((SemanticsPropertyReceiver)object0));
                return S0.a;
            }
        });
    }

    private static final Modifier m(Modifier modifier0, boolean z, Map map0, State state0, O o0, a a0, MutableInteractionSource mutableInteractionSource0) {
        return KeyInputModifierKt.a(modifier0, new Function1(z, map0, state0, o0, a0, mutableInteractionSource0) {
            final boolean e;
            final Map f;
            final State g;
            final O h;
            final a i;
            final MutableInteractionSource j;

            {
                this.e = z;
                this.f = map0;
                this.g = state0;
                this.h = o0;
                this.i = a0;
                this.j = mutableInteractionSource0;
                super(1);
            }

            @l
            public final Boolean a(@l KeyEvent keyEvent0) {
                L.p(keyEvent0, "keyEvent");
                if(this.e && Clickable_androidKt.g(keyEvent0)) {
                    Key key0 = Key.B4(KeyEvent_androidKt.a(keyEvent0));
                    if(!this.f.containsKey(key0)) {
                        Press pressInteraction$Press0 = new Press(((Offset)this.g.getValue()).A(), null);
                        Key key1 = Key.B4(KeyEvent_androidKt.a(keyEvent0));
                        this.f.put(key1, pressInteraction$Press0);
                        androidx.compose.foundation.ClickableKt.genericClickableWithoutGesture.detectPressAndClickFromKey.1.1 clickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$10 = new o(pressInteraction$Press0, null) {
                            int k;
                            final MutableInteractionSource l;
                            final Press m;

                            {
                                this.l = mutableInteractionSource0;
                                this.m = pressInteraction$Press0;
                                super(2, d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                return new androidx.compose.foundation.ClickableKt.genericClickableWithoutGesture.detectPressAndClickFromKey.1.1(this.l, this.m, d0);
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((O)object0), ((d)object1));
                            }

                            @m
                            public final Object invoke(@l O o0, @m d d0) {
                                return ((androidx.compose.foundation.ClickableKt.genericClickableWithoutGesture.detectPressAndClickFromKey.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                Object object1 = b.l();
                                switch(this.k) {
                                    case 0: {
                                        f0.n(object0);
                                        this.k = 1;
                                        return this.l.b(this.m, this) == object1 ? object1 : S0.a;
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
                        k.f(this.h, null, null, clickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$10, 3, null);
                        return true;
                    }
                }
                else if(this.e && Clickable_androidKt.c(keyEvent0)) {
                    Key key2 = Key.B4(KeyEvent_androidKt.a(keyEvent0));
                    Press pressInteraction$Press1 = (Press)this.f.remove(key2);
                    if(pressInteraction$Press1 != null) {
                        androidx.compose.foundation.ClickableKt.genericClickableWithoutGesture.detectPressAndClickFromKey.1.2.1 clickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$10 = new o(pressInteraction$Press1, null) {
                            int k;
                            final MutableInteractionSource l;
                            final Press m;

                            {
                                this.l = mutableInteractionSource0;
                                this.m = pressInteraction$Press0;
                                super(2, d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                return new androidx.compose.foundation.ClickableKt.genericClickableWithoutGesture.detectPressAndClickFromKey.1.2.1(this.l, this.m, d0);
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((O)object0), ((d)object1));
                            }

                            @m
                            public final Object invoke(@l O o0, @m d d0) {
                                return ((androidx.compose.foundation.ClickableKt.genericClickableWithoutGesture.detectPressAndClickFromKey.1.2.1)this.create(o0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                Object object1 = b.l();
                                switch(this.k) {
                                    case 0: {
                                        f0.n(object0);
                                        Release pressInteraction$Release0 = new Release(this.m);
                                        this.k = 1;
                                        return this.l.b(pressInteraction$Release0, this) == object1 ? object1 : S0.a;
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
                        k.f(this.h, null, null, clickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$10, 3, null);
                    }
                    this.i.invoke();
                    return true;
                }
                return false;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((androidx.compose.ui.input.key.KeyEvent)object0).h());
            }
        });
    }

    @m
    public static final Object n(@l PressGestureScope pressGestureScope0, long v, @l MutableInteractionSource mutableInteractionSource0, @l MutableState mutableState0, @l State state0, @l d d0) {
        Object object0 = P.g(new o(pressGestureScope0, v, mutableInteractionSource0, mutableState0, state0, null) {
            boolean k;
            int l;
            private Object m;
            final PressGestureScope n;
            final long o;
            final MutableInteractionSource p;
            final MutableState q;
            final State r;

            {
                this.n = pressGestureScope0;
                this.o = v;
                this.p = mutableInteractionSource0;
                this.q = mutableState0;
                this.r = state0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.foundation.ClickableKt.handlePressInteraction.2(this.n, this.o, this.p, this.q, this.r, d0);
                d1.m = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.foundation.ClickableKt.handlePressInteraction.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Release pressInteraction$Release0;
                boolean z;
                Object object2;
                I0 i00;
                Object object1 = b.l();
                switch(this.l) {
                    case 0: {
                        f0.n(object0);
                        i00 = k.f(((O)this.m), null, null, new o(this.o, this.p, this.q, null) {
                            Object k;
                            int l;
                            final State m;
                            final long n;
                            final MutableInteractionSource o;
                            final MutableState p;

                            {
                                this.m = state0;
                                this.n = v;
                                this.o = mutableInteractionSource0;
                                this.p = mutableState0;
                                super(2, d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                return new androidx.compose.foundation.ClickableKt.handlePressInteraction.2.delayJob.1(this.m, this.n, this.o, this.p, d0);
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((O)object0), ((d)object1));
                            }

                            @m
                            public final Object invoke(@l O o0, @m d d0) {
                                return ((androidx.compose.foundation.ClickableKt.handlePressInteraction.2.delayJob.1)this.create(o0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                Press pressInteraction$Press1;
                                Object object1 = b.l();
                                switch(this.l) {
                                    case 0: {
                                        f0.n(object0);
                                        if(((Boolean)((a)this.m.getValue()).invoke()).booleanValue()) {
                                            this.l = 1;
                                            if(a0.b(100L, this) == object1) {
                                                return object1;
                                            }
                                        }
                                        goto label_9;
                                    }
                                    case 1: {
                                        f0.n(object0);
                                    label_9:
                                        Press pressInteraction$Press0 = new Press(this.n, null);
                                        this.k = pressInteraction$Press0;
                                        this.l = 2;
                                        if(this.o.b(pressInteraction$Press0, this) == object1) {
                                            return object1;
                                        }
                                        pressInteraction$Press1 = pressInteraction$Press0;
                                        break;
                                    }
                                    case 2: {
                                        pressInteraction$Press1 = (Press)this.k;
                                        f0.n(object0);
                                        break;
                                    }
                                    default: {
                                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                    }
                                }
                                this.p.setValue(pressInteraction$Press1);
                                return S0.a;
                            }
                        }, 3, null);
                        this.m = i00;
                        this.l = 1;
                        object2 = this.n.e1(this);
                        if(object2 == object1) {
                            return object1;
                        }
                    label_22:
                        boolean z1 = ((Boolean)object2).booleanValue();
                        if(i00.isActive()) {
                            this.m = null;
                            this.k = z1;
                            this.l = 2;
                            if(M0.l(i00, this) == object1) {
                                return object1;
                            }
                            z = z1;
                        label_30:
                            if(z) {
                                Press pressInteraction$Press0 = new Press(this.o, null);
                                Release pressInteraction$Release1 = new Release(pressInteraction$Press0);
                                this.m = pressInteraction$Release1;
                                this.l = 3;
                                if(this.p.b(pressInteraction$Press0, this) == object1) {
                                    return object1;
                                }
                                pressInteraction$Release0 = pressInteraction$Release1;
                            label_38:
                                this.m = null;
                                this.l = 4;
                                if(this.p.b(pressInteraction$Release0, this) == object1) {
                                    return object1;
                                }
                            }
                        }
                        else {
                            Press pressInteraction$Press1 = (Press)this.q.getValue();
                            if(pressInteraction$Press1 != null) {
                                MutableInteractionSource mutableInteractionSource0 = this.p;
                                Release pressInteraction$Release2 = z1 ? new Release(pressInteraction$Press1) : new Cancel(pressInteraction$Press1);
                                this.m = null;
                                this.l = 5;
                                if(mutableInteractionSource0.b(pressInteraction$Release2, this) == object1) {
                                    return object1;
                                }
                            }
                        }
                        break;
                    }
                    case 1: {
                        i00 = (I0)this.m;
                        f0.n(object0);
                        object2 = object0;
                        goto label_22;
                    }
                    case 2: {
                        z = this.k;
                        f0.n(object0);
                        goto label_30;
                    }
                    case 3: {
                        pressInteraction$Release0 = (Release)this.m;
                        f0.n(object0);
                        goto label_38;
                    }
                    case 4: 
                    case 5: {
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                this.q.setValue(null);
                return S0.a;
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }
}

