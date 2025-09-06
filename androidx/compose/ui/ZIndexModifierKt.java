package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nZIndexModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZIndexModifier.kt\nandroidx/compose/ui/ZIndexModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,76:1\n135#2:77\n*S KotlinDebug\n*F\n+ 1 ZIndexModifier.kt\nandroidx/compose/ui/ZIndexModifierKt\n*L\n45#1:77\n*E\n"})
public final class ZIndexModifierKt {
    @Stable
    @l
    public static final Modifier a(@l Modifier modifier0, float f) {
        L.p(modifier0, "<this>");
        return modifier0.r0(new ZIndexModifier(f, InspectableValueKt.b()));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 ZIndexModifier.kt\nandroidx/compose/ui/ZIndexModifierKt\n*L\n1#1,170:1\n46#2,3:171\n*E\n"})
        public final class androidx.compose.ui.ZIndexModifierKt.zIndex..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;

            public androidx.compose.ui.ZIndexModifierKt.zIndex..inlined.debugInspectorInfo.1(float f) {
                this.e = f;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("zIndex");
                inspectorInfo0.e(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }
}

