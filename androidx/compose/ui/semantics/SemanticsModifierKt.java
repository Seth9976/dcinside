package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nSemanticsModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsModifier.kt\nandroidx/compose/ui/semantics/SemanticsModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,147:1\n135#2:148\n135#2:149\n*S KotlinDebug\n*F\n+ 1 SemanticsModifier.kt\nandroidx/compose/ui/semantics/SemanticsModifierKt\n*L\n114#1:148\n142#1:149\n*E\n"})
public final class SemanticsModifierKt {
    @l
    public static final Modifier a(@l Modifier modifier0, @l Function1 function10) {
        L.p(modifier0, "<this>");
        L.p(function10, "properties");
        return modifier0.r0(new SemanticsModifierCore(false, true, function10, InspectableValueKt.b()));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 SemanticsModifier.kt\nandroidx/compose/ui/semantics/SemanticsModifierKt\n*L\n1#1,170:1\n143#2,3:171\n*E\n"})
        public final class androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final Function1 e;

            public androidx.compose.ui.semantics.SemanticsModifierKt.clearAndSetSemantics..inlined.debugInspectorInfo.1(Function1 function10) {
                this.e = function10;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("clearAndSetSemantics");
                inspectorInfo0.b().c("properties", this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @l
    public static final Modifier b(@l Modifier modifier0, boolean z, @l Function1 function10) {
        L.p(modifier0, "<this>");
        L.p(function10, "properties");
        return modifier0.r0(new SemanticsModifierCore(z, false, function10, InspectableValueKt.b()));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 SemanticsModifier.kt\nandroidx/compose/ui/semantics/SemanticsModifierKt\n*L\n1#1,170:1\n115#2,4:171\n*E\n"})
        public final class androidx.compose.ui.semantics.SemanticsModifierKt.semantics..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final boolean e;
            final Function1 f;

            public androidx.compose.ui.semantics.SemanticsModifierKt.semantics..inlined.debugInspectorInfo.1(boolean z, Function1 function10) {
                this.e = z;
                this.f = function10;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("semantics");
                inspectorInfo0.b().c("mergeDescendants", Boolean.valueOf(this.e));
                inspectorInfo0.b().c("properties", this.f);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier c(Modifier modifier0, boolean z, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return SemanticsModifierKt.b(modifier0, z, function10);
    }
}

