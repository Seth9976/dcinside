package androidx.compose.foundation.layout;

import A3.r;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.T;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.math.b;
import kotlin.ranges.s;
import y4.l;

@s0({"SMAP\nRowColumnMeasurementHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnMeasurementHelper.kt\nandroidx/compose/foundation/layout/RowColumnMeasurementHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,325:1\n1#2:326\n*E\n"})
public final class RowColumnMeasurementHelper {
    @l
    private final LayoutOrientation a;
    @l
    private final r b;
    private final float c;
    @l
    private final SizeMode d;
    @l
    private final CrossAxisAlignment e;
    @l
    private final List f;
    @l
    private final Placeable[] g;
    @l
    private final RowColumnParentData[] h;

    private RowColumnMeasurementHelper(LayoutOrientation layoutOrientation0, r r0, float f, SizeMode sizeMode0, CrossAxisAlignment crossAxisAlignment0, List list0, Placeable[] arr_placeable) {
        this.a = layoutOrientation0;
        this.b = r0;
        this.c = f;
        this.d = sizeMode0;
        this.e = crossAxisAlignment0;
        this.f = list0;
        this.g = arr_placeable;
        int v = list0.size();
        RowColumnParentData[] arr_rowColumnParentData = new RowColumnParentData[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_rowColumnParentData[v1] = RowColumnImplKt.l(((IntrinsicMeasurable)this.f.get(v1)));
        }
        this.h = arr_rowColumnParentData;
    }

    public RowColumnMeasurementHelper(LayoutOrientation layoutOrientation0, r r0, float f, SizeMode sizeMode0, CrossAxisAlignment crossAxisAlignment0, List list0, Placeable[] arr_placeable, w w0) {
        this(layoutOrientation0, r0, f, sizeMode0, crossAxisAlignment0, list0, arr_placeable);
    }

    public final int a(@l Placeable placeable0) {
        L.p(placeable0, "<this>");
        return this.a == LayoutOrientation.a ? placeable0.K1() : placeable0.N1();
    }

    @l
    public final r b() {
        return this.b;
    }

    public final float c() {
        return this.c;
    }

    @l
    public final CrossAxisAlignment d() {
        return this.e;
    }

    private final int e(Placeable placeable0, RowColumnParentData rowColumnParentData0, int v, LayoutDirection layoutDirection0, int v1) {
        CrossAxisAlignment crossAxisAlignment0;
        if(rowColumnParentData0 == null) {
            crossAxisAlignment0 = this.e;
        }
        else {
            crossAxisAlignment0 = rowColumnParentData0.f();
            if(crossAxisAlignment0 == null) {
                crossAxisAlignment0 = this.e;
            }
        }
        int v2 = this.a(placeable0);
        if(this.a == LayoutOrientation.a) {
            layoutDirection0 = LayoutDirection.a;
        }
        return crossAxisAlignment0.d(v - v2, layoutDirection0, placeable0, v1);
    }

    @l
    public final SizeMode f() {
        return this.d;
    }

    @l
    public final List g() {
        return this.f;
    }

    @l
    public final LayoutOrientation h() {
        return this.a;
    }

    @l
    public final Placeable[] i() {
        return this.g;
    }

    private final int[] j(int v, int[] arr_v, int[] arr_v1, MeasureScope measureScope0) {
        LayoutDirection layoutDirection0 = measureScope0.getLayoutDirection();
        this.b.K0(v, arr_v, layoutDirection0, measureScope0, arr_v1);
        return arr_v1;
    }

    public final int k(@l Placeable placeable0) {
        L.p(placeable0, "<this>");
        return this.a == LayoutOrientation.a ? placeable0.N1() : placeable0.K1();
    }

    @l
    public final RowColumnMeasureHelperResult l(@l MeasureScope measureScope0, long v, int v1, int v2) {
        int v34;
        int v32;
        int v27;
        float f4;
        int v17;
        int v16;
        int v14;
        int v13;
        int v11;
        L.p(measureScope0, "measureScope");
        OrientationIndependentConstraints orientationIndependentConstraints0 = new OrientationIndependentConstraints(v, this.a, null);
        int v3 = measureScope0.b1(this.c);
        int v4 = v2 - v1;
        int v5 = v1;
        int v6 = 0;
        int v7 = 0;
        int v8 = 0;
        float f = 0.0f;
        int v9 = 0;
        int v10 = 0;
        while(v5 < v2) {
            Measurable measurable0 = (Measurable)this.f.get(v5);
            RowColumnParentData rowColumnParentData0 = this.h[v5];
            float f1 = RowColumnImplKt.m(rowColumnParentData0);
            if(f1 > 0.0f) {
                f += f1;
                ++v8;
                v11 = v5;
            }
            else {
                int v12 = orientationIndependentConstraints0.i();
                Placeable placeable0 = this.g[v5];
                if(placeable0 == null) {
                    v13 = v12;
                    v14 = v7;
                    v11 = v5;
                    placeable0 = measurable0.r1(OrientationIndependentConstraints.f(orientationIndependentConstraints0, 0, (v12 == 0x7FFFFFFF ? 0x7FFFFFFF : v12 - v9), 0, 0, 8, null).n(this.a));
                }
                else {
                    v13 = v12;
                    v14 = v7;
                    v11 = v5;
                }
                int v15 = Math.min(v3, v13 - v9 - this.k(placeable0));
                v9 += this.k(placeable0) + v15;
                v7 = Math.max(v14, this.a(placeable0));
                v10 = v10 != 0 || RowColumnImplKt.q(rowColumnParentData0) ? 1 : 0;
                this.g[v11] = placeable0;
                v6 = v15;
            }
            v5 = v11 + 1;
        }
        if(v8 == 0) {
            v9 -= v6;
            v16 = v7;
            v17 = 0;
        }
        else {
            int v18 = Float.compare(f, 0.0f);
            int v19 = v3 * (v8 - 1);
            int v20 = (v18 <= 0 || orientationIndependentConstraints0.i() == 0x7FFFFFFF ? orientationIndependentConstraints0.j() : orientationIndependentConstraints0.i()) - v9 - v19;
            float f2 = v18 <= 0 ? 0.0f : ((float)v20) / f;
            int v21 = 0;
            Iterator iterator0 = s.W1(v1, v2).iterator();
            while(iterator0.hasNext()) {
                v21 += b.L0(RowColumnImplKt.m(this.h[((T)iterator0).b()]) * f2);
            }
            int v22 = v20 - v21;
            int v23 = v1;
            v16 = v7;
            int v24 = 0;
            while(v23 < v2) {
                if(this.g[v23] == null) {
                    Measurable measurable1 = (Measurable)this.f.get(v23);
                    RowColumnParentData rowColumnParentData1 = this.h[v23];
                    float f3 = RowColumnImplKt.m(rowColumnParentData1);
                    if(f3 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables");
                    }
                    int v25 = b.U(v22);
                    int v26 = Math.max(0, b.L0(f3 * f2) + v25);
                    if(!RowColumnImplKt.k(rowColumnParentData1) || v26 == 0x7FFFFFFF) {
                        f4 = f2;
                        v27 = 0;
                    }
                    else {
                        f4 = f2;
                        v27 = v26;
                    }
                    Placeable placeable1 = measurable1.r1(new OrientationIndependentConstraints(v27, v26, 0, orientationIndependentConstraints0.g()).n(this.a));
                    v24 += this.k(placeable1);
                    int v28 = Math.max(v16, this.a(placeable1));
                    int v29 = v10 != 0 || RowColumnImplKt.q(rowColumnParentData1) ? 1 : 0;
                    this.g[v23] = placeable1;
                    v16 = v28;
                    v10 = v29;
                    v22 -= v25;
                }
                else {
                    f4 = f2;
                }
                ++v23;
                f2 = f4;
            }
            v17 = s.B(v24 + v19, orientationIndependentConstraints0.i() - v9);
        }
        if(v10 == 0) {
            v32 = 0;
            v34 = 0;
        }
        else {
            int v30 = v1;
            int v31 = 0;
            v32 = 0;
            while(v30 < v2) {
                Placeable placeable2 = this.g[v30];
                L.m(placeable2);
                CrossAxisAlignment crossAxisAlignment0 = RowColumnImplKt.j(this.h[v30]);
                Integer integer0 = crossAxisAlignment0 == null ? null : crossAxisAlignment0.e(placeable2);
                if(integer0 != null) {
                    int v33 = integer0.intValue();
                    if(v33 == 0x80000000) {
                        v33 = 0;
                    }
                    v31 = Math.max(v31, v33);
                    v32 = Math.max(v32, this.a(placeable2) - (integer0.intValue() == 0x80000000 ? this.a(placeable2) : integer0.intValue()));
                }
                ++v30;
            }
            v34 = v31;
        }
        int v35 = Math.max(v9 + v17, orientationIndependentConstraints0.j());
        int v36 = orientationIndependentConstraints0.g() == 0x7FFFFFFF || this.d != SizeMode.b ? Math.max(v16, Math.max(orientationIndependentConstraints0.h(), v32 + v34)) : orientationIndependentConstraints0.g();
        int[] arr_v = new int[v4];
        for(int v37 = 0; v37 < v4; ++v37) {
            arr_v[v37] = 0;
        }
        int[] arr_v1 = new int[v4];
        for(int v38 = 0; v38 < v4; ++v38) {
            Placeable placeable3 = this.g[v38 + v1];
            L.m(placeable3);
            arr_v1[v38] = this.k(placeable3);
        }
        return new RowColumnMeasureHelperResult(v36, v35, v1, v2, v34, this.j(v35, arr_v1, arr_v, measureScope0));
    }

    public final void m(@l PlacementScope placeable$PlacementScope0, @l RowColumnMeasureHelperResult rowColumnMeasureHelperResult0, int v, @l LayoutDirection layoutDirection0) {
        L.p(placeable$PlacementScope0, "placeableScope");
        L.p(rowColumnMeasureHelperResult0, "measureResult");
        L.p(layoutDirection0, "layoutDirection");
        int v1 = rowColumnMeasureHelperResult0.f();
        int v2 = rowColumnMeasureHelperResult0.c();
        while(v1 < v2) {
            Placeable placeable0 = this.g[v1];
            L.m(placeable0);
            int[] arr_v = rowColumnMeasureHelperResult0.d();
            Object object0 = ((Measurable)this.f.get(v1)).c();
            int v3 = this.e(placeable0, (object0 instanceof RowColumnParentData ? ((RowColumnParentData)object0) : null), rowColumnMeasureHelperResult0.b(), layoutDirection0, rowColumnMeasureHelperResult0.a()) + v;
            if(this.a == LayoutOrientation.a) {
                PlacementScope.p(placeable$PlacementScope0, placeable0, arr_v[v1 - rowColumnMeasureHelperResult0.f()], v3, 0.0f, 4, null);
            }
            else {
                PlacementScope.p(placeable$PlacementScope0, placeable0, v3, arr_v[v1 - rowColumnMeasureHelperResult0.f()], 0.0f, 4, null);
            }
            ++v1;
        }
    }
}

