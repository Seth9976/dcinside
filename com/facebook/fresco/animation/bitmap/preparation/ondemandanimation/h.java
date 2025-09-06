package com.facebook.fresco.animation.bitmap.preparation.ondemandanimation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.T;
import kotlin.collections.u;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import y4.l;

@s0({"SMAP\nCircularList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CircularList.kt\ncom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/CircularList\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,30:1\n1#2:31\n1557#3:32\n1628#3,3:33\n*S KotlinDebug\n*F\n+ 1 CircularList.kt\ncom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/CircularList\n*L\n28#1:32\n28#1:33,3\n*E\n"})
public final class h {
    private final int a;

    public h(int v) {
        this.a = v;
    }

    public final int a(int v) {
        int v1 = v % this.a;
        Integer integer0 = v1 >= 0 ? v1 : null;
        return integer0 == null ? v1 + this.a : ((int)integer0);
    }

    public final int b() {
        return this.a;
    }

    public final boolean c(int v, int v1, int v2) {
        int v3 = this.a(v2 + v);
        return v >= v3 ? v <= v1 && v1 <= this.a || v1 >= 0 && v1 <= v3 : v <= v1 && v1 <= v3;
    }

    @l
    public final List d(int v, int v1) {
        kotlin.ranges.l l0 = s.W1(0, v1);
        List list0 = new ArrayList(u.b0(l0, 10));
        Iterator iterator0 = l0.iterator();
        while(iterator0.hasNext()) {
            list0.add(this.a(((T)iterator0).b() + v));
        }
        return list0;
    }
}

