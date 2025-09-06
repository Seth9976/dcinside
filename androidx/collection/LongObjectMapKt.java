package androidx.collection;

import kotlin.jvm.internal.L;
import y4.l;

public final class LongObjectMapKt {
    @l
    private static final MutableLongObjectMap a;

    static {
        LongObjectMapKt.a = new MutableLongObjectMap(0);
    }

    @l
    public static final LongObjectMap a() {
        L.n(LongObjectMapKt.a, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        return LongObjectMapKt.a;
    }

    @l
    public static final LongObjectMap b() {
        L.n(LongObjectMapKt.a, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.longObjectMapOf>");
        return LongObjectMapKt.a;
    }

    @l
    public static final LongObjectMap c(long v, Object object0) {
        LongObjectMap longObjectMap0 = new MutableLongObjectMap(0, 1, null);
        ((MutableLongObjectMap)longObjectMap0).j0(v, object0);
        return longObjectMap0;
    }

    @l
    public static final LongObjectMap d(long v, Object object0, long v1, Object object1) {
        LongObjectMap longObjectMap0 = new MutableLongObjectMap(0, 1, null);
        ((MutableLongObjectMap)longObjectMap0).j0(v, object0);
        ((MutableLongObjectMap)longObjectMap0).j0(v1, object1);
        return longObjectMap0;
    }

    @l
    public static final LongObjectMap e(long v, Object object0, long v1, Object object1, long v2, Object object2) {
        LongObjectMap longObjectMap0 = new MutableLongObjectMap(0, 1, null);
        ((MutableLongObjectMap)longObjectMap0).j0(v, object0);
        ((MutableLongObjectMap)longObjectMap0).j0(v1, object1);
        ((MutableLongObjectMap)longObjectMap0).j0(v2, object2);
        return longObjectMap0;
    }

    @l
    public static final LongObjectMap f(long v, Object object0, long v1, Object object1, long v2, Object object2, long v3, Object object3) {
        LongObjectMap longObjectMap0 = new MutableLongObjectMap(0, 1, null);
        ((MutableLongObjectMap)longObjectMap0).j0(v, object0);
        ((MutableLongObjectMap)longObjectMap0).j0(v1, object1);
        ((MutableLongObjectMap)longObjectMap0).j0(v2, object2);
        ((MutableLongObjectMap)longObjectMap0).j0(v3, object3);
        return longObjectMap0;
    }

    @l
    public static final LongObjectMap g(long v, Object object0, long v1, Object object1, long v2, Object object2, long v3, Object object3, long v4, Object object4) {
        LongObjectMap longObjectMap0 = new MutableLongObjectMap(0, 1, null);
        ((MutableLongObjectMap)longObjectMap0).j0(v, object0);
        ((MutableLongObjectMap)longObjectMap0).j0(v1, object1);
        ((MutableLongObjectMap)longObjectMap0).j0(v2, object2);
        ((MutableLongObjectMap)longObjectMap0).j0(v3, object3);
        ((MutableLongObjectMap)longObjectMap0).j0(v4, object4);
        return longObjectMap0;
    }

    @l
    public static final MutableLongObjectMap h() {
        return new MutableLongObjectMap(0, 1, null);
    }

    @l
    public static final MutableLongObjectMap i(long v, Object object0) {
        MutableLongObjectMap mutableLongObjectMap0 = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap0.j0(v, object0);
        return mutableLongObjectMap0;
    }

    @l
    public static final MutableLongObjectMap j(long v, Object object0, long v1, Object object1) {
        MutableLongObjectMap mutableLongObjectMap0 = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap0.j0(v, object0);
        mutableLongObjectMap0.j0(v1, object1);
        return mutableLongObjectMap0;
    }

    @l
    public static final MutableLongObjectMap k(long v, Object object0, long v1, Object object1, long v2, Object object2) {
        MutableLongObjectMap mutableLongObjectMap0 = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap0.j0(v, object0);
        mutableLongObjectMap0.j0(v1, object1);
        mutableLongObjectMap0.j0(v2, object2);
        return mutableLongObjectMap0;
    }

    @l
    public static final MutableLongObjectMap l(long v, Object object0, long v1, Object object1, long v2, Object object2, long v3, Object object3) {
        MutableLongObjectMap mutableLongObjectMap0 = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap0.j0(v, object0);
        mutableLongObjectMap0.j0(v1, object1);
        mutableLongObjectMap0.j0(v2, object2);
        mutableLongObjectMap0.j0(v3, object3);
        return mutableLongObjectMap0;
    }

    @l
    public static final MutableLongObjectMap m(long v, Object object0, long v1, Object object1, long v2, Object object2, long v3, Object object3, long v4, Object object4) {
        MutableLongObjectMap mutableLongObjectMap0 = new MutableLongObjectMap(0, 1, null);
        mutableLongObjectMap0.j0(v, object0);
        mutableLongObjectMap0.j0(v1, object1);
        mutableLongObjectMap0.j0(v2, object2);
        mutableLongObjectMap0.j0(v3, object3);
        mutableLongObjectMap0.j0(v4, object4);
        return mutableLongObjectMap0;
    }
}

