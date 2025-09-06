package androidx.collection;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1100:1\n1#2:1101\n*E\n"})
public final class ScatterSetKt {
    @l
    private static final MutableScatterSet a;

    static {
        ScatterSetKt.a = new MutableScatterSet(0);
    }

    @l
    public static final ScatterSet a() {
        L.n(ScatterSetKt.a, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        return ScatterSetKt.a;
    }

    @l
    public static final MutableScatterSet b() {
        return new MutableScatterSet(0, 1, null);
    }

    @l
    public static final MutableScatterSet c(Object object0) {
        MutableScatterSet mutableScatterSet0 = new MutableScatterSet(1);
        mutableScatterSet0.Z(object0);
        return mutableScatterSet0;
    }

    @l
    public static final MutableScatterSet d(Object object0, Object object1) {
        MutableScatterSet mutableScatterSet0 = new MutableScatterSet(2);
        mutableScatterSet0.Z(object0);
        mutableScatterSet0.Z(object1);
        return mutableScatterSet0;
    }

    @l
    public static final MutableScatterSet e(Object object0, Object object1, Object object2) {
        MutableScatterSet mutableScatterSet0 = new MutableScatterSet(3);
        mutableScatterSet0.Z(object0);
        mutableScatterSet0.Z(object1);
        mutableScatterSet0.Z(object2);
        return mutableScatterSet0;
    }

    @l
    public static final MutableScatterSet f(@l Object[] arr_object) {
        L.p(arr_object, "elements");
        MutableScatterSet mutableScatterSet0 = new MutableScatterSet(arr_object.length);
        mutableScatterSet0.b0(arr_object);
        return mutableScatterSet0;
    }

    @l
    public static final ScatterSet g() {
        L.n(ScatterSetKt.a, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.scatterSetOf>");
        return ScatterSetKt.a;
    }

    @l
    public static final ScatterSet h(Object object0) {
        return ScatterSetKt.c(object0);
    }

    @l
    public static final ScatterSet i(Object object0, Object object1) {
        return ScatterSetKt.d(object0, object1);
    }

    @l
    public static final ScatterSet j(Object object0, Object object1, Object object2) {
        return ScatterSetKt.e(object0, object1, object2);
    }

    @l
    public static final ScatterSet k(@l Object[] arr_object) {
        L.p(arr_object, "elements");
        ScatterSet scatterSet0 = new MutableScatterSet(arr_object.length);
        ((MutableScatterSet)scatterSet0).b0(arr_object);
        return scatterSet0;
    }
}

