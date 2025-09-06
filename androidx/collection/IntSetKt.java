package androidx.collection;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nIntSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSet.kt\nandroidx/collection/IntSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,853:1\n1#2:854\n*E\n"})
public final class IntSetKt {
    @l
    private static final MutableIntSet a;
    @l
    private static final int[] b;

    static {
        IntSetKt.a = new MutableIntSet(0);
        IntSetKt.b = new int[0];
    }

    @l
    public static final IntSet a() {
        return IntSetKt.a;
    }

    @l
    public static final int[] b() {
        return IntSetKt.b;
    }

    public static final int c(int v) {
        return v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
    }

    @l
    public static final IntSet d() {
        return IntSetKt.a;
    }

    @l
    public static final IntSet e(int v) {
        return IntSetKt.j(v);
    }

    @l
    public static final IntSet f(int v, int v1) {
        return IntSetKt.k(v, v1);
    }

    @l
    public static final IntSet g(int v, int v1, int v2) {
        return IntSetKt.l(v, v1, v2);
    }

    @l
    public static final IntSet h(@l int[] arr_v) {
        L.p(arr_v, "elements");
        IntSet intSet0 = new MutableIntSet(arr_v.length);
        ((MutableIntSet)intSet0).V(arr_v);
        return intSet0;
    }

    @l
    public static final MutableIntSet i() {
        return new MutableIntSet(0, 1, null);
    }

    @l
    public static final MutableIntSet j(int v) {
        MutableIntSet mutableIntSet0 = new MutableIntSet(1);
        mutableIntSet0.T(v);
        return mutableIntSet0;
    }

    @l
    public static final MutableIntSet k(int v, int v1) {
        MutableIntSet mutableIntSet0 = new MutableIntSet(2);
        mutableIntSet0.T(v);
        mutableIntSet0.T(v1);
        return mutableIntSet0;
    }

    @l
    public static final MutableIntSet l(int v, int v1, int v2) {
        MutableIntSet mutableIntSet0 = new MutableIntSet(3);
        mutableIntSet0.T(v);
        mutableIntSet0.T(v1);
        mutableIntSet0.T(v2);
        return mutableIntSet0;
    }

    @l
    public static final MutableIntSet m(@l int[] arr_v) {
        L.p(arr_v, "elements");
        MutableIntSet mutableIntSet0 = new MutableIntSet(arr_v.length);
        mutableIntSet0.V(arr_v);
        return mutableIntSet0;
    }
}

