package androidx.collection;

import kotlin.jvm.internal.L;
import y4.l;

public final class ObjectIntMapKt {
    @l
    private static final MutableObjectIntMap a;

    static {
        ObjectIntMapKt.a = new MutableObjectIntMap(0);
    }

    @l
    public static final ObjectIntMap a() {
        L.n(ObjectIntMapKt.a, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        return ObjectIntMapKt.a;
    }

    @l
    public static final MutableObjectIntMap b() {
        return new MutableObjectIntMap(0, 1, null);
    }

    @l
    public static final MutableObjectIntMap c(Object object0, int v) {
        MutableObjectIntMap mutableObjectIntMap0 = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap0.l0(object0, v);
        return mutableObjectIntMap0;
    }

    @l
    public static final MutableObjectIntMap d(Object object0, int v, Object object1, int v1) {
        MutableObjectIntMap mutableObjectIntMap0 = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap0.l0(object0, v);
        mutableObjectIntMap0.l0(object1, v1);
        return mutableObjectIntMap0;
    }

    @l
    public static final MutableObjectIntMap e(Object object0, int v, Object object1, int v1, Object object2, int v2) {
        MutableObjectIntMap mutableObjectIntMap0 = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap0.l0(object0, v);
        mutableObjectIntMap0.l0(object1, v1);
        mutableObjectIntMap0.l0(object2, v2);
        return mutableObjectIntMap0;
    }

    @l
    public static final MutableObjectIntMap f(Object object0, int v, Object object1, int v1, Object object2, int v2, Object object3, int v3) {
        MutableObjectIntMap mutableObjectIntMap0 = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap0.l0(object0, v);
        mutableObjectIntMap0.l0(object1, v1);
        mutableObjectIntMap0.l0(object2, v2);
        mutableObjectIntMap0.l0(object3, v3);
        return mutableObjectIntMap0;
    }

    @l
    public static final MutableObjectIntMap g(Object object0, int v, Object object1, int v1, Object object2, int v2, Object object3, int v3, Object object4, int v4) {
        MutableObjectIntMap mutableObjectIntMap0 = new MutableObjectIntMap(0, 1, null);
        mutableObjectIntMap0.l0(object0, v);
        mutableObjectIntMap0.l0(object1, v1);
        mutableObjectIntMap0.l0(object2, v2);
        mutableObjectIntMap0.l0(object3, v3);
        mutableObjectIntMap0.l0(object4, v4);
        return mutableObjectIntMap0;
    }

    @l
    public static final ObjectIntMap h() {
        L.n(ObjectIntMapKt.a, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.objectIntMap>");
        return ObjectIntMapKt.a;
    }

    @l
    public static final ObjectIntMap i(Object object0, int v) {
        ObjectIntMap objectIntMap0 = new MutableObjectIntMap(0, 1, null);
        ((MutableObjectIntMap)objectIntMap0).l0(object0, v);
        return objectIntMap0;
    }

    @l
    public static final ObjectIntMap j(Object object0, int v, Object object1, int v1) {
        ObjectIntMap objectIntMap0 = new MutableObjectIntMap(0, 1, null);
        ((MutableObjectIntMap)objectIntMap0).l0(object0, v);
        ((MutableObjectIntMap)objectIntMap0).l0(object1, v1);
        return objectIntMap0;
    }

    @l
    public static final ObjectIntMap k(Object object0, int v, Object object1, int v1, Object object2, int v2) {
        ObjectIntMap objectIntMap0 = new MutableObjectIntMap(0, 1, null);
        ((MutableObjectIntMap)objectIntMap0).l0(object0, v);
        ((MutableObjectIntMap)objectIntMap0).l0(object1, v1);
        ((MutableObjectIntMap)objectIntMap0).l0(object2, v2);
        return objectIntMap0;
    }

    @l
    public static final ObjectIntMap l(Object object0, int v, Object object1, int v1, Object object2, int v2, Object object3, int v3) {
        ObjectIntMap objectIntMap0 = new MutableObjectIntMap(0, 1, null);
        ((MutableObjectIntMap)objectIntMap0).l0(object0, v);
        ((MutableObjectIntMap)objectIntMap0).l0(object1, v1);
        ((MutableObjectIntMap)objectIntMap0).l0(object2, v2);
        ((MutableObjectIntMap)objectIntMap0).l0(object3, v3);
        return objectIntMap0;
    }

    @l
    public static final ObjectIntMap m(Object object0, int v, Object object1, int v1, Object object2, int v2, Object object3, int v3, Object object4, int v4) {
        ObjectIntMap objectIntMap0 = new MutableObjectIntMap(0, 1, null);
        ((MutableObjectIntMap)objectIntMap0).l0(object0, v);
        ((MutableObjectIntMap)objectIntMap0).l0(object1, v1);
        ((MutableObjectIntMap)objectIntMap0).l0(object2, v2);
        ((MutableObjectIntMap)objectIntMap0).l0(object3, v3);
        ((MutableObjectIntMap)objectIntMap0).l0(object4, v4);
        return objectIntMap0;
    }
}

