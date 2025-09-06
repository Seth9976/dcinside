package androidx.compose.foundation;

import A3.p;
import android.os.Build.VERSION;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSystemGestureExclusion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemGestureExclusion.kt\nandroidx/compose/foundation/SystemGestureExclusionKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,162:1\n135#2:163\n135#2:164\n76#3:165\n50#4:166\n49#4:167\n1114#5,6:168\n*S KotlinDebug\n*F\n+ 1 SystemGestureExclusion.kt\nandroidx/compose/foundation/SystemGestureExclusionKt\n*L\n45#1:163\n66#1:164\n80#1:165\n81#1:166\n81#1:167\n81#1:168,6\n*E\n"})
public final class SystemGestureExclusionKt {
    @RequiresApi(29)
    @Composable
    private static final Modifier a(Function1 function10, Composer composer0, int v) {
        composer0.V(0x6497DCFB);
        View view0 = (View)composer0.L(AndroidCompositionLocals_androidKt.k());
        composer0.V(0x1E7B2B64);
        boolean z = composer0.t(view0);
        boolean z1 = composer0.t(function10);
        ExcludeFromSystemGestureModifier excludeFromSystemGestureModifier0 = composer0.W();
        if(z || z1 || excludeFromSystemGestureModifier0 == Composer.a.a()) {
            excludeFromSystemGestureModifier0 = new ExcludeFromSystemGestureModifier(view0, function10);
            composer0.O(excludeFromSystemGestureModifier0);
        }
        composer0.g0();
        EffectsKt.c(excludeFromSystemGestureModifier0, new Function1(excludeFromSystemGestureModifier0) {
            final ExcludeFromSystemGestureModifier e;

            {
                this.e = excludeFromSystemGestureModifier0;
                super(1);
            }

            @l
            public final DisposableEffectResult a(@l DisposableEffectScope disposableEffectScope0) {
                L.p(disposableEffectScope0, "$this$DisposableEffect");
                return new DisposableEffectResult() {
                    @Override  // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        this.a.l();
                    }
                };
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((DisposableEffectScope)object0));
            }
        }, composer0, 0);
        composer0.g0();
        return excludeFromSystemGestureModifier0;
    }

    @l
    public static final Modifier b(@l Modifier modifier0) {
        L.p(modifier0, "<this>");
        return Build.VERSION.SDK_INT < 29 ? modifier0 : ComposedModifierKt.e(modifier0, InspectableValueKt.b(), androidx.compose.foundation.SystemGestureExclusionKt.systemGestureExclusion.2.e);

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 SystemGestureExclusion.kt\nandroidx/compose/foundation/SystemGestureExclusionKt\n*L\n1#1,170:1\n46#2,2:171\n*E\n"})
        public final class androidx.compose.foundation.SystemGestureExclusionKt.systemGestureExclusion..inlined.debugInspectorInfo.1 extends N implements Function1 {
            public androidx.compose.foundation.SystemGestureExclusionKt.systemGestureExclusion..inlined.debugInspectorInfo.1() {
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("systemGestureExclusion");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }


        @s0({"SMAP\nSystemGestureExclusion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemGestureExclusion.kt\nandroidx/compose/foundation/SystemGestureExclusionKt$systemGestureExclusion$2\n+ 2 SystemGestureExclusion.kt\nandroidx/compose/foundation/SystemGestureExclusionKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,162:1\n80#2:163\n81#2:165\n82#2:174\n76#3:164\n50#4:166\n49#4:167\n1114#5,6:168\n*S KotlinDebug\n*F\n+ 1 SystemGestureExclusion.kt\nandroidx/compose/foundation/SystemGestureExclusionKt$systemGestureExclusion$2\n*L\n48#1:163\n48#1:165\n48#1:174\n48#1:164\n48#1:166\n48#1:167\n48#1:168,6\n*E\n"})
        final class androidx.compose.foundation.SystemGestureExclusionKt.systemGestureExclusion.2 extends N implements p {
            public static final androidx.compose.foundation.SystemGestureExclusionKt.systemGestureExclusion.2 e;

            static {
                androidx.compose.foundation.SystemGestureExclusionKt.systemGestureExclusion.2.e = new androidx.compose.foundation.SystemGestureExclusionKt.systemGestureExclusion.2();
            }

            androidx.compose.foundation.SystemGestureExclusionKt.systemGestureExclusion.2() {
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(1120057036);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(1120057036, v, -1, "androidx.compose.foundation.systemGestureExclusion.<anonymous> (SystemGestureExclusion.kt:46)");
                }
                composer0.V(0x6497DCFB);
                View view0 = (View)composer0.L(AndroidCompositionLocals_androidKt.k());
                composer0.V(0x1E7B2B64);
                boolean z = composer0.t(view0);
                boolean z1 = composer0.t(null);
                ExcludeFromSystemGestureModifier excludeFromSystemGestureModifier0 = composer0.W();
                if(z || z1 || excludeFromSystemGestureModifier0 == Composer.a.a()) {
                    excludeFromSystemGestureModifier0 = new ExcludeFromSystemGestureModifier(view0, null);
                    composer0.O(excludeFromSystemGestureModifier0);
                }
                composer0.g0();
                EffectsKt.c(excludeFromSystemGestureModifier0, new androidx.compose.foundation.SystemGestureExclusionKt.excludeFromSystemGestureQ.1(excludeFromSystemGestureModifier0), composer0, 0);
                composer0.g0();
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return excludeFromSystemGestureModifier0;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        }

    }

    @l
    public static final Modifier c(@l Modifier modifier0, @l Function1 function10) {
        L.p(modifier0, "<this>");
        L.p(function10, "exclusion");
        return Build.VERSION.SDK_INT < 29 ? modifier0 : ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(function10) {
            final Function1 e;

            {
                this.e = function10;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(108999);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(108999, v, -1, "androidx.compose.foundation.systemGestureExclusion.<anonymous> (SystemGestureExclusion.kt:68)");
                }
                Function1 function10 = this.e;
                composer0.V(0x6497DCFB);
                View view0 = (View)composer0.L(AndroidCompositionLocals_androidKt.k());
                composer0.V(0x1E7B2B64);
                boolean z = composer0.t(view0);
                boolean z1 = composer0.t(function10);
                ExcludeFromSystemGestureModifier excludeFromSystemGestureModifier0 = composer0.W();
                if(z || z1 || excludeFromSystemGestureModifier0 == Composer.a.a()) {
                    excludeFromSystemGestureModifier0 = new ExcludeFromSystemGestureModifier(view0, function10);
                    composer0.O(excludeFromSystemGestureModifier0);
                }
                composer0.g0();
                EffectsKt.c(excludeFromSystemGestureModifier0, new androidx.compose.foundation.SystemGestureExclusionKt.excludeFromSystemGestureQ.1(excludeFromSystemGestureModifier0), composer0, 0);
                composer0.g0();
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return excludeFromSystemGestureModifier0;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 SystemGestureExclusion.kt\nandroidx/compose/foundation/SystemGestureExclusionKt\n*L\n1#1,170:1\n67#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.SystemGestureExclusionKt.systemGestureExclusion..inlined.debugInspectorInfo.2 extends N implements Function1 {
            final Function1 e;

            public androidx.compose.foundation.SystemGestureExclusionKt.systemGestureExclusion..inlined.debugInspectorInfo.2(Function1 function10) {
                this.e = function10;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("systemGestureExclusion");
                inspectorInfo0.b().c("exclusion", this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }
}

