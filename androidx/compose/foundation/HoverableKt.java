package androidx.compose.foundation;

import A3.o;
import A3.p;
import androidx.compose.foundation.interaction.HoverInteraction.Enter;
import androidx.compose.foundation.interaction.HoverInteraction.Exit;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.M0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nHoverable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,116:1\n135#2:117\n*S KotlinDebug\n*F\n+ 1 Hoverable.kt\nandroidx/compose/foundation/HoverableKt\n*L\n50#1:117\n*E\n"})
public final class HoverableKt {
    @l
    public static final Modifier a(@l Modifier modifier0, @l MutableInteractionSource mutableInteractionSource0, boolean z) {
        L.p(modifier0, "<this>");
        L.p(mutableInteractionSource0, "interactionSource");
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
            public final Modifier d(@l Modifier modifier0, @m Composer composer0, int v) {
                Modifier modifier1;
                L.p(modifier0, "$this$composed");
                composer0.V(1294013553);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(1294013553, v, -1, "androidx.compose.foundation.hoverable.<anonymous> (Hoverable.kt:54)");
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
                MutableInteractionSource mutableInteractionSource0 = this.e;
                composer0.V(0x1E7B2B64);
                boolean z = composer0.t(mutableState0);
                boolean z1 = composer0.t(mutableInteractionSource0);
                androidx.compose.foundation.HoverableKt.hoverable.2.1.1 hoverableKt$hoverable$2$1$10 = composer0.W();
                if(z || z1 || hoverableKt$hoverable$2$1$10 == composer$Companion0.a()) {
                    hoverableKt$hoverable$2$1$10 = new Function1(mutableInteractionSource0) {
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
                                    androidx.compose.foundation.HoverableKt.hoverable.2.i(this.f, this.b);
                                }
                            };
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            return this.a(((DisposableEffectScope)object0));
                        }
                    };
                    composer0.O(hoverableKt$hoverable$2$1$10);
                }
                composer0.g0();
                EffectsKt.c(mutableInteractionSource0, hoverableKt$hoverable$2$1$10, composer0, 0);
                Boolean boolean0 = Boolean.valueOf(this.f);
                MutableInteractionSource mutableInteractionSource1 = this.e;
                boolean z2 = this.f;
                composer0.V(0x607FB4C4);
                boolean z3 = composer0.t(Boolean.valueOf(this.f));
                boolean z4 = composer0.t(mutableState0);
                boolean z5 = composer0.t(mutableInteractionSource1);
                androidx.compose.foundation.HoverableKt.hoverable.2.2.1 hoverableKt$hoverable$2$2$10 = composer0.W();
                if((z3 | z4 | z5) != 0 || hoverableKt$hoverable$2$2$10 == composer$Companion0.a()) {
                    hoverableKt$hoverable$2$2$10 = new o(mutableState0, mutableInteractionSource1, null) {
                        int k;
                        final boolean l;
                        final MutableState m;
                        final MutableInteractionSource n;

                        {
                            this.l = z;
                            this.m = mutableState0;
                            this.n = mutableInteractionSource0;
                            super(2, d0);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@m Object object0, @l d d0) {
                            return new androidx.compose.foundation.HoverableKt.hoverable.2.2.1(this.l, this.m, this.n, d0);
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            return this.invoke(((O)object0), ((d)object1));
                        }

                        @m
                        public final Object invoke(@l O o0, @m d d0) {
                            return ((androidx.compose.foundation.HoverableKt.hoverable.2.2.1)this.create(o0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            Object object1 = b.l();
                            switch(this.k) {
                                case 0: {
                                    f0.n(object0);
                                    if(!this.l) {
                                        this.k = 1;
                                        if(androidx.compose.foundation.HoverableKt.hoverable.2.f(this.m, this.n, this) == object1) {
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
                    composer0.O(hoverableKt$hoverable$2$2$10);
                }
                composer0.g0();
                EffectsKt.g(boolean0, hoverableKt$hoverable$2$2$10, composer0, 0x40);
                if(this.f) {
                    androidx.compose.foundation.HoverableKt.hoverable.2.3 hoverableKt$hoverable$2$30 = new o(this.e, mutableState0, null) {
                        int k;
                        private Object l;
                        final O m;
                        final MutableInteractionSource n;
                        final MutableState o;

                        {
                            this.m = o0;
                            this.n = mutableInteractionSource0;
                            this.o = mutableState0;
                            super(2, d0);
                        }

                        @m
                        public final Object a(@l PointerInputScope pointerInputScope0, @m d d0) {
                            return ((androidx.compose.foundation.HoverableKt.hoverable.2.3)this.create(pointerInputScope0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@m Object object0, @l d d0) {
                            d d1 = new androidx.compose.foundation.HoverableKt.hoverable.2.3(this.m, this.n, this.o, d0);
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
                                    androidx.compose.foundation.HoverableKt.hoverable.2.3.1 hoverableKt$hoverable$2$3$10 = new o(this.m, this.n, this.o, null) {
                                        int l;
                                        private Object m;
                                        final g n;
                                        final O o;
                                        final MutableInteractionSource p;
                                        final MutableState q;

                                        {
                                            this.n = g0;
                                            this.o = o0;
                                            this.p = mutableInteractionSource0;
                                            this.q = mutableState0;
                                            super(2, d0);
                                        }

                                        @m
                                        public final Object a(@l AwaitPointerEventScope awaitPointerEventScope0, @m d d0) {
                                            return ((androidx.compose.foundation.HoverableKt.hoverable.2.3.1)this.create(awaitPointerEventScope0, d0)).invokeSuspend(S0.a);
                                        }

                                        @Override  // kotlin.coroutines.jvm.internal.a
                                        @l
                                        public final d create(@m Object object0, @l d d0) {
                                            d d1 = new androidx.compose.foundation.HoverableKt.hoverable.2.3.1(this.n, this.o, this.p, this.q, d0);
                                            d1.m = object0;
                                            return d1;
                                        }

                                        @Override  // A3.o
                                        public Object invoke(Object object0, Object object1) {
                                            return this.a(((AwaitPointerEventScope)object0), ((d)object1));
                                        }

                                        @Override  // kotlin.coroutines.jvm.internal.a
                                        @m
                                        public final Object invokeSuspend(@l Object object0) {
                                            AwaitPointerEventScope awaitPointerEventScope0;
                                            Object object1 = b.l();
                                            switch(this.l) {
                                                case 0: {
                                                    f0.n(object0);
                                                    awaitPointerEventScope0 = (AwaitPointerEventScope)this.m;
                                                    goto label_16;
                                                }
                                                case 1: {
                                                    awaitPointerEventScope0 = (AwaitPointerEventScope)this.m;
                                                    f0.n(object0);
                                                    break;
                                                }
                                                default: {
                                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                }
                                            }
                                            while(true) {
                                                int v = ((PointerEvent)object0).i();
                                                if(PointerEventType.k(v, 4)) {
                                                    androidx.compose.foundation.HoverableKt.hoverable.2.3.1.1 hoverableKt$hoverable$2$3$1$10 = new o(this.q, null) {
                                                        int k;
                                                        final MutableInteractionSource l;
                                                        final MutableState m;

                                                        {
                                                            this.l = mutableInteractionSource0;
                                                            this.m = mutableState0;
                                                            super(2, d0);
                                                        }

                                                        @Override  // kotlin.coroutines.jvm.internal.a
                                                        @l
                                                        public final d create(@m Object object0, @l d d0) {
                                                            return new androidx.compose.foundation.HoverableKt.hoverable.2.3.1.1(this.l, this.m, d0);
                                                        }

                                                        @Override  // A3.o
                                                        public Object invoke(Object object0, Object object1) {
                                                            return this.invoke(((O)object0), ((d)object1));
                                                        }

                                                        @m
                                                        public final Object invoke(@l O o0, @m d d0) {
                                                            return ((androidx.compose.foundation.HoverableKt.hoverable.2.3.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                                        }

                                                        @Override  // kotlin.coroutines.jvm.internal.a
                                                        @m
                                                        public final Object invokeSuspend(@l Object object0) {
                                                            Object object1 = b.l();
                                                            switch(this.k) {
                                                                case 0: {
                                                                    f0.n(object0);
                                                                    this.k = 1;
                                                                    return androidx.compose.foundation.HoverableKt.hoverable.2.e(this.l, this.m, this) == object1 ? object1 : S0.a;
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
                                                    k.f(this.o, null, null, hoverableKt$hoverable$2$3$1$10, 3, null);
                                                }
                                                else if(PointerEventType.k(v, 5)) {
                                                    androidx.compose.foundation.HoverableKt.hoverable.2.3.1.2 hoverableKt$hoverable$2$3$1$20 = new o(this.p, null) {
                                                        int k;
                                                        final MutableState l;
                                                        final MutableInteractionSource m;

                                                        {
                                                            this.l = mutableState0;
                                                            this.m = mutableInteractionSource0;
                                                            super(2, d0);
                                                        }

                                                        @Override  // kotlin.coroutines.jvm.internal.a
                                                        @l
                                                        public final d create(@m Object object0, @l d d0) {
                                                            return new androidx.compose.foundation.HoverableKt.hoverable.2.3.1.2(this.l, this.m, d0);
                                                        }

                                                        @Override  // A3.o
                                                        public Object invoke(Object object0, Object object1) {
                                                            return this.invoke(((O)object0), ((d)object1));
                                                        }

                                                        @m
                                                        public final Object invoke(@l O o0, @m d d0) {
                                                            return ((androidx.compose.foundation.HoverableKt.hoverable.2.3.1.2)this.create(o0, d0)).invokeSuspend(S0.a);
                                                        }

                                                        @Override  // kotlin.coroutines.jvm.internal.a
                                                        @m
                                                        public final Object invokeSuspend(@l Object object0) {
                                                            Object object1 = b.l();
                                                            switch(this.k) {
                                                                case 0: {
                                                                    f0.n(object0);
                                                                    this.k = 1;
                                                                    return androidx.compose.foundation.HoverableKt.hoverable.2.f(this.l, this.m, this) == object1 ? object1 : S0.a;
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
                                                    k.f(this.o, null, null, hoverableKt$hoverable$2$3$1$20, 3, null);
                                                }
                                            label_16:
                                                if(!M0.E(this.n)) {
                                                    break;
                                                }
                                                this.m = awaitPointerEventScope0;
                                                this.l = 1;
                                                object0 = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope0, null, this, 1, null);
                                                if(object0 != object1) {
                                                    continue;
                                                }
                                                return object1;
                                            }
                                            return S0.a;
                                        }
                                    };
                                    this.k = 1;
                                    return pointerInputScope0.R0(hoverableKt$hoverable$2$3$10, this) == object1 ? object1 : S0.a;
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
                    modifier1 = SuspendingPointerInputFilterKt.c(Modifier.m0, this.e, hoverableKt$hoverable$2$30);
                }
                else {
                    modifier1 = Modifier.m0;
                }
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return modifier1;
            }

            private static final Object e(MutableInteractionSource mutableInteractionSource0, MutableState mutableState0, d d0) {
                androidx.compose.foundation.HoverableKt.hoverable.2.invoke.emitEnter.1 hoverableKt$hoverable$2$invoke$emitEnter$10;
                if(d0 instanceof androidx.compose.foundation.HoverableKt.hoverable.2.invoke.emitEnter.1) {
                    hoverableKt$hoverable$2$invoke$emitEnter$10 = (androidx.compose.foundation.HoverableKt.hoverable.2.invoke.emitEnter.1)d0;
                    int v = hoverableKt$hoverable$2$invoke$emitEnter$10.n;
                    if((v & 0x80000000) == 0) {
                        hoverableKt$hoverable$2$invoke$emitEnter$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                            Object k;
                            Object l;
                            Object m;
                            int n;

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                this.m = object0;
                                this.n |= 0x80000000;
                                return androidx.compose.foundation.HoverableKt.hoverable.2.e(null, null, this);
                            }
                        };
                    }
                    else {
                        hoverableKt$hoverable$2$invoke$emitEnter$10.n = v ^ 0x80000000;
                    }
                }
                else {
                    hoverableKt$hoverable$2$invoke$emitEnter$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                        Object k;
                        Object l;
                        Object m;
                        int n;

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            this.m = object0;
                            this.n |= 0x80000000;
                            return androidx.compose.foundation.HoverableKt.hoverable.2.e(null, null, this);
                        }
                    };
                }
                Object object0 = hoverableKt$hoverable$2$invoke$emitEnter$10.m;
                Object object1 = b.l();
                switch(hoverableKt$hoverable$2$invoke$emitEnter$10.n) {
                    case 0: {
                        f0.n(object0);
                        if(androidx.compose.foundation.HoverableKt.hoverable.2.g(mutableState0) == null) {
                            Enter hoverInteraction$Enter0 = new Enter();
                            hoverableKt$hoverable$2$invoke$emitEnter$10.k = mutableState0;
                            hoverableKt$hoverable$2$invoke$emitEnter$10.l = hoverInteraction$Enter0;
                            hoverableKt$hoverable$2$invoke$emitEnter$10.n = 1;
                            if(mutableInteractionSource0.b(hoverInteraction$Enter0, hoverableKt$hoverable$2$invoke$emitEnter$10) == object1) {
                                return object1;
                            }
                            androidx.compose.foundation.HoverableKt.hoverable.2.h(mutableState0, hoverInteraction$Enter0);
                            return S0.a;
                        }
                        break;
                    }
                    case 1: {
                        Enter hoverInteraction$Enter1 = (Enter)hoverableKt$hoverable$2$invoke$emitEnter$10.l;
                        mutableState0 = (MutableState)hoverableKt$hoverable$2$invoke$emitEnter$10.k;
                        f0.n(object0);
                        androidx.compose.foundation.HoverableKt.hoverable.2.h(mutableState0, hoverInteraction$Enter1);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                return S0.a;
            }

            private static final Object f(MutableState mutableState0, MutableInteractionSource mutableInteractionSource0, d d0) {
                androidx.compose.foundation.HoverableKt.hoverable.2.invoke.emitExit.1 hoverableKt$hoverable$2$invoke$emitExit$10;
                if(d0 instanceof androidx.compose.foundation.HoverableKt.hoverable.2.invoke.emitExit.1) {
                    hoverableKt$hoverable$2$invoke$emitExit$10 = (androidx.compose.foundation.HoverableKt.hoverable.2.invoke.emitExit.1)d0;
                    int v = hoverableKt$hoverable$2$invoke$emitExit$10.m;
                    if((v & 0x80000000) == 0) {
                        hoverableKt$hoverable$2$invoke$emitExit$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                            Object k;
                            Object l;
                            int m;

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                this.l = object0;
                                this.m |= 0x80000000;
                                return androidx.compose.foundation.HoverableKt.hoverable.2.f(null, null, this);
                            }
                        };
                    }
                    else {
                        hoverableKt$hoverable$2$invoke$emitExit$10.m = v ^ 0x80000000;
                    }
                }
                else {
                    hoverableKt$hoverable$2$invoke$emitExit$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                        Object k;
                        Object l;
                        int m;

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            this.l = object0;
                            this.m |= 0x80000000;
                            return androidx.compose.foundation.HoverableKt.hoverable.2.f(null, null, this);
                        }
                    };
                }
                Object object0 = hoverableKt$hoverable$2$invoke$emitExit$10.l;
                Object object1 = b.l();
                switch(hoverableKt$hoverable$2$invoke$emitExit$10.m) {
                    case 0: {
                        f0.n(object0);
                        Enter hoverInteraction$Enter0 = androidx.compose.foundation.HoverableKt.hoverable.2.g(mutableState0);
                        if(hoverInteraction$Enter0 != null) {
                            Exit hoverInteraction$Exit0 = new Exit(hoverInteraction$Enter0);
                            hoverableKt$hoverable$2$invoke$emitExit$10.k = mutableState0;
                            hoverableKt$hoverable$2$invoke$emitExit$10.m = 1;
                            if(mutableInteractionSource0.b(hoverInteraction$Exit0, hoverableKt$hoverable$2$invoke$emitExit$10) == object1) {
                                return object1;
                            }
                            androidx.compose.foundation.HoverableKt.hoverable.2.h(mutableState0, null);
                            return S0.a;
                        }
                        break;
                    }
                    case 1: {
                        mutableState0 = (MutableState)hoverableKt$hoverable$2$invoke$emitExit$10.k;
                        f0.n(object0);
                        androidx.compose.foundation.HoverableKt.hoverable.2.h(mutableState0, null);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                return S0.a;
            }

            private static final Enter g(MutableState mutableState0) {
                return (Enter)mutableState0.getValue();
            }

            private static final void h(MutableState mutableState0, Enter hoverInteraction$Enter0) {
                mutableState0.setValue(hoverInteraction$Enter0);
            }

            private static final void i(MutableState mutableState0, MutableInteractionSource mutableInteractionSource0) {
                Enter hoverInteraction$Enter0 = androidx.compose.foundation.HoverableKt.hoverable.2.g(mutableState0);
                if(hoverInteraction$Enter0 != null) {
                    mutableInteractionSource0.a(new Exit(hoverInteraction$Enter0));
                    androidx.compose.foundation.HoverableKt.hoverable.2.h(mutableState0, null);
                }
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.d(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Hoverable.kt\nandroidx/compose/foundation/HoverableKt\n*L\n1#1,170:1\n51#2,4:171\n*E\n"})
        public final class androidx.compose.foundation.HoverableKt.hoverable..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final MutableInteractionSource e;
            final boolean f;

            public androidx.compose.foundation.HoverableKt.hoverable..inlined.debugInspectorInfo.1(MutableInteractionSource mutableInteractionSource0, boolean z) {
                this.e = mutableInteractionSource0;
                this.f = z;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("hoverable");
                inspectorInfo0.b().c("interactionSource", this.e);
                inspectorInfo0.b().c("enabled", Boolean.valueOf(this.f));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier b(Modifier modifier0, MutableInteractionSource mutableInteractionSource0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        return HoverableKt.a(modifier0, mutableInteractionSource0, z);
    }
}

