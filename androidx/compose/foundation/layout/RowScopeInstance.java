package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowScopeInstance\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,272:1\n1#2:273\n135#3:274\n135#3:275\n135#3:276\n135#3:277\n*S KotlinDebug\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowScopeInstance\n*L\n227#1:274\n241#1:275\n252#1:276\n265#1:277\n*E\n"})
public final class RowScopeInstance implements RowScope {
    @l
    public static final RowScopeInstance a;

    static {
        RowScopeInstance.a = new RowScopeInstance();
    }

    @Override  // androidx.compose.foundation.layout.RowScope
    @l
    public Modifier a(@l Modifier modifier0, @l Function1 function10) {
        L.p(modifier0, "<this>");
        L.p(function10, "alignmentLineBlock");
        return modifier0.r0(new WithAlignmentLineBlock(function10, InspectableValueKt.b()));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowScopeInstance\n*L\n1#1,170:1\n266#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.layout.RowScopeInstance.alignBy..inlined.debugInspectorInfo.2 extends N implements Function1 {
            final Function1 e;

            public androidx.compose.foundation.layout.RowScopeInstance.alignBy..inlined.debugInspectorInfo.2(Function1 function10) {
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

    @Override  // androidx.compose.foundation.layout.RowScope
    @Stable
    @l
    public Modifier b(@l Modifier modifier0, float f, boolean z) {
        L.p(modifier0, "<this>");
        if(((double)f) <= 0.0) {
            throw new IllegalArgumentException(("invalid weight " + f + "; must be greater than zero").toString());
        }
        return modifier0.r0(new LayoutWeightImpl(f, z, InspectableValueKt.b()));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowScopeInstance\n*L\n1#1,170:1\n228#2,5:171\n*E\n"})
        public final class androidx.compose.foundation.layout.RowScopeInstance.weight..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final float e;
            final boolean f;

            public androidx.compose.foundation.layout.RowScopeInstance.weight..inlined.debugInspectorInfo.1(float f, boolean z) {
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

    @Override  // androidx.compose.foundation.layout.RowScope
    @Stable
    @l
    public Modifier c(@l Modifier modifier0, @l HorizontalAlignmentLine horizontalAlignmentLine0) {
        L.p(modifier0, "<this>");
        L.p(horizontalAlignmentLine0, "alignmentLine");
        return modifier0.r0(new WithAlignmentLine(horizontalAlignmentLine0, InspectableValueKt.b()));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowScopeInstance\n*L\n1#1,170:1\n253#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.layout.RowScopeInstance.alignBy..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final HorizontalAlignmentLine e;

            public androidx.compose.foundation.layout.RowScopeInstance.alignBy..inlined.debugInspectorInfo.1(HorizontalAlignmentLine horizontalAlignmentLine0) {
                this.e = horizontalAlignmentLine0;
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

    @Override  // androidx.compose.foundation.layout.RowScope
    @Stable
    @l
    public Modifier d(@l Modifier modifier0, @l Vertical alignment$Vertical0) {
        L.p(modifier0, "<this>");
        L.p(alignment$Vertical0, "alignment");
        return modifier0.r0(new VerticalAlignModifier(alignment$Vertical0, InspectableValueKt.b()));

        @s0({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowScopeInstance\n*L\n1#1,170:1\n242#2,3:171\n*E\n"})
        public final class androidx.compose.foundation.layout.RowScopeInstance.align..inlined.debugInspectorInfo.1 extends N implements Function1 {
            final Vertical e;

            public androidx.compose.foundation.layout.RowScopeInstance.align..inlined.debugInspectorInfo.1(Vertical alignment$Vertical0) {
                this.e = alignment$Vertical0;
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

    @Override  // androidx.compose.foundation.layout.RowScope
    @Stable
    @l
    public Modifier e(@l Modifier modifier0) {
        L.p(modifier0, "<this>");
        return this.c(modifier0, AlignmentLineKt.a());
    }
}

