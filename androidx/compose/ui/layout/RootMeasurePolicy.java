package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode.NoIntrinsicsMeasurePolicy;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nRootMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RootMeasurePolicy.kt\nandroidx/compose/ui/layout/RootMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,67:1\n151#2,3:68\n33#2,4:71\n154#2,2:75\n38#2:77\n156#2:78\n33#2,6:79\n*S KotlinDebug\n*F\n+ 1 RootMeasurePolicy.kt\nandroidx/compose/ui/layout/RootMeasurePolicy\n*L\n47#1:68,3\n47#1:71,4\n47#1:75,2\n47#1:77\n47#1:78\n52#1:79,6\n*E\n"})
public final class RootMeasurePolicy extends NoIntrinsicsMeasurePolicy {
    @l
    public static final RootMeasurePolicy b;

    static {
        RootMeasurePolicy.b = new RootMeasurePolicy();
    }

    private RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    @l
    public MeasureResult a(@l MeasureScope measureScope0, @l List list0, long v) {
        L.p(measureScope0, "$this$measure");
        L.p(list0, "measurables");
        if(list0.isEmpty()) {
            return MeasureScope.-CC.p(measureScope0, Constraints.r(v), Constraints.q(v), null, androidx.compose.ui.layout.RootMeasurePolicy.measure.1.e, 4, null);
        }
        if(list0.size() == 1) {
            Placeable placeable0 = ((Measurable)list0.get(0)).r1(v);
            return MeasureScope.-CC.p(measureScope0, ConstraintsKt.g(v, placeable0.N1()), ConstraintsKt.f(v, placeable0.K1()), null, new Function1() {
                final Placeable e;

                {
                    this.e = placeable0;
                    super(1);
                }

                public final void a(@l PlacementScope placeable$PlacementScope0) {
                    L.p(placeable$PlacementScope0, "$this$layout");
                    PlacementScope.z(placeable$PlacementScope0, this.e, 0, 0, 0.0f, null, 12, null);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((PlacementScope)object0));
                    return S0.a;
                }
            }, 4, null);
        }
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v2 = list0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            arrayList0.add(((Measurable)list0.get(v3)).r1(v));
        }
        int v4 = arrayList0.size();
        int v5 = 0;
        int v6 = 0;
        for(int v1 = 0; v1 < v4; ++v1) {
            Placeable placeable1 = (Placeable)arrayList0.get(v1);
            v5 = Math.max(placeable1.N1(), v5);
            v6 = Math.max(placeable1.K1(), v6);
        }
        return MeasureScope.-CC.p(measureScope0, ConstraintsKt.g(v, v5), ConstraintsKt.f(v, v6), null, new Function1() {
            final List e;

            {
                this.e = list0;
                super(1);
            }

            public final void a(@l PlacementScope placeable$PlacementScope0) {
                L.p(placeable$PlacementScope0, "$this$layout");
                List list0 = this.e;
                int v = list0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    PlacementScope.z(placeable$PlacementScope0, ((Placeable)list0.get(v1)), 0, 0, 0.0f, null, 12, null);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((PlacementScope)object0));
                return S0.a;
            }
        }, 4, null);

        final class androidx.compose.ui.layout.RootMeasurePolicy.measure.1 extends N implements Function1 {
            public static final androidx.compose.ui.layout.RootMeasurePolicy.measure.1 e;

            static {
                androidx.compose.ui.layout.RootMeasurePolicy.measure.1.e = new androidx.compose.ui.layout.RootMeasurePolicy.measure.1();
            }

            androidx.compose.ui.layout.RootMeasurePolicy.measure.1() {
                super(1);
            }

            public final void a(@l PlacementScope placeable$PlacementScope0) {
                L.p(placeable$PlacementScope0, "$this$layout");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((PlacementScope)object0));
                return S0.a;
            }
        }

    }
}

