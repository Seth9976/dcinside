package androidx.collection;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nLongList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongList.kt\nandroidx/collection/LongListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LongList.kt\nandroidx/collection/MutableLongList\n*L\n1#1,969:1\n1#2:970\n713#3,2:971\n713#3,2:973\n713#3,2:975\n713#3,2:977\n713#3,2:979\n713#3,2:981\n*S KotlinDebug\n*F\n+ 1 LongList.kt\nandroidx/collection/LongListKt\n*L\n938#1:971,2\n947#1:973,2\n948#1:975,2\n958#1:977,2\n959#1:979,2\n960#1:981,2\n*E\n"})
public final class LongListKt {
    @l
    private static final LongList a;

    static {
        LongListKt.a = new MutableLongList(0);
    }

    @l
    public static final LongList a() {
        return LongListKt.a;
    }

    @l
    public static final LongList b() {
        return LongListKt.a;
    }

    @l
    public static final LongList c(long v) {
        return LongListKt.h(v);
    }

    @l
    public static final LongList d(long v, long v1) {
        return LongListKt.i(v, v1);
    }

    @l
    public static final LongList e(long v, long v1, long v2) {
        return LongListKt.j(v, v1, v2);
    }

    @l
    public static final LongList f(@l long[] arr_v) {
        L.p(arr_v, "elements");
        LongList longList0 = new MutableLongList(arr_v.length);
        ((MutableLongList)longList0).k0(arr_v);
        return longList0;
    }

    @l
    public static final MutableLongList g() {
        return new MutableLongList(0, 1, null);
    }

    @l
    public static final MutableLongList h(long v) {
        MutableLongList mutableLongList0 = new MutableLongList(1);
        mutableLongList0.X(v);
        return mutableLongList0;
    }

    @l
    public static final MutableLongList i(long v, long v1) {
        MutableLongList mutableLongList0 = new MutableLongList(2);
        mutableLongList0.X(v);
        mutableLongList0.X(v1);
        return mutableLongList0;
    }

    @l
    public static final MutableLongList j(long v, long v1, long v2) {
        MutableLongList mutableLongList0 = new MutableLongList(3);
        mutableLongList0.X(v);
        mutableLongList0.X(v1);
        mutableLongList0.X(v2);
        return mutableLongList0;
    }

    @l
    public static final MutableLongList k(@l long[] arr_v) {
        L.p(arr_v, "elements");
        MutableLongList mutableLongList0 = new MutableLongList(arr_v.length);
        mutableLongList0.k0(arr_v);
        return mutableLongList0;
    }
}

