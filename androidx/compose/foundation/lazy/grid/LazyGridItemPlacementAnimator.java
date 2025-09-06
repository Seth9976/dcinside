package androidx.compose.foundation.lazy.grid;

import A3.o;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.S0;
import kotlin.collections.Y;
import kotlin.collections.u;
import kotlin.comparisons.a;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyGridItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,412:1\n101#2,2:413\n33#2,6:415\n103#2:421\n33#2,4:422\n38#2:427\n33#2,6:430\n33#2,6:438\n101#2,2:445\n33#2,6:447\n103#2:453\n33#2,6:457\n33#2,6:465\n69#2,4:474\n74#2:480\n101#2,2:481\n33#2,4:483\n38#2:488\n103#2:489\n86#3:426\n86#3:471\n86#3:472\n79#3:473\n86#3:478\n79#3:479\n86#3:487\n1011#4,2:428\n1002#4,2:436\n1855#4:444\n1856#4:454\n1011#4,2:455\n1002#4,2:463\n*S KotlinDebug\n*F\n+ 1 LazyGridItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator\n*L\n77#1:413,2\n77#1:415,6\n77#1:421\n96#1:422,4\n96#1:427\n131#1:430,6\n149#1:438,6\n171#1:445,2\n171#1:447,6\n171#1:453\n199#1:457,6\n227#1:465,6\n338#1:474,4\n338#1:480\n376#1:481,2\n376#1:483,4\n376#1:488\n376#1:489\n116#1:426\n272#1:471\n273#1:472\n332#1:473\n339#1:478\n344#1:479\n377#1:487\n128#1:428,2\n148#1:436,2\n164#1:444\n164#1:454\n198#1:455,2\n226#1:463,2\n*E\n"})
public final class LazyGridItemPlacementAnimator {
    @l
    private final O a;
    private final boolean b;
    @l
    private final Map c;
    @l
    private Map d;
    private int e;
    @l
    private final LinkedHashSet f;
    @l
    private final List g;
    @l
    private final List h;
    @l
    private final List i;
    @l
    private final List j;

    public LazyGridItemPlacementAnimator(@l O o0, boolean z) {
        L.p(o0, "scope");
        super();
        this.a = o0;
        this.b = z;
        this.c = new LinkedHashMap();
        this.d = Y.z();
        this.f = new LinkedHashSet();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
    }

    private final ItemInfo b(LazyGridPositionedItem lazyGridPositionedItem0, int v) {
        ItemInfo itemInfo0 = new ItemInfo(lazyGridPositionedItem0.g(), lazyGridPositionedItem0.f());
        long v1 = this.b ? IntOffset.g(lazyGridPositionedItem0.b(), 0, v, 1, null) : IntOffset.g(lazyGridPositionedItem0.b(), v, 0, 2, null);
        int v2 = lazyGridPositionedItem0.l();
        for(int v3 = 0; v3 < v2; ++v3) {
            itemInfo0.d().add(new PlaceableInfo(v1, lazyGridPositionedItem0.j(v3), null));
        }
        return itemInfo0;
    }

    static ItemInfo c(LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator0, LazyGridPositionedItem lazyGridPositionedItem0, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = lazyGridItemPlacementAnimator0.f(lazyGridPositionedItem0.b());
        }
        return lazyGridItemPlacementAnimator0.b(lazyGridPositionedItem0, v);
    }

    public final long d(@l Object object0, int v, int v1, int v2, long v3) {
        L.p(object0, "key");
        ItemInfo itemInfo0 = (ItemInfo)this.c.get(object0);
        if(itemInfo0 == null) {
            return v3;
        }
        PlaceableInfo placeableInfo0 = (PlaceableInfo)itemInfo0.d().get(v);
        long v4 = ((IntOffset)placeableInfo0.a().u()).w();
        long v5 = itemInfo0.c();
        long v6 = IntOffsetKt.a(((int)(v4 >> 0x20)) + ((int)(v5 >> 0x20)), ((int)(v4 & 0xFFFFFFFFL)) + ((int)(v5 & 0xFFFFFFFFL)));
        long v7 = placeableInfo0.d();
        long v8 = itemInfo0.c();
        long v9 = IntOffsetKt.a(((int)(v7 >> 0x20)) + ((int)(v8 >> 0x20)), ((int)(v7 & 0xFFFFFFFFL)) + ((int)(v8 & 0xFFFFFFFFL)));
        if(placeableInfo0.b() && (this.f(v9) <= v1 && this.f(v6) < v1 || this.f(v9) >= v2 && this.f(v6) > v2)) {
            androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator.getAnimatedOffset.1 lazyGridItemPlacementAnimator$getAnimatedOffset$10 = new o(null) {
                int k;
                final PlaceableInfo l;

                {
                    this.l = placeableInfo0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator.getAnimatedOffset.1(this.l, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator.getAnimatedOffset.1)this.create(o0, d0)).invokeSuspend(S0.a);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    Object object1 = b.l();
                    switch(this.k) {
                        case 0: {
                            f0.n(object0);
                            IntOffset intOffset0 = IntOffset.b(this.l.d());
                            this.k = 1;
                            if(this.l.a().B(intOffset0, this) == object1) {
                                return object1;
                            }
                            break;
                        }
                        case 1: {
                            f0.n(object0);
                            break;
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                    this.l.e(false);
                    return S0.a;
                }
            };
            k.f(this.a, null, null, lazyGridItemPlacementAnimator$getAnimatedOffset$10, 3, null);
        }
        return v6;
    }

    // 去混淆评级： 低(20)
    private final int e(LazyGridPositionedItem lazyGridPositionedItem0) {
        return this.b ? lazyGridPositionedItem0.c() : lazyGridPositionedItem0.getColumn();
    }

    // 去混淆评级： 低(20)
    private final int f(long v) {
        return this.b ? ((int)(v & 0xFFFFFFFFL)) : ((int)(v >> 0x20));
    }

    private final boolean g(ItemInfo itemInfo0, int v) {
        List list0 = itemInfo0.d();
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            PlaceableInfo placeableInfo0 = (PlaceableInfo)list0.get(v2);
            long v3 = placeableInfo0.d();
            long v4 = itemInfo0.c();
            long v5 = IntOffsetKt.a(((int)(v3 >> 0x20)) + ((int)(v4 >> 0x20)), ((int)(v3 & 0xFFFFFFFFL)) + ((int)(v4 & 0xFFFFFFFFL)));
            if(this.f(v5) + placeableInfo0.c() > 0 && this.f(v5) < v) {
                return true;
            }
        }
        return false;
    }

    public final void h(int v, int v1, int v2, @l List list0, @l LazyMeasuredItemProvider lazyMeasuredItemProvider0, @l LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider0) {
        Map map2;
        Map map1;
        int v10;
        L.p(list0, "positionedItems");
        L.p(lazyMeasuredItemProvider0, "itemProvider");
        L.p(lazyGridSpanLayoutProvider0, "spanLayoutProvider");
        int v3 = list0.size();
        int v4 = 0;
        while(v4 < v3) {
            if(((LazyGridPositionedItem)list0.get(v4)).h()) {
                goto label_12;
            }
            ++v4;
        }
        if(this.c.isEmpty()) {
            this.i();
            return;
        }
    label_12:
        int v5 = this.e;
        LazyGridPositionedItem lazyGridPositionedItem0 = (LazyGridPositionedItem)u.G2(list0);
        this.e = lazyGridPositionedItem0 == null ? 0 : lazyGridPositionedItem0.getIndex();
        Map map0 = this.d;
        this.d = lazyMeasuredItemProvider0.c();
        int v6 = this.b ? v2 : v1;
        long v7 = this.k(v);
        Set set0 = this.c.keySet();
        this.f.addAll(set0);
        int v8 = list0.size();
        int v9 = 0;
        while(v9 < v8) {
            LazyGridPositionedItem lazyGridPositionedItem1 = (LazyGridPositionedItem)list0.get(v9);
            this.f.remove(lazyGridPositionedItem1.getKey());
            if(lazyGridPositionedItem1.h()) {
                ItemInfo itemInfo0 = (ItemInfo)this.c.get(lazyGridPositionedItem1.getKey());
                if(itemInfo0 == null) {
                    Integer integer0 = (Integer)map0.get(lazyGridPositionedItem1.getKey());
                    if(integer0 == null || lazyGridPositionedItem1.getIndex() == ((int)integer0)) {
                        v10 = v5;
                        ItemInfo itemInfo1 = LazyGridItemPlacementAnimator.c(this, lazyGridPositionedItem1, 0, 2, null);
                        this.c.put(lazyGridPositionedItem1.getKey(), itemInfo1);
                    }
                    else {
                        if(((int)integer0) < v5) {
                            this.g.add(lazyGridPositionedItem1);
                        }
                        else {
                            this.h.add(lazyGridPositionedItem1);
                        }
                        v10 = v5;
                    }
                    map1 = map0;
                }
                else {
                    v10 = v5;
                    long v11 = itemInfo0.c();
                    map1 = map0;
                    itemInfo0.g(IntOffsetKt.a(((int)(v11 >> 0x20)) + ((int)(v7 >> 0x20)), ((int)(v11 & 0xFFFFFFFFL)) + ((int)(v7 & 0xFFFFFFFFL))));
                    itemInfo0.f(lazyGridPositionedItem1.g());
                    itemInfo0.e(lazyGridPositionedItem1.f());
                    this.j(lazyGridPositionedItem1, itemInfo0);
                }
            }
            else {
                v10 = v5;
                map1 = map0;
                this.c.remove(lazyGridPositionedItem1.getKey());
            }
            ++v9;
            v5 = v10;
            map0 = map1;
        }
        List list1 = this.g;
        if(list1.size() > 1) {
            map2 = map0;
            u.p0(list1, new Comparator() {
                @Override
                public final int compare(Object object0, Object object1) {
                    Object object2 = ((LazyGridPositionedItem)object1).getKey();
                    Integer integer0 = (Integer)this.a.get(object2);
                    Object object3 = ((LazyGridPositionedItem)object0).getKey();
                    return a.l(integer0, ((Integer)this.a.get(object3)));
                }
            });
        }
        else {
            map2 = map0;
        }
        List list2 = this.g;
        int v12 = list2.size();
        int v14 = -1;
        int v15 = 0;
        int v16 = 0;
        for(int v13 = 0; v13 < v12; ++v13) {
            LazyGridPositionedItem lazyGridPositionedItem2 = (LazyGridPositionedItem)list2.get(v13);
            int v17 = this.e(lazyGridPositionedItem2);
            if(v17 == -1 || v17 != v14) {
                v15 += v16;
                v16 = lazyGridPositionedItem2.i();
                v14 = v17;
            }
            else {
                v16 = Math.max(v16, lazyGridPositionedItem2.i());
            }
            ItemInfo itemInfo2 = this.b(lazyGridPositionedItem2, -v15 - lazyGridPositionedItem2.i());
            this.c.put(lazyGridPositionedItem2.getKey(), itemInfo2);
            this.j(lazyGridPositionedItem2, itemInfo2);
        }
        List list3 = this.h;
        if(list3.size() > 1) {
            u.p0(list3, new Comparator() {
                @Override
                public final int compare(Object object0, Object object1) {
                    Object object2 = ((LazyGridPositionedItem)object0).getKey();
                    Integer integer0 = (Integer)this.a.get(object2);
                    Object object3 = ((LazyGridPositionedItem)object1).getKey();
                    return a.l(integer0, ((Integer)this.a.get(object3)));
                }
            });
        }
        List list4 = this.h;
        int v18 = list4.size();
        int v20 = -1;
        int v21 = 0;
        int v22 = 0;
        for(int v19 = 0; v19 < v18; ++v19) {
            LazyGridPositionedItem lazyGridPositionedItem3 = (LazyGridPositionedItem)list4.get(v19);
            int v23 = this.e(lazyGridPositionedItem3);
            if(v23 == -1 || v23 != v20) {
                v21 += v22;
                v22 = lazyGridPositionedItem3.i();
                v20 = v23;
            }
            else {
                v22 = Math.max(v22, lazyGridPositionedItem3.i());
            }
            ItemInfo itemInfo3 = this.b(lazyGridPositionedItem3, v6 + v21);
            this.c.put(lazyGridPositionedItem3.getKey(), itemInfo3);
            this.j(lazyGridPositionedItem3, itemInfo3);
        }
        for(Object object0: this.f) {
            ItemInfo itemInfo4 = (ItemInfo)Y.K(this.c, object0);
            Integer integer1 = (Integer)this.d.get(object0);
            List list5 = itemInfo4.d();
            int v24 = list5.size();
            int v25 = 0;
            while(true) {
                boolean z = false;
                if(v25 < v24) {
                    if(((PlaceableInfo)list5.get(v25)).b()) {
                        z = true;
                    }
                    else {
                        ++v25;
                        continue;
                    }
                }
                break;
            }
            if(itemInfo4.d().isEmpty() || integer1 == null || !z && L.g(integer1, map2.get(object0)) || !z && !this.g(itemInfo4, v6)) {
                this.c.remove(object0);
            }
            else {
                LazyGridMeasuredItem lazyGridMeasuredItem0 = LazyMeasuredItemProvider.b(lazyMeasuredItemProvider0, ItemIndex.c(((int)integer1)), 0, (this.b ? Constraints.b.e(itemInfo4.b()) : Constraints.b.d(itemInfo4.b())), 2, null);
                if(((int)integer1) < this.e) {
                    this.i.add(lazyGridMeasuredItem0);
                }
                else {
                    this.j.add(lazyGridMeasuredItem0);
                }
            }
        }
        List list6 = this.i;
        if(list6.size() > 1) {
            u.p0(list6, new Comparator() {
                @Override
                public final int compare(Object object0, Object object1) {
                    Object object2 = ((LazyGridMeasuredItem)object1).c();
                    Integer integer0 = (Integer)this.a.d.get(object2);
                    Object object3 = ((LazyGridMeasuredItem)object0).c();
                    return a.l(integer0, ((Integer)this.a.d.get(object3)));
                }
            });
        }
        List list7 = this.i;
        int v26 = list7.size();
        int v28 = 0;
        int v29 = 0;
        int v30 = -1;
        for(int v27 = 0; v27 < v26; ++v27) {
            LazyGridMeasuredItem lazyGridMeasuredItem1 = (LazyGridMeasuredItem)list7.get(v27);
            int v31 = lazyGridSpanLayoutProvider0.d(lazyGridMeasuredItem1.b());
            if(v31 == -1 || v31 != v30) {
                v28 += v29;
                v29 = lazyGridMeasuredItem1.d();
                v30 = v31;
            }
            else {
                v29 = Math.max(v29, lazyGridMeasuredItem1.d());
            }
            ItemInfo itemInfo5 = (ItemInfo)Y.K(this.c, lazyGridMeasuredItem1.c());
            LazyGridPositionedItem lazyGridPositionedItem4 = lazyGridMeasuredItem1.h(-v28 - lazyGridMeasuredItem1.d(), itemInfo5.a(), v1, v2, -1, -1);
            list0.add(lazyGridPositionedItem4);
            this.j(lazyGridPositionedItem4, itemInfo5);
        }
        List list8 = this.j;
        if(list8.size() > 1) {
            u.p0(list8, new Comparator() {
                @Override
                public final int compare(Object object0, Object object1) {
                    return a.l(((Integer)this.a.d.get(((LazyGridMeasuredItem)object0).c())), ((Integer)this.a.d.get(((LazyGridMeasuredItem)object1).c())));
                }
            });
        }
        List list9 = this.j;
        int v32 = list9.size();
        int v33 = 0;
        int v34 = 0;
        int v35 = -1;
        for(int v36 = 0; v36 < v32; ++v36) {
            LazyGridMeasuredItem lazyGridMeasuredItem2 = (LazyGridMeasuredItem)list9.get(v36);
            int v37 = lazyGridSpanLayoutProvider0.d(lazyGridMeasuredItem2.b());
            if(v37 == -1 || v37 != v35) {
                v33 += v34;
                v34 = lazyGridMeasuredItem2.d();
                v35 = v37;
            }
            else {
                v34 = Math.max(v34, lazyGridMeasuredItem2.d());
            }
            ItemInfo itemInfo6 = (ItemInfo)Y.K(this.c, lazyGridMeasuredItem2.c());
            LazyGridPositionedItem lazyGridPositionedItem5 = lazyGridMeasuredItem2.h(v6 + v33, itemInfo6.a(), v1, v2, -1, -1);
            list0.add(lazyGridPositionedItem5);
            this.j(lazyGridPositionedItem5, itemInfo6);
        }
        this.g.clear();
        this.h.clear();
        this.i.clear();
        this.j.clear();
        this.f.clear();
    }

    public final void i() {
        this.c.clear();
        this.d = Y.z();
        this.e = -1;
    }

    private final void j(LazyGridPositionedItem lazyGridPositionedItem0, ItemInfo itemInfo0) {
        while(itemInfo0.d().size() > lazyGridPositionedItem0.l()) {
            u.O0(itemInfo0.d());
        }
        while(itemInfo0.d().size() < lazyGridPositionedItem0.l()) {
            long v = lazyGridPositionedItem0.b();
            long v1 = itemInfo0.c();
            itemInfo0.d().add(new PlaceableInfo(IntOffsetKt.a(((int)(v >> 0x20)) - ((int)(v1 >> 0x20)), ((int)(v & 0xFFFFFFFFL)) - ((int)(v1 & 0xFFFFFFFFL))), lazyGridPositionedItem0.j(itemInfo0.d().size()), null));
        }
        List list0 = itemInfo0.d();
        int v2 = list0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            PlaceableInfo placeableInfo0 = (PlaceableInfo)list0.get(v3);
            long v4 = placeableInfo0.d();
            long v5 = itemInfo0.c();
            long v6 = lazyGridPositionedItem0.b();
            placeableInfo0.f(lazyGridPositionedItem0.j(v3));
            FiniteAnimationSpec finiteAnimationSpec0 = lazyGridPositionedItem0.e(v3);
            if(!IntOffset.j(IntOffsetKt.a(((int)(v4 >> 0x20)) + ((int)(v5 >> 0x20)), ((int)(v4 & 0xFFFFFFFFL)) + ((int)(v5 & 0xFFFFFFFFL))), v6)) {
                long v7 = itemInfo0.c();
                placeableInfo0.g(IntOffsetKt.a(((int)(v6 >> 0x20)) - ((int)(v7 >> 0x20)), ((int)(v6 & 0xFFFFFFFFL)) - ((int)(v7 & 0xFFFFFFFFL))));
                if(finiteAnimationSpec0 != null) {
                    placeableInfo0.e(true);
                    androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator.startAnimationsIfNeeded.1.1 lazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$10 = new o(finiteAnimationSpec0, null) {
                        int k;
                        final PlaceableInfo l;
                        final FiniteAnimationSpec m;

                        {
                            this.l = placeableInfo0;
                            this.m = finiteAnimationSpec0;
                            super(2, d0);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @l
                        public final d create(@m Object object0, @l d d0) {
                            return new androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator.startAnimationsIfNeeded.1.1(this.l, this.m, d0);
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            return this.invoke(((O)object0), ((d)object1));
                        }

                        @m
                        public final Object invoke(@l O o0, @m d d0) {
                            return ((androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator.startAnimationsIfNeeded.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                        }

                        @Override  // kotlin.coroutines.jvm.internal.a
                        @m
                        public final Object invokeSuspend(@l Object object0) {
                            FiniteAnimationSpec finiteAnimationSpec1;
                            Object object1 = b.l();
                            switch(this.k) {
                                case 0: {
                                    f0.n(object0);
                                    if(this.l.a().x()) {
                                        FiniteAnimationSpec finiteAnimationSpec0 = this.m;
                                        finiteAnimationSpec1 = finiteAnimationSpec0 instanceof SpringSpec ? ((SpringSpec)finiteAnimationSpec0) : LazyGridItemPlacementAnimatorKt.a;
                                    }
                                    else {
                                        finiteAnimationSpec1 = this.m;
                                    }
                                    try {
                                        IntOffset intOffset0 = IntOffset.b(this.l.d());
                                        this.k = 1;
                                        if(Animatable.i(this.l.a(), intOffset0, finiteAnimationSpec1, null, null, this, 12, null) == object1) {
                                            return object1;
                                        label_16:
                                            f0.n(object0);
                                        }
                                        this.l.e(false);
                                    }
                                    catch(CancellationException unused_ex) {
                                    }
                                    break;
                                }
                                case 1: {
                                    goto label_16;
                                }
                                default: {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                            }
                            return S0.a;
                        }
                    };
                    k.f(this.a, null, null, lazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$10, 3, null);
                }
            }
        }
    }

    private final long k(int v) {
        int v1 = this.b ? 0 : v;
        if(!this.b) {
            v = 0;
        }
        return IntOffsetKt.a(v1, v);
    }
}

