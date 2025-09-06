package androidx.compose.foundation.lazy;

import A3.p;
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
import kotlin.V;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.s0;
import kotlin.math.b;
import kotlin.r0;
import kotlin.ranges.j;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyListMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n+ 2 DataIndex.kt\nandroidx/compose/foundation/lazy/DataIndex\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n*L\n1#1,515:1\n30#2:516\n25#2:521\n27#2:523\n25#2:524\n30#2:525\n33#3,4:517\n38#3:522\n33#3,6:526\n33#3,6:532\n33#3,4:541\n38#3:547\n33#3,6:549\n33#3,6:555\n33#3,6:561\n33#3,6:567\n33#3,6:573\n36#4,3:538\n39#4,2:545\n41#4:548\n*S KotlinDebug\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n*L\n127#1:516\n152#1:521\n169#1:523\n176#1:524\n186#1:525\n151#1:517,4\n151#1:522\n248#1:526,6\n264#1:532,6\n330#1:541,4\n330#1:547\n376#1:549,6\n419#1:555,6\n494#1:561,6\n500#1:567,6\n505#1:573,6\n330#1:538,3\n330#1:545,2\n330#1:548\n*E\n"})
public final class LazyListMeasureKt {
    @l
    private static final V a;

    static {
        LazyListMeasureKt.a = r0.a(0x80000000, 0x80000000);
    }

    private static final List a(List list0, List list1, List list2, int v, int v1, int v2, int v3, int v4, boolean z, Vertical arrangement$Vertical0, Horizontal arrangement$Horizontal0, boolean z1, Density density0) {
        int v5 = z ? v1 : v;
        boolean z2 = v2 < Math.min(v5, v3);
        if(z2 && v4 != 0) {
            throw new IllegalStateException("Check failed.");
        }
        List list3 = new ArrayList(list0.size() + list1.size() + list2.size());
        if(z2) {
            if(!list1.isEmpty() || !list2.isEmpty()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            int v7 = list0.size();
            int[] arr_v = new int[v7];
            for(int v8 = 0; v8 < v7; ++v8) {
                arr_v[v8] = ((LazyMeasuredItem)list0.get(LazyListMeasureKt.b(v8, z1, v7))).d();
            }
            int[] arr_v1 = new int[v7];
            for(int v9 = 0; v9 < v7; ++v9) {
                arr_v1[v9] = 0;
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
            j j0 = kotlin.collections.l.le(arr_v1);
            if(z1) {
                j0 = s.q1(j0);
            }
            int v10 = j0.g();
            int v11 = j0.h();
            int v12 = j0.i();
            if(v12 > 0 && v10 <= v11 || v12 < 0 && v11 <= v10) {
                while(true) {
                    int v13 = arr_v1[v10];
                    LazyMeasuredItem lazyMeasuredItem0 = (LazyMeasuredItem)list0.get(LazyListMeasureKt.b(v10, z1, v7));
                    if(z1) {
                        v13 = v5 - v13 - lazyMeasuredItem0.d();
                    }
                    ((ArrayList)list3).add(lazyMeasuredItem0.f(v13, v, v1));
                    if(v10 == v11) {
                        return list3;
                    }
                    v10 += v12;
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        else {
            int v14 = list1.size();
            int v15 = v4;
            for(int v16 = 0; v16 < v14; ++v16) {
                LazyMeasuredItem lazyMeasuredItem1 = (LazyMeasuredItem)list1.get(v16);
                v15 -= lazyMeasuredItem1.e();
                ((ArrayList)list3).add(lazyMeasuredItem1.f(v15, v, v1));
            }
            int v17 = list0.size();
            int v18 = v4;
            for(int v19 = 0; v19 < v17; ++v19) {
                LazyMeasuredItem lazyMeasuredItem2 = (LazyMeasuredItem)list0.get(v19);
                ((ArrayList)list3).add(lazyMeasuredItem2.f(v18, v, v1));
                v18 += lazyMeasuredItem2.e();
            }
            int v20 = list2.size();
            for(int v6 = 0; v6 < v20; ++v6) {
                LazyMeasuredItem lazyMeasuredItem3 = (LazyMeasuredItem)list2.get(v6);
                ((ArrayList)list3).add(lazyMeasuredItem3.f(v18, v, v1));
                v18 += lazyMeasuredItem3.e();
            }
        }
        return list3;
    }

    // 去混淆评级： 低(20)
    private static final int b(int v, boolean z, int v1) {
        return z ? v1 - v - 1 : v;
    }

    private static final List c(LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo0, List list0, LazyMeasuredItemProvider lazyMeasuredItemProvider0, LazyListItemProvider lazyListItemProvider0, int v, int v1, LazyLayoutPinnedItemList lazyLayoutPinnedItemList0) {
        h l0$h0 = new h();
        int v2 = ((LazyMeasuredItem)u.p3(list0)).b();
        if(lazyListBeyondBoundsInfo0.d()) {
            v2 = Math.max(LazyListMeasureKt.e(lazyListBeyondBoundsInfo0, v), v2);
        }
        int v3 = Math.min(v2 + v1, v - 1);
        int v4 = ((LazyMeasuredItem)u.p3(list0)).b() + 1;
        if(v4 <= v3) {
            while(true) {
                LazyListMeasureKt.d(l0$h0, lazyMeasuredItemProvider0, v4);
                if(v4 == v3) {
                    break;
                }
                ++v4;
            }
        }
        int v5 = lazyLayoutPinnedItemList0.size();
        for(int v6 = 0; v6 < v5; ++v6) {
            PinnedItem lazyLayoutPinnedItemList$PinnedItem0 = (PinnedItem)lazyLayoutPinnedItemList0.get(v6);
            int v7 = LazyLayoutItemProviderKt.c(lazyListItemProvider0, lazyLayoutPinnedItemList$PinnedItem0.getKey(), lazyLayoutPinnedItemList$PinnedItem0.getIndex());
            if(v7 > v3 && v7 < v) {
                LazyListMeasureKt.d(l0$h0, lazyMeasuredItemProvider0, v7);
            }
        }
        List list1 = (List)l0$h0.a;
        return list1 == null ? u.H() : list1;
    }

    private static final void d(h l0$h0, LazyMeasuredItemProvider lazyMeasuredItemProvider0, int v) {
        if(l0$h0.a == null) {
            l0$h0.a = new ArrayList();
        }
        Object object0 = l0$h0.a;
        if(object0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ((List)object0).add(lazyMeasuredItemProvider0.a(v));
    }

    private static final int e(LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo0, int v) {
        return Math.min(lazyListBeyondBoundsInfo0.b(), v - 1);
    }

    private static final List f(LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo0, int v, LazyMeasuredItemProvider lazyMeasuredItemProvider0, LazyListItemProvider lazyListItemProvider0, int v1, int v2, LazyLayoutPinnedItemList lazyLayoutPinnedItemList0) {
        h l0$h0 = new h();
        int v4 = Math.max(0, (lazyListBeyondBoundsInfo0.d() ? Math.min(LazyListMeasureKt.h(lazyListBeyondBoundsInfo0, v1), v) : v) - v2);
        int v5 = v - 1;
        if(v4 <= v5) {
            while(true) {
                LazyListMeasureKt.g(l0$h0, lazyMeasuredItemProvider0, v5);
                if(v5 == v4) {
                    break;
                }
                --v5;
            }
        }
        int v6 = lazyLayoutPinnedItemList0.size();
        for(int v3 = 0; v3 < v6; ++v3) {
            PinnedItem lazyLayoutPinnedItemList$PinnedItem0 = (PinnedItem)lazyLayoutPinnedItemList0.get(v3);
            int v7 = LazyLayoutItemProviderKt.c(lazyListItemProvider0, lazyLayoutPinnedItemList$PinnedItem0.getKey(), lazyLayoutPinnedItemList$PinnedItem0.getIndex());
            if(v7 < v4) {
                LazyListMeasureKt.g(l0$h0, lazyMeasuredItemProvider0, v7);
            }
        }
        List list0 = (List)l0$h0.a;
        return list0 == null ? u.H() : list0;
    }

    private static final void g(h l0$h0, LazyMeasuredItemProvider lazyMeasuredItemProvider0, int v) {
        if(l0$h0.a == null) {
            l0$h0.a = new ArrayList();
        }
        Object object0 = l0$h0.a;
        if(object0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ((List)object0).add(lazyMeasuredItemProvider0.a(v));
    }

    private static final int h(LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo0, int v) {
        return Math.min(lazyListBeyondBoundsInfo0.c(), v - 1);
    }

    private static final boolean i(int v) {
        return v != 0x80000000;
    }

    @l
    public static final LazyListMeasureResult j(int v, @l LazyListItemProvider lazyListItemProvider0, @l LazyMeasuredItemProvider lazyMeasuredItemProvider0, int v1, int v2, int v3, int v4, int v5, int v6, float f, long v7, boolean z, @l List list0, @m Vertical arrangement$Vertical0, @m Horizontal arrangement$Horizontal0, boolean z1, @l Density density0, @l LazyListItemPlacementAnimator lazyListItemPlacementAnimator0, @l LazyListBeyondBoundsInfo lazyListBeyondBoundsInfo0, int v8, @l LazyLayoutPinnedItemList lazyLayoutPinnedItemList0, @l p p0) {
        boolean z3;
        float f2;
        LazyMeasuredItem lazyMeasuredItem4;
        int v37;
        int v36;
        int v34;
        int v33;
        int v32;
        int v31;
        int v29;
        int v14;
        int v13;
        int v10;
        L.p(lazyListItemProvider0, "itemProvider");
        L.p(lazyMeasuredItemProvider0, "measuredItemProvider");
        L.p(list0, "headerIndexes");
        L.p(density0, "density");
        L.p(lazyListItemPlacementAnimator0, "placementAnimator");
        L.p(lazyListBeyondBoundsInfo0, "beyondBoundsInfo");
        L.p(lazyLayoutPinnedItemList0, "pinnedItems");
        L.p(p0, "layout");
        if(v2 < 0 || v3 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if(v <= 0) {
            Object object0 = p0.invoke(Constraints.r(v7), Constraints.q(v7), androidx.compose.foundation.lazy.LazyListMeasureKt.measureLazyList.1.e);
            List list1 = u.H();
            return z ? new LazyListMeasureResult(null, 0, false, 0.0f, ((MeasureResult)object0), list1, -v2, v1 + v3, 0, z1, Orientation.a, v3, v4) : new LazyListMeasureResult(null, 0, false, 0.0f, ((MeasureResult)object0), list1, -v2, v1 + v3, 0, z1, Orientation.b, v3, v4);
        }
        int v9 = v5;
        if(v9 >= v) {
            v9 = v - 1;
            v10 = 0;
        }
        else {
            v10 = v6;
        }
        int v11 = b.L0(f);
        int v12 = v10 - v11;
        if(DataIndex.f(v9, 0) && v12 < 0) {
            v11 += v12;
            v12 = 0;
        }
        ArrayList arrayList0 = new ArrayList();
        if(v4 < 0) {
            v13 = v4;
            v14 = v9;
        }
        else {
            v14 = v9;
            v13 = 0;
        }
        int v15 = v13 - v2;
        int v16 = 0;
        int v17 = v12 + v15;
        while(v17 < 0 && v14 > 0) {
            LazyMeasuredItem lazyMeasuredItem0 = lazyMeasuredItemProvider0.a(v14 - 1);
            arrayList0.add(0, lazyMeasuredItem0);
            v16 = Math.max(v16, lazyMeasuredItem0.a());
            v17 += lazyMeasuredItem0.e();
            --v14;
        }
        if(v17 < v15) {
            v11 += v17;
            v17 = v15;
        }
        int v18 = v17 - v15;
        int v19 = v1 + v3;
        int v20 = s.u(v19, 0);
        int v21 = arrayList0.size();
        int v22 = -v18;
        int v23 = v14;
        for(int v24 = 0; v24 < v21; ++v24) {
            ++v23;
            v22 += ((LazyMeasuredItem)arrayList0.get(v24)).e();
        }
        int v25 = v18;
        int v26 = v16;
        int v27 = v22;
        int v28 = v23;
        while(v28 < v && (v27 < v20 || v27 <= 0 || arrayList0.isEmpty())) {
            LazyMeasuredItem lazyMeasuredItem1 = lazyMeasuredItemProvider0.a(v28);
            v27 += lazyMeasuredItem1.e();
            if(v27 <= v15) {
                v29 = v15;
                if(v28 != v - 1) {
                    v25 -= lazyMeasuredItem1.e();
                    v14 = v28 + 1;
                    goto label_72;
                }
            }
            else {
                v29 = v15;
            }
            arrayList0.add(lazyMeasuredItem1);
            v26 = Math.max(v26, lazyMeasuredItem1.a());
        label_72:
            ++v28;
            v15 = v29;
        }
        if(v27 < v1) {
            int v30 = v1 - v27;
            v25 -= v30;
            v27 += v30;
            while(v25 < v2 && v14 > 0) {
                LazyMeasuredItem lazyMeasuredItem2 = lazyMeasuredItemProvider0.a(v14 - 1);
                arrayList0.add(0, lazyMeasuredItem2);
                v26 = Math.max(v26, lazyMeasuredItem2.a());
                v25 += lazyMeasuredItem2.e();
                --v14;
            }
            v11 += v30;
            if(v25 < 0) {
                v31 = v26;
                v32 = v27 + v25;
                v33 = v11 + v25;
                v34 = v14;
                v25 = 0;
                goto label_98;
            }
            goto label_94;
        }
        else {
        label_94:
            v31 = v26;
            v32 = v27;
            v33 = v11;
            v34 = v14;
        }
    label_98:
        float f1 = b.U(b.L0(f)) != b.U(v33) || Math.abs(b.L0(f)) < Math.abs(v33) ? f : ((float)v33);
        if(v25 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int v35 = -v25;
        LazyMeasuredItem lazyMeasuredItem3 = (LazyMeasuredItem)u.B2(arrayList0);
        if(v2 > 0 || v4 < 0) {
            int v38 = arrayList0.size();
            LazyMeasuredItem lazyMeasuredItem5 = lazyMeasuredItem3;
            int v39 = 0;
            while(true) {
                if(v39 < v38) {
                    int v40 = ((LazyMeasuredItem)arrayList0.get(v39)).e();
                    if(v25 != 0 && v40 <= v25) {
                        v37 = v35;
                        if(v39 == u.J(arrayList0)) {
                            break;
                        }
                        v25 -= v40;
                        ++v39;
                        lazyMeasuredItem5 = (LazyMeasuredItem)arrayList0.get(v39);
                        v35 = v37;
                        continue;
                    }
                }
                v37 = v35;
                break;
            }
            lazyMeasuredItem4 = lazyMeasuredItem5;
            v36 = v25;
        }
        else {
            v36 = v25;
            v37 = v35;
            lazyMeasuredItem4 = lazyMeasuredItem3;
        }
        List list2 = LazyListMeasureKt.f(lazyListBeyondBoundsInfo0, v34, lazyMeasuredItemProvider0, lazyListItemProvider0, v, v8, lazyLayoutPinnedItemList0);
        int v41 = list2.size();
        for(int v42 = 0; v42 < v41; ++v42) {
            v31 = Math.max(v31, ((LazyMeasuredItem)list2.get(v42)).a());
        }
        List list3 = LazyListMeasureKt.c(lazyListBeyondBoundsInfo0, arrayList0, lazyMeasuredItemProvider0, lazyListItemProvider0, v, v8, lazyLayoutPinnedItemList0);
        int v43 = list3.size();
        for(int v44 = 0; v44 < v43; ++v44) {
            v31 = Math.max(v31, ((LazyMeasuredItem)list3.get(v44)).a());
        }
        boolean z2 = L.g(lazyMeasuredItem4, u.B2(arrayList0)) && list2.isEmpty() && list3.isEmpty();
        int v45 = ConstraintsKt.g(v7, (z ? v31 : v32));
        if(z) {
            v31 = v32;
        }
        int v46 = ConstraintsKt.f(v7, v31);
        List list4 = LazyListMeasureKt.a(arrayList0, list2, list3, v45, v46, v32, v1, v37, z, arrangement$Vertical0, arrangement$Horizontal0, z1, density0);
        lazyListItemPlacementAnimator0.g(((int)f1), v45, v46, list4, lazyMeasuredItemProvider0);
        LazyListPositionedItem lazyListPositionedItem0 = list0.isEmpty() ? null : LazyListHeadersKt.a(list4, lazyMeasuredItemProvider0, list0, v2, v45, v46);
        if(v28 >= v) {
            f2 = f1;
            z3 = v32 <= v1 ? false : true;
        }
        else {
            f2 = f1;
            z3 = true;
        }
        Object object1 = p0.invoke(v45, v46, new Function1(list4, lazyListPositionedItem0) {
            final List e;
            final LazyListPositionedItem f;

            {
                this.e = list0;
                this.f = lazyListPositionedItem0;
                super(1);
            }

            public final void a(@l PlacementScope placeable$PlacementScope0) {
                L.p(placeable$PlacementScope0, "$this$invoke");
                List list0 = this.e;
                LazyListPositionedItem lazyListPositionedItem0 = this.f;
                int v = list0.size();
                for(int v1 = 0; v1 < v; ++v1) {
                    LazyListPositionedItem lazyListPositionedItem1 = (LazyListPositionedItem)list0.get(v1);
                    if(lazyListPositionedItem1 != lazyListPositionedItem0) {
                        lazyListPositionedItem1.h(placeable$PlacementScope0);
                    }
                }
                LazyListPositionedItem lazyListPositionedItem2 = this.f;
                if(lazyListPositionedItem2 != null) {
                    lazyListPositionedItem2.h(placeable$PlacementScope0);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((PlacementScope)object0));
                return S0.a;
            }
        });
        if(z2) {
            return z ? new LazyListMeasureResult(lazyMeasuredItem4, v36, z3, f2, ((MeasureResult)object1), list4, -v2, v19, v, z1, Orientation.a, v3, v4) : new LazyListMeasureResult(lazyMeasuredItem4, v36, z3, f2, ((MeasureResult)object1), list4, -v2, v19, v, z1, Orientation.b, v3, v4);
        }
        ArrayList arrayList1 = new ArrayList(list4.size());
        int v47 = list4.size();
        for(int v48 = 0; v48 < v47; ++v48) {
            Object object2 = list4.get(v48);
            LazyListPositionedItem lazyListPositionedItem1 = (LazyListPositionedItem)object2;
            if(lazyListPositionedItem1.getIndex() >= ((LazyMeasuredItem)u.B2(arrayList0)).b() && lazyListPositionedItem1.getIndex() <= ((LazyMeasuredItem)u.p3(arrayList0)).b() || lazyListPositionedItem1 == lazyListPositionedItem0) {
                arrayList1.add(object2);
            }
        }
        return z ? new LazyListMeasureResult(lazyMeasuredItem4, v36, z3, f2, ((MeasureResult)object1), arrayList1, -v2, v19, v, z1, Orientation.a, v3, v4) : new LazyListMeasureResult(lazyMeasuredItem4, v36, z3, f2, ((MeasureResult)object1), arrayList1, -v2, v19, v, z1, Orientation.b, v3, v4);

        final class androidx.compose.foundation.lazy.LazyListMeasureKt.measureLazyList.1 extends N implements Function1 {
            public static final androidx.compose.foundation.lazy.LazyListMeasureKt.measureLazyList.1 e;

            static {
                androidx.compose.foundation.lazy.LazyListMeasureKt.measureLazyList.1.e = new androidx.compose.foundation.lazy.LazyListMeasureKt.measureLazyList.1();
            }

            androidx.compose.foundation.lazy.LazyListMeasureKt.measureLazyList.1() {
                super(1);
            }

            public final void a(@l PlacementScope placeable$PlacementScope0) {
                L.p(placeable$PlacementScope0, "$this$invoke");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((PlacementScope)object0));
                return S0.a;
            }
        }

    }
}

