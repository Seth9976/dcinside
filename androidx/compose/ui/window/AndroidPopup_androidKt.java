package androidx.compose.ui.window;

import A3.a;
import A3.o;
import A3.p;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager.LayoutParams;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope.-CC;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InfiniteAnimationPolicyKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,824:1\n50#2:825\n49#2:826\n25#2:837\n456#2,14:857\n456#2,14:885\n1114#3,6:827\n1114#3,6:838\n76#4:833\n76#4:834\n76#4:835\n76#4:836\n76#4:845\n76#4:873\n74#5:844\n75#5,11:846\n88#5:871\n74#5:872\n75#5,11:874\n88#5:899\n76#6:900\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt\n*L\n194#1:825\n194#1:826\n235#1:837\n309#1:857,14\n341#1:885,14\n194#1:827,6\n235#1:838,6\n228#1:833\n229#1:834\n230#1:835\n231#1:836\n309#1:845\n341#1:873\n309#1:844\n309#1:846,11\n309#1:871\n341#1:872\n341#1:874,11\n341#1:899\n233#1:900\n*E\n"})
public final class AndroidPopup_androidKt {
    @l
    private static final ProvidableCompositionLocal a;

    static {
        AndroidPopup_androidKt.a = CompositionLocalKt.d(null, AndroidPopup_androidKt.LocalPopupTestTag.1.e, 1, null);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void a(@l PopupPositionProvider popupPositionProvider0, @m a a0, @m PopupProperties popupProperties0, @l o o0, @m Composer composer0, int v, int v1) {
        PopupProperties popupProperties1;
        a a1;
        LayoutDirection layoutDirection1;
        int v2;
        L.p(popupPositionProvider0, "popupPositionProvider");
        L.p(o0, "content");
        Composer composer1 = composer0.G(-830247068);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.t(popupPositionProvider0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.Y(a0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.t(popupProperties0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.Y(o0) ? 0x800 : 0x400);
        }
        if((v2 & 5851) != 1170 || !composer1.c()) {
            a a2 = (v1 & 2) == 0 ? a0 : null;
            PopupProperties popupProperties2 = (v1 & 4) == 0 ? popupProperties0 : new PopupProperties(false, false, false, null, false, false, 0x3F, null);
            if(ComposerKt.g0()) {
                ComposerKt.w0(-830247068, v2, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:221)");
            }
            Object object0 = composer1.L(AndroidCompositionLocals_androidKt.k());
            Object object1 = composer1.L(CompositionLocalsKt.i());
            Object object2 = composer1.L(AndroidPopup_androidKt.a);
            LayoutDirection layoutDirection0 = (LayoutDirection)composer1.L(CompositionLocalsKt.p());
            CompositionContext compositionContext0 = ComposablesKt.u(composer1, 0);
            State state0 = SnapshotStateKt.t(o0, composer1, v2 >> 9 & 14);
            Object object3 = RememberSaveableKt.d(new Object[0], null, null, androidx.compose.ui.window.AndroidPopup_androidKt.Popup.popupId.1.e, composer1, 3080, 6);
            composer1.V(0xE2A708A4);
            PopupLayout popupLayout0 = composer1.W();
            if(popupLayout0 == Composer.a.a()) {
                L.o(((UUID)object3), "popupId");
                layoutDirection1 = layoutDirection0;
                PopupLayout popupLayout1 = new PopupLayout(a2, popupProperties2, ((String)object2), ((View)object0), ((Density)object1), popupPositionProvider0, ((UUID)object3), null, 0x80, null);
                popupLayout1.p(compositionContext0, ComposableLambdaKt.c(0x4DA88F2F, true, new o(popupLayout1, state0) {
                    final PopupLayout e;
                    final State f;

                    {
                        this.e = popupLayout0;
                        this.f = state0;
                        super(2);
                    }

                    @Composable
                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    public final void a(@m Composer composer0, int v) {
                        if((v & 11) == 2 && composer0.c()) {
                            composer0.m();
                            return;
                        }
                        if(ComposerKt.g0()) {
                            ComposerKt.w0(0x4DA88F2F, v, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:244)");
                        }
                        Modifier modifier0 = AlphaKt.a(OnRemeasuredModifierKt.a(SemanticsModifierKt.c(Modifier.m0, false, androidx.compose.ui.window.AndroidPopup_androidKt.Popup.popupLayout.1.1.1.1.e, 1, null), new Function1() {
                            final PopupLayout e;

                            {
                                this.e = popupLayout0;
                                super(1);
                            }

                            public final void a(long v) {
                                IntSize intSize0 = IntSize.b(v);
                                this.e.setPopupContentSize-fhxjrPA(intSize0);
                                this.e.v();
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.a(((IntSize)object0).q());
                                return S0.a;
                            }
                        }), (this.e.getCanCalculatePosition() ? 1.0f : 0.0f));
                        ComposableLambda composableLambda0 = ComposableLambdaKt.b(composer0, 606497925, true, new o() {
                            final State e;

                            {
                                this.e = state0;
                                super(2);
                            }

                            @Composable
                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            public final void a(@m Composer composer0, int v) {
                                if((v & 11) == 2 && composer0.c()) {
                                    composer0.m();
                                    return;
                                }
                                if(ComposerKt.g0()) {
                                    ComposerKt.w0(606497925, v, -1, "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:255)");
                                }
                                AndroidPopup_androidKt.b(this.e).invoke(composer0, 0);
                                if(ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                this.a(((Composer)object0), ((Number)object1).intValue());
                                return S0.a;
                            }
                        });
                        composer0.V(0x53D02508);
                        androidx.compose.ui.window.AndroidPopup_androidKt.SimpleStack.1 androidPopup_androidKt$SimpleStack$10 = androidx.compose.ui.window.AndroidPopup_androidKt.SimpleStack.1.a;
                        composer0.V(-1323940314);
                        Density density0 = (Density)composer0.L(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection0 = (LayoutDirection)composer0.L(CompositionLocalsKt.p());
                        ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer0.L(CompositionLocalsKt.w());
                        Companion composeUiNode$Companion0 = ComposeUiNode.p0;
                        a a0 = composeUiNode$Companion0.a();
                        p p0 = LayoutKt.f(modifier0);
                        if(!(composer0.H() instanceof Applier)) {
                            ComposablesKt.n();
                        }
                        composer0.h();
                        if(composer0.E()) {
                            composer0.k(a0);
                        }
                        else {
                            composer0.f();
                        }
                        Composer composer1 = Updater.b(composer0);
                        Updater.j(composer1, androidPopup_androidKt$SimpleStack$10, composeUiNode$Companion0.d());
                        Updater.j(composer1, density0, composeUiNode$Companion0.b());
                        Updater.j(composer1, layoutDirection0, composeUiNode$Companion0.c());
                        Updater.j(composer1, viewConfiguration0, composeUiNode$Companion0.f());
                        p0.invoke(SkippableUpdater.a(SkippableUpdater.b(composer0)), composer0, 0);
                        composer0.V(2058660585);
                        composableLambda0.invoke(composer0, 6);
                        composer0.g0();
                        composer0.g();
                        composer0.g0();
                        composer0.g0();
                        if(ComposerKt.g0()) {
                            ComposerKt.v0();
                        }

                        final class androidx.compose.ui.window.AndroidPopup_androidKt.Popup.popupLayout.1.1.1.1 extends N implements Function1 {
                            public static final androidx.compose.ui.window.AndroidPopup_androidKt.Popup.popupLayout.1.1.1.1 e;

                            static {
                                androidx.compose.ui.window.AndroidPopup_androidKt.Popup.popupLayout.1.1.1.1.e = new androidx.compose.ui.window.AndroidPopup_androidKt.Popup.popupLayout.1.1.1.1();
                            }

                            androidx.compose.ui.window.AndroidPopup_androidKt.Popup.popupLayout.1.1.1.1() {
                                super(1);
                            }

                            public final void a(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                                L.p(semanticsPropertyReceiver0, "$this$semantics");
                                SemanticsPropertiesKt.v0(semanticsPropertyReceiver0);
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.a(((SemanticsPropertyReceiver)object0));
                                return S0.a;
                            }
                        }

                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        this.a(((Composer)object0), ((Number)object1).intValue());
                        return S0.a;
                    }
                }));
                composer1.O(popupLayout1);
                popupLayout0 = popupLayout1;
            }
            else {
                layoutDirection1 = layoutDirection0;
            }
            composer1.g0();
            EffectsKt.c(popupLayout0, new Function1(popupLayout0, a2, popupProperties2, ((String)object2), layoutDirection1) {
                final PopupLayout e;
                final a f;
                final PopupProperties g;
                final String h;
                final LayoutDirection i;

                {
                    this.e = popupLayout0;
                    this.f = a0;
                    this.g = popupProperties0;
                    this.h = s;
                    this.i = layoutDirection0;
                    super(1);
                }

                @l
                public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                    L.p(disposableEffectScope0, "$this$DisposableEffect");
                    this.e.q();
                    this.e.s(this.f, this.g, this.h, this.i);
                    return new DisposableEffectResult() {
                        @Override  // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            this.a.e();
                            this.a.n();
                        }
                    };
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((DisposableEffectScope)object0));
                }
            }, composer1, 8);
            EffectsKt.k(new a(popupLayout0, a2, popupProperties2, ((String)object2), layoutDirection1) {
                final PopupLayout e;
                final a f;
                final PopupProperties g;
                final String h;
                final LayoutDirection i;

                {
                    this.e = popupLayout0;
                    this.f = a0;
                    this.g = popupProperties0;
                    this.h = s;
                    this.i = layoutDirection0;
                    super(0);
                }

                @Override  // A3.a
                public Object invoke() {
                    this.invoke();
                    return S0.a;
                }

                public final void invoke() {
                    this.e.s(this.f, this.g, this.h, this.i);
                }
            }, composer1, 0);
            EffectsKt.c(popupPositionProvider0, new Function1(popupLayout0, popupPositionProvider0) {
                final PopupLayout e;
                final PopupPositionProvider f;

                {
                    this.e = popupLayout0;
                    this.f = popupPositionProvider0;
                    super(1);
                }

                @l
                public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                    L.p(disposableEffectScope0, "$this$DisposableEffect");
                    this.e.setPositionProvider(this.f);
                    this.e.v();
                    return new androidx.compose.ui.window.AndroidPopup_androidKt.Popup.4.invoke..inlined.onDispose.1();

                    @s0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$Popup$4\n*L\n1#1,484:1\n290#2:485\n*E\n"})
                    public final class androidx.compose.ui.window.AndroidPopup_androidKt.Popup.4.invoke..inlined.onDispose.1 implements DisposableEffectResult {
                        @Override  // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                        }
                    }

                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((DisposableEffectScope)object0));
                }
            }, composer1, v2 & 14);
            EffectsKt.g(popupLayout0, new o(popupLayout0, null) {
                int k;
                private Object l;
                final PopupLayout m;

                {
                    this.m = popupLayout0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    d d1 = new androidx.compose.ui.window.AndroidPopup_androidKt.Popup.5(this.m, d0);
                    d1.l = object0;
                    return d1;
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((androidx.compose.ui.window.AndroidPopup_androidKt.Popup.5)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    O o0;
                    Object object1 = b.l();
                    switch(this.k) {
                        case 0: {
                            f0.n(object0);
                            o0 = (O)this.l;
                            goto label_9;
                        }
                        case 1: {
                            o0 = (O)this.l;
                            f0.n(object0);
                            break;
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                    while(true) {
                        this.m.o();
                    label_9:
                        if(!P.k(o0)) {
                            break;
                        }
                        this.l = o0;
                        this.k = 1;
                        if(InfiniteAnimationPolicyKt.a(androidx.compose.ui.window.AndroidPopup_androidKt.Popup.5.1.e, this) != object1) {
                            continue;
                        }
                        return object1;
                    }
                    return S0.a;

                    final class androidx.compose.ui.window.AndroidPopup_androidKt.Popup.5.1 extends N implements Function1 {
                        public static final androidx.compose.ui.window.AndroidPopup_androidKt.Popup.5.1 e;

                        static {
                            androidx.compose.ui.window.AndroidPopup_androidKt.Popup.5.1.e = new androidx.compose.ui.window.AndroidPopup_androidKt.Popup.5.1();
                        }

                        androidx.compose.ui.window.AndroidPopup_androidKt.Popup.5.1() {
                            super(1);
                        }

                        public final void a(long v) {
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            return S0.a;
                        }
                    }

                }
            }, composer1, 72);
            androidx.compose.ui.window.AndroidPopup_androidKt.Popup.7 androidPopup_androidKt$Popup$70 = new Function1(popupLayout0) {
                final PopupLayout e;

                {
                    this.e = popupLayout0;
                    super(1);
                }

                public final void a(@l LayoutCoordinates layoutCoordinates0) {
                    L.p(layoutCoordinates0, "childCoordinates");
                    LayoutCoordinates layoutCoordinates1 = layoutCoordinates0.K();
                    L.m(layoutCoordinates1);
                    this.e.u(layoutCoordinates1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((LayoutCoordinates)object0));
                    return S0.a;
                }
            };
            Modifier modifier0 = OnGloballyPositionedModifierKt.a(Modifier.m0, androidPopup_androidKt$Popup$70);
            androidx.compose.ui.window.AndroidPopup_androidKt.Popup.8 androidPopup_androidKt$Popup$80 = new MeasurePolicy() {
                @Override  // androidx.compose.ui.layout.MeasurePolicy
                @l
                public final MeasureResult a(@l MeasureScope measureScope0, @l List list0, long v) {
                    L.p(measureScope0, "$this$Layout");
                    L.p(list0, "<anonymous parameter 0>");
                    popupLayout0.setParentLayoutDirection(layoutDirection1);
                    return MeasureScope.-CC.p(measureScope0, 0, 0, null, androidx.compose.ui.window.AndroidPopup_androidKt.Popup.8.measure.1.e, 4, null);

                    final class androidx.compose.ui.window.AndroidPopup_androidKt.Popup.8.measure.1 extends N implements Function1 {
                        public static final androidx.compose.ui.window.AndroidPopup_androidKt.Popup.8.measure.1 e;

                        static {
                            androidx.compose.ui.window.AndroidPopup_androidKt.Popup.8.measure.1.e = new androidx.compose.ui.window.AndroidPopup_androidKt.Popup.8.measure.1();
                        }

                        androidx.compose.ui.window.AndroidPopup_androidKt.Popup.8.measure.1() {
                            super(1);
                        }

                        public final void a(@l PlacementScope placeable$PlacementScope0) {
                            L.p(placeable$PlacementScope0, "$this$layout");
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.a(((PlacementScope)object0));
                            return S0.a;
                        }
                    }

                }

                @Override  // androidx.compose.ui.layout.MeasurePolicy
                public int b(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                    return e.c(this, intrinsicMeasureScope0, list0, v);
                }

                @Override  // androidx.compose.ui.layout.MeasurePolicy
                public int c(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                    return e.d(this, intrinsicMeasureScope0, list0, v);
                }

                @Override  // androidx.compose.ui.layout.MeasurePolicy
                public int d(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                    return e.a(this, intrinsicMeasureScope0, list0, v);
                }

                @Override  // androidx.compose.ui.layout.MeasurePolicy
                public int e(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                    return e.b(this, intrinsicMeasureScope0, list0, v);
                }
            };
            composer1.V(-1323940314);
            Density density0 = (Density)composer1.L(CompositionLocalsKt.i());
            LayoutDirection layoutDirection2 = (LayoutDirection)composer1.L(CompositionLocalsKt.p());
            ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer1.L(CompositionLocalsKt.w());
            Companion composeUiNode$Companion0 = ComposeUiNode.p0;
            a a3 = composeUiNode$Companion0.a();
            p p0 = LayoutKt.f(modifier0);
            if(!(composer1.H() instanceof Applier)) {
                ComposablesKt.n();
            }
            composer1.h();
            if(composer1.E()) {
                composer1.k(a3);
            }
            else {
                composer1.f();
            }
            Composer composer2 = Updater.b(composer1);
            Updater.j(composer2, androidPopup_androidKt$Popup$80, composeUiNode$Companion0.d());
            Updater.j(composer2, density0, composeUiNode$Companion0.b());
            Updater.j(composer2, layoutDirection2, composeUiNode$Companion0.c());
            Updater.j(composer2, viewConfiguration0, composeUiNode$Companion0.f());
            p0.invoke(SkippableUpdater.a(SkippableUpdater.b(composer1)), composer1, 0);
            composer1.V(2058660585);
            composer1.g0();
            composer1.g();
            composer1.g0();
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            a1 = a2;
            popupProperties1 = popupProperties2;
        }
        else {
            composer1.m();
            a1 = a0;
            popupProperties1 = popupProperties0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(popupPositionProvider0, a1, popupProperties1, o0, v, v1) {
                final PopupPositionProvider e;
                final a f;
                final PopupProperties g;
                final o h;
                final int i;
                final int j;

                {
                    this.e = popupPositionProvider0;
                    this.f = a0;
                    this.g = popupProperties0;
                    this.h = o0;
                    this.i = v;
                    this.j = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    AndroidPopup_androidKt.a(this.e, this.f, this.g, this.h, composer0, (this.i | 1) & -920350135 | ((0x24924924 & (this.i | 1)) >> 1 | 306783378 & (this.i | 1)) | (306783378 & (this.i | 1)) << 1 & (0x24924924 & (this.i | 1)), this.j);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.ui.window.AndroidPopup_androidKt.Popup.popupId.1 extends N implements a {
            public static final androidx.compose.ui.window.AndroidPopup_androidKt.Popup.popupId.1 e;

            static {
                androidx.compose.ui.window.AndroidPopup_androidKt.Popup.popupId.1.e = new androidx.compose.ui.window.AndroidPopup_androidKt.Popup.popupId.1();
            }

            androidx.compose.ui.window.AndroidPopup_androidKt.Popup.popupId.1() {
                super(0);
            }

            public final UUID b() {
                return UUID.randomUUID();
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

    }

    private static final o b(State state0) {
        return (o)state0.getValue();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void c(@m Alignment alignment0, long v, @m a a0, @m PopupProperties popupProperties0, @l o o0, @m Composer composer0, int v1, int v2) {
        PopupProperties popupProperties2;
        a a2;
        long v5;
        Alignment alignment1;
        PopupProperties popupProperties1;
        a a1;
        long v4;
        int v3;
        L.p(o0, "content");
        Composer composer1 = composer0.G(0x119A1011);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.t(alignment0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
            v4 = v;
        }
        else if((v1 & 0x70) == 0) {
            v4 = v;
            v3 |= (composer1.A(v4) ? 0x20 : 16);
        }
        else {
            v4 = v;
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
            a1 = a0;
        }
        else if((v1 & 0x380) == 0) {
            a1 = a0;
            v3 |= (composer1.Y(a1) ? 0x100 : 0x80);
        }
        else {
            a1 = a0;
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
            popupProperties1 = popupProperties0;
        }
        else if((v1 & 0x1C00) == 0) {
            popupProperties1 = popupProperties0;
            v3 |= (composer1.t(popupProperties1) ? 0x800 : 0x400);
        }
        else {
            popupProperties1 = popupProperties0;
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((0xE000 & v1) == 0) {
            v3 |= (composer1.Y(o0) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v3) != 9362 || !composer1.c()) {
            Alignment alignment2 = (v2 & 1) == 0 ? alignment0 : Alignment.a.C();
            if((v2 & 2) != 0) {
                v4 = IntOffsetKt.a(0, 0);
            }
            if((v2 & 4) != 0) {
                a1 = null;
            }
            if((v2 & 8) != 0) {
                popupProperties1 = new PopupProperties(false, false, false, null, false, false, 0x3F, null);
            }
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x119A1011, v3, -1, "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:186)");
            }
            IntOffset intOffset0 = IntOffset.b(v4);
            composer1.V(0x1E7B2B64);
            boolean z = composer1.t(alignment2);
            boolean z1 = composer1.t(intOffset0);
            AlignmentOffsetPositionProvider alignmentOffsetPositionProvider0 = composer1.W();
            if(z1 || z || alignmentOffsetPositionProvider0 == Composer.a.a()) {
                alignmentOffsetPositionProvider0 = new AlignmentOffsetPositionProvider(alignment2, v4, null);
                composer1.O(alignmentOffsetPositionProvider0);
            }
            composer1.g0();
            AndroidPopup_androidKt.a(alignmentOffsetPositionProvider0, a1, popupProperties1, o0, composer1, v3 >> 3 & 0x1FF0, 0);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            a2 = a1;
            popupProperties2 = popupProperties1;
            alignment1 = alignment2;
            v5 = v4;
        }
        else {
            composer1.m();
            alignment1 = alignment0;
            v5 = v4;
            a2 = a1;
            popupProperties2 = popupProperties1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(alignment1, v5, a2, popupProperties2, o0, v1, v2) {
                final Alignment e;
                final long f;
                final a g;
                final PopupProperties h;
                final o i;
                final int j;
                final int k;

                {
                    this.e = alignment0;
                    this.f = v;
                    this.g = a0;
                    this.h = popupProperties0;
                    this.i = o0;
                    this.j = v1;
                    this.k = v2;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    AndroidPopup_androidKt.c(this.e, this.f, this.g, this.h, this.i, composer0, (this.j | 1) & -920350135 | ((0x24924924 & (this.j | 1)) >> 1 | 306783378 & (this.j | 1)) | (306783378 & (this.j | 1)) << 1 & (0x24924924 & (this.j | 1)), this.k);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void d(@l String s, @l o o0, @m Composer composer0, int v) {
        L.p(s, "tag");
        L.p(o0, "content");
        Composer composer1 = composer0.G(-498879600);
        int v1 = (v & 14) == 0 ? (composer1.t(s) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.Y(o0) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.c()) {
            if(ComposerKt.g0()) {
                ComposerKt.w0(-498879600, v1, -1, "androidx.compose.ui.window.PopupTestTag (AndroidPopup.android.kt:331)");
            }
            CompositionLocalKt.b(new ProvidedValue[]{AndroidPopup_androidKt.a.f(s)}, o0, composer1, v1 & 0x70 | 8);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        else {
            composer1.m();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(s, o0, v) {
                final String e;
                final o f;
                final int g;

                {
                    this.e = s;
                    this.f = o0;
                    this.g = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    AndroidPopup_androidKt.d(this.e, this.f, composer0, (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)));
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void e(Modifier modifier0, o o0, Composer composer0, int v) {
        composer0.V(0x53D02508);
        androidx.compose.ui.window.AndroidPopup_androidKt.SimpleStack.1 androidPopup_androidKt$SimpleStack$10 = androidx.compose.ui.window.AndroidPopup_androidKt.SimpleStack.1.a;
        composer0.V(-1323940314);
        Density density0 = (Density)composer0.L(CompositionLocalsKt.i());
        LayoutDirection layoutDirection0 = (LayoutDirection)composer0.L(CompositionLocalsKt.p());
        ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer0.L(CompositionLocalsKt.w());
        Companion composeUiNode$Companion0 = ComposeUiNode.p0;
        a a0 = composeUiNode$Companion0.a();
        p p0 = LayoutKt.f(modifier0);
        if(!(composer0.H() instanceof Applier)) {
            ComposablesKt.n();
        }
        composer0.h();
        if(composer0.E()) {
            composer0.k(a0);
        }
        else {
            composer0.f();
        }
        Composer composer1 = Updater.b(composer0);
        Updater.j(composer1, androidPopup_androidKt$SimpleStack$10, composeUiNode$Companion0.d());
        Updater.j(composer1, density0, composeUiNode$Companion0.b());
        Updater.j(composer1, layoutDirection0, composeUiNode$Companion0.c());
        Updater.j(composer1, viewConfiguration0, composeUiNode$Companion0.f());
        p0.invoke(SkippableUpdater.a(SkippableUpdater.b(composer0)), composer0, 0);
        composer0.V(2058660585);
        o0.invoke(composer0, ((int)(((v << 3 & 0x70 | v >> 3 & 14) << 9 & 0x1C00 | 6) >> 9 & 14)));
        composer0.g0();
        composer0.g();
        composer0.g0();
        composer0.g0();

        @s0({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,824:1\n151#2,3:825\n33#2,4:828\n154#2,2:832\n38#2:834\n156#2:835\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1\n*L\n351#1:825,3\n351#1:828,4\n351#1:832,2\n351#1:834\n351#1:835\n*E\n"})
        public final class androidx.compose.ui.window.AndroidPopup_androidKt.SimpleStack.1 implements MeasurePolicy {
            public static final androidx.compose.ui.window.AndroidPopup_androidKt.SimpleStack.1 a;

            static {
                androidx.compose.ui.window.AndroidPopup_androidKt.SimpleStack.1.a = new androidx.compose.ui.window.AndroidPopup_androidKt.SimpleStack.1();
            }

            public androidx.compose.ui.window.AndroidPopup_androidKt.SimpleStack.1() {
                super();
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            @l
            public final MeasureResult a(@l MeasureScope measureScope0, @l List list0, long v) {
                L.p(measureScope0, "$this$Layout");
                L.p(list0, "measurables");
                switch(list0.size()) {
                    case 0: {
                        return MeasureScope.-CC.p(measureScope0, 0, 0, null, androidx.compose.ui.window.AndroidPopup_androidKt.SimpleStack.1.measure.1.e, 4, null);
                    }
                    case 1: {
                        Placeable placeable1 = ((Measurable)list0.get(0)).r1(v);
                        return MeasureScope.-CC.p(measureScope0, placeable1.N1(), placeable1.K1(), null, new Function1() {
                            final Placeable e;

                            {
                                this.e = placeable0;
                                super(1);
                            }

                            public final void a(@l PlacementScope placeable$PlacementScope0) {
                                L.p(placeable$PlacementScope0, "$this$layout");
                                PlacementScope.v(placeable$PlacementScope0, this.e, 0, 0, 0.0f, 4, null);
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.a(((PlacementScope)object0));
                                return S0.a;
                            }
                        }, 4, null);
                    }
                    default: {
                        ArrayList arrayList0 = new ArrayList(list0.size());
                        int v2 = list0.size();
                        for(int v3 = 0; v3 < v2; ++v3) {
                            arrayList0.add(((Measurable)list0.get(v3)).r1(v));
                        }
                        int v4 = u.J(arrayList0);
                        if(v4 >= 0) {
                            int v5 = 0;
                            int v6 = 0;
                            for(int v1 = 0; true; ++v1) {
                                Placeable placeable0 = (Placeable)arrayList0.get(v1);
                                v5 = Math.max(v5, placeable0.N1());
                                v6 = Math.max(v6, placeable0.K1());
                                if(v1 == v4) {
                                    break;
                                }
                            }
                            return MeasureScope.-CC.p(measureScope0, v5, v6, null, new Function1() {
                                final List e;

                                {
                                    this.e = list0;
                                    super(1);
                                }

                                public final void a(@l PlacementScope placeable$PlacementScope0) {
                                    L.p(placeable$PlacementScope0, "$this$layout");
                                    int v = u.J(this.e);
                                    if(v >= 0) {
                                        for(int v1 = 0; true; ++v1) {
                                            PlacementScope.v(placeable$PlacementScope0, ((Placeable)this.e.get(v1)), 0, 0, 0.0f, 4, null);
                                            if(v1 == v) {
                                                break;
                                            }
                                        }
                                    }
                                }

                                @Override  // kotlin.jvm.functions.Function1
                                public Object invoke(Object object0) {
                                    this.a(((PlacementScope)object0));
                                    return S0.a;
                                }
                            }, 4, null);
                        }
                        return MeasureScope.-CC.p(measureScope0, 0, 0, null, new Function1() {
                            final List e;

                            {
                                this.e = list0;
                                super(1);
                            }

                            public final void a(@l PlacementScope placeable$PlacementScope0) {
                                L.p(placeable$PlacementScope0, "$this$layout");
                                int v = u.J(this.e);
                                if(v >= 0) {
                                    for(int v1 = 0; true; ++v1) {
                                        PlacementScope.v(placeable$PlacementScope0, ((Placeable)this.e.get(v1)), 0, 0, 0.0f, 4, null);
                                        if(v1 == v) {
                                            break;
                                        }
                                    }
                                }
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.a(((PlacementScope)object0));
                                return S0.a;
                            }
                        }, 4, null);
                    }
                }

                @s0({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1$measure$1\n*L\n1#1,824:1\n*E\n"})
                public final class androidx.compose.ui.window.AndroidPopup_androidKt.SimpleStack.1.measure.1 extends N implements Function1 {
                    public static final androidx.compose.ui.window.AndroidPopup_androidKt.SimpleStack.1.measure.1 e;

                    static {
                        androidx.compose.ui.window.AndroidPopup_androidKt.SimpleStack.1.measure.1.e = new androidx.compose.ui.window.AndroidPopup_androidKt.SimpleStack.1.measure.1();
                    }

                    public androidx.compose.ui.window.AndroidPopup_androidKt.SimpleStack.1.measure.1() {
                        super(1);
                    }

                    public final void a(@l PlacementScope placeable$PlacementScope0) {
                        L.p(placeable$PlacementScope0, "$this$layout");
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((PlacementScope)object0));
                        return S0.a;
                    }
                }

            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int b(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                return e.c(this, intrinsicMeasureScope0, list0, v);
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int c(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                return e.d(this, intrinsicMeasureScope0, list0, v);
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int d(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                return e.a(this, intrinsicMeasureScope0, list0, v);
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int e(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                return e.b(this, intrinsicMeasureScope0, list0, v);
            }
        }

    }

    @l
    public static final ProvidableCompositionLocal h() {
        return AndroidPopup_androidKt.a;
    }

    public static final boolean i(@l View view0) {
        L.p(view0, "<this>");
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getRootView().getLayoutParams();
        WindowManager.LayoutParams windowManager$LayoutParams0 = viewGroup$LayoutParams0 instanceof WindowManager.LayoutParams ? ((WindowManager.LayoutParams)viewGroup$LayoutParams0) : null;
        return windowManager$LayoutParams0 != null && (windowManager$LayoutParams0.flags & 0x2000) != 0;
    }

    public static final boolean j(@l View view0, @m String s) {
        L.p(view0, "view");
        return view0 instanceof PopupLayout && (s == null || L.g(s, ((PopupLayout)view0).getTestTag()));
    }

    public static boolean k(View view0, String s, int v, Object object0) {
        if((v & 2) != 0) {
            s = null;
        }
        return AndroidPopup_androidKt.j(view0, s);
    }

    private static final IntRect l(Rect rect0) {
        return new IntRect(rect0.left, rect0.top, rect0.right, rect0.bottom);
    }
}

