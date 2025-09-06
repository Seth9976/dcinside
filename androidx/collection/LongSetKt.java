package androidx.collection;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nLongSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSet.kt\nandroidx/collection/LongSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,853:1\n1#2:854\n*E\n"})
public final class LongSetKt {
    @l
    private static final MutableLongSet a;
    @l
    private static final long[] b;

    static {
        LongSetKt.a = new MutableLongSet(0);
        LongSetKt.b = new long[0];
    }

    @l
    public static final LongSet a() {
        return LongSetKt.a;
    }

    @l
    public static final long[] b() {
        return LongSetKt.b;
    }

    public static final int c(long v) {
        int v1 = (int)(v ^ v >>> 0x20);
        return v1 * 0xCC9E2D51 ^ v1 * 0xCC9E2D51 << 16;
    }

    @l
    public static final LongSet d() {
        return LongSetKt.a;
    }

    @l
    public static final LongSet e(long v) {
        return LongSetKt.j(v);
    }

    @l
    public static final LongSet f(long v, long v1) {
        return LongSetKt.k(v, v1);
    }

    @l
    public static final LongSet g(long v, long v1, long v2) {
        return LongSetKt.l(v, v1, v2);
    }

    @l
    public static final LongSet h(@l long[] arr_v) {
        L.p(arr_v, "elements");
        LongSet longSet0 = new MutableLongSet(arr_v.length);
        ((MutableLongSet)longSet0).V(arr_v);
        return longSet0;
    }

    @l
    public static final MutableLongSet i() {
        return new MutableLongSet(0, 1, null);
    }

    @l
    public static final MutableLongSet j(long v) {
        MutableLongSet mutableLongSet0 = new MutableLongSet(1);
        mutableLongSet0.T(v);
        return mutableLongSet0;
    }

    @l
    public static final MutableLongSet k(long v, long v1) {
        MutableLongSet mutableLongSet0 = new MutableLongSet(2);
        mutableLongSet0.T(v);
        mutableLongSet0.T(v1);
        return mutableLongSet0;
    }

    @l
    public static final MutableLongSet l(long v, long v1, long v2) {
        MutableLongSet mutableLongSet0 = new MutableLongSet(3);
        mutableLongSet0.T(v);
        mutableLongSet0.T(v1);
        mutableLongSet0.T(v2);
        return mutableLongSet0;
    }

    @l
    public static final MutableLongSet m(@l long[] arr_v) {
        L.p(arr_v, "elements");
        MutableLongSet mutableLongSet0 = new MutableLongSet(arr_v.length);
        mutableLongSet0.V(arr_v);
        return mutableLongSet0;
    }
}

