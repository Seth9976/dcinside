package j$.util;

import java.util.Collection;
import java.util.Iterator;

public final class Spliterators {
    private static final Spliterator a;
    private static final W b;
    private static final Z c;
    private static final T d;

    static {
        Spliterators.a = new n0();  // 初始化器: Ljava/lang/Object;-><init>()V
        Spliterators.b = new l0();  // 初始化器: Ljava/lang/Object;-><init>()V
        Spliterators.c = new m0();  // 初始化器: Ljava/lang/Object;-><init>()V
        Spliterators.d = new k0();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    private static void a(int v, int v1, int v2) {
        if(v1 > v2) {
            throw new ArrayIndexOutOfBoundsException("origin(" + v1 + ") > fence(" + v2 + ")");
        }
        if(v1 < 0) {
            throw new ArrayIndexOutOfBoundsException(v1);
        }
        if(v2 > v) {
            throw new ArrayIndexOutOfBoundsException(v2);
        }
    }

    public static T b() {
        return Spliterators.d;
    }

    public static W c() {
        return Spliterators.b;
    }

    public static Z d() {
        return Spliterators.c;
    }

    public static Spliterator e() {
        return Spliterators.a;
    }

    public static PrimitiveIterator.OfDouble f(T t0) {
        Objects.requireNonNull(t0);
        return new h0(t0);
    }

    public static PrimitiveIterator.OfInt g(W w0) {
        Objects.requireNonNull(w0);
        return new f0(w0);
    }

    public static PrimitiveIterator.OfLong h(Z z0) {
        Objects.requireNonNull(z0);
        return new g0(z0);
    }

    public static Iterator i(Spliterator spliterator0) {
        Objects.requireNonNull(spliterator0);
        return new e0(spliterator0);
    }

    public static T j(double[] arr_f, int v, int v1) {
        Spliterators.a(((double[])Objects.requireNonNull(arr_f)).length, v, v1);
        return new j0(arr_f, v, v1, 1040);
    }

    public static W k(int[] arr_v, int v, int v1) {
        Spliterators.a(((int[])Objects.requireNonNull(arr_v)).length, v, v1);
        return new o0(arr_v, v, v1, 1040);
    }

    public static Z l(long[] arr_v, int v, int v1) {
        Spliterators.a(((long[])Objects.requireNonNull(arr_v)).length, v, v1);
        return new q0(arr_v, v, v1, 1040);
    }

    public static Spliterator m(Object[] arr_object, int v, int v1) {
        Spliterators.a(((Object[])Objects.requireNonNull(arr_object)).length, v, v1);
        return new i0(arr_object, v, v1, 1040);
    }

    public static Spliterator spliterator(Collection collection0, int v) {
        return new p0(((Collection)Objects.requireNonNull(collection0)), v);
    }

    public static Spliterator spliteratorUnknownSize(Iterator iterator0, int v) {
        return new p0(((Iterator)Objects.requireNonNull(iterator0)), v);
    }
}

