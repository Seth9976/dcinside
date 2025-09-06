package androidx.collection;

import kotlin.jvm.internal.L;
import y4.l;

public final class ObjectLongMapKt {
    @l
    private static final MutableObjectLongMap a;

    static {
        ObjectLongMapKt.a = new MutableObjectLongMap(0);
    }

    @l
    public static final ObjectLongMap a() {
        L.n(ObjectLongMapKt.a, "null cannot be cast to non-null type androidx.collection.ObjectLongMap<K of androidx.collection.ObjectLongMapKt.emptyObjectLongMap>");
        return ObjectLongMapKt.a;
    }

    @l
    public static final MutableObjectLongMap b() {
        return new MutableObjectLongMap(0, 1, null);
    }

    @l
    public static final MutableObjectLongMap c(Object object0, long v) {
        MutableObjectLongMap mutableObjectLongMap0 = new MutableObjectLongMap(0, 1, null);
        mutableObjectLongMap0.l0(object0, v);
        return mutableObjectLongMap0;
    }

    @l
    public static final MutableObjectLongMap d(Object object0, long v, Object object1, long v1) {
        MutableObjectLongMap mutableObjectLongMap0 = new MutableObjectLongMap(0, 1, null);
        mutableObjectLongMap0.l0(object0, v);
        mutableObjectLongMap0.l0(object1, v1);
        return mutableObjectLongMap0;
    }

    @l
    public static final MutableObjectLongMap e(Object object0, long v, Object object1, long v1, Object object2, long v2) {
        MutableObjectLongMap mutableObjectLongMap0 = new MutableObjectLongMap(0, 1, null);
        mutableObjectLongMap0.l0(object0, v);
        mutableObjectLongMap0.l0(object1, v1);
        mutableObjectLongMap0.l0(object2, v2);
        return mutableObjectLongMap0;
    }

    @l
    public static final MutableObjectLongMap f(Object object0, long v, Object object1, long v1, Object object2, long v2, Object object3, long v3) {
        MutableObjectLongMap mutableObjectLongMap0 = new MutableObjectLongMap(0, 1, null);
        mutableObjectLongMap0.l0(object0, v);
        mutableObjectLongMap0.l0(object1, v1);
        mutableObjectLongMap0.l0(object2, v2);
        mutableObjectLongMap0.l0(object3, v3);
        return mutableObjectLongMap0;
    }

    @l
    public static final MutableObjectLongMap g(Object object0, long v, Object object1, long v1, Object object2, long v2, Object object3, long v3, Object object4, long v4) {
        MutableObjectLongMap mutableObjectLongMap0 = new MutableObjectLongMap(0, 1, null);
        mutableObjectLongMap0.l0(object0, v);
        mutableObjectLongMap0.l0(object1, v1);
        mutableObjectLongMap0.l0(object2, v2);
        mutableObjectLongMap0.l0(object3, v3);
        mutableObjectLongMap0.l0(object4, v4);
        return mutableObjectLongMap0;
    }

    @l
    public static final ObjectLongMap h() {
        L.n(ObjectLongMapKt.a, "null cannot be cast to non-null type androidx.collection.ObjectLongMap<K of androidx.collection.ObjectLongMapKt.objectLongMap>");
        return ObjectLongMapKt.a;
    }

    @l
    public static final ObjectLongMap i(Object object0, long v) {
        ObjectLongMap objectLongMap0 = new MutableObjectLongMap(0, 1, null);
        ((MutableObjectLongMap)objectLongMap0).l0(object0, v);
        return objectLongMap0;
    }

    @l
    public static final ObjectLongMap j(Object object0, long v, Object object1, long v1) {
        ObjectLongMap objectLongMap0 = new MutableObjectLongMap(0, 1, null);
        ((MutableObjectLongMap)objectLongMap0).l0(object0, v);
        ((MutableObjectLongMap)objectLongMap0).l0(object1, v1);
        return objectLongMap0;
    }

    @l
    public static final ObjectLongMap k(Object object0, long v, Object object1, long v1, Object object2, long v2) {
        ObjectLongMap objectLongMap0 = new MutableObjectLongMap(0, 1, null);
        ((MutableObjectLongMap)objectLongMap0).l0(object0, v);
        ((MutableObjectLongMap)objectLongMap0).l0(object1, v1);
        ((MutableObjectLongMap)objectLongMap0).l0(object2, v2);
        return objectLongMap0;
    }

    @l
    public static final ObjectLongMap l(Object object0, long v, Object object1, long v1, Object object2, long v2, Object object3, long v3) {
        ObjectLongMap objectLongMap0 = new MutableObjectLongMap(0, 1, null);
        ((MutableObjectLongMap)objectLongMap0).l0(object0, v);
        ((MutableObjectLongMap)objectLongMap0).l0(object1, v1);
        ((MutableObjectLongMap)objectLongMap0).l0(object2, v2);
        ((MutableObjectLongMap)objectLongMap0).l0(object3, v3);
        return objectLongMap0;
    }

    @l
    public static final ObjectLongMap m(Object object0, long v, Object object1, long v1, Object object2, long v2, Object object3, long v3, Object object4, long v4) {
        ObjectLongMap objectLongMap0 = new MutableObjectLongMap(0, 1, null);
        ((MutableObjectLongMap)objectLongMap0).l0(object0, v);
        ((MutableObjectLongMap)objectLongMap0).l0(object1, v1);
        ((MutableObjectLongMap)objectLongMap0).l0(object2, v2);
        ((MutableObjectLongMap)objectLongMap0).l0(object3, v3);
        ((MutableObjectLongMap)objectLongMap0).l0(object4, v4);
        return objectLongMap0;
    }
}

