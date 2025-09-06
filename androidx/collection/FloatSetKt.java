package androidx.collection;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nFloatSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatSet.kt\nandroidx/collection/FloatSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,853:1\n1#2:854\n*E\n"})
public final class FloatSetKt {
    @l
    private static final MutableFloatSet a;
    @l
    private static final float[] b;

    static {
        FloatSetKt.a = new MutableFloatSet(0);
        FloatSetKt.b = new float[0];
    }

    @l
    public static final FloatSet a() {
        return FloatSetKt.a;
    }

    @l
    public static final FloatSet b() {
        return FloatSetKt.a;
    }

    @l
    public static final FloatSet c(float f) {
        return FloatSetKt.j(f);
    }

    @l
    public static final FloatSet d(float f, float f1) {
        return FloatSetKt.k(f, f1);
    }

    @l
    public static final FloatSet e(float f, float f1, float f2) {
        return FloatSetKt.l(f, f1, f2);
    }

    @l
    public static final FloatSet f(@l float[] arr_f) {
        L.p(arr_f, "elements");
        FloatSet floatSet0 = new MutableFloatSet(arr_f.length);
        ((MutableFloatSet)floatSet0).V(arr_f);
        return floatSet0;
    }

    @l
    public static final float[] g() {
        return FloatSetKt.b;
    }

    public static final int h(float f) {
        int v = Float.floatToIntBits(f);
        return v * 0xCC9E2D51 ^ v * 0xCC9E2D51 << 16;
    }

    @l
    public static final MutableFloatSet i() {
        return new MutableFloatSet(0, 1, null);
    }

    @l
    public static final MutableFloatSet j(float f) {
        MutableFloatSet mutableFloatSet0 = new MutableFloatSet(1);
        mutableFloatSet0.T(f);
        return mutableFloatSet0;
    }

    @l
    public static final MutableFloatSet k(float f, float f1) {
        MutableFloatSet mutableFloatSet0 = new MutableFloatSet(2);
        mutableFloatSet0.T(f);
        mutableFloatSet0.T(f1);
        return mutableFloatSet0;
    }

    @l
    public static final MutableFloatSet l(float f, float f1, float f2) {
        MutableFloatSet mutableFloatSet0 = new MutableFloatSet(3);
        mutableFloatSet0.T(f);
        mutableFloatSet0.T(f1);
        mutableFloatSet0.T(f2);
        return mutableFloatSet0;
    }

    @l
    public static final MutableFloatSet m(@l float[] arr_f) {
        L.p(arr_f, "elements");
        MutableFloatSet mutableFloatSet0 = new MutableFloatSet(arr_f.length);
        mutableFloatSet0.V(arr_f);
        return mutableFloatSet0;
    }
}

