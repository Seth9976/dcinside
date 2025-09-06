package androidx.compose.foundation.lazy;

import A3.o;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
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

@s0({"SMAP\nLazyListItemPlacementAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemPlacementAnimator\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,350:1\n101#2,2:351\n33#2,6:353\n103#2:359\n33#2,4:360\n38#2:365\n33#2,6:368\n33#2,6:376\n101#2,2:383\n33#2,6:385\n103#2:391\n33#2,6:395\n33#2,6:403\n69#2,4:414\n74#2:420\n101#2,2:421\n33#2,4:423\n38#2:428\n103#2:429\n86#3:364\n86#3:409\n86#3:410\n79#3:411\n86#3:412\n79#3:413\n86#3:418\n79#3:419\n86#3:427\n1011#4,2:366\n1002#4,2:374\n1855#4:382\n1856#4:392\n1011#4,2:393\n1002#4,2:401\n*S KotlinDebug\n*F\n+ 1 LazyListItemPlacementAnimator.kt\nandroidx/compose/foundation/lazy/LazyListItemPlacementAnimator\n*L\n74#1:351,2\n74#1:353,6\n74#1:359\n93#1:360,4\n93#1:365\n124#1:368,6\n133#1:376,6\n148#1:383,2\n148#1:385,6\n148#1:391\n167#1:395,6\n178#1:403,6\n278#1:414,4\n278#1:420\n316#1:421,2\n316#1:423,4\n316#1:428\n316#1:429\n113#1:364\n208#1:409\n209#1:410\n251#1:411\n254#1:412\n272#1:413\n279#1:418\n284#1:419\n317#1:427\n123#1:366,2\n132#1:374,2\n141#1:382\n141#1:392\n166#1:393,2\n177#1:401,2\n*E\n"})
public final class LazyListItemPlacementAnimator {
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

    public LazyListItemPlacementAnimator(@l O o0, boolean z) {
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

    private final ItemInfo b(LazyListPositionedItem lazyListPositionedItem0, int v) {
        ItemInfo itemInfo0 = new ItemInfo();
        long v2 = lazyListPositionedItem0.f(0);
        long v3 = this.b ? IntOffset.g(v2, 0, v, 1, null) : IntOffset.g(v2, v, 0, 2, null);
        int v4 = lazyListPositionedItem0.g();
        for(int v1 = 0; v1 < v4; ++v1) {
            long v5 = lazyListPositionedItem0.f(v1);
            long v6 = IntOffsetKt.a(((int)(v5 >> 0x20)) - ((int)(v2 >> 0x20)), ((int)(v5 & 0xFFFFFFFFL)) - ((int)(v2 & 0xFFFFFFFFL)));
            itemInfo0.b().add(new PlaceableInfo(IntOffsetKt.a(((int)(v3 >> 0x20)) + ((int)(v6 >> 0x20)), ((int)(v3 & 0xFFFFFFFFL)) + ((int)(v6 & 0xFFFFFFFFL))), lazyListPositionedItem0.d(v1), null));
        }
        return itemInfo0;
    }

    static ItemInfo c(LazyListItemPlacementAnimator lazyListItemPlacementAnimator0, LazyListPositionedItem lazyListPositionedItem0, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = lazyListItemPlacementAnimator0.e(lazyListPositionedItem0.f(0));
        }
        return lazyListItemPlacementAnimator0.b(lazyListPositionedItem0, v);
    }

    public final long d(@l Object object0, int v, int v1, int v2, long v3) {
        L.p(object0, "key");
        ItemInfo itemInfo0 = (ItemInfo)this.c.get(object0);
        if(itemInfo0 == null) {
            return v3;
        }
        PlaceableInfo placeableInfo0 = (PlaceableInfo)itemInfo0.b().get(v);
        long v4 = ((IntOffset)placeableInfo0.a().u()).w();
        long v5 = itemInfo0.a();
        long v6 = IntOffsetKt.a(((int)(v4 >> 0x20)) + ((int)(v5 >> 0x20)), ((int)(v4 & 0xFFFFFFFFL)) + ((int)(v5 & 0xFFFFFFFFL)));
        long v7 = placeableInfo0.d();
        long v8 = itemInfo0.a();
        long v9 = IntOffsetKt.a(((int)(v7 >> 0x20)) + ((int)(v8 >> 0x20)), ((int)(v7 & 0xFFFFFFFFL)) + ((int)(v8 & 0xFFFFFFFFL)));
        if(placeableInfo0.b() && (this.e(v9) <= v1 && this.e(v6) <= v1 || this.e(v9) >= v2 && this.e(v6) >= v2)) {
            androidx.compose.foundation.lazy.LazyListItemPlacementAnimator.getAnimatedOffset.1 lazyListItemPlacementAnimator$getAnimatedOffset$10 = new o(null) {
                int k;
                final PlaceableInfo l;

                {
                    this.l = placeableInfo0;
                    super(2, d0);
                }

                @Override  // kotlin.coroutines.jvm.internal.a
                @l
                public final d create(@m Object object0, @l d d0) {
                    return new androidx.compose.foundation.lazy.LazyListItemPlacementAnimator.getAnimatedOffset.1(this.l, d0);
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((O)object0), ((d)object1));
                }

                @m
                public final Object invoke(@l O o0, @m d d0) {
                    return ((androidx.compose.foundation.lazy.LazyListItemPlacementAnimator.getAnimatedOffset.1)this.create(o0, d0)).invokeSuspend(S0.a);
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
            k.f(this.a, null, null, lazyListItemPlacementAnimator$getAnimatedOffset$10, 3, null);
        }
        return v6;
    }

    // 去混淆评级： 低(20)
    private final int e(long v) {
        return this.b ? ((int)(v & 0xFFFFFFFFL)) : ((int)(v >> 0x20));
    }

    private final boolean f(ItemInfo itemInfo0, int v) {
        List list0 = itemInfo0.b();
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            PlaceableInfo placeableInfo0 = (PlaceableInfo)list0.get(v2);
            long v3 = placeableInfo0.d();
            long v4 = itemInfo0.a();
            long v5 = IntOffsetKt.a(((int)(v3 >> 0x20)) + ((int)(v4 >> 0x20)), ((int)(v3 & 0xFFFFFFFFL)) + ((int)(v4 & 0xFFFFFFFFL)));
            if(this.e(v5) + placeableInfo0.c() > 0 && this.e(v5) < v) {
                return true;
            }
        }
        return false;
    }

    public final void g(int v, int v1, int v2, @l List list0, @l LazyMeasuredItemProvider lazyMeasuredItemProvider0) {
        int v11;
        int v10;
        L.p(list0, "positionedItems");
        L.p(lazyMeasuredItemProvider0, "itemProvider");
        int v3 = list0.size();
        int v4 = 0;
        while(v4 < v3) {
            if(((LazyListPositionedItem)list0.get(v4)).c()) {
                goto label_11;
            }
            ++v4;
        }
        if(this.c.isEmpty()) {
            this.h();
            return;
        }
    label_11:
        int v5 = this.e;
        LazyListPositionedItem lazyListPositionedItem0 = (LazyListPositionedItem)u.G2(list0);
        this.e = lazyListPositionedItem0 == null ? 0 : lazyListPositionedItem0.getIndex();
        Map map0 = this.d;
        this.d = lazyMeasuredItemProvider0.c();
        int v6 = this.b ? v2 : v1;
        long v7 = this.j(v);
        Set set0 = this.c.keySet();
        this.f.addAll(set0);
        int v8 = list0.size();
        int v9 = 0;
        while(v9 < v8) {
            LazyListPositionedItem lazyListPositionedItem1 = (LazyListPositionedItem)list0.get(v9);
            this.f.remove(lazyListPositionedItem1.getKey());
            if(lazyListPositionedItem1.c()) {
                ItemInfo itemInfo0 = (ItemInfo)this.c.get(lazyListPositionedItem1.getKey());
                if(itemInfo0 == null) {
                    Integer integer0 = (Integer)map0.get(lazyListPositionedItem1.getKey());
                    if(integer0 == null || lazyListPositionedItem1.getIndex() == ((int)integer0)) {
                        v10 = v5;
                        v11 = v8;
                        ItemInfo itemInfo1 = LazyListItemPlacementAnimator.c(this, lazyListPositionedItem1, 0, 2, null);
                        this.c.put(lazyListPositionedItem1.getKey(), itemInfo1);
                    }
                    else {
                        if(((int)integer0) < v5) {
                            this.g.add(lazyListPositionedItem1);
                        }
                        else {
                            this.h.add(lazyListPositionedItem1);
                        }
                        v10 = v5;
                        v11 = v8;
                    }
                }
                else {
                    v10 = v5;
                    v11 = v8;
                    long v12 = itemInfo0.a();
                    itemInfo0.c(IntOffsetKt.a(((int)(v12 >> 0x20)) + ((int)(v7 >> 0x20)), ((int)(v12 & 0xFFFFFFFFL)) + ((int)(v7 & 0xFFFFFFFFL))));
                    this.i(lazyListPositionedItem1, itemInfo0);
                }
            }
            else {
                v10 = v5;
                v11 = v8;
                this.c.remove(lazyListPositionedItem1.getKey());
            }
            ++v9;
            v8 = v11;
            v5 = v10;
        }
        List list1 = this.g;
        if(list1.size() > 1) {
            u.p0(list1, new Comparator() {
                @Override
                public final int compare(Object object0, Object object1) {
                    Object object2 = ((LazyListPositionedItem)object1).getKey();
                    Integer integer0 = (Integer)this.a.get(object2);
                    Object object3 = ((LazyListPositionedItem)object0).getKey();
                    return a.l(integer0, ((Integer)this.a.get(object3)));
                }
            });
        }
        List list2 = this.g;
        int v13 = list2.size();
        int v15 = 0;
        for(int v14 = 0; v14 < v13; ++v14) {
            LazyListPositionedItem lazyListPositionedItem2 = (LazyListPositionedItem)list2.get(v14);
            int v16 = -v15 - lazyListPositionedItem2.getSize();
            v15 += lazyListPositionedItem2.getSize();
            ItemInfo itemInfo2 = this.b(lazyListPositionedItem2, v16);
            this.c.put(lazyListPositionedItem2.getKey(), itemInfo2);
            this.i(lazyListPositionedItem2, itemInfo2);
        }
        List list3 = this.h;
        if(list3.size() > 1) {
            u.p0(list3, new Comparator() {
                @Override
                public final int compare(Object object0, Object object1) {
                    Object object2 = ((LazyListPositionedItem)object0).getKey();
                    Integer integer0 = (Integer)this.a.get(object2);
                    Object object3 = ((LazyListPositionedItem)object1).getKey();
                    return a.l(integer0, ((Integer)this.a.get(object3)));
                }
            });
        }
        List list4 = this.h;
        int v17 = list4.size();
        int v19 = 0;
        for(int v18 = 0; v18 < v17; ++v18) {
            LazyListPositionedItem lazyListPositionedItem3 = (LazyListPositionedItem)list4.get(v18);
            int v20 = v6 + v19;
            v19 += lazyListPositionedItem3.getSize();
            ItemInfo itemInfo3 = this.b(lazyListPositionedItem3, v20);
            this.c.put(lazyListPositionedItem3.getKey(), itemInfo3);
            this.i(lazyListPositionedItem3, itemInfo3);
        }
        for(Object object0: this.f) {
            ItemInfo itemInfo4 = (ItemInfo)Y.K(this.c, object0);
            Integer integer1 = (Integer)this.d.get(object0);
            List list5 = itemInfo4.b();
            int v21 = list5.size();
            int v22 = 0;
            while(true) {
                boolean z = false;
                if(v22 < v21) {
                    if(((PlaceableInfo)list5.get(v22)).b()) {
                        z = true;
                    }
                    else {
                        ++v22;
                        continue;
                    }
                }
                break;
            }
            if(itemInfo4.b().isEmpty() || integer1 == null || !z && L.g(integer1, map0.get(object0)) || !z && !this.f(itemInfo4, v6)) {
                this.c.remove(object0);
            }
            else {
                LazyMeasuredItem lazyMeasuredItem0 = lazyMeasuredItemProvider0.a(DataIndex.c(((int)integer1)));
                if(((int)integer1) < this.e) {
                    this.i.add(lazyMeasuredItem0);
                }
                else {
                    this.j.add(lazyMeasuredItem0);
                }
            }
        }
        List list6 = this.i;
        if(list6.size() > 1) {
            u.p0(list6, new Comparator() {
                @Override
                public final int compare(Object object0, Object object1) {
                    Object object2 = ((LazyMeasuredItem)object1).c();
                    Integer integer0 = (Integer)this.a.d.get(object2);
                    Object object3 = ((LazyMeasuredItem)object0).c();
                    return a.l(integer0, ((Integer)this.a.d.get(object3)));
                }
            });
        }
        List list7 = this.i;
        int v23 = list7.size();
        int v25 = 0;
        for(int v24 = 0; v24 < v23; ++v24) {
            LazyMeasuredItem lazyMeasuredItem1 = (LazyMeasuredItem)list7.get(v24);
            int v26 = -v25 - lazyMeasuredItem1.d();
            v25 += lazyMeasuredItem1.d();
            ItemInfo itemInfo5 = (ItemInfo)Y.K(this.c, lazyMeasuredItem1.c());
            LazyListPositionedItem lazyListPositionedItem4 = lazyMeasuredItem1.f(v26, v1, v2);
            list0.add(lazyListPositionedItem4);
            this.i(lazyListPositionedItem4, itemInfo5);
        }
        List list8 = this.j;
        if(list8.size() > 1) {
            u.p0(list8, new Comparator() {
                @Override
                public final int compare(Object object0, Object object1) {
                    return a.l(((Integer)this.a.d.get(((LazyMeasuredItem)object0).c())), ((Integer)this.a.d.get(((LazyMeasuredItem)object1).c())));
                }
            });
        }
        List list9 = this.j;
        int v27 = list9.size();
        int v29 = 0;
        for(int v28 = 0; v28 < v27; ++v28) {
            LazyMeasuredItem lazyMeasuredItem2 = (LazyMeasuredItem)list9.get(v28);
            int v30 = v6 + v29;
            v29 += lazyMeasuredItem2.d();
            ItemInfo itemInfo6 = (ItemInfo)Y.K(this.c, lazyMeasuredItem2.c());
            LazyListPositionedItem lazyListPositionedItem5 = lazyMeasuredItem2.f(v30, v1, v2);
            list0.add(lazyListPositionedItem5);
            this.i(lazyListPositionedItem5, itemInfo6);
        }
        this.g.clear();
        this.h.clear();
        this.i.clear();
        this.j.clear();
        this.f.clear();
    }

    public final void h() {
        this.c.clear();
        this.d = Y.z();
        this.e = -1;
    }

    private final void i(LazyListPositionedItem lazyListPositionedItem0, ItemInfo itemInfo0) {
        while(itemInfo0.b().size() > lazyListPositionedItem0.g()) {
            u.O0(itemInfo0.b());
        }
        while(itemInfo0.b().size() < lazyListPositionedItem0.g()) {
            int v = itemInfo0.b().size();
            long v1 = lazyListPositionedItem0.f(v);
            long v2 = itemInfo0.a();
            itemInfo0.b().add(new PlaceableInfo(IntOffsetKt.a(((int)(v1 >> 0x20)) - ((int)(v2 >> 0x20)), ((int)(v1 & 0xFFFFFFFFL)) - ((int)(v2 & 0xFFFFFFFFL))), lazyListPositionedItem0.d(v), null));
        }
        List list0 = itemInfo0.b();
        int v3 = list0.size();
        for(int v4 = 0; v4 < v3; ++v4) {
            PlaceableInfo placeableInfo0 = (PlaceableInfo)list0.get(v4);
            long v5 = placeableInfo0.d();
            long v6 = itemInfo0.a();
            long v7 = lazyListPositionedItem0.f(v4);
            placeableInfo0.f(lazyListPositionedItem0.d(v4));
            FiniteAnimationSpec finiteAnimationSpec0 = lazyListPositionedItem0.b(v4);
            if(!IntOffset.j(IntOffsetKt.a(((int)(v5 >> 0x20)) + ((int)(v6 >> 0x20)), ((int)(v5 & 0xFFFFFFFFL)) + ((int)(v6 & 0xFFFFFFFFL))), v7)) {
                long v8 = itemInfo0.a();
                placeableInfo0.g(IntOffsetKt.a(((int)(v7 >> 0x20)) - ((int)(v8 >> 0x20)), ((int)(v7 & 0xFFFFFFFFL)) - ((int)(v8 & 0xFFFFFFFFL))));
                if(finiteAnimationSpec0 != null) {
                    placeableInfo0.e(true);
                    androidx.compose.foundation.lazy.LazyListItemPlacementAnimator.startAnimationsIfNeeded.1.1 lazyListItemPlacementAnimator$startAnimationsIfNeeded$1$10 = new o(finiteAnimationSpec0, null) {
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
                            return new androidx.compose.foundation.lazy.LazyListItemPlacementAnimator.startAnimationsIfNeeded.1.1(this.l, this.m, d0);
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            return this.invoke(((O)object0), ((d)object1));
                        }

                        @m
                        public final Object invoke(@l O o0, @m d d0) {
                            return ((androidx.compose.foundation.lazy.LazyListItemPlacementAnimator.startAnimationsIfNeeded.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
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
                                        finiteAnimationSpec1 = finiteAnimationSpec0 instanceof SpringSpec ? ((SpringSpec)finiteAnimationSpec0) : LazyListItemPlacementAnimatorKt.a;
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
                    k.f(this.a, null, null, lazyListItemPlacementAnimator$startAnimationsIfNeeded$1$10, 3, null);
                }
            }
        }
    }

    private final long j(int v) {
        int v1 = this.b ? 0 : v;
        if(!this.b) {
            v = 0;
        }
        return IntOffsetKt.a(v1, v);
    }
}

