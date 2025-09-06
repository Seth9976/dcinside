package androidx.compose.ui.window;

import A3.a;
import A3.o;
import A3.p;
import android.view.View;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope.-CC;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,456:1\n76#2:457\n76#2:458\n76#2:459\n76#2:469\n50#3:460\n49#3:461\n456#3,14:481\n1114#4,6:462\n74#5:468\n75#5,11:470\n88#5:495\n76#6:496\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt\n*L\n156#1:457\n157#1:458\n158#1:459\n444#1:469\n162#1:460\n162#1:461\n444#1:481,14\n162#1:462,6\n444#1:468\n444#1:470,11\n444#1:495\n160#1:496\n*E\n"})
public final class AndroidDialog_androidKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void a(@l a a0, @m DialogProperties dialogProperties0, @l o o0, @m Composer composer0, int v, int v1) {
        DialogProperties dialogProperties1;
        DialogProperties dialogProperties3;
        LayoutDirection layoutDirection0;
        int v2;
        L.p(a0, "onDismissRequest");
        L.p(o0, "content");
        Composer composer1 = composer0.G(-2032877254);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.Y(a0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.t(dialogProperties0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.Y(o0) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.c()) {
            DialogProperties dialogProperties2 = (v1 & 2) == 0 ? dialogProperties0 : new DialogProperties(false, false, null, 7, null);
            if(ComposerKt.g0()) {
                ComposerKt.w0(-2032877254, v2, -1, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:150)");
            }
            Object object0 = composer1.L(AndroidCompositionLocals_androidKt.k());
            Object object1 = composer1.L(CompositionLocalsKt.i());
            Object object2 = composer1.L(CompositionLocalsKt.p());
            CompositionContext compositionContext0 = ComposablesKt.u(composer1, 0);
            State state0 = SnapshotStateKt.t(o0, composer1, v2 >> 6 & 14);
            UUID uUID0 = (UUID)RememberSaveableKt.d(new Object[0], null, null, androidx.compose.ui.window.AndroidDialog_androidKt.Dialog.dialogId.1.e, composer1, 3080, 6);
            composer1.V(0x1E7B2B64);
            boolean z = composer1.t(((View)object0));
            boolean z1 = composer1.t(((Density)object1));
            DialogWrapper dialogWrapper0 = composer1.W();
            if(z || z1 || dialogWrapper0 == Composer.a.a()) {
                L.o(uUID0, "dialogId");
                layoutDirection0 = (LayoutDirection)object2;
                dialogProperties3 = dialogProperties2;
                dialogWrapper0 = new DialogWrapper(a0, dialogProperties2, ((View)object0), layoutDirection0, ((Density)object1), uUID0);
                dialogWrapper0.j(compositionContext0, ComposableLambdaKt.c(0x1D1A4619, true, new o(state0) {
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
                            ComposerKt.w0(0x1D1A4619, v, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:170)");
                        }
                        AndroidDialog_androidKt.c(SemanticsModifierKt.c(Modifier.m0, false, androidx.compose.ui.window.AndroidDialog_androidKt.Dialog.dialog.1.1.1.1.e, 1, null), ComposableLambdaKt.b(composer0, 0xE030C439, true, new o() {
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
                                    ComposerKt.w0(0xE030C439, v, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:175)");
                                }
                                AndroidDialog_androidKt.b(this.e).invoke(composer0, 0);
                                if(ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                this.a(((Composer)object0), ((Number)object1).intValue());
                                return S0.a;
                            }
                        }), composer0, 0x30, 0);
                        if(ComposerKt.g0()) {
                            ComposerKt.v0();
                        }

                        final class androidx.compose.ui.window.AndroidDialog_androidKt.Dialog.dialog.1.1.1.1 extends N implements Function1 {
                            public static final androidx.compose.ui.window.AndroidDialog_androidKt.Dialog.dialog.1.1.1.1 e;

                            static {
                                androidx.compose.ui.window.AndroidDialog_androidKt.Dialog.dialog.1.1.1.1.e = new androidx.compose.ui.window.AndroidDialog_androidKt.Dialog.dialog.1.1.1.1();
                            }

                            androidx.compose.ui.window.AndroidDialog_androidKt.Dialog.dialog.1.1.1.1() {
                                super(1);
                            }

                            public final void a(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
                                L.p(semanticsPropertyReceiver0, "$this$semantics");
                                SemanticsPropertiesKt.i(semanticsPropertyReceiver0);
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
                composer1.O(dialogWrapper0);
            }
            else {
                layoutDirection0 = (LayoutDirection)object2;
                dialogProperties3 = dialogProperties2;
            }
            composer1.g0();
            EffectsKt.c(dialogWrapper0, new Function1(dialogWrapper0) {
                final DialogWrapper e;

                {
                    this.e = dialogWrapper0;
                    super(1);
                }

                @l
                public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                    L.p(disposableEffectScope0, "$this$DisposableEffect");
                    this.e.show();
                    return new DisposableEffectResult() {
                        @Override  // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            this.a.dismiss();
                            this.a.i();
                        }
                    };
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((DisposableEffectScope)object0));
                }
            }, composer1, 8);
            EffectsKt.k(new a(dialogWrapper0, a0, dialogProperties3, layoutDirection0) {
                final DialogWrapper e;
                final a f;
                final DialogProperties g;
                final LayoutDirection h;

                {
                    this.e = dialogWrapper0;
                    this.f = a0;
                    this.g = dialogProperties0;
                    this.h = layoutDirection0;
                    super(0);
                }

                @Override  // A3.a
                public Object invoke() {
                    this.invoke();
                    return S0.a;
                }

                public final void invoke() {
                    this.e.m(this.f, this.g, this.h);
                }
            }, composer1, 0);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
            dialogProperties1 = dialogProperties3;
        }
        else {
            composer1.m();
            dialogProperties1 = dialogProperties0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(a0, dialogProperties1, o0, v, v1) {
                final a e;
                final DialogProperties f;
                final o g;
                final int h;
                final int i;

                {
                    this.e = a0;
                    this.f = dialogProperties0;
                    this.g = o0;
                    this.h = v;
                    this.i = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    AndroidDialog_androidKt.a(this.e, this.f, this.g, composer0, (this.h | 1) & -920350135 | ((0x24924924 & (this.h | 1)) >> 1 | 306783378 & (this.h | 1)) | (306783378 & (this.h | 1)) << 1 & (0x24924924 & (this.h | 1)), this.i);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        final class androidx.compose.ui.window.AndroidDialog_androidKt.Dialog.dialogId.1 extends N implements a {
            public static final androidx.compose.ui.window.AndroidDialog_androidKt.Dialog.dialogId.1 e;

            static {
                androidx.compose.ui.window.AndroidDialog_androidKt.Dialog.dialogId.1.e = new androidx.compose.ui.window.AndroidDialog_androidKt.Dialog.dialogId.1();
            }

            androidx.compose.ui.window.AndroidDialog_androidKt.Dialog.dialogId.1() {
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
    private static final void c(Modifier modifier0, o o0, Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.G(0xB9CB0778);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.t(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.Y(o0) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.c()) {
            if((v1 & 1) != 0) {
                modifier0 = Modifier.m0;
            }
            if(ComposerKt.g0()) {
                ComposerKt.w0(0xB9CB0778, v2, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:439)");
            }
            androidx.compose.ui.window.AndroidDialog_androidKt.DialogLayout.1 androidDialog_androidKt$DialogLayout$10 = androidx.compose.ui.window.AndroidDialog_androidKt.DialogLayout.1.a;
            composer1.V(-1323940314);
            Density density0 = (Density)composer1.L(CompositionLocalsKt.i());
            LayoutDirection layoutDirection0 = (LayoutDirection)composer1.L(CompositionLocalsKt.p());
            ViewConfiguration viewConfiguration0 = (ViewConfiguration)composer1.L(CompositionLocalsKt.w());
            Companion composeUiNode$Companion0 = ComposeUiNode.p0;
            a a0 = composeUiNode$Companion0.a();
            p p0 = LayoutKt.f(modifier0);
            if(!(composer1.H() instanceof Applier)) {
                ComposablesKt.n();
            }
            composer1.h();
            if(composer1.E()) {
                composer1.k(a0);
            }
            else {
                composer1.f();
            }
            Composer composer2 = Updater.b(composer1);
            Updater.j(composer2, androidDialog_androidKt$DialogLayout$10, composeUiNode$Companion0.d());
            Updater.j(composer2, density0, composeUiNode$Companion0.b());
            Updater.j(composer2, layoutDirection0, composeUiNode$Companion0.c());
            Updater.j(composer2, viewConfiguration0, composeUiNode$Companion0.f());
            p0.invoke(SkippableUpdater.a(SkippableUpdater.b(composer1)), composer1, 0);
            composer1.V(2058660585);
            o0.invoke(composer1, ((int)(((v2 >> 3 & 14 | v2 << 3 & 0x70) << 9 & 0x1C00 | 6) >> 9 & 14)));
            composer1.g0();
            composer1.g();
            composer1.g0();
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        else {
            composer1.m();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(modifier0, o0, v, v1) {
                final Modifier e;
                final o f;
                final int g;
                final int h;

                {
                    this.e = modifier0;
                    this.f = o0;
                    this.g = v;
                    this.h = v1;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    AndroidDialog_androidKt.c(this.e, this.f, composer0, (this.g | 1) & -920350135 | ((0x24924924 & (this.g | 1)) >> 1 | 306783378 & (this.g | 1)) | (306783378 & (this.g | 1)) << 1 & (0x24924924 & (this.g | 1)), this.h);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }

        @s0({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$DialogLayout$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,456:1\n151#2,3:457\n33#2,4:460\n154#2,2:464\n38#2:466\n156#2:467\n171#2,13:468\n171#2,13:481\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$DialogLayout$1\n*L\n448#1:457,3\n448#1:460,4\n448#1:464,2\n448#1:466\n448#1:467\n449#1:468,13\n450#1:481,13\n*E\n"})
        final class androidx.compose.ui.window.AndroidDialog_androidKt.DialogLayout.1 implements MeasurePolicy {
            public static final androidx.compose.ui.window.AndroidDialog_androidKt.DialogLayout.1 a;

            static {
                androidx.compose.ui.window.AndroidDialog_androidKt.DialogLayout.1.a = new androidx.compose.ui.window.AndroidDialog_androidKt.DialogLayout.1();
            }

            androidx.compose.ui.window.AndroidDialog_androidKt.DialogLayout.1() {
                super();
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            @l
            public final MeasureResult a(@l MeasureScope measureScope0, @l List list0, long v) {
                Object object1;
                L.p(measureScope0, "$this$Layout");
                L.p(list0, "measurables");
                ArrayList arrayList0 = new ArrayList(list0.size());
                int v1 = list0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    arrayList0.add(((Measurable)list0.get(v2)).r1(v));
                }
                Object object0 = null;
                if(arrayList0.isEmpty()) {
                    object1 = null;
                }
                else {
                    object1 = arrayList0.get(0);
                    int v4 = ((Placeable)object1).N1();
                    int v5 = u.J(arrayList0);
                    if(1 <= v5) {
                        for(int v6 = 1; true; ++v6) {
                            Object object2 = arrayList0.get(v6);
                            int v7 = ((Placeable)object2).N1();
                            if(v4 < v7) {
                                object1 = object2;
                                v4 = v7;
                            }
                            if(v6 == v5) {
                                break;
                            }
                        }
                    }
                }
                int v8 = ((Placeable)object1) == null ? Constraints.r(v) : ((Placeable)object1).N1();
                if(!arrayList0.isEmpty()) {
                    Object object3 = arrayList0.get(0);
                    int v9 = ((Placeable)object3).K1();
                    int v10 = u.J(arrayList0);
                    if(1 <= v10) {
                        for(int v3 = 1; true; ++v3) {
                            Object object4 = arrayList0.get(v3);
                            int v11 = ((Placeable)object4).K1();
                            if(v9 < v11) {
                                object3 = object4;
                                v9 = v11;
                            }
                            if(v3 == v10) {
                                break;
                            }
                        }
                    }
                    object0 = object3;
                }
                return ((Placeable)object0) == null ? MeasureScope.-CC.p(measureScope0, v8, Constraints.q(v), null, new Function1() {
                    final List e;

                    {
                        this.e = list0;
                        super(1);
                    }

                    public final void a(@l PlacementScope placeable$PlacementScope0) {
                        L.p(placeable$PlacementScope0, "$this$layout");
                        List list0 = this.e;
                        int v = list0.size();
                        for(int v1 = 0; v1 < v; ++v1) {
                            PlacementScope.v(placeable$PlacementScope0, ((Placeable)list0.get(v1)), 0, 0, 0.0f, 4, null);
                        }
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((PlacementScope)object0));
                        return S0.a;
                    }
                }, 4, null) : MeasureScope.-CC.p(measureScope0, v8, ((Placeable)object0).K1(), null, new Function1() {
                    final List e;

                    {
                        this.e = list0;
                        super(1);
                    }

                    public final void a(@l PlacementScope placeable$PlacementScope0) {
                        L.p(placeable$PlacementScope0, "$this$layout");
                        List list0 = this.e;
                        int v = list0.size();
                        for(int v1 = 0; v1 < v; ++v1) {
                            PlacementScope.v(placeable$PlacementScope0, ((Placeable)list0.get(v1)), 0, 0, 0.0f, 4, null);
                        }
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((PlacementScope)object0));
                        return S0.a;
                    }
                }, 4, null);
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
}

