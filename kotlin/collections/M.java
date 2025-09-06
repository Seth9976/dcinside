package kotlin.collections;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import kotlin.b0;
import kotlin.h0;
import kotlin.internal.f;
import kotlin.jvm.internal.L;
import y4.l;
import z3.i;

class m {
    @l
    public static final Object[] a(@l Object[] arr_object, int v) {
        L.p(arr_object, "reference");
        Object object0 = Array.newInstance(arr_object.getClass().getComponentType(), v);
        L.n(object0, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[])object0;
    }

    @b0
    @h0(version = "1.3")
    @i(name = "contentDeepHashCode")
    public static int b(@y4.m Object[] arr_object) {
        return Arrays.deepHashCode(arr_object);
    }

    @h0(version = "1.3")
    public static final void c(int v, int v1) {
        if(v > v1) {
            throw new IndexOutOfBoundsException("toIndex (" + v + ") is greater than size (" + v1 + ").");
        }
    }

    public static final Object[] d(Object[] arr_object) {
        if(arr_object == null) {
            L.y(0, "T");
            return new Object[0];
        }
        return arr_object;
    }

    @f
    private static final String e(byte[] arr_b, Charset charset0) {
        L.p(arr_b, "<this>");
        L.p(charset0, "charset");
        return new String(arr_b, charset0);
    }

    public static final Object[] f(Collection collection0) {
        L.p(collection0, "<this>");
        L.y(0, "T?");
        return collection0.toArray(new Object[0]);
    }
}

