package androidx.compose.foundation;

import A3.p;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nIndication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,186:1\n135#2:187\n*S KotlinDebug\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationKt\n*L\n115#1:187\n*E\n"})
public final class IndicationKt {
    @l
    private static final ProvidableCompositionLocal a;

    static {
        IndicationKt.a = CompositionLocalKt.e(IndicationKt.LocalIndication.1.e);
    }

    @l
    public static final ProvidableCompositionLocal a() {
        return IndicationKt.a;
    }

    @l
    public static final Modifier b(@l Modifier modifier0, @l InteractionSource interactionSource0, @m Indication indication0) {
        L.p(modifier0, "<this>");
        L.p(interactionSource0, "interactionSource");
        return ComposedModifierKt.e(modifier0, InspectableValueKt.b(), new p(indication0, interactionSource0) {
            final Indication e;
            final InteractionSource f;

            {
                this.e = indication0;
                this.f = interactionSource0;
                super(3);
            }

            @Composable
            @l
            public final Modifier a(@l Modifier modifier0, @m Composer composer0, int v) {
                L.p(modifier0, "$this$composed");
                composer0.V(0xEAE6CFBB);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0xEAE6CFBB, v, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:107)");
                }
                Indication indication0 = this.e;
                if(indication0 == null) {
                    indication0 = NoIndication.a;
                }
                IndicationInstance indicationInstance0 = indication0.a(this.f, composer0, 0);
                composer0.V(0x44FAF204);
                boolean z = composer0.t(indicationInstance0);
                IndicationModifier indicationModifier0 = composer0.W();
                if(z || indicationModifier0 == Composer.a.a()) {
                    indicationModifier0 = new IndicationModifier(indicationInstance0);
                    composer0.O(indicationModifier0);
                }
                composer0.g0();
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return indicationModifier0;
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Indication.kt\nandroidx/compose/foundation/IndicationKt\n*L\n1#1,170:1\n116#2,4:171\n*E\n"})
        public final class androidx.compose.foundation.IndicationKt.indication..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final Indication e;
            final InteractionSource f;

            public androidx.compose.foundation.IndicationKt.indication..inlined.debugInspectorInfo.1(Indication indication0, InteractionSource interactionSource0) {
                this.e = indication0;
                this.f = interactionSource0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("indication");
                inspectorInfo0.b().c("indication", this.e);
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

