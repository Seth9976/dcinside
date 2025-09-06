package androidx.compose.foundation.layout;

import A3.o;
import A3.p;
import A3.r;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope.-CC;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.math.b;
import y4.l;
import y4.m;

@s0({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,769:1\n32#2,6:770\n32#2,6:776\n32#2,6:782\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/RowColumnImplKt\n*L\n532#1:770,6\n556#1:776,6\n582#1:782,6\n*E\n"})
public final class RowColumnImplKt {
    private static final p a(LayoutOrientation layoutOrientation0) {
        return layoutOrientation0 == LayoutOrientation.a ? IntrinsicMeasureBlocks.a.a() : IntrinsicMeasureBlocks.a.e();
    }

    private static final p b(LayoutOrientation layoutOrientation0) {
        return layoutOrientation0 == LayoutOrientation.a ? IntrinsicMeasureBlocks.a.b() : IntrinsicMeasureBlocks.a.f();
    }

    private static final p c(LayoutOrientation layoutOrientation0) {
        return layoutOrientation0 == LayoutOrientation.a ? IntrinsicMeasureBlocks.a.c() : IntrinsicMeasureBlocks.a.g();
    }

    private static final p d(LayoutOrientation layoutOrientation0) {
        return layoutOrientation0 == LayoutOrientation.a ? IntrinsicMeasureBlocks.a.d() : IntrinsicMeasureBlocks.a.h();
    }

    @m
    public static final CrossAxisAlignment j(@m RowColumnParentData rowColumnParentData0) {
        return rowColumnParentData0 == null ? null : rowColumnParentData0.f();
    }

    public static final boolean k(@m RowColumnParentData rowColumnParentData0) {
        return rowColumnParentData0 == null ? true : rowColumnParentData0.g();
    }

    @m
    public static final RowColumnParentData l(@l IntrinsicMeasurable intrinsicMeasurable0) {
        L.p(intrinsicMeasurable0, "<this>");
        Object object0 = intrinsicMeasurable0.c();
        return object0 instanceof RowColumnParentData ? ((RowColumnParentData)object0) : null;
    }

    public static final float m(@m RowColumnParentData rowColumnParentData0) {
        return rowColumnParentData0 == null ? 0.0f : rowColumnParentData0.h();
    }

    private static final int n(List list0, o o0, o o1, int v, int v1) {
        int v8;
        int v2 = Math.min((list0.size() - 1) * v1, v);
        int v3 = list0.size();
        float f = 0.0f;
        int v6 = 0;
        for(int v5 = 0; v5 < v3; ++v5) {
            IntrinsicMeasurable intrinsicMeasurable0 = (IntrinsicMeasurable)list0.get(v5);
            float f1 = RowColumnImplKt.m(RowColumnImplKt.l(intrinsicMeasurable0));
            if(f1 == 0.0f) {
                int v7 = Math.min(((Number)o0.invoke(intrinsicMeasurable0, 0x7FFFFFFF)).intValue(), v - v2);
                v2 += v7;
                v6 = Math.max(v6, ((Number)o1.invoke(intrinsicMeasurable0, v7)).intValue());
            }
            else if(f1 > 0.0f) {
                f += f1;
            }
        }
        if(f == 0.0f) {
            v8 = 0;
        }
        else {
            v8 = v == 0x7FFFFFFF ? 0x7FFFFFFF : b.L0(((float)Math.max(v - v2, 0)) / f);
        }
        int v9 = list0.size();
        for(int v4 = 0; v4 < v9; ++v4) {
            IntrinsicMeasurable intrinsicMeasurable1 = (IntrinsicMeasurable)list0.get(v4);
            float f2 = RowColumnImplKt.m(RowColumnImplKt.l(intrinsicMeasurable1));
            if(f2 > 0.0f) {
                v6 = Math.max(v6, ((Number)o1.invoke(intrinsicMeasurable1, ((int)(v8 == 0x7FFFFFFF ? 0x7FFFFFFF : b.L0(((float)v8) * f2))))).intValue());
            }
        }
        return v6;
    }

    private static final int o(List list0, o o0, int v, int v1) {
        int v2 = list0.size();
        int v4 = 0;
        int v5 = 0;
        float f = 0.0f;
        for(int v3 = 0; v3 < v2; ++v3) {
            IntrinsicMeasurable intrinsicMeasurable0 = (IntrinsicMeasurable)list0.get(v3);
            float f1 = RowColumnImplKt.m(RowColumnImplKt.l(intrinsicMeasurable0));
            int v6 = ((Number)o0.invoke(intrinsicMeasurable0, v)).intValue();
            if(f1 == 0.0f) {
                v5 += v6;
            }
            else if(f1 > 0.0f) {
                f += f1;
                v4 = Math.max(v4, b.L0(((float)v6) / f1));
            }
        }
        return b.L0(((float)v4) * f) + v5 + (list0.size() - 1) * v1;
    }

    private static final int p(List list0, o o0, o o1, int v, int v1, LayoutOrientation layoutOrientation0, LayoutOrientation layoutOrientation1) {
        return layoutOrientation0 == layoutOrientation1 ? RowColumnImplKt.o(list0, o0, v, v1) : RowColumnImplKt.n(list0, o1, o0, v, v1);
    }

    public static final boolean q(@m RowColumnParentData rowColumnParentData0) {
        CrossAxisAlignment crossAxisAlignment0 = RowColumnImplKt.j(rowColumnParentData0);
        return crossAxisAlignment0 == null ? false : crossAxisAlignment0.f();
    }

    @l
    public static final MeasurePolicy r(@l LayoutOrientation layoutOrientation0, @l r r0, float f, @l SizeMode sizeMode0, @l CrossAxisAlignment crossAxisAlignment0) {
        L.p(layoutOrientation0, "orientation");
        L.p(r0, "arrangement");
        L.p(sizeMode0, "crossAxisSize");
        L.p(crossAxisAlignment0, "crossAxisAlignment");
        return new MeasurePolicy() {
            @Override  // androidx.compose.ui.layout.MeasurePolicy
            @l
            public MeasureResult a(@l MeasureScope measureScope0, @l List list0, long v) {
                L.p(measureScope0, "$this$measure");
                L.p(list0, "measurables");
                RowColumnMeasurementHelper rowColumnMeasurementHelper0 = new RowColumnMeasurementHelper(layoutOrientation0, r0, f, sizeMode0, crossAxisAlignment0, list0, new Placeable[list0.size()], null);
                RowColumnMeasureHelperResult rowColumnMeasureHelperResult0 = rowColumnMeasurementHelper0.l(measureScope0, v, 0, list0.size());
                return layoutOrientation0 == LayoutOrientation.a ? MeasureScope.-CC.p(measureScope0, rowColumnMeasureHelperResult0.e(), rowColumnMeasureHelperResult0.b(), null, new Function1(rowColumnMeasureHelperResult0, measureScope0) {
                    final RowColumnMeasurementHelper e;
                    final RowColumnMeasureHelperResult f;
                    final MeasureScope g;

                    {
                        this.e = rowColumnMeasurementHelper0;
                        this.f = rowColumnMeasureHelperResult0;
                        this.g = measureScope0;
                        super(1);
                    }

                    public final void a(@l PlacementScope placeable$PlacementScope0) {
                        L.p(placeable$PlacementScope0, "$this$layout");
                        LayoutDirection layoutDirection0 = this.g.getLayoutDirection();
                        this.e.m(placeable$PlacementScope0, this.f, 0, layoutDirection0);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((PlacementScope)object0));
                        return S0.a;
                    }
                }, 4, null) : MeasureScope.-CC.p(measureScope0, rowColumnMeasureHelperResult0.b(), rowColumnMeasureHelperResult0.e(), null, new Function1(rowColumnMeasureHelperResult0, measureScope0) {
                    final RowColumnMeasurementHelper e;
                    final RowColumnMeasureHelperResult f;
                    final MeasureScope g;

                    {
                        this.e = rowColumnMeasurementHelper0;
                        this.f = rowColumnMeasureHelperResult0;
                        this.g = measureScope0;
                        super(1);
                    }

                    public final void a(@l PlacementScope placeable$PlacementScope0) {
                        L.p(placeable$PlacementScope0, "$this$layout");
                        LayoutDirection layoutDirection0 = this.g.getLayoutDirection();
                        this.e.m(placeable$PlacementScope0, this.f, 0, layoutDirection0);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.a(((PlacementScope)object0));
                        return S0.a;
                    }
                }, 4, null);
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int b(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
                L.p(intrinsicMeasureScope0, "<this>");
                L.p(list0, "measurables");
                return ((Number)RowColumnImplKt.c(layoutOrientation0).invoke(list0, v, intrinsicMeasureScope0.b1(f))).intValue();
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int c(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
                L.p(intrinsicMeasureScope0, "<this>");
                L.p(list0, "measurables");
                return ((Number)RowColumnImplKt.d(layoutOrientation0).invoke(list0, v, intrinsicMeasureScope0.b1(f))).intValue();
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int d(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
                L.p(intrinsicMeasureScope0, "<this>");
                L.p(list0, "measurables");
                return ((Number)RowColumnImplKt.a(layoutOrientation0).invoke(list0, v, intrinsicMeasureScope0.b1(f))).intValue();
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int e(@l IntrinsicMeasureScope intrinsicMeasureScope0, @l List list0, int v) {
                L.p(intrinsicMeasureScope0, "<this>");
                L.p(list0, "measurables");
                return ((Number)RowColumnImplKt.b(layoutOrientation0).invoke(list0, v, intrinsicMeasureScope0.b1(f))).intValue();
            }
        };
    }
}

