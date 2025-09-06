package androidx.collection;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/IntListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntList.kt\nandroidx/collection/MutableIntList\n*L\n1#1,969:1\n1#2:970\n713#3,2:971\n713#3,2:973\n713#3,2:975\n713#3,2:977\n713#3,2:979\n713#3,2:981\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/IntListKt\n*L\n938#1:971,2\n947#1:973,2\n948#1:975,2\n958#1:977,2\n959#1:979,2\n960#1:981,2\n*E\n"})
public final class IntListKt {
    @l
    private static final IntList a;

    static {
        IntListKt.a = new MutableIntList(0);
    }

    @l
    public static final IntList a() {
        return IntListKt.a;
    }

    @l
    public static final IntList b() {
        return IntListKt.a;
    }

    @l
    public static final IntList c(int v) {
        return IntListKt.h(v);
    }

    @l
    public static final IntList d(int v, int v1) {
        return IntListKt.i(v, v1);
    }

    @l
    public static final IntList e(int v, int v1, int v2) {
        return IntListKt.j(v, v1, v2);
    }

    @l
    public static final IntList f(@l int[] arr_v) {
        L.p(arr_v, "elements");
        IntList intList0 = new MutableIntList(arr_v.length);
        ((MutableIntList)intList0).k0(arr_v);
        return intList0;
    }

    @l
    public static final MutableIntList g() {
        return new MutableIntList(0, 1, null);
    }

    @l
    public static final MutableIntList h(int v) {
        MutableIntList mutableIntList0 = new MutableIntList(1);
        mutableIntList0.X(v);
        return mutableIntList0;
    }

    @l
    public static final MutableIntList i(int v, int v1) {
        MutableIntList mutableIntList0 = new MutableIntList(2);
        mutableIntList0.X(v);
        mutableIntList0.X(v1);
        return mutableIntList0;
    }

    @l
    public static final MutableIntList j(int v, int v1, int v2) {
        MutableIntList mutableIntList0 = new MutableIntList(3);
        mutableIntList0.X(v);
        mutableIntList0.X(v1);
        mutableIntList0.X(v2);
        return mutableIntList0;
    }

    @l
    public static final MutableIntList k(@l int[] arr_v) {
        L.p(arr_v, "elements");
        MutableIntList mutableIntList0 = new MutableIntList(arr_v.length);
        mutableIntList0.k0(arr_v);
        return mutableIntList0;
    }
}

