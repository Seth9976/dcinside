package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nOnGloballyPositionedModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnGloballyPositionedModifier.kt\nandroidx/compose/ui/layout/OnGloballyPositionedModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,92:1\n135#2:93\n*S KotlinDebug\n*F\n+ 1 OnGloballyPositionedModifier.kt\nandroidx/compose/ui/layout/OnGloballyPositionedModifierKt\n*L\n47#1:93\n*E\n"})
public final class OnGloballyPositionedModifierKt {
    @Stable
    @l
    public static final Modifier a(@l Modifier modifier0, @l Function1 function10) {
        L.p(modifier0, "<this>");
        L.p(function10, "onGloballyPositioned");
        return modifier0.r0(new OnGloballyPositionedModifierImpl(function10, InspectableValueKt.b()));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 OnGloballyPositionedModifier.kt\nandroidx/compose/ui/layout/OnGloballyPositionedModifierKt\n*L\n1#1,170:1\n48#2,3:171\n*E\n"})
        public final class androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final Function1 e;

            public androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned..inlined.debugInspectorInfo.1(Function1 function10) {
                this.e = function10;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("onGloballyPositioned");
                inspectorInfo0.b().c("onGloballyPositioned", this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }
}

