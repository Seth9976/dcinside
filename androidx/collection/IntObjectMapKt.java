package androidx.collection;

import kotlin.jvm.internal.L;
import y4.l;

public final class IntObjectMapKt {
    @l
    private static final MutableIntObjectMap a;

    static {
        IntObjectMapKt.a = new MutableIntObjectMap(0);
    }

    @l
    public static final IntObjectMap a() {
        L.n(IntObjectMapKt.a, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
        return IntObjectMapKt.a;
    }

    @l
    public static final IntObjectMap b() {
        L.n(IntObjectMapKt.a, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        return IntObjectMapKt.a;
    }

    @l
    public static final IntObjectMap c(int v, Object object0) {
        IntObjectMap intObjectMap0 = new MutableIntObjectMap(0, 1, null);
        ((MutableIntObjectMap)intObjectMap0).j0(v, object0);
        return intObjectMap0;
    }

    @l
    public static final IntObjectMap d(int v, Object object0, int v1, Object object1) {
        IntObjectMap intObjectMap0 = new MutableIntObjectMap(0, 1, null);
        ((MutableIntObjectMap)intObjectMap0).j0(v, object0);
        ((MutableIntObjectMap)intObjectMap0).j0(v1, object1);
        return intObjectMap0;
    }

    @l
    public static final IntObjectMap e(int v, Object object0, int v1, Object object1, int v2, Object object2) {
        IntObjectMap intObjectMap0 = new MutableIntObjectMap(0, 1, null);
        ((MutableIntObjectMap)intObjectMap0).j0(v, object0);
        ((MutableIntObjectMap)intObjectMap0).j0(v1, object1);
        ((MutableIntObjectMap)intObjectMap0).j0(v2, object2);
        return intObjectMap0;
    }

    @l
    public static final IntObjectMap f(int v, Object object0, int v1, Object object1, int v2, Object object2, int v3, Object object3) {
        IntObjectMap intObjectMap0 = new MutableIntObjectMap(0, 1, null);
        ((MutableIntObjectMap)intObjectMap0).j0(v, object0);
        ((MutableIntObjectMap)intObjectMap0).j0(v1, object1);
        ((MutableIntObjectMap)intObjectMap0).j0(v2, object2);
        ((MutableIntObjectMap)intObjectMap0).j0(v3, object3);
        return intObjectMap0;
    }

    @l
    public static final IntObjectMap g(int v, Object object0, int v1, Object object1, int v2, Object object2, int v3, Object object3, int v4, Object object4) {
        IntObjectMap intObjectMap0 = new MutableIntObjectMap(0, 1, null);
        ((MutableIntObjectMap)intObjectMap0).j0(v, object0);
        ((MutableIntObjectMap)intObjectMap0).j0(v1, object1);
        ((MutableIntObjectMap)intObjectMap0).j0(v2, object2);
        ((MutableIntObjectMap)intObjectMap0).j0(v3, object3);
        ((MutableIntObjectMap)intObjectMap0).j0(v4, object4);
        return intObjectMap0;
    }

    @l
    public static final MutableIntObjectMap h() {
        return new MutableIntObjectMap(0, 1, null);
    }

    @l
    public static final MutableIntObjectMap i(int v, Object object0) {
        MutableIntObjectMap mutableIntObjectMap0 = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap0.j0(v, object0);
        return mutableIntObjectMap0;
    }

    @l
    public static final MutableIntObjectMap j(int v, Object object0, int v1, Object object1) {
        MutableIntObjectMap mutableIntObjectMap0 = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap0.j0(v, object0);
        mutableIntObjectMap0.j0(v1, object1);
        return mutableIntObjectMap0;
    }

    @l
    public static final MutableIntObjectMap k(int v, Object object0, int v1, Object object1, int v2, Object object2) {
        MutableIntObjectMap mutableIntObjectMap0 = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap0.j0(v, object0);
        mutableIntObjectMap0.j0(v1, object1);
        mutableIntObjectMap0.j0(v2, object2);
        return mutableIntObjectMap0;
    }

    @l
    public static final MutableIntObjectMap l(int v, Object object0, int v1, Object object1, int v2, Object object2, int v3, Object object3) {
        MutableIntObjectMap mutableIntObjectMap0 = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap0.j0(v, object0);
        mutableIntObjectMap0.j0(v1, object1);
        mutableIntObjectMap0.j0(v2, object2);
        mutableIntObjectMap0.j0(v3, object3);
        return mutableIntObjectMap0;
    }

    @l
    public static final MutableIntObjectMap m(int v, Object object0, int v1, Object object1, int v2, Object object2, int v3, Object object3, int v4, Object object4) {
        MutableIntObjectMap mutableIntObjectMap0 = new MutableIntObjectMap(0, 1, null);
        mutableIntObjectMap0.j0(v, object0);
        mutableIntObjectMap0.j0(v1, object1);
        mutableIntObjectMap0.j0(v2, object2);
        mutableIntObjectMap0.j0(v3, object3);
        mutableIntObjectMap0.j0(v4, object4);
        return mutableIntObjectMap0;
    }
}

