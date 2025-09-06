package androidx.collection;

import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,1618:1\n1#2:1619\n948#3,2:1620\n948#3,2:1622\n948#3,2:1624\n948#3,2:1626\n948#3,2:1628\n948#3,2:1630\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectListKt\n*L\n1587#1:1620,2\n1596#1:1622,2\n1597#1:1624,2\n1607#1:1626,2\n1608#1:1628,2\n1609#1:1630,2\n*E\n"})
public final class ObjectListKt {
    @l
    private static final Object[] a;
    @l
    private static final ObjectList b;

    static {
        ObjectListKt.a = new Object[0];
        ObjectListKt.b = new MutableObjectList(0);
    }

    private static final void d(List list0, int v) {
        int v1 = list0.size();
        if(v < 0 || v >= v1) {
            throw new IndexOutOfBoundsException("Index " + v + " is out of bounds. The list has " + v1 + " elements.");
        }
    }

    private static final void e(List list0, int v, int v1) {
        int v2 = list0.size();
        if(v > v1) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + v + ") is greater than toIndex (" + v1 + ").");
        }
        if(v < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + v + ") is less than 0.");
        }
        if(v1 > v2) {
            throw new IndexOutOfBoundsException("toIndex (" + v1 + ") is more than than the list size (" + v2 + ')');
        }
    }

    @l
    public static final ObjectList f() {
        L.n(ObjectListKt.b, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
        return ObjectListKt.b;
    }

    @l
    public static final MutableObjectList g() {
        return new MutableObjectList(0, 1, null);
    }

    @l
    public static final MutableObjectList h(Object object0) {
        MutableObjectList mutableObjectList0 = new MutableObjectList(1);
        mutableObjectList0.Z(object0);
        return mutableObjectList0;
    }

    @l
    public static final MutableObjectList i(Object object0, Object object1) {
        MutableObjectList mutableObjectList0 = new MutableObjectList(2);
        mutableObjectList0.Z(object0);
        mutableObjectList0.Z(object1);
        return mutableObjectList0;
    }

    @l
    public static final MutableObjectList j(Object object0, Object object1, Object object2) {
        MutableObjectList mutableObjectList0 = new MutableObjectList(3);
        mutableObjectList0.Z(object0);
        mutableObjectList0.Z(object1);
        mutableObjectList0.Z(object2);
        return mutableObjectList0;
    }

    @l
    public static final MutableObjectList k(@l Object[] arr_object) {
        L.p(arr_object, "elements");
        MutableObjectList mutableObjectList0 = new MutableObjectList(arr_object.length);
        mutableObjectList0.A0(arr_object);
        return mutableObjectList0;
    }

    @l
    public static final ObjectList l() {
        L.n(ObjectListKt.b, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.objectListOf>");
        return ObjectListKt.b;
    }

    @l
    public static final ObjectList m(Object object0) {
        return ObjectListKt.h(object0);
    }

    @l
    public static final ObjectList n(Object object0, Object object1) {
        return ObjectListKt.i(object0, object1);
    }

    @l
    public static final ObjectList o(Object object0, Object object1, Object object2) {
        return ObjectListKt.j(object0, object1, object2);
    }

    @l
    public static final ObjectList p(@l Object[] arr_object) {
        L.p(arr_object, "elements");
        ObjectList objectList0 = new MutableObjectList(arr_object.length);
        ((MutableObjectList)objectList0).A0(arr_object);
        return objectList0;
    }
}

