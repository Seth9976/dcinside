package androidx.compose.animation;

import A3.o;
import A3.p;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.S0;
import kotlin.coroutines.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nAnimationModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/AnimationModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,162:1\n135#2:163\n*S KotlinDebug\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/AnimationModifierKt\n*L\n72#1:163\n*E\n"})
public final class AnimationModifierKt {
    @l
    public static final Modifier a(@l Modifier modifier0, @l FiniteAnimationSpec finiteAnimationSpec0, @m o o0) {
        L.p(modifier0, "<this>");
        L.p(finiteAnimationSpec0, "animationSpec");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(o0, finiteAnimationSpec0) {
            final o e;
            final FiniteAnimationSpec f;

            {
                this.e = o0;
                this.f = finiteAnimationSpec0;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(-843180607);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(-843180607, v, -1, "androidx.compose.animation.animateContentSize.<anonymous> (AnimationModifier.kt:76)");
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
                FiniteAnimationSpec finiteAnimationSpec0 = this.f;
                composer0.V(0x44FAF204);
                boolean z = composer0.t(o0);
                SizeAnimationModifier sizeAnimationModifier0 = composer0.W();
                if(z || sizeAnimationModifier0 == composer$Companion0.a()) {
                    sizeAnimationModifier0 = new SizeAnimationModifier(finiteAnimationSpec0, o0);
                    composer0.O(sizeAnimationModifier0);
                }
                composer0.g0();
                sizeAnimationModifier0.m(this.e);
                Modifier modifier1 = ClipKt.b(modifier0).r0(sizeAnimationModifier0);
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

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AnimationModifier.kt\nandroidx/compose/animation/AnimationModifierKt\n*L\n1#1,170:1\n73#2,4:171\n*E\n"})
        public final class androidx.compose.animation.AnimationModifierKt.animateContentSize..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final FiniteAnimationSpec e;
            final o f;

            public androidx.compose.animation.AnimationModifierKt.animateContentSize..inlined.debugInspectorInfo.1(FiniteAnimationSpec finiteAnimationSpec0, o o0) {
                this.e = finiteAnimationSpec0;
                this.f = o0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("animateContentSize");
                inspectorInfo0.b().c("animationSpec", this.e);
                inspectorInfo0.b().c("finishedListener", this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier b(Modifier modifier0, FiniteAnimationSpec finiteAnimationSpec0, o o0, int v, Object object0) {
        if((v & 1) != 0) {
            finiteAnimationSpec0 = AnimationSpecKt.o(0.0f, 0.0f, null, 7, null);
        }
        if((v & 2) != 0) {
            o0 = null;
        }
        return AnimationModifierKt.a(modifier0, finiteAnimationSpec0, o0);
    }
}

