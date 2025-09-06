package androidx.compose.foundation.layout;

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

@s0({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,218:1\n135#2:219\n*S KotlinDebug\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioKt\n*L\n62#1:219\n*E\n"})
public final class AspectRatioKt {
    @Stable
    @l
    public static final Modifier a(@l Modifier modifier0, float f, boolean z) {
        L.p(modifier0, "<this>");
        return modifier0.r0(new AspectRatioModifier(f, z, InspectableValueKt.b()));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioKt\n*L\n1#1,170:1\n63#2,4:171\n*E\n"})
        public final class androidx.compose.foundation.layout.AspectRatioKt.aspectRatio..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;
            final boolean f;

            public androidx.compose.foundation.layout.AspectRatioKt.aspectRatio..inlined.debugInspectorInfo.1(float f, boolean z) {
                this.e = f;
                this.f = z;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("aspectRatio");
                inspectorInfo0.b().c("ratio", this.e);
                inspectorInfo0.b().c("matchHeightConstraintsFirst", Boolean.valueOf(this.f));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    public static Modifier b(Modifier modifier0, float f, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return AspectRatioKt.a(modifier0, f, z);
    }
}

