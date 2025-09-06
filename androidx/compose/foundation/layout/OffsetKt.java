package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/foundation/layout/OffsetKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,227:1\n135#2:228\n135#2:230\n135#2:232\n135#2:233\n155#3:229\n155#3:231\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/foundation/layout/OffsetKt\n*L\n55#1:228\n83#1:230\n114#1:232\n145#1:233\n50#1:229\n78#1:231\n*E\n"})
public final class OffsetKt {
    @l
    public static final Modifier a(@l Modifier modifier0, @l Function1 function10) {
        L.p(modifier0, "<this>");
        L.p(function10, "offset");
        return modifier0.r0(new OffsetPxModifier(function10, false, InspectableValueKt.b()));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Offset.kt\nandroidx/compose/foundation/layout/OffsetKt\n*L\n1#1,170:1\n146#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.layout.OffsetKt.absoluteOffset..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final Function1 e;

            public androidx.compose.foundation.layout.OffsetKt.absoluteOffset..inlined.debugInspectorInfo.1(Function1 function10) {
                this.e = function10;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("absoluteOffset");
                inspectorInfo0.b().c("offset", this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @Stable
    @l
    public static final Modifier b(@l Modifier modifier0, float f, float f1) {
        L.p(modifier0, "$this$absoluteOffset");
        return modifier0.r0(new OffsetModifier(f, f1, false, InspectableValueKt.b(), null));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Offset.kt\nandroidx/compose/foundation/layout/OffsetKt\n*L\n1#1,170:1\n84#2,4:171\n*E\n"})
        public final class androidx.compose.foundation.layout.OffsetKt.absoluteOffset-VpY3zN4..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;
            final float f;

            public androidx.compose.foundation.layout.OffsetKt.absoluteOffset-VpY3zN4..inlined.debugInspectorInfo.1(float f, float f1) {
                this.e = f;
                this.f = f1;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("absoluteOffset");
                inspectorInfo0.b().c("x", Dp.d(this.e));
                inspectorInfo0.b().c("y", Dp.d(this.f));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier c(Modifier modifier0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        return OffsetKt.b(modifier0, f, f1);
    }

    @l
    public static final Modifier d(@l Modifier modifier0, @l Function1 function10) {
        L.p(modifier0, "<this>");
        L.p(function10, "offset");
        return modifier0.r0(new OffsetPxModifier(function10, true, InspectableValueKt.b()));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Offset.kt\nandroidx/compose/foundation/layout/OffsetKt\n*L\n1#1,170:1\n115#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.layout.OffsetKt.offset..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final Function1 e;

            public androidx.compose.foundation.layout.OffsetKt.offset..inlined.debugInspectorInfo.1(Function1 function10) {
                this.e = function10;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("offset");
                inspectorInfo0.b().c("offset", this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @Stable
    @l
    public static final Modifier e(@l Modifier modifier0, float f, float f1) {
        L.p(modifier0, "$this$offset");
        return modifier0.r0(new OffsetModifier(f, f1, true, InspectableValueKt.b(), null));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Offset.kt\nandroidx/compose/foundation/layout/OffsetKt\n*L\n1#1,170:1\n56#2,4:171\n*E\n"})
        public final class androidx.compose.foundation.layout.OffsetKt.offset-VpY3zN4..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;
            final float f;

            public androidx.compose.foundation.layout.OffsetKt.offset-VpY3zN4..inlined.debugInspectorInfo.1(float f, float f1) {
                this.e = f;
                this.f = f1;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("offset");
                inspectorInfo0.b().c("x", Dp.d(this.e));
                inspectorInfo0.b().c("y", Dp.d(this.f));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier f(Modifier modifier0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        return OffsetKt.e(modifier0, f, f1);
    }
}

