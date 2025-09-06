package androidx.compose.foundation.lazy.grid;

import A3.p;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement.Horizontal;
import androidx.compose.foundation.layout.Arrangement.Vertical;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProviderKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList.PinnedItem;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.collections.l;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.math.b;
import kotlin.ranges.j;
import kotlin.ranges.s;
import y4.m;

@s0({"SMAP\nLazyGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n+ 2 ItemIndex.kt\nandroidx/compose/foundation/lazy/grid/LineIndex\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n*L\n1#1,435:1\n315#1,3:446\n318#1,14:453\n333#1:468\n315#1,3:469\n318#1,14:476\n333#1:491\n30#2:436\n25#2:441\n27#2:443\n25#2:444\n30#2:445\n33#3,4:437\n38#3:442\n33#3,4:449\n38#3:467\n33#3,4:472\n38#3:490\n33#3,4:495\n38#3:501\n33#3,6:503\n132#3,3:509\n33#3,4:512\n135#3,2:516\n38#3:518\n137#3:519\n33#3,6:520\n33#3,6:526\n33#3,6:532\n36#4,3:492\n39#4,2:499\n41#4:502\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n*L\n213#1:446,3\n213#1:453,14\n213#1:468\n221#1:469,3\n221#1:476,14\n221#1:491\n118#1:436\n142#1:441\n163#1:443\n168#1:444\n178#1:445\n141#1:437,4\n141#1:442\n213#1:449,4\n213#1:467\n221#1:472,4\n221#1:490\n294#1:495,4\n294#1:501\n317#1:503,6\n360#1:509,3\n360#1:512,4\n360#1:516,2\n360#1:518\n360#1:519\n403#1:520,6\n409#1:526,6\n414#1:532,6\n294#1:492,3\n294#1:499,2\n294#1:502\n*E\n"})
public final class LazyGridMeasureKt {
    @ExperimentalFoundationApi
    private static final List a(LazyLayoutPinnedItemList lazyLayoutPinnedItemList0, LazyMeasuredItemProvider lazyMeasuredItemProvider0, LazyGridItemProvider lazyGridItemProvider0, Function1 function10, Function1 function11) {
        int v = lazyLayoutPinnedItemList0.size();
        List list0 = null;
        for(int v1 = 0; v1 < v; ++v1) {
            PinnedItem lazyLayoutPinnedItemList$PinnedItem0 = (PinnedItem)lazyLayoutPinnedItemList0.get(v1);
            int v2 = LazyLayoutItemProviderKt.c(lazyGridItemProvider0, lazyLayoutPinnedItemList$PinnedItem0.getKey(), lazyLayoutPinnedItemList$PinnedItem0.getIndex());
            if(((Boolean)function11.invoke(v2)).booleanValue()) {
                LazyGridMeasuredItem lazyGridMeasuredItem0 = LazyMeasuredItemProvider.b(lazyMeasuredItemProvider0, v2, 0, ((Constraints)function10.invoke(ItemIndex.a(v2))).x(), 2, null);
                if(list0 == null) {
                    list0 = new ArrayList();
                }
                list0.add(lazyGridMeasuredItem0);
            }
        }
        return list0 == null ? u.H() : list0;
    }

    private static final List b(List list0, List list1, List list2, int v, int v1, int v2, int v3, int v4, boolean z, Vertical arrangement$Vertical0, Horizontal arrangement$Horizontal0, boolean z1, Density density0) {
        int v5 = z ? v1 : v;
        boolean z2 = v2 < Math.min(v5, v3);
        if(z2 && v4 != 0) {
            throw new IllegalStateException("Check failed.");
        }
        int v7 = list0.size();
        int v9 = 0;
        for(int v8 = 0; v8 < v7; ++v8) {
            v9 += ((LazyGridMeasuredLine)list0.get(v8)).b().length;
        }
        List list3 = new ArrayList(v9);
        if(z2) {
            if(!list1.isEmpty() || !list2.isEmpty()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            int v10 = list0.size();
            int[] arr_v = new int[v10];
            for(int v11 = 0; v11 < v10; ++v11) {
                arr_v[v11] = ((LazyGridMeasuredLine)list0.get(LazyGridMeasureKt.c(v11, z1, v10))).c();
            }
            int[] arr_v1 = new int[v10];
            for(int v12 = 0; v12 < v10; ++v12) {
                arr_v1[v12] = 0;
            }
            if(z) {
                if(arrangement$Vertical0 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                arrangement$Vertical0.c(density0, v5, arr_v, arr_v1);
            }
            else {
                if(arrangement$Horizontal0 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                arrangement$Horizontal0.b(density0, v5, arr_v, LayoutDirection.a, arr_v1);
            }
            j j0 = l.le(arr_v1);
            if(z1) {
                j0 = s.q1(j0);
            }
            int v13 = j0.g();
            int v14 = j0.h();
            int v15 = j0.i();
            if(v15 > 0 && v13 <= v14 || v15 < 0 && v14 <= v13) {
                while(true) {
                    int v16 = arr_v1[v13];
                    LazyGridMeasuredLine lazyGridMeasuredLine0 = (LazyGridMeasuredLine)list0.get(LazyGridMeasureKt.c(v13, z1, v10));
                    if(z1) {
                        v16 = v5 - v16 - lazyGridMeasuredLine0.c();
                    }
                    ((ArrayList)list3).addAll(lazyGridMeasuredLine0.f(v16, v, v1));
                    if(v13 == v14) {
                        return list3;
                    }
                    v13 += v15;
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        else {
            int v17 = list1.size();
            int v18 = v4;
            for(int v19 = 0; v19 < v17; ++v19) {
                LazyGridMeasuredItem lazyGridMeasuredItem0 = (LazyGridMeasuredItem)list1.get(v19);
                v18 -= lazyGridMeasuredItem0.e();
                ((ArrayList)list3).add(LazyGridMeasureKt.e(lazyGridMeasuredItem0, v18, v, v1));
            }
            int v20 = list0.size();
            int v21 = v4;
            for(int v22 = 0; v22 < v20; ++v22) {
                LazyGridMeasuredLine lazyGridMeasuredLine1 = (LazyGridMeasuredLine)list0.get(v22);
                ((ArrayList)list3).addAll(lazyGridMeasuredLine1.f(v21, v, v1));
                v21 += lazyGridMeasuredLine1.d();
            }
            int v23 = list2.size();
            for(int v6 = 0; v6 < v23; ++v6) {
                LazyGridMeasuredItem lazyGridMeasuredItem1 = (LazyGridMeasuredItem)list2.get(v6);
                ((ArrayList)list3).add(LazyGridMeasureKt.e(lazyGridMeasuredItem1, v21, v, v1));
                v21 += lazyGridMeasuredItem1.e();
            }
        }
        return list3;
    }

    // 去混淆评级： 低(20)
    private static final int c(int v, boolean z, int v1) {
        return z ? v1 - v - 1 : v;
    }

    @y4.l
    public static final LazyGridMeasureResult d(int v, @y4.l LazyGridItemProvider lazyGridItemProvider0, @y4.l LazyMeasuredLineProvider lazyMeasuredLineProvider0, @y4.l LazyMeasuredItemProvider lazyMeasuredItemProvider0, int v1, int v2, int v3, int v4, int v5, int v6, float f, long v7, boolean z, @m Vertical arrangement$Vertical0, @m Horizontal arrangement$Horizontal0, boolean z1, @y4.l Density density0, @y4.l LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator0, @y4.l LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider0, @y4.l LazyLayoutPinnedItemList lazyLayoutPinnedItemList0, @y4.l p p0) {
        int v62;
        int v61;
        int v57;
        LazyGridMeasuredLine lazyGridMeasuredLine5;
        int v56;
        int v55;
        int v54;
        int v49;
        int v48;
        int v47;
        int v46;
        int v45;
        float f2;
        ArrayList arrayList1;
        int v44;
        int v43;
        int v38;
        int v35;
        int v34;
        int v33;
        int v28;
        int v27;
        int v26;
        L.p(lazyGridItemProvider0, "itemProvider");
        L.p(lazyMeasuredLineProvider0, "measuredLineProvider");
        L.p(lazyMeasuredItemProvider0, "measuredItemProvider");
        L.p(density0, "density");
        L.p(lazyGridItemPlacementAnimator0, "placementAnimator");
        L.p(lazyGridSpanLayoutProvider0, "spanLayoutProvider");
        L.p(lazyLayoutPinnedItemList0, "pinnedItems");
        L.p(p0, "layout");
        if(v2 < 0 || v3 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if(v <= 0) {
            Object object0 = p0.invoke(Constraints.r(v7), Constraints.q(v7), androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.measureLazyGrid.1.e);
            List list0 = u.H();
            return z ? new LazyGridMeasureResult(null, 0, false, 0.0f, ((MeasureResult)object0), list0, -v2, v1 + v3, 0, z1, Orientation.a, v3, v4) : new LazyGridMeasureResult(null, 0, false, 0.0f, ((MeasureResult)object0), list0, -v2, v1 + v3, 0, z1, Orientation.b, v3, v4);
        }
        int v8 = b.L0(f);
        int v9 = v6 - v8;
        if(LineIndex.f(v5, 0) && v9 < 0) {
            v8 += v9;
            v9 = 0;
        }
        ArrayList arrayList0 = new ArrayList();
        int v10 = (v4 >= 0 ? 0 : v4) - v2;
        int v11 = v9 + v10;
        int v12;
        for(v12 = v5; v11 < 0 && v12 > 0; --v12) {
            LazyGridMeasuredLine lazyGridMeasuredLine0 = lazyMeasuredLineProvider0.b(v12 - 1);
            arrayList0.add(0, lazyGridMeasuredLine0);
            v11 += lazyGridMeasuredLine0.d();
        }
        int v13 = -v2;
        if(v11 < v10) {
            v8 += v11;
            v11 = v10;
        }
        int v14 = v11 - v10;
        int v15 = v1 + v3;
        int v16 = v12;
        int v17 = s.u(v15, 0);
        int v18 = -v14;
        int v19 = arrayList0.size();
        int v20 = v16;
        int v21 = v14;
        for(int v22 = 0; v22 < v19; ++v22) {
            ++v20;
            v18 += ((LazyGridMeasuredLine)arrayList0.get(v22)).d();
        }
        int v23 = v18;
        int v24 = v20;
        while(v24 < v && (v23 < v17 || v23 <= 0 || arrayList0.isEmpty())) {
            LazyGridMeasuredLine lazyGridMeasuredLine1 = lazyMeasuredLineProvider0.b(v24);
            if(lazyGridMeasuredLine1.e()) {
                break;
            }
            int v25 = v23 + lazyGridMeasuredLine1.d();
            if(v25 <= v10) {
                v26 = v10;
                v27 = v25;
                if(((LazyGridMeasuredItem)l.Ah(lazyGridMeasuredLine1.b())).b() != v - 1) {
                    v28 = v24 + 1;
                    v21 -= lazyGridMeasuredLine1.d();
                    goto label_63;
                }
            }
            else {
                v26 = v10;
                v27 = v25;
            }
            arrayList0.add(lazyGridMeasuredLine1);
            v28 = v16;
        label_63:
            ++v24;
            v16 = v28;
            v23 = v27;
            v10 = v26;
        }
        if(v23 < v1) {
            int v29 = v1 - v23;
            int v30 = v23 + v29;
            int v31 = v16;
            int v32;
            for(v32 = v21 - v29; v32 < v2 && v31 > 0; v32 += lazyGridMeasuredLine2.d()) {
                --v31;
                LazyGridMeasuredLine lazyGridMeasuredLine2 = lazyMeasuredLineProvider0.b(v31);
                arrayList0.add(0, lazyGridMeasuredLine2);
            }
            v33 = v15;
            v8 += v29;
            if(v32 < 0) {
                v8 += v32;
                v34 = v30 + v32;
                v35 = 0;
            }
            else {
                v35 = v32;
                v34 = v30;
            }
        }
        else {
            v33 = v15;
            v34 = v23;
            v35 = v21;
        }
        float f1 = b.U(b.L0(f)) != b.U(v8) || Math.abs(b.L0(f)) < Math.abs(v8) ? f : ((float)v8);
        if(v35 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int v36 = -v35;
        LazyGridMeasuredLine lazyGridMeasuredLine3 = (LazyGridMeasuredLine)u.B2(arrayList0);
        LazyGridMeasuredItem lazyGridMeasuredItem0 = (LazyGridMeasuredItem)l.nc(lazyGridMeasuredLine3.b());
        int v37 = lazyGridMeasuredItem0 == null ? 0 : lazyGridMeasuredItem0.b();
        LazyGridMeasuredLine lazyGridMeasuredLine4 = (LazyGridMeasuredLine)u.v3(arrayList0);
        if(lazyGridMeasuredLine4 == null) {
            v38 = 0;
        }
        else {
            LazyGridMeasuredItem[] arr_lazyGridMeasuredItem = lazyGridMeasuredLine4.b();
            if(arr_lazyGridMeasuredItem == null) {
                v38 = 0;
            }
            else {
                LazyGridMeasuredItem lazyGridMeasuredItem1 = (LazyGridMeasuredItem)l.di(arr_lazyGridMeasuredItem);
                v38 = lazyGridMeasuredItem1 == null ? 0 : lazyGridMeasuredItem1.b();
            }
        }
        int v39 = lazyLayoutPinnedItemList0.size();
        List list1 = null;
        int v40 = v34;
        List list2 = null;
        int v41 = 0;
        while(v41 < v39) {
            PinnedItem lazyLayoutPinnedItemList$PinnedItem0 = (PinnedItem)lazyLayoutPinnedItemList0.get(v41);
            int v42 = LazyLayoutItemProviderKt.c(lazyGridItemProvider0, lazyLayoutPinnedItemList$PinnedItem0.getKey(), lazyLayoutPinnedItemList$PinnedItem0.getIndex());
            if(v42 < 0 || v42 >= v37) {
                v46 = v33;
                v43 = v38;
                v44 = v37;
                arrayList1 = arrayList0;
                f2 = f1;
                v45 = v36;
                v47 = v13;
                v48 = v40;
                v49 = v41;
            }
            else {
                v43 = v38;
                v44 = v37;
                arrayList1 = arrayList0;
                f2 = f1;
                v45 = v36;
                v46 = v33;
                v47 = v13;
                v48 = v40;
                v49 = v41;
                LazyGridMeasuredItem lazyGridMeasuredItem2 = LazyMeasuredItemProvider.b(lazyMeasuredItemProvider0, v42, 0, lazyMeasuredLineProvider0.d(v42), 2, null);
                if(list2 == null) {
                    list2 = new ArrayList();
                }
                list2.add(lazyGridMeasuredItem2);
            }
            v41 = v49 + 1;
            arrayList0 = arrayList1;
            v13 = v47;
            v36 = v45;
            v38 = v43;
            v37 = v44;
            f1 = f2;
            v33 = v46;
            v40 = v48;
        }
        int v50 = v38;
        if(list2 == null) {
            list2 = u.H();
        }
        int v51 = lazyLayoutPinnedItemList0.size();
        int v52 = 0;
        while(v52 < v51) {
            PinnedItem lazyLayoutPinnedItemList$PinnedItem1 = (PinnedItem)lazyLayoutPinnedItemList0.get(v52);
            int v53 = LazyLayoutItemProviderKt.c(lazyGridItemProvider0, lazyLayoutPinnedItemList$PinnedItem1.getKey(), lazyLayoutPinnedItemList$PinnedItem1.getIndex());
            if(v50 + 1 > v53 || v53 >= v) {
                v54 = v52;
                v55 = v50;
                v56 = v51;
            }
            else {
                v54 = v52;
                v55 = v50;
                v56 = v51;
                LazyGridMeasuredItem lazyGridMeasuredItem3 = LazyMeasuredItemProvider.b(lazyMeasuredItemProvider0, v53, 0, lazyMeasuredLineProvider0.d(v53), 2, null);
                if(list1 == null) {
                    list1 = new ArrayList();
                }
                list1.add(lazyGridMeasuredItem3);
            }
            v52 = v54 + 1;
            v51 = v56;
            v50 = v55;
        }
        if(list1 == null) {
            list1 = u.H();
        }
        if(v2 > 0 || v4 < 0) {
            int v58 = arrayList0.size();
            v57 = v35;
            int v59 = 0;
            while(v59 < v58) {
                int v60 = ((LazyGridMeasuredLine)arrayList0.get(v59)).d();
                if(v57 == 0 || v60 > v57 || v59 == u.J(arrayList0)) {
                    break;
                }
                v57 -= v60;
                ++v59;
                lazyGridMeasuredLine3 = (LazyGridMeasuredLine)arrayList0.get(v59);
            }
            lazyGridMeasuredLine5 = lazyGridMeasuredLine3;
        }
        else {
            lazyGridMeasuredLine5 = lazyGridMeasuredLine3;
            v57 = v35;
        }
        if(z) {
            v61 = Constraints.p(v7);
            v62 = v40;
        }
        else {
            v62 = v40;
            v61 = ConstraintsKt.g(v7, v62);
        }
        int v63 = z ? ConstraintsKt.f(v7, v62) : Constraints.o(v7);
        List list3 = LazyGridMeasureKt.b(arrayList0, list2, list1, v61, v63, v62, v1, v36, z, arrangement$Vertical0, arrangement$Horizontal0, z1, density0);
        lazyGridItemPlacementAnimator0.h(((int)f1), v61, v63, list3, lazyMeasuredItemProvider0, lazyGridSpanLayoutProvider0);
        boolean z2 = v50 != v - 1 || v62 > v1;
        Object object1 = p0.invoke(v61, v63, new Function1(list3) {
            final List e;

            {
                this.e = list0;
                super(1);
            }

            public final void a(@y4.l PlacementScope placeable$PlacementScope0) {
                L.p(placeable$PlacementScope0, "$this$invoke");
                List list0 = this.e;
                int v = list0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    ((LazyGridPositionedItem)list0.get(v1)).m(placeable$PlacementScope0);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((PlacementScope)object0));
                return S0.a;
            }
        });
        if(list2.isEmpty() && list1.isEmpty()) {
            return z ? new LazyGridMeasureResult(lazyGridMeasuredLine5, v57, z2, f1, ((MeasureResult)object1), list3, v13, v33, v, z1, Orientation.a, v3, v4) : new LazyGridMeasureResult(lazyGridMeasuredLine5, v57, z2, f1, ((MeasureResult)object1), list3, v13, v33, v, z1, Orientation.b, v3, v4);
        }
        ArrayList arrayList2 = new ArrayList(list3.size());
        int v64 = list3.size();
        for(int v65 = 0; v65 < v64; ++v65) {
            Object object2 = list3.get(v65);
            int v66 = ((LazyGridPositionedItem)object2).getIndex();
            if(v37 <= v66 && v66 <= v50) {
                arrayList2.add(object2);
            }
        }
        return z ? new LazyGridMeasureResult(lazyGridMeasuredLine5, v57, z2, f1, ((MeasureResult)object1), arrayList2, v13, v33, v, z1, Orientation.a, v3, v4) : new LazyGridMeasureResult(lazyGridMeasuredLine5, v57, z2, f1, ((MeasureResult)object1), arrayList2, v13, v33, v, z1, Orientation.b, v3, v4);

        final class androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.measureLazyGrid.1 extends N implements Function1 {
            public static final androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.measureLazyGrid.1 e;

            static {
                androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.measureLazyGrid.1.e = new androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.measureLazyGrid.1();
            }

            androidx.compose.foundation.lazy.grid.LazyGridMeasureKt.measureLazyGrid.1() {
                super(1);
            }

            public final void a(@y4.l PlacementScope placeable$PlacementScope0) {
                L.p(placeable$PlacementScope0, "$this$invoke");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((PlacementScope)object0));
                return S0.a;
            }
        }

    }

    private static final LazyGridPositionedItem e(LazyGridMeasuredItem lazyGridMeasuredItem0, int v, int v1, int v2) {
        return lazyGridMeasuredItem0.h(v, 0, v1, v2, 0, 0);
    }
}

