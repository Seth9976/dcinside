package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnScopeInstance\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,250:1\n1#2:251\n135#3:252\n135#3:253\n135#3:254\n135#3:255\n*S KotlinDebug\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnScopeInstance\n*L\n207#1:252\n221#1:253\n232#1:254\n243#1:255\n*E\n"})
public final class ColumnScopeInstance implements ColumnScope {
    @l
    public static final ColumnScopeInstance a;

    static {
        ColumnScopeInstance.a = new ColumnScopeInstance();
    }

    @Override  // androidx.compose.foundation.layout.ColumnScope
    @Stable
    @l
    public Modifier a(@l Modifier modifier0, @l Function1 function10) {
        L.p(modifier0, "<this>");
        L.p(function10, "alignmentLineBlock");
        return modifier0.r0(new WithAlignmentLineBlock(function10, InspectableValueKt.b()));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnScopeInstance\n*L\n1#1,170:1\n244#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.layout.ColumnScopeInstance.alignBy..inlined.debugInspectorInfo.2 extends N implements Function1 {
            final Function1 e;

            public androidx.compose.foundation.layout.ColumnScopeInstance.alignBy..inlined.debugInspectorInfo.2(Function1 function10) {
                this.e = function10;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("alignBy");
                inspectorInfo0.e(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @Override  // androidx.compose.foundation.layout.ColumnScope
    @Stable
    @l
    public Modifier b(@l Modifier modifier0, float f, boolean z) {
        L.p(modifier0, "<this>");
        if(((double)f) <= 0.0) {
            throw new IllegalArgumentException(("invalid weight " + f + "; must be greater than zero").toString());
        }
        return modifier0.r0(new LayoutWeightImpl(f, z, InspectableValueKt.b()));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnScopeInstance\n*L\n1#1,170:1\n208#2,5:171\n*E\n"})
        public final class androidx.compose.foundation.layout.ColumnScopeInstance.weight..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;
            final boolean f;

            public androidx.compose.foundation.layout.ColumnScopeInstance.weight..inlined.debugInspectorInfo.1(float f, boolean z) {
                this.e = f;
                this.f = z;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("weight");
                inspectorInfo0.e(this.e);
                inspectorInfo0.b().c("weight", this.e);
                inspectorInfo0.b().c("fill", Boolean.valueOf(this.f));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @Override  // androidx.compose.foundation.layout.ColumnScope
    @Stable
    @l
    public Modifier c(@l Modifier modifier0, @l VerticalAlignmentLine verticalAlignmentLine0) {
        L.p(modifier0, "<this>");
        L.p(verticalAlignmentLine0, "alignmentLine");
        return modifier0.r0(new WithAlignmentLine(verticalAlignmentLine0, InspectableValueKt.b()));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnScopeInstance\n*L\n1#1,170:1\n233#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.layout.ColumnScopeInstance.alignBy..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final VerticalAlignmentLine e;

            public androidx.compose.foundation.layout.ColumnScopeInstance.alignBy..inlined.debugInspectorInfo.1(VerticalAlignmentLine verticalAlignmentLine0) {
                this.e = verticalAlignmentLine0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("alignBy");
                inspectorInfo0.e(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((InspectorInfo)object0));
                return S0.a;
            }
        }

    }

    @Override  // androidx.compose.foundation.layout.ColumnScope
    @Stable
    @l
    public Modifier d(@l Modifier modifier0, @l Horizontal alignment$Horizontal0) {
        L.p(modifier0, "<this>");
        L.p(alignment$Horizontal0, "alignment");
        return modifier0.r0(new HorizontalAlignModifier(alignment$Horizontal0, InspectableValueKt.b()));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnScopeInstance\n*L\n1#1,170:1\n222#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.layout.ColumnScopeInstance.align..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final Horizontal e;

            public androidx.compose.foundation.layout.ColumnScopeInstance.align..inlined.debugInspectorInfo.1(Horizontal alignment$Horizontal0) {
                this.e = alignment$Horizontal0;
                super(1);
            }

            public final void a(@l InspectorInfo inspectorInfo0) {
                L.p(inspectorInfo0, "$this$null");
                inspectorInfo0.d("align");
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

