package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import kotlin.S0;
import kotlin.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

public final class InspectableValueKt {
    @l
    private static final Function1 a;
    private static boolean b;

    static {
        InspectableValueKt.a = InspectableValueKt.NoInspectorInfo.1.e;
    }

    @l
    public static final Function1 a(@l Function1 function10) {
        L.p(function10, "definitions");
        return InspectableValueKt.b();

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n*L\n1#1,170:1\n*E\n"})
        public final class androidx.compose.ui.platform.InspectableValueKt.debugInspectorInfo.1 extends N implements Function1 {
            final Function1 e;

            public androidx.compose.ui.platform.InspectableValueKt.debugInspectorInfo.1(Function1 function10) {
                this.e = function10;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                this.e.invoke(inspectorInfo0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @l
    public static final Function1 b() {
        return InspectableValueKt.a;
    }

    @l
    public static final Modifier c(@l Modifier modifier0, @l Function1 function10, @l Function1 function11) {
        L.p(modifier0, "<this>");
        L.p(function10, "inspectorInfo");
        L.p(function11, "factory");
        return InspectableValueKt.d(modifier0, function10, ((Modifier)function11.invoke(Modifier.m0)));
    }

    @b0
    @l
    public static final Modifier d(@l Modifier modifier0, @l Function1 function10, @l Modifier modifier1) {
        L.p(modifier0, "<this>");
        L.p(function10, "inspectorInfo");
        L.p(modifier1, "wrapped");
        InspectableModifier inspectableModifier0 = new InspectableModifier(function10);
        return modifier0.r0(inspectableModifier0).r0(modifier1).r0(inspectableModifier0.j());
    }

    public static final boolean e() [...] // 潜在的解密器

    public static final void f(boolean z) {
        InspectableValueKt.b = z;
    }
}

