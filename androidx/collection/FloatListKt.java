package androidx.collection;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nFloatList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FloatList.kt\nandroidx/collection/MutableFloatList\n*L\n1#1,969:1\n1#2:970\n713#3,2:971\n713#3,2:973\n713#3,2:975\n713#3,2:977\n713#3,2:979\n713#3,2:981\n*S KotlinDebug\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatListKt\n*L\n938#1:971,2\n947#1:973,2\n948#1:975,2\n958#1:977,2\n959#1:979,2\n960#1:981,2\n*E\n"})
public final class FloatListKt {
    @l
    private static final FloatList a;

    static {
        FloatListKt.a = new MutableFloatList(0);
    }

    @l
    public static final FloatList a() {
        return FloatListKt.a;
    }

    @l
    public static final FloatList b() {
        return FloatListKt.a;
    }

    @l
    public static final FloatList c(float f) {
        return FloatListKt.h(f);
    }

    @l
    public static final FloatList d(float f, float f1) {
        return FloatListKt.i(f, f1);
    }

    @l
    public static final FloatList e(float f, float f1, float f2) {
        return FloatListKt.j(f, f1, f2);
    }

    @l
    public static final FloatList f(@l float[] arr_f) {
        L.p(arr_f, "elements");
        FloatList floatList0 = new MutableFloatList(arr_f.length);
        ((MutableFloatList)floatList0).k0(arr_f);
        return floatList0;
    }

    @l
    public static final MutableFloatList g() {
        return new MutableFloatList(0, 1, null);
    }

    @l
    public static final MutableFloatList h(float f) {
        MutableFloatList mutableFloatList0 = new MutableFloatList(1);
        mutableFloatList0.X(f);
        return mutableFloatList0;
    }

    @l
    public static final MutableFloatList i(float f, float f1) {
        MutableFloatList mutableFloatList0 = new MutableFloatList(2);
        mutableFloatList0.X(f);
        mutableFloatList0.X(f1);
        return mutableFloatList0;
    }

    @l
    public static final MutableFloatList j(float f, float f1, float f2) {
        MutableFloatList mutableFloatList0 = new MutableFloatList(3);
        mutableFloatList0.X(f);
        mutableFloatList0.X(f1);
        mutableFloatList0.X(f2);
        return mutableFloatList0;
    }

    @l
    public static final MutableFloatList k(@l float[] arr_f) {
        L.p(arr_f, "elements");
        MutableFloatList mutableFloatList0 = new MutableFloatList(arr_f.length);
        mutableFloatList0.k0(arr_f);
        return mutableFloatList0;
    }
}

